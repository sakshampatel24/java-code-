package employee;

public class Employee {
	private String ename,email,designation;
	public int age,salary;
	public double Tax;
	public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", email=" + email + ", designation=" + designation +"]";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void check_Eligible(int age,int salary) {
		 this.age = age;
		 this.salary = salary;
		if(age >=18 && age <= 100 && salary>=50000 && salary<=80000)
		{
		    Tax = (10*50000) / 100;
			System.out.println("you have to pay Tax with 10 percentage:" +Tax);
			System.out.println("you can vote");
			//System.out.println("age:"+age);
		}
		else if (age >= 10 && age <= 17 && salary > 50000 && salary < 100000) {
			Tax =(20*50000)/100;
			System.out.println("you cannot vote");
			System.out.println("you have to pay Tax with 20 percentage:" +Tax);
			//System.out.println("age:"+age);
		}
	
		else 
		{
	
			System.out.println("you have to go");
		}
	  }

	public void getdata() {
		ename ="Saksham";
		email="patelska@223gamil.com";
		designation="Software engineer";
		
	}
	public void display() {
		System.out.println(ename +" "+email+" "+" "+designation+" ");
		System.out.println("Age: " +age);
		System.out.println("salary: " +salary);
	}

}
