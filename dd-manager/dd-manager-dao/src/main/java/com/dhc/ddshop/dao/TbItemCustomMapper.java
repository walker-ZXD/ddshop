package com.dhc.ddshop.dao;

import com.dhc.ddshop.common.dto.Order;
import com.dhc.ddshop.common.dto.Page;
import com.dhc.ddshop.pojo.vo.TbItemCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 自定义的商品实体数据访问层接口
 * User: DHC
 * Date: 2017/11/7
 * Time: 14:33
 * Version:V1.0
 */
public interface TbItemCustomMapper {
    /**
     * 查询商品表中所有记录的数量
     * @return
     */
    int countItems();

    /**
     * 查询指定页码显示记录集合
     * @param
     * @return
     */

//  List<TbItemCustom> listItemsByPage(@Param("page") Page page,@Param("order") Order order);
    List<TbItemCustom> listItemsByPage(Map<String,Object> map);
}
