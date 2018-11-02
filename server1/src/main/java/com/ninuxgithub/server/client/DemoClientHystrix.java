package com.ninuxgithub.server.client;

import com.ninuxgithub.server.entity.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
public class DemoClientHystrix implements DemoClient {
    @Override
    public List<Person> list() {
        System.out.println("进入断路器-list。。。");
        throw new RuntimeException("list 保存失败.");
    }

    @Override
    public Map<String, Boolean> save() {
        System.out.println("进入断路器-save。。。");
        throw new RuntimeException("save 保存失败.");
    }
}
