package com.sk.helloboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sk.helloboot.model.School;
import com.sk.helloboot.repository.querydsl.SchoolRePositoryCustom;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long>, SchoolRePositoryCustom  {
	List<School> findByName(String condition);
}
