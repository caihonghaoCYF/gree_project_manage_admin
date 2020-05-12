package com.macro.mall.service.impl;

import com.macro.mall.mapper.GreePmLxMapper;
import com.macro.mall.model.GreePmLx;
import com.macro.mall.service.GreePMLXService;
import com.macro.mall.utils.UserUtil;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@SuppressWarnings("all")
public class GreePMLXServiceImpl implements GreePMLXService {

    @Autowired
    private GreePmLxMapper greePmLxMapper;

    @Override
    public int create(GreePmLx greePmLx) {
        String username = "";
        if (UserUtil.getLoginUser() != null){
            username = UserUtil.getLoginUser().getUsername();
        }
        greePmLx.setCreateTime(new Date());
        greePmLx.setCreateBy(username);
        greePmLx.setUpdateTime(new Date());
        greePmLx.setUpdateBy(username);
        greePmLx.setDelFlag(false);
        return greePmLxMapper.insert(greePmLx);
    }
}
