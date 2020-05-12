package com.macro.mall.mapper;

import com.macro.mall.model.GreePmLx;
import com.macro.mall.model.GreePmLxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GreePmLxMapper {
    long countByExample(GreePmLxExample example);

    int deleteByExample(GreePmLxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GreePmLx record);

    int insertSelective(GreePmLx record);

    List<GreePmLx> selectByExample(GreePmLxExample example);

    GreePmLx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GreePmLx record, @Param("example") GreePmLxExample example);

    int updateByExample(@Param("record") GreePmLx record, @Param("example") GreePmLxExample example);

    int updateByPrimaryKeySelective(GreePmLx record);

    int updateByPrimaryKey(GreePmLx record);
}