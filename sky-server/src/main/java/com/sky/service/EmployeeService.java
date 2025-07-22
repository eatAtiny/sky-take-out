package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO 登录信息
     * @return 登录成功返回员工信息，登录失败返回null
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO 新增员工信息
     * @return 新增成功返回员工信息，失败返回null
     */
    Employee insert(EmployeeDTO employeeDTO);

    /**
     * 分页查询
     * @param employeePageQueryDTO 分页查询条件
     * @return 分页查询结果
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);


}
