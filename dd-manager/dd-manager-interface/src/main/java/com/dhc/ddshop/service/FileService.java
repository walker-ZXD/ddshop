package com.dhc.ddshop.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * User: DHC
 * Date: 2017/11/17
 * Time: 16:34
 * Version:V1.0
 */
public interface FileService {
    Map<String,Object> uploadImage(MultipartFile multipartFile);
}
