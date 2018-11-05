package com.ninuxgithub.server.controller;

import com.ninuxgithub.server.entity.Person;
import com.ninuxgithub.server.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Person> list() {
        return personService.list();
    }


    @RequestMapping(value = "/save", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String, Boolean> savePerson() {
        boolean b = personService.savePerson(new Person("java", 18));
        Map<String, Boolean> map = new HashMap<>();
        map.put("flag", b);
        return map;
    }
}
