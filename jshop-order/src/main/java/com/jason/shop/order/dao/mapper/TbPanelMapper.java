package com.jason.shop.order.dao.mapper;

import com.jason.shop.order.dao.model.TbPanel;
import java.util.List;

public interface TbPanelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPanel record);

    TbPanel selectByPrimaryKey(Integer id);

    List<TbPanel> selectAll();

    int updateByPrimaryKey(TbPanel record);
}