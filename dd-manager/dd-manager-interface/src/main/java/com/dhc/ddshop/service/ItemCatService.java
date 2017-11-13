package com.dhc.ddshop.service;

import com.dhc.ddshop.common.dto.TreeNode;

import java.util.List;

/**
 * User: DHC
 * Date: 2017/11/10
 * Time: 15:08
 * Version:V1.0
 */
public interface ItemCatService {
    List<TreeNode> listItemCatsByPid(Long parentId);
}
