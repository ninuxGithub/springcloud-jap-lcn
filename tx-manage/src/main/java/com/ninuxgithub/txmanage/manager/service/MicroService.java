package com.ninuxgithub.txmanage.manager.service;

import com.ninuxgithub.txmanage.model.TxServer;
import com.ninuxgithub.txmanage.model.TxState;

/**
 * create by lorne on 2017/11/11
 */
public interface MicroService {

    String  tmKey = "tx-manager";

    TxServer getServer();

    TxState getState();
}
