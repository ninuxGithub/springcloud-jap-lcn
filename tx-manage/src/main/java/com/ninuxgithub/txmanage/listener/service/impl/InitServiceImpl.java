package com.ninuxgithub.txmanage.listener.service.impl;

import com.ninuxgithub.txmanage.Constants;
import com.ninuxgithub.txmanage.config.ConfigReader;
import com.ninuxgithub.txmanage.listener.service.InitService;
import com.ninuxgithub.txmanage.netty.service.NettyServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by lorne on 2017/7/4.
 */
@Service
public class InitServiceImpl implements InitService {

    @Autowired
    private NettyServerService nettyServerService;

    @Autowired
    private ConfigReader configReader;


    @Override
    public void start() {
        /**加载本地服务信息**/

        Constants.socketPort = configReader.getSocketPort();
        Constants.maxConnection = configReader.getSocketMaxConnection();
        nettyServerService.start();
    }

    @Override
    public void close() {
        nettyServerService.close();
    }
}
