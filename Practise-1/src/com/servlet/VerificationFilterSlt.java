package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.model.Person;

/**
 * Servlet Filter implementation class VerificationFilterSlt
 */
@WebFilter("/verification")
public class VerificationFilterSlt implements Filter {

    /**
     * Default constructor. 
     */
    public VerificationFilterSlt() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		HttpServletRequest req=(HttpServletRequest)request;
		// pass the request along the filter chain
		String email=(String)req.getParameter("email");
		String password=(String)req.getParameter("password");
		PrintWriter pw=response.getWriter();
		System.out.println(email);
		System.out.println(password);
		
		if(email.endsWith(".com") && password.length()>7) {
			System.out.print("verified");
			Person person=new Person();
			person.setId(41);
			person.setName((String)request.getParameter("username"));
			person.setSalary(Double.parseDouble(request.getParameter("salary")));
			person.setPassword((String)request.getParameter("password"));
			
			RegistrationService reg=new RegistrationService();
			reg.savePerson(person);
			
		}
		else
			pw.println("something went wrong");
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
