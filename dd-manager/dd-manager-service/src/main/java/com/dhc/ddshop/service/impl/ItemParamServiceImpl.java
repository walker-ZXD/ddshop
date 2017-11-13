package com.dhc.ddshop.service.impl;

import com.dhc.ddshop.common.dto.Page;
import com.dhc.ddshop.common.dto.Result;
import com.dhc.ddshop.dao.TbItemParamCustomMapper;
import com.dhc.ddshop.pojo.vo.TbItemParamCustom;
import com.dhc.ddshop.service.ItemParamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: DHC
 * Date: 2017/11/13
 * Time: 17:45
 * Version:V1.0
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbItemParamCustomMapper itemParamCustomDao;

    @Override
    public Result<TbItemParamCustom> listItemParamsByPage(Page page) {
        Result<TbItemParamCustom> result = null;
        try {
            //DAO层接口多多个参数解决方案之一
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("page", page);
            //取出tb_item_param这张表记录条数
            int count = itemParamCustomDao.countItemParams();
            //取出对应页码的记录集合
            List<TbItemParamCustom> list = itemParamCustomDao.listItemParamsByPage(map);
            result = new Result<TbItemParamCustom>();
            result.setTotal(count);
            result.setRows(list);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }
}
