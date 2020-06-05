package com.sk.helloboot.repository.querydsl;

import com.sk.helloboot.model.School;

public interface SchoolRePositoryCustom {
	School querydslFindById(Long id);
}
