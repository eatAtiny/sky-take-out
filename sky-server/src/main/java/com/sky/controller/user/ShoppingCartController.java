package com.sky.controller.user;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;
import com.sky.result.Result;
import com.sky.service.ShoppingCartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/shoppingCart")
@Slf4j
@Api("购物车相关接口")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    /**
     * 添加购物车
     */
    @PostMapping("add")
    @ApiOperation("添加购物车")
    public Result add(@RequestBody ShoppingCartDTO shoppingCartDTO) {
        log.info("添加购物车：{}", shoppingCartDTO);
        shoppingCartService.add(shoppingCartDTO);
        return Result.success();
    }

    /**
     * 查询购物车
     */
    @GetMapping("/list")
    @ApiOperation("查询购物车")
    public Result<List<ShoppingCart>> list() {
        log.info("查询购物车");
        List<ShoppingCart> list = shoppingCartService.list();
        return Result.success(list);
    }

    /**
     * 清空购物车
     */
    @DeleteMapping("/clean")
    @ApiOperation("清空购物车")
    public Result delete() {
        shoppingCartService.delete();
        return Result.success();
    }

    /**
     * 减少购物车数量
     */
    @PostMapping("/sub")
    @ApiOperation("减少购物车商品数量")
    public Result sub(@RequestBody ShoppingCartDTO shoppingCartDTO) {
        shoppingCartService.sub(shoppingCartDTO);
        return Result.success();
    }

}
