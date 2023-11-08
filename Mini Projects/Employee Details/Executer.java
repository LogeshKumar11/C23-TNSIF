package MiniProject;

public class Executer {

	public static void main(String[] args) {
		
		//Insert Employee 
		Statements.insertEmployee(102, "Shizuka", "Senior Developer", 50000);
		Statements.insertEmployee(103, "Jackie Chan", "Frontend Developer", 22000);
		
		//Update Designation and Salary
		Statements.updateEmployee(103,"Backend Developer",30000);
		
		//Display Employee Details
		Statements.showDetails();
		
		Statements.insertEmployee(104, "Dora", "HR", 30000);
		Statements.insertEmployee(105, "Chhota Bheem", "Business Executive", 22000);
		
		//Delete Employee
		Statements.deleteEmployee(105);
		
		Statements.showDetails();
		
		Statements.closeconnection();
		
		
		
	}

}
