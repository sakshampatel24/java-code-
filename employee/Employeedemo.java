package employee;
public class Employeedemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setEmail("patelsak223@gmail.com");
		emp1.setEname("Saksham patel");
		emp1.setDesignation("Software Engineer");
		emp1.check_Eligible(18,80000);
		emp1.display();
		emp1.getdata();
		System.out.println(emp1.toString());
		}
}
