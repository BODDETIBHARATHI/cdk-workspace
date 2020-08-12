import java.util.Scanner;
class Employee{
	private int empno;
	private String ename;
	private double salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

class EmpManager{
	 int count = 10;
     private Employee[] emp = new Employee[count];
      int i=0;
     public void create(Employee e){
    	 if (i == 10) {
 			System.out.print("We can't allocate more employees.");
 			return;
 		}
    	 emp[i] = e;
    	 i++;
 	}
 	public void update(int itemno, Employee e){
 		boolean updated = false;
		for (int j = 0; j < i; j++) {

			if (emp[j].getEmpno() == itemno) {
				emp[j] = e;
				updated = true;
			}
		}
		if (updated == true) {
			System.out.println("Updated Successfully");
		} 
		else {
			System.out.println("Entry not found with given employee number.Please enter valid employee Id");
		}
	}
 	public void delete(int empno){  
 		int j, found=0;
 		for(j=0;j<i;j++) {
 			if(emp[j].getEmpno() == empno) {
 				found = 1;
 				break;
 			}
 		}
 		if(found == 0) {
 			System.out.println("There is no employee with given employee number. Please enter valid employee Id");
 			return ;
 		}
 				for(int k=j+1;k<i;k++) {
 					emp[k-1] = emp[k];
 				}
 				i--;
 				System.out.println("Employee with Id "+empno+" deleted successfully");
 	}
 	public void print()
 	{
 		System.out.println("EmployeeID  |  EmployeeName  |  EmployeeSalary");
 		for(int j=0;j<i;j++) {
 			System.out.println(emp[j].getEmpno()+"           |        "+emp[j].getEname()+"       |       "+emp[j].getSalary());
 		}
 	}
}

public class LabAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int ch;
        EmpManager em = new EmpManager();
        Scanner sc=new Scanner(System.in);
        while(true) {
        System.out.println("Enter 1 for create employee.\nEnter 2 for update employee.\nEnter 3 for delete employee.\nEnter 4 for printing employees.\nEnter 5 for exit ");
        ch = sc.nextInt();
        switch(ch) {
        case 1:
            Employee e = new Employee();
        	System.out.println("Enter employee id");
        	e.setEmpno(sc.nextInt());
        	System.out.println("Enter employee name");
        	e.setEname(sc.next());
        	System.out.println("Enter employee salary");
        	e.setSalary(sc.nextDouble());
        	em.create(e);
        	break;
        case 2:
            Employee eu = new Employee();
        	System.out.println("Enter the employee number to update");
        	int itemno = sc.nextInt();
        	eu.setEmpno(itemno);
        	System.out.println("Enter employee name");
        	eu.setEname(sc.next());
        	System.out.println("Enter employee salary");
        	eu.setSalary(sc.nextDouble());
        	em.update(itemno, eu);
        	break;
        case 3:
        	System.out.println("Enter the empid which you want to delete");
        	int id = sc.nextInt();
        	em.delete(id);
        	break;
        case 4:
        	em.print();
        	break;
        case 5:
        	System.exit(0);
        }
         
	}
	}

}
