package cn.bdqn.demo1.controller;


import cn.bdqn.demo1.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author leye
 * @since 2023-04-04
 */
@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/index/{id}")
    public String getEmployeeById(@PathVariable("id") int id){
        log.info("成功查询");
        employeeService.getById(id);
        return "index";
    }
}
