package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {

    /**
     * 新增菜品和对应的口味数据
     * @param dishDTO 菜品信息
     */
    public void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品分页查询
     * @param dishPageQueryDTO 分页查询条件
     * @return 分页查询结果
     */
    public PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     * @param ids 菜品id集合
     */
    public void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品
     * @param id 菜品id
     * @return 菜品信息
     */
    public DishVO getByIdWithFlavor(Long id);

    /**
     * 修改菜品
     * @param dishDTO 菜品信息
     */
    public void updateWithFlavor(DishDTO dishDTO);

    /**
     * 菜品起售停售
     * @param status 菜品状态
     * @param id 菜品id
     */
    public void startOrStop(Integer status, Long id);

    /**
     * 根据分类id查询菜品
     * @param categoryId 分类id
     * @return 菜品信息列表
     */
    public List<Dish> list(Long categoryId);



}
