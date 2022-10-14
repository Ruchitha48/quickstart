package com.example.demo.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.examle.demo.entity.Fee;
import com.examle.demo.utils.ConnectionFactory;

public class FeeRepository {
	Connection con=null;
	private static String  insertSql="insert into tieto_fee values(?,?,?,?)";
	private static String  findAllSql="select * from tieto_fee";
	private static String  findByIdSql="select * from tieto_fee where id=?";
	private static String removeByIdSql="delete  from tieto_fee where id=?";
	private static String updateById="update  tieto_fee set amount=?  where id=?";
	public FeeRepository() {
		super();
		this.con=ConnectionFactory.getMySqlConnection();
	}
public int add (Fee entity)throws SQLException {
	int rowAdded=0;
	try(PreparedStatement pstmt=con.prepareStatement(insertSql)){
		pstmt.setInt(1,entity.getId());
		pstmt.setString(2,entity.getBranch());
		pstmt.setString(3,entity.getYear());
		pstmt.setDouble(4,entity.getAmount());
		rowAdded=pstmt.executeUpdate();
		
	}catch(SQLException e) {
		throw e;
	}
	
	
	return rowAdded;
}



public List<Fee> findAll(){
	List<Fee> list=new ArrayList<>();
	try(PreparedStatement pstmt=con.prepareStatement(findAllSql)){
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			int id=rs.getInt("id");
			String branch=rs.getString("branch");
			String year=rs.getString("year");
			double amount=rs.getDouble("amount");
			Fee rowRef=new Fee(id,branch,year,amount);
			list.add(rowRef);
			
		}
		
		
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
	return list;
}



public Optional<Fee> findById(int key) {
	Optional<Fee> found=Optional.empty();
	try(PreparedStatement pstmt=con.prepareStatement(findByIdSql)){
		pstmt.setInt(1, key);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			int id=rs.getInt("id");
			String branch=rs.getString("branch");
			String year=rs.getString("year");
			double amount=rs.getDouble("amount");
			Fee foundObject=new Fee(id,branch,year,amount);
			 found=Optional.of(foundObject);
			
		}
		
		
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	return found;
}
public int remove(int key)  {
	int rowDeleted=0;
	try(PreparedStatement pstmt=con.prepareStatement(removeByIdSql)){
		pstmt.setInt(1, key);
		
			rowDeleted=pstmt.executeUpdate();
		
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	

	return rowDeleted;
}

public int update(double amount,int id) {
	int rowupdated=0;
	try(PreparedStatement pstmt=con.prepareStatement(updateById)){
		//pstmt.setInt(2,entity.getId());
		//pstmt.setString(2,entity.getBranch());
		//pstmt.setString(3,entity.getYear());
		//pstmt.setDouble(1,entity.getAmount());
		pstmt.setDouble(1, amount);
		pstmt.setInt(2, id);
		rowupdated=pstmt.executeUpdate();
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
	
	return rowupdated;
}



}