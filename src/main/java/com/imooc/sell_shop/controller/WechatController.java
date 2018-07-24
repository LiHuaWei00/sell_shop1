package com.imooc.sell_shop.controller;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 15:26 2018/7/24
 */
@RestController
@RequestMapping("/wechat")
public class WechatController {
    @Autowired
    private WxMpService wxMpService;
    @GetMapping("/authorize")
    public void authorize(@RequestParam("returnUrl") String returnUrl){
        //1.配置

        //2.调用方法
        wxMpService.oauth2buildAuthorizationUrl("",WxConsts.OAuth2Scope.SNSAPI_USERINFO,"");
    }
    @GetMapping("/userInfo")
    public void userInfo(){

    }
}
