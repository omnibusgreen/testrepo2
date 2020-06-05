package com.sk.helloboot.repository.querydsl;

import java.util.List;

import com.sk.helloboot.model.Ticket;

public interface StudentRepositoryCustom {
	List<Ticket> getAllTickets();
}
