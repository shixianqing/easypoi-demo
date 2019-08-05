package com.insuresmart.easypoidemo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.insuresmart.easypoidemo.service.BillService;

/**
 * Billcontroller
 * @author:shixianqing
 * @ctime: 2019/6/30
 */
@RestController
@RequestMapping("/Bill")
@Api(value = "Bill控制器", description = "Bill管理")
public class BillController {

    @Autowired
    private BillService service;

    private static final Logger logger = LoggerFactory.getLogger(BillController.class);




}