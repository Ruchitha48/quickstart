package com.example.demo.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Fee;


public interface FeeRepository extends JpaRepository<Fee, Integer> {
//the method below should follow DSL convention i.e u use findBy...property name with 1st letter capital
//public List<Fee> findByBranch(String srchString);	
	
	
	//no need follow DSL convention as we are adding our query by using @Query annotation
//	@Query(value="select * from tieto_fee where branch=:srchString",nativeQuery=true)
//	public List<Fee> findByBranchName(@Param("srchString")String srchString);	
	
//JPQL uses className and property name instead of table name and column name when nativeQuery=false	
	@Query(value="From Fee where branch=:srchString",nativeQuery=false)
	public List<Fee> findByBranchName(@Param("srchString")String srchString);	
	
	
	@Query(value="update tieto_fee set amount=:amount where id=:id",nativeQuery=true)
	@Modifying
	@Transactional
	public int updateAmount(@Param("amount")double amount,@Param("id")int id);
}
