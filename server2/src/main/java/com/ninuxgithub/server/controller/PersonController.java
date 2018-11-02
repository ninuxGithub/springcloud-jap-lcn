package com.ninuxgithub.server.controller;

import com.ninuxgithub.server.entity.Person;
import com.ninuxgithub.server.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/list")
    public List<Person> list() {
        return personService.list();
    }


    @RequestMapping("/save")
    public Map<String, Boolean> savePerson() {
        boolean b = personService.savePerson(new Person("java", 18));
        Map<String, Boolean> map = new HashMap<>();
        map.put("flag", b);
        return map;
    }
}
