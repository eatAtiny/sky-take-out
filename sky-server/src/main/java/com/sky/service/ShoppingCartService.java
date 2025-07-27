package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO 购物车数据传输对象
     */
    void add(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查询购物车
     * @return 购物车列表
     */
    List<ShoppingCart> list();

    /**
     * 清空购物车
     */
    void delete();

    /**
     * 减少购物车一个商品数量
     * @param shoppingCartDTO 购物车数据传输对象
     */
    void sub(ShoppingCartDTO shoppingCartDTO);
}
