package com.ninuxgithub.server.service;

import com.ninuxgithub.server.entity.Person;

import java.util.List;

public interface PersonService {

    public List<Person> list();

    public boolean savePerson(Person person);

}
