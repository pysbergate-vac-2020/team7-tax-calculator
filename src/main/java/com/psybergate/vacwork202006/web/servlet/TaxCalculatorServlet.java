package com.psybergate.vacwork202006.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psybergate.vacwork202006.dao.PersonDAO;
import com.psybergate.vacwork202006.service.*;
import com.psybergate.vacwork202006.taxcalculator.CapitalGain;
import com.psybergate.vacwork202006.taxcalculator.Expense;
import com.psybergate.vacwork202006.taxcalculator.Income;


@WebServlet("/taxcalc/*")
public class TaxCalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaxCalculatorServlet() {
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
		String taxnumber=request.getParameter("taxNumber");
		
		int retirement= Integer.parseInt(request.getParameter("retirement"));
		int allowance= Integer.parseInt(request.getParameter("allowance"));
		int salary= Integer.parseInt(request.getParameter("salary"));
		int bonus= Integer.parseInt(request.getParameter("bonus"));
		int interest= Integer.parseInt(request.getParameter("interest"));
		int purchaseprice= Integer.parseInt(request.getParameter("purchaseprice"));
		int sellingprice= Integer.parseInt(request.getParameter("sellingprice"));
		int additionalexpenses= Integer.parseInt(request.getParameter("additionalexpenses"));
		int totaltax= Integer.parseInt(request.getParameter("totaltax"));
		
		CapitalGain capitalgains = new CapitalGain(purchaseprice,sellingprice,additionalexpenses);
		Income income = new Income(salary,bonus,interest,capitalgains);
		Expense expense = new Expense(allowance,retirement,salary);
		PersonDAO person = new PersonDAO();
		TaxCalculatorService calculator = new TaxCalculatorService();
		
		int CapitalGain = calculator.getIncomeCapitalGain(taxnumber);
		int Retirement = calculator.getExpensesRetirementFund(taxnumber);
		int Salary = calculator.getIncomeSalary(taxnumber);
		int Bonus = calculator.getIncomeBonus(taxnumber);
		int Interest = calculator.getIncomeInterest(taxnumber);
		int Allowance = calculator.getExpensesTravelAllowance(taxnumber);
		double TotalTax = calculator.getNetTaxPayable(taxnumber);
		
		if (income==null && expense ==null) {
		/*person.insertPersonIncome(taxnumber ,income, );
		person.insertPersonExpenses(taxnumber, retirement, allowance);*/
		}else if (income!=null && expense !=null) {
		// from database to form
		request.setAttribute("capitalgain", CapitalGain);
		request.setAttribute("allowance", Allowance);
		request.setAttribute("salary", Salary);
		request.setAttribute("interest", Interest);
		request.setAttribute("retirement", Retirement);
		request.setAttribute("bonus", Bonus);
		request.setAttribute("totaltax", TotalTax);
		}				
	}

}
