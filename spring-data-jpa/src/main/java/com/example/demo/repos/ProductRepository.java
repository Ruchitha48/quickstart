package com.example.demo.repos;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Product;
public interface ProductRepository extends JpaRepository<Product, Integer> {
	//findByProprtyName
	public List<Product> findByProductName(String qryString );
	public List<Product> findByRatePerUnit(int rate);
	
	
	@Query(value="select * from product_sep_2022 where Rate_per_unit>:srch",nativeQuery=true)
	@Modifying
	@Transactional
	public List<Product> findByProductRate(@Param("srch")double srch);
		
		
	}
	

