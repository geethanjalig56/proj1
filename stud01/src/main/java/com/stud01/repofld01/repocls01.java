package com.stud01.repofld01;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stud01.entityfld01.entitycls01;
import java.util.List;


	@Repository
	public interface repocls01 extends JpaRepository<entitycls01, Long> {
	    @Query("SELECT s.rollno01 FROM student01 s")
	    List<Long> findallrollno01s();

	    @Query("SELECT s FROM student01 s WHERE s.rollno01 = :rollno01")
	    entitycls01 findbyrollno01(Long rollno01);
	}	
	