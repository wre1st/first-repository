package com.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Person;
import com.util.DbConnection;

public class RegistrationService {

	public RegistrationService() {

	}

	public void savePerson(Person person) {

		try {
			Connection connection = DbConnection.getConnection();
			PreparedStatement pre = connection
					.prepareStatement("insert into user(id,name,password,salary) values(?,?,?,?)");
			pre.setInt(1, person.getId());
			pre.setString(2, person.getName());
			pre.setString(3, person.getPassword());
			pre.setDouble(4, person.getSalary());

			if (pre.execute()) {
				System.out.println("Executed");
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
