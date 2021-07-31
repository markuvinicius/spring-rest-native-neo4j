package com.markuvinicius.graph.springrestnativeneo4j.repository;

import com.markuvinicius.graph.springrestnativeneo4j.domain.Person;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {
    private SessionFactory sessionFactory;

    @Autowired
    public PersonRepository(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public void save(Person person){
        Session session = this.sessionFactory.openSession();
        session.save(person);
    }
}
