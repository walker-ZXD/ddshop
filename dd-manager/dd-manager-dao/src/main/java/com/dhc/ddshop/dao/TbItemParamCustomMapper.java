package com.dhc.ddshop.dao;

import com.dhc.ddshop.pojo.vo.TbItemParamCustom;

import java.util.List;
import java.util.Map;

/**
 * User: DHC
 * Date: 2017/11/13
 * Time: 17:52
 * Version:V1.0
 */
public interface TbItemParamCustomMapper {

    int countItemParams();

    List<TbItemParamCustom> listItemParamsByPage(Map<String, Object> map);
}
