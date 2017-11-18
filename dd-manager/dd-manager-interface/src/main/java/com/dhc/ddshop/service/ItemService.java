package com.dhc.ddshop.service;

import com.dhc.ddshop.common.dto.Order;
import com.dhc.ddshop.common.dto.Page;
import com.dhc.ddshop.common.dto.Result;
import com.dhc.ddshop.pojo.po.TbItem;
import com.dhc.ddshop.pojo.vo.TbItemCustom;
import com.dhc.ddshop.pojo.vo.TbItemQuery;

import java.util.List;


public interface ItemService {

    TbItem getById(Long itemId);

//    List<TbItem> listItems();

    /**
     * 分页
     * @param page
     * @return
     */
    Result<TbItemCustom> listItemsByPage(Page page,Order order, TbItemQuery query);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int updateBatch(List<Long> ids);

    /**
     * 批量上架
     * @param ids
     * @return
     */
    int updatePutaway(List<Long> ids);
    /**
     * 批量下架
     * @param ids
     * @return
     */

    int updatePutdown(List<Long> ids);

    /**
     * 新增商品
     * @param tbItem  商品实体类
     * @param content  商品描述
     * @return   受到影响的行数
     */
    int saveItem(TbItem tbItem, String content,String paramData);
}
