package com.fruit.Service;

import com.fruit.Model.Shopcart;
import com.fruit.Model.ShopcartExample;
import com.fruit.Model.ShopcartKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Admin on 2017/4/27.
 */
public interface ShopcartService {

    long countByExample(ShopcartExample example);

    int deleteByExample(ShopcartExample example);

    int deleteByPrimaryKey(ShopcartKey key);

    int insert(Shopcart record);

    int insertSelective(Shopcart record);

    List<Shopcart> selectByExample(ShopcartExample example);

    Shopcart selectByPrimaryKey(ShopcartKey key);

    int updateByExampleSelective(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByExample(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByPrimaryKeySelective(Shopcart record);

    int updateByPrimaryKey(Shopcart record);
}
