
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
    	 System.out.println("create");
    	 if(i<count) {
    		 System.out.println("i= "+i);
    		 emp[i] = e;
    	 System.out.println(emp[i].getEmpno()+" , "+emp[i].getEname()+" , "+emp[i].getSalary() +" i="+i);
    	 i++;
    	 for(int j=0;j<i;j++) {
  			System.out.println(emp[j].getEmpno()+" , "+emp[j].getEname()+" , "+emp[j].getSalary() + " i="+i+" ,j="+j);
  		}
    	 }
 	}
 	public void update(int itemno, Employee e){
 		System.out.println("update");
 		emp[itemno] = e;
 	}
 	public void delete(int empno){  
 		System.out.println("delete");
 		System.out.println("i out = "+i);
 		for(int j=0;j<i;j++) {
 	 		System.out.println("in j loop i="+i+" , "+"j="+j);
 			if(empno == emp[j].getEmpno()) {
 				for(int k=j;k<i;k++) {
 			 		System.out.println("in k loop i="+i+" , "+"j="+j+" , "+"k="+k);
 					emp[k] = emp[k+1];
 				}
 			}
 		}
 	}
 	public void print()
 	{
 		System.out.println("print");
 		for(int j=0;j<i;j++) {
 			System.out.println(emp[j].getEmpno()+" , "+emp[j].getEname()+" , "+emp[j].getSalary() + " i="+i+" ,j="+j);
 		}
 	}
}

public class LabAssignment3 {

	public static void main(String[] args) {
        int ch;
        EmpManager em = new EmpManager();
        Employee e = new Employee();
        Scanner sc=new Scanner(System.in);
        while(true) {
        System.out.println("Enter 1 for create employee.\n Enter 2 for update employee.\nEnter 3 for delete employee.\nEnter 4 for printing employees.\nEnter 5 for exit ");
        ch = sc.nextInt();
        switch(ch) {
        case 1:
        	System.out.println("Enter employee id");
        	e.setEmpno(sc.nextInt());
        	System.out.println("Enter employee name");
        	e.setEname(sc.next());
        	System.out.println("Enter employee salary");
        	e.setSalary(sc.nextDouble());
        	em.create(e);
        	break;
        case 2:
        	System.out.println("Enter the item number to update");
        	int itemno = sc.nextInt();
        	System.out.println("Enter employee id");
        	e.setEmpno(sc.nextInt());
        	System.out.println("Enter employee name");
        	e.setEname(sc.next());
        	System.out.println("Enter employee salary");
        	e.setSalary(sc.nextDouble());
        	em.update(itemno, e);
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
