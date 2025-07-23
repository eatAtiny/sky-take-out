package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入菜品口味数据
     * @param dishFlavors 菜品口味数据列表
     */
    void insertBench(List<DishFlavor> dishFlavors);

    /**
     * 根据菜品id查询对应的口味数据
     * @param dishIds 菜品id
     */
     void deleteBenchByDishIds(List<Long> dishIds);
}
