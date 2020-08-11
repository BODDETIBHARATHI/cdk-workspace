import java.util.Scanner;
class Emp{
	private int empid;
	private String ename;
	private double salary;
	public Emp(int empid, String ename, double salary) {
		// TODO Auto-generated constructor stub
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEmpno() {
		return empid;
	}
	public void setEmpno(int empid) {
		this.empid = empid;
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
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Emp[] e = new Emp[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
        	int empid = sc.nextInt();
        	String ename = sc.next();
        	double salary = sc.nextDouble();
        	e[i] = new Emp(empid, ename, salary);
        }
        for(int i=0;i<5;i++) {
        	System.out.println("Employee "+(i+1)+" id = "+e[i].getEmpno()+ " name = "+e[i].getEname()+" salary = "+e[i].getSalary());
        }
        sc.close();
	}

}
