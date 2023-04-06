package cn.bdqn.demo1.service.impl;

import cn.bdqn.demo1.entity.Employee;
import cn.bdqn.demo1.mapper.EmployeeMapper;
import cn.bdqn.demo1.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author leye
 * @since 2023-04-04
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
