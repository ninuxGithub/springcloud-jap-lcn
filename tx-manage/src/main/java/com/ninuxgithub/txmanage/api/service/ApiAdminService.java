package com.ninuxgithub.txmanage.api.service;

import com.ninuxgithub.txmanage.compensate.model.TxModel;
import com.ninuxgithub.txmanage.model.ModelName;
import com.ninuxgithub.txmanage.model.TxState;
import com.lorne.core.framework.exception.ServiceException;

import java.util.List;

/**
 * create by lorne on 2017/11/12
 */
public interface ApiAdminService {

    TxState getState();

    String loadNotifyJson();

    List<ModelName> modelList();


    List<String> modelTimes(String model);

    List<TxModel> modelInfos(String path);

    boolean compensate(String path) throws ServiceException;

    boolean hasCompensate();

    boolean delCompensate(String path);

}
