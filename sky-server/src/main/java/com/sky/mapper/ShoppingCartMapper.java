package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {

    /**
     * 查询购物车
     * @param shoppingCart 购物车数据传输对象
     * @return
     */
    List<ShoppingCart> list(ShoppingCart shoppingCart);

    /**
     * 更新购物车数量
     * @param shoppingCart 购物车数据传输对象
     */
    @Select("update shopping_cart set number = #{number} where id = #{id}")
    void updateNumber(ShoppingCart shoppingCart);

    /**
     * 插入购物车
     * @param shoppingCart 购物车数据传输对象
     */
    @Insert("insert into shopping_cart (name, user_id, dish_id, setmeal_id, dish_flavor, number, amount, image, create_time) " +
            "values (#{name}, #{userId}, #{dishId}, #{setmealId}, #{dishFlavor}, #{number}, #{amount}, #{image}, #{createTime})")
    void insert(ShoppingCart shoppingCart);

    /**
     * 删除购物车
     * @param shoppingCart 购物车数据传输对象
     */
    @Delete("delete from shopping_cart where user_id = #{userId}")
    void delete(ShoppingCart shoppingCart);

    /**
     * 批量插入购物车数据
     *
     * @param shoppingCartList 购物车列表
     */
    void insertBatch(List<ShoppingCart> shoppingCartList);
}
