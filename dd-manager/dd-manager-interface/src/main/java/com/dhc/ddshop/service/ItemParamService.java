package com.dhc.ddshop.service;

import com.dhc.ddshop.common.dto.Page;
import com.dhc.ddshop.common.dto.Result;
import com.dhc.ddshop.pojo.vo.TbItemParamCustom;

/**
 * User: DHC
 * Date: 2017/11/13
 * Time: 17:44
 * Version:V1.0
 */
public interface ItemParamService {
    /**
     * 对参数规格说明表进行分页操作
     * @param page
     * @return
     */
    Result<TbItemParamCustom> listItemParamsByPage(Page page);
}
