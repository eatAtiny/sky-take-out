package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "员工分页查询条件")
public class EmployeePageQueryDTO implements Serializable {

    //员工姓名
    @ApiModelProperty(value = "员工姓名")
    private String name;

    //页码
    @ApiModelProperty(value = "页码")
    private int page;

    //每页显示记录数
    @ApiModelProperty(value = "每页显示记录数")
    private int pageSize;

}
