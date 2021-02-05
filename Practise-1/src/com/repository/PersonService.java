package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.PersonDao;
import com.model.Person;
import com.util.DbConnection;

public class PersonService implements PersonDao {
	Connection con;
	PreparedStatement preStatement;
	
	@Override
	public List<Person> getPersonList() {
		con=DbConnection.getConnection();
		List<Person> personList=new ArrayList();
		
		try {
		preStatement=con.prepareStatement("select * from user");
		ResultSet rs=preStatement.executeQuery();
		
		while(rs.next()) {
			Person p=new Person();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setPassword(rs.getString("password"));
			p.setSalary(rs.getDouble("salary"));
			personList.add(p);
		}
		
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		
		
		return personList;
	}

}
