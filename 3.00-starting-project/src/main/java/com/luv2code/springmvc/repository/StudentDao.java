package com.luv2code.springmvc.repository;

import com.luv2code.springmvc.models.CollegeStudent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository                                         //Entity        Primary Key
public interface StudentDao extends CrudRepository<CollegeStudent, Integer> {

    //spring will automatically perform the query for us behind the scenes
    public CollegeStudent findByEmailAddress(String emailAddress);

}
