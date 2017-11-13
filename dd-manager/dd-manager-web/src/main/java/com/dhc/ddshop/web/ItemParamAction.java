package com.dhc.ddshop.web;

import com.dhc.ddshop.common.dto.Page;
import com.dhc.ddshop.common.dto.Result;
import com.dhc.ddshop.pojo.vo.TbItemParamCustom;
import com.dhc.ddshop.service.ItemParamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: DHC
 * Date: 2017/11/13
 * Time: 17:36
 * Version:V1.0
 */
@Controller
public class ItemParamAction {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ItemParamService itemParamService;

    @ResponseBody
    @RequestMapping("/itemParams")
    public Result<TbItemParamCustom> listItemParamsByPage(Page page){
        Result<TbItemParamCustom> result = null;
        try {
            result = itemParamService.listItemParamsByPage(page);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }
}
