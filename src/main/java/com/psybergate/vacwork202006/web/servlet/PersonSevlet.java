package com.psybergate.vacwork202006.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psybergate.vacwork202006.taxcalculator.Expense;
import com.psybergate.vacwork202006.taxcalculator.Income;
import com.psybergate.vacwork202006.web.controller.PersonController;


/**
 * Servlet implementation class Register
 */
@WebServlet("/PersonSevlet")
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
		String taxnumber=request.getParameter("taxnumber");
		String taxnumber1=request.getParameter("taxnumber1");
		String submittype=request.getParameter("submit");
		//Person person = new Person(name,surname,taxnumber);
		//PersonController manager= new PersonController();
			
			/*String result = manager.insertPerson(person);
			request.setAttribute("SuccessMessage", result + " you can now login");
			request.getRequestDispatcher("Login.jsp").forward(request, response);*/
			
			/*String result1 = manager.getPerson(person);
			request.setAttribute("message",result1);
			request.getRequestDispatcher("CalculateTax.jsp").forward(request, response);*/
		/*PersonController manager= new PersonController();
		Person p = new Person();
		 p=manager.getPerson(taxnumber1);
		
		 if (submittype.equals("Register")) {
			p.setName(name);
		    p.setSurname(surname);
		    p.setTaxnumber(taxnumber);
		    manager.insertPerson(p);
		    request.setAttribute("SuccessMessage", "registration done you can now login");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		 }else if( submittype.equals("Login") && p.getTaxnumber()!=null) {
			request.setAttribute("message", " welcome");
			request.getRequestDispatcher("CalculateTax.jsp").forward(request, response);
		 }*/
		
		String retimentfund=request.getParameter("retirefund");
		double retire= Double.parseDouble(retimentfund);
		String travelallowance=request.getParameter("travelallowance");
		double allowance= Double.parseDouble(travelallowance);
		String salary=request.getParameter("salary");
		double salary1= Double.parseDouble(salary);
		String bonus=request.getParameter("bonus");
		double bonus1= Double.parseDouble(bonus);
		String interest=request.getParameter("interest");
		double interest1= Double.parseDouble(interest);
		String capitalgain=request.getParameter("capitalgain");
		double capitalgain1= Double.parseDouble(capitalgain);
		String taxamount=request.getParameter("taxamount");
		double taxamount1= Double.parseDouble(taxamount);
		
		PersonController manager= new PersonController();
		/*Income income=new Income();
		Expense expense=new Expense();
		manager.getPersonID("10");				
		income.setBonus(bonus1);
		income.setCapitalgain(capitalgain1);
		income.setInterest(interest1);
		income.setSalary(salary1);
		expense.setRetirementfund(retire);
		expense.setTravelallowance(allowance);
		manager.insertPersonIncome(income);
		manager.insertPersonExpenses(expense);*/
				
	}

}
