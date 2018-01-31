package com.granpree;

import com.granpree.dao.PersonDao;
import com.granpree.entity.Person;

import java.util.List;

public class DaoTest {

    public static void main(String[] args) {
        PersonDao dao = new PersonDao();
        List<Person> personList = dao.findPersonsByFirstname("kang");
        System.out.println(personList.get(0).getFirstname());
    }
}
