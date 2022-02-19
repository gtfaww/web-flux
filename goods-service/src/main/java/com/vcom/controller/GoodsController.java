package com.vcom.controller;

import com.vcom.bean.Goods;
import com.vcom.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    private GoodsService goodsService;


    @GetMapping("/mock/{id}")
    public Goods mockById(@PathVariable long id) {
        return goodsService.mock(id);
    }

    @GetMapping("/mock/list")
    public List<Goods> mockList(@RequestParam String ids, @RequestParam(required = false) String label) {
        String[] idArr = ids.split(",");
        return goodsService.mockList(idArr, label);
    }
}
