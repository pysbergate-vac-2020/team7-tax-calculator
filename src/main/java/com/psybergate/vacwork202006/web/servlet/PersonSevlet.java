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
import com.psybergate.vacwork202006.web.controller.RegisterDetailsController;


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
		String TaxNumber=request.getParameter("taxNumber");
		String submittype=request.getParameter("submit");
		int retirement= Integer.parseInt(request.getParameter("retirement"));
		int allowance= Integer.parseInt(request.getParameter("allowance"));
		int salary= Integer.parseInt(request.getParameter("salary"));
		int bonus= Integer.parseInt(request.getParameter("bonus"));
		int interest= Integer.parseInt(request.getParameter("interest"));
		int purchaseprice= Integer.parseInt(request.getParameter("purchaseprice"));
		int sellingprice= Integer.parseInt(request.getParameter("sellingprice"));
		int additionalexpenses= Integer.parseInt(request.getParameter("additionalexpenses"));
		RegisterDetailsController details = new RegisterDetailsController();
		RegisterService register= new RegisterService();
		LoginService login=new LoginService();
		boolean result=login.checkUser(TaxNumber);
		
		if(submittype.equals("Register")) {
			register.registerUser(name,surname,TaxNumber,salary,bonus,interest,purchaseprice,additionalexpenses,sellingprice,retirement,allowance);
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
