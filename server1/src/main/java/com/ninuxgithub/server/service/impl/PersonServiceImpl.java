package com.ninuxgithub.server.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.netflix.discovery.converters.Auto;
import com.ninuxgithub.server.entity.Person;
import com.ninuxgithub.server.repository.PersonRepository;
import com.ninuxgithub.server.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> list() {
        return personRepository.findAll();
    }

    @Override
    @TxTransaction
    @Transactional
    public boolean savePerson(Person person) {
        Person save = personRepository.save(person);
        int v=100/0;
        return save !=null;
    }
}
