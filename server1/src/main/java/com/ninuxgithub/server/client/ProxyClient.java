package com.ninuxgithub.server.client;

import com.ninuxgithub.server.entity.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@FeignClient(value ="server2" ,fallback= DemoClientHystrix.class)
public interface ProxyClient {
    @RequestMapping("/list")
    List<Person> list();


    @RequestMapping("/save")
    Map<String,Boolean> save();
}
