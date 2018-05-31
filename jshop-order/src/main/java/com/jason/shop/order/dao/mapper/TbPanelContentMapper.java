package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbPanelContent;
import java.util.List;

public interface TbPanelContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPanelContent record);

    TbPanelContent selectByPrimaryKey(Integer id);

    List<TbPanelContent> selectAll();

    int updateByPrimaryKey(TbPanelContent record);
}