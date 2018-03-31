package com.fruit.DAO;

import com.fruit.Model.Goodsinformation;
import com.fruit.Model.GoodsinformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsinformationDAO {
    long countByExample(GoodsinformationExample example);

    int deleteByExample(GoodsinformationExample example);

    int deleteByPrimaryKey(Integer pkid);

    int insert(Goodsinformation record);

    int insertSelective(Goodsinformation record);

    List<Goodsinformation> selectByExample(GoodsinformationExample example);

    Goodsinformation selectByPrimaryKey(Integer pkid);

    int updateByExampleSelective(@Param("record") Goodsinformation record, @Param("example") GoodsinformationExample example);

    int updateByExample(@Param("record") Goodsinformation record, @Param("example") GoodsinformationExample example);

    int updateByPrimaryKeySelective(Goodsinformation record);

    int updateByPrimaryKey(Goodsinformation record);
}