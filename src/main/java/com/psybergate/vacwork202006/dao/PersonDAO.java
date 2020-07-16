package com.psybergate.vacwork202006.dao;

import java.sql.*;

import com.psybergate.vacwork202006.taxcalculator.Income;



public class PersonDAO {

	private Connection connection;
	
	public void insertNewPerson(String name, String surname, String taxNumber) {
		try {
			connect();
			Statement insertStatement = connection.createStatement();
			String sql = "INSERT INTO public.\"PERSON\"( \"PERSON_NAME\", \"PERSON_SURNAME\", \"PERSON_TAX_NUMBER\")" +
						"VALUES ('"+ name +"','"+ surname + "','" + taxNumber + "');";
			insertStatement.executeUpdate(sql);
			//connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public int getPersonID(String taxNumber) {
		try {
			connect();
			Statement insertStatement = connection.createStatement();
			String sql = "SELECT \"PERSON_ID\"\r\n" + 
					"	FROM public.\"PERSON\"\r\n" + 
					"	WHERE \"PERSON_TAX_NUMBER\" = '" + taxNumber + "';";
			ResultSet result = insertStatement.executeQuery(sql);
			result.next();
			int personID = result.getInt("PERSON_ID");
			return personID;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public void insertPersonIncome(String taxNumber ,Income income) {
		
		try {
			connect();
			Statement insertStatement = connection.createStatement();
			String sql = "INSERT INTO public.\"INCOME\"( \"PERSON_ID\", \"INCOME_SALARY\", \"INCOME_BONUS\", \"INCOME_INTEREST\", \"INCOME_CAPITAL_GAIN\")\r\n" + 
					"	VALUES ("+  getPersonID(taxNumber) + "," + income.getPersonSalary() + "," + income.getPersonBonus() + "," + income.getInterestRecieved() + "," + income.getCapitalGain() + ");";
			insertStatement.executeUpdate(sql);
			//connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int getPersonIncomeSalary(String taxNumber) {
		try {
			connect();
			Statement insertStatement = connection.createStatement();
			String sql = "SELECT \"INCOME_SALARY\"\r\n" + 
					"	FROM public.\"INCOME\"\r\n" + 
					"	WHERE \"PERSON_ID\" = " + getPersonID(taxNumber) + ";";
			ResultSet result = insertStatement.executeQuery(sql);
			result.next();
			int incomeSalary = result.getInt("INCOME_SALARY");
			return incomeSalary;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public int getPersonIncomeBonus(String taxNumber) {
		try {
			connect();
			Statement insertStatement = connection.createStatement();
			String sql = "SELECT \"INCOME_BONUS\"\r\n" + 
					"	FROM public.\"INCOME\"\r\n" + 
					"	WHERE \"PERSON_ID\" = " + getPersonID(taxNumber) + ";";
			ResultSet result = insertStatement.executeQuery(sql);
			result.next();
			int incomeBonus = result.getInt("INCOME_BONUS");
			return incomeBonus;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public int getPersonIncomeInterest(String taxNumber) {
		try {
			connect();
			Statement insertStatement = connection.createStatement();
			String sql = "SELECT \"INCOME_INTEREST\"\r\n" + 
					"	FROM public.\"INCOME\"\r\n" + 
					"	WHERE \"PERSON_ID\" = " + getPersonID(taxNumber) + ";";
			ResultSet result = insertStatement.executeQuery(sql);
			result.next();
			int incomeInterest = result.getInt("INCOME_INTEREST");
			return incomeInterest;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public int getPersonTaxableIncome(String taxNumber) {
		try {
			connect();
			Statement insertStatement = connection.createStatement();
			String sql = "SELECT \"INCOME_TAXABLE_INCOME\"\r\n" + 
					"	FROM public.\"INCOME\"\r\n" + 
					"	WHERE \"PERSON_ID\" = " + getPersonID(taxNumber) + ";";
			ResultSet result = insertStatement.executeQuery(sql);
			result.next();
			int incomeTaxableIncome = result.getInt("INCOME_TAXABLE_INCOME");
			return incomeTaxableIncome;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public int getPersonIncomeCapitalGain(String taxNumber) {
		try {
			connect();
			Statement insertStatement = connection.createStatement();
			String sql = "SELECT \"INCOME_CAPITAL_GAIN\"\r\n" + 
					"	FROM public.\"INCOME\"\r\n" + 
					"	WHERE \"PERSON_ID\" = " + getPersonID(taxNumber) + ";";
			ResultSet result = insertStatement.executeQuery(sql);
			result.next();
			int incomeCapitalGain = result.getInt("INCOME_CAPITAL_GAIN");
			return incomeCapitalGain;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public void insertPersonExpenses(String taxNumber,int retirementFund, int travelAllowance) {
		try {
			connect();
			Statement insertStatement = connection.createStatement();
			String sql = "INSERT INTO public.\"EXPENSES\"( \"PERSON_ID\", \"EXPENSES_RETIRE_FUND\", \"EXPENSES_TRAVEL_ALL\")\r\n" + 
					"	VALUES ("+ getPersonID(taxNumber) + "," + retirementFund + "," + travelAllowance + ");";
			insertStatement.executeUpdate(sql);
			//connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int getPersonExpensesRetirementFund(String taxNumber) {
		try {
			connect();
			Statement insertStatement = connection.createStatement();
			String sql = "SELECT \"EXPENSES_RETIRE_FUND\"\r\n" + 
					"	FROM public.\"EXPENSES\"\r\n" + 
					"	WHERE \"PERSON_ID\" = " + getPersonID(taxNumber) + ";";
			ResultSet result = insertStatement.executeQuery(sql);
			result.next();
			int retirementFund = result.getInt("EXPENSES_RETIRE_FUND");
			return retirementFund;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public int getPersonExpensesTravelAllowance(String taxNumber) {
		try {
			connect();
			Statement insertStatement = connection.createStatement();
			String sql = "SELECT \"EXPENSES_TRAVEL_ALL\"\r\n" + 
					"	FROM public.\"EXPENSES\"\r\n" + 
					"	WHERE \"PERSON_ID\" = " + getPersonID(taxNumber) + ";";
			ResultSet result = insertStatement.executeQuery(sql);
			result.next();
			int travelAllowance = result.getInt("EXPENSES_TRAVEL_ALL");
			return travelAllowance;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

<<<<<<< HEAD
		
	private void connect() {
=======
	public void connect() {
>>>>>>> 529db0ccfb2b8b00067d6ed807d1c748f6e52dce
		try{
			//Class.forName("org.postgresql.Driver");
			final String url = "jdbc:postgresql://localhost:5432/TaxCalculator";
			final String user = "postgres";
			final String password = "v@nd@22";
			connection = DriverManager.getConnection(url, user, password);
			if (connection!= null) {
				System.out.println("Connected!");
			}
			else {
				System.out.println("Did not connect!");
			}	
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


