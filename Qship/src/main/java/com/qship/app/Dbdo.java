package com.qship.app;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Dbdo extends JpaRepository<Employee, Integer> {
	

}
