package com.wangke.twocode.controller;

import com.wangke.twocode.utils.QRCodeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/qrCode")
public class QRCodeGeneratorController {

    @GetMapping("/generator")
    public void encodeQrCode(String codeContent, HttpServletResponse response){
        String imgPath = "C:\\Users\\11769\\Desktop\\touxiang.jpg";

        try{
            QRCodeUtil.encode(codeContent,imgPath,true,response.getOutputStream());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
