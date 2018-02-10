package com.granpree.dao;

import com.querydsl.jpa.impl.JPAQuery;
import com.granpree.entity.Person;

import com.granpree.entity.QPerson;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

import java.util.List;

@Repository
public class  PersonDao{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("minwoo");
    private EntityManager em = emf.createEntityManager();
    static QPerson person  = QPerson.person;


    public Person save(final Person Person){
        em.persist(Person);
        return Person;
    }

/*

    public List<Person> findPersonsByFirstnameAndSurname(final String firstname, final String surname) {
        final JPAQuery<Person> query = new JPAQuery<>(em);

        return query.from(person).where(person.firstname.eq(firstname).and(person.surname.eq(surname))).fetch();
    }
*/

    public List<Person> findPersonsByFirstnameAndSurname(final String firstname, final String surname) {
        final JPAQuery<Person> query = new JPAQuery<>(em);

        return query.from(person).where(person.firstName.eq(firstname).and(person.surName.eq(surname))).fetch();
    }


    public List<Person> findPersonsByFirstname(final String firstname){
        final JPAQuery<Person> query = new JPAQuery<>(em);

        return query.from(person).where(person.firstName.eq(firstname)).fetch();
    }
}
