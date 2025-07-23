package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdByDishId(List<Long> dishIds);

    /**
     * 根据套餐id查询菜品
     * @param setmealId
     * @return
     */
    @Select("select * from setmeal_dish where setmeal_id = #{setmealId}")
    List<SetmealDish> getSetmealDishBySetmealId(Long setmealId);

    /**
     * 插入套餐和菜品的关联关系
     * @param setmealDishes 套餐和菜品的关联关系列表
     */
    void insertSetmealDishBench(List<SetmealDish> setmealDishes);

    /**
     * 根据套餐id删除套餐和菜品的关联关系
     * @param setmealId 套餐id
     */
    void deleteBySetmealId(Long setmealId);

    /**
     * 根据套餐id删除套餐和菜品的关联关系
     * @param setmealIds 套餐ids
     */
    void deleteBySetmealIds(List<Long> setmealIds);
}
