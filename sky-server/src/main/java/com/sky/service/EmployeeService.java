package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.dto.PasswordEditDTO;
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

    /**
     * 启用禁用员工账号
     * @param status 账号状态
     * @param id 员工id
     */
    void updateStatus(Integer status, Long id);

    /**
     * 根据id查询员工
     * @param id 员工id
     * @return 员工信息
     */
    Employee getById(Long id);

    /**
     * 修改员工信息
     * @param employeeDTO 员工信息
     */
    void update(EmployeeDTO employeeDTO);

    /**
     * 修改密码
     * @param passwordEditDTO 密码修改信息
     */
    void editPassword(PasswordEditDTO passwordEditDTO);

}
