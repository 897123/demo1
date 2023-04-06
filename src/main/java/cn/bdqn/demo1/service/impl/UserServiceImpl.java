package cn.bdqn.demo1.service.impl;

import cn.bdqn.demo1.entity.User;
import cn.bdqn.demo1.mapper.UserMapper;
import cn.bdqn.demo1.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author leye
 * @since 2023-04-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
