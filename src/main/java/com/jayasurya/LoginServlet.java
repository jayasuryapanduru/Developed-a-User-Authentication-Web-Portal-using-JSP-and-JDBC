package com.jayasurya;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	
	{
			String url = "jdbc:mysql://localhost:3306/createknowledge";
			String name1 = "root";
			String pass = "Surya@4090#";
			try {
				
				Connection connection = DriverManager.getConnection(url, name1, pass);
				String name  = request.getParameter("textName");
				String passWord = request.getParameter("textpwd");
				
				String query = "SELECT * FROM login WHERE userName=? AND passWord=?";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				
				preparedStatement.setString(1,name);
				preparedStatement.setString(2, passWord);
				
				
				ResultSet resultSet = preparedStatement.executeQuery();
				
				if (resultSet.next())
				{
					response.sendRedirect("Success.jsp");
				}
				else {
					
					response.sendRedirect("Error.jsp");
				}
	
			} catch (Exception e) 
			
			{
				System.out.println(e);
			}
		
	}

}
