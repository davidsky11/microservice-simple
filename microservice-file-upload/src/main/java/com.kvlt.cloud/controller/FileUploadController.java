package com.kvlt.cloud.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * FileUploadController
 *
 * @author KVLT
 * @date 2017-12-11.
 */
@RestController
public class FileUploadController {

    /**
     * 上传文件
     *  测试方法
     *   有界面的测试: http://localhost:8025/index.html
     *   使用命令：curl -F "file=@文件全名" localhost:8080/upload
     *   没有做IO异常、文件大小、文件非空等处理
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String handleFileUpload(@RequestParam(value = "file", required = true) MultipartFile file) throws IOException {
        // 可能会有 堆内存溢出问题，需要设置JVM内存大小，  -Xms4000M -Xmx4000M
        byte[] bytes = file.getBytes();
        File fileToSave = new File(file.getOriginalFilename());
        FileCopyUtils.copy(bytes, fileToSave);
        return fileToSave.getAbsolutePath();
    }

}
