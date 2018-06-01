package com.jason.shop.authentication.dao.mapper;


import com.jason.shop.authentication.dao.model.TbMember;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface TbMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbMember record);

    TbMember selectByPrimaryKey(Long id);

    List<TbMember> selectAll();

    int updateByPrimaryKey(TbMember record);

    TbMember selectByName(String username);
}