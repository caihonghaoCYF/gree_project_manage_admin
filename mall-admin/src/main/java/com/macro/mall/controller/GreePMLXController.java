package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.GreePmLx;
import com.macro.mall.service.GreePMLXService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "GreePMLXController", description = "项目管理立项")
@RequestMapping("/lx")
public class GreePMLXController {

    @Autowired
    private GreePMLXService greePMLXService;

    @ApiOperation("添加项目立项")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody GreePmLx greePmLx) {
        int count = greePMLXService.create(greePmLx);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

}
