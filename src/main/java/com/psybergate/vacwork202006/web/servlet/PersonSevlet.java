package com.psybergate.vacwork202006.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psybergate.vacwork202006.domain.Person;
import com.psybergate.vacwork202006.service.LoginService;
import com.psybergate.vacwork202006.service.RegisterService;


/**
 * Servlet implementation class Register
 */
@WebServlet("/person/*")
public class PersonSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name=request.getParameter("name");
		String surname=request.getParameter("surname");
		String taxnumber=request.getParameter("taxNumber");
		String submittype=request.getParameter("submit");
		
		RegisterService register= new RegisterService();
		LoginService login=new LoginService();
		boolean result=login.checkUser(taxnumber);
			
		if(submittype.equals("Register")) {
			register.registerUser(name,surname,taxnumber);
			request.setAttribute("SuccessMessage"," you can now login");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else if (submittype.equals("Login") && result!=false) {
			request.setAttribute("message", " welcome");
			request.getRequestDispatcher("Capture_tax_info.jsp").forward(request, response);
			//Person person = new Person();
		    //String TaxNumber = person.setTaxnumber(taxnumber);
		}	
		
						
	}

}
