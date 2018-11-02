package com.ninuxgithub.txmanage.api.service.impl;

import com.ninuxgithub.txmanage.api.service.ApiModelService;
import com.ninuxgithub.txmanage.manager.ModelInfoManager;
import com.ninuxgithub.txmanage.model.ModelInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by lorne on 2017/11/13
 */
@Service
public class ApiModelServiceImpl implements ApiModelService {


    @Override
    public List<ModelInfo> onlines() {
        return ModelInfoManager.getInstance().getOnlines();
    }


}
