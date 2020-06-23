package com.itzcy.dao;

import com.itzcy.domain.Item;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemDao {

    @Select("select * from items where id=#{id}")
    Item findById(Integer id);
}
