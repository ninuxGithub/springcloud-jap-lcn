package com.ninuxgithub.ribbonserver;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "errorMethod")
    public Map<String, Boolean> savePerson() {
        return restTemplate.getForObject("http://SERVER-TWO/save", Map.class);
    }

    public Map<String, Boolean> errorMethod() {
        Map<String,Boolean> map = new HashMap<>();
        map.put("flag",false);
        return map;
    }
}
