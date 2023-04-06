package cn.bdqn.demo1.controller;


import cn.bdqn.demo1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author leye
 * @since 2023-04-06
 */
@Controller
public class UserController {
    @Autowired
    StringRedisTemplate redisTemplate;
    /**
     * 登录页面
     * @return
     */
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUsername()) && "123456".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
            //登录成功重定向到主页面，重定向防止重复提交
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }

    }

    /**
     * main页面
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(Model model){
//        Object loginUser = session.getAttribute("loginUser");
//        if(loginUser!=null){

//        }else{
//            model.addAttribute("msg","请先登录");
//            return "login";
//        }
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();

        String s = opsForValue.get("/main.html");
        String s1 = opsForValue.get("/productList");
        model.addAttribute("mainCount",s);
        model.addAttribute("listCount",s1);
        return "main";
    }
}
