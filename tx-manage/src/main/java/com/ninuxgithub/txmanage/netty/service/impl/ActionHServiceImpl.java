package com.ninuxgithub.txmanage.netty.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ninuxgithub.txmanage.config.ConfigReader;
import com.ninuxgithub.txmanage.netty.service.IActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 心跳包
 * create by lorne on 2017/11/11
 */
@Service(value = "h")
public class ActionHServiceImpl implements IActionService{


    @Autowired
    private ConfigReader configReader;

    @Override
    public String execute(String channelAddress, String key, JSONObject params ) {
        return String.valueOf(configReader.getTransactionNettyDelayTime());
    }
}
