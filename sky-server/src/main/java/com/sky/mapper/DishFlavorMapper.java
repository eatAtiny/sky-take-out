package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入菜品口味数据
     * @param dishFlavors 菜品口味数据列表
     */
    void insertBench(List<DishFlavor> dishFlavors);

    /**
     * 根据菜品id删除对应的口味数据
     * @param dishIds 菜品id
     */
     void deleteBenchByDishIds(List<Long> dishIds);

     /**
      * 根据菜品id查询对应的口味数据
      * @param dishId 菜品id
      * @return 口味数据列表
      */
     @Select("select * from dish_flavor where dish_id = #{dishId}")
     List<DishFlavor> getByDishId(Long dishId);
}
