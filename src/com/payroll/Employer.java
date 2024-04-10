package com.payroll;
import java.util.*;

public class Employer extends Employee{
	
	private String nameofthecompany,locations,bands,departments,monthofpay,date;
	static int incometax;
	private ArrayList <String> elocation = new ArrayList<>();
	private ArrayList<String> eband = new ArrayList<>(); 
	private ArrayList<String> edept= new ArrayList<>();
	private HashMap<Integer,String> empdictionary = new HashMap<Integer,String>();
	public Employer(String cname,ArrayList location,ArrayList band,ArrayList dept,HashMap empdictionary) {
		this.nameofthecompany=cname;
		this.elocation=location;
		this.eband=band;
		this.edept=dept;
		this.empdictionary=empdictionary;
	}
	
	public Employer()
	{
		
	}

	public String getNameofthecompany() {
		return nameofthecompany;
	}

	public void setNameofthecompany(String nameofthecompany) {
		this.nameofthecompany = nameofthecompany;
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public String getBands() {
		return bands;
	}

	public void setBands(String bands) {
		this.bands = bands;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}
	
	public static void employee_details( Employee value)
	{
		System.out.println("Employee Name: "+value.getName());
		System.out.println("Employee Gender: "+value.getGender());
		System.out.println("Employee doornumber: "+value.getDoornumber());
		System.out.println("Employee Street: "+value.getStreet());
		System.out.println("Employee area: "+value.getArea());
		System.out.println("Employee city: "+value.getCity());
		System.out.println("Employee pincode: "+value.getPin());
		System.out.println("Employee location: "+value.getLocation());
		System.out.println("Employee department: "+value.getDepartment());
		System.out.println("Employee type: "+value.getEmployeetype());
		System.out.println("Employee id: "+value.getEmployeeid());
		System.out.println("Employee PF Number: "+value.getPfnummber());
		System.out.println("Employee BankAccount Number: "+value.getBankaccountnumber());
		System.out.println("Employye Package: "+value.getCtcinlakhs());
	}
	HashMap<String,Object> details=new HashMap<>();
	
	
	public static void modify_user(Employee value)
	{
		
		System.out.println("1 modify name");
		System.out.println("2 modify Location");
		System.out.println("3 modify department");
		System.out.println("4 modify employee type");
		System.out.println("5 modify band");
		System.out.println("6 modify account number");
		System.out.println("7 modify ctc");
		System.out.println("Select to modify details");
		Scanner sc=new Scanner(System.in);
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter name to modify");
			String name=sc.next();
			value.setName(name);
			break;
		case 2:
			System.out.println("Enter location to modify");
			String location =sc.next();
			value.setLocation(location);
			break;
		case 3:
			System.out.println("Enter department to modify");
			String department=sc.next();
			value.setDepartment(department);
			break;
		case 4:
			System.out.println("Enter employee type to modify");
			String emptype=sc.next();
			value.setDepartment(emptype);
			break;
		
		case 5:
			System.out.println("Enter Employee band to modify");
			String empband=sc.next();
			value.setDepartment(empband);
			break;
		case 6:
			System.out.println("Enter employee account number to modify");
			String accno=sc.next();
			value.setDepartment(accno);
			break;
		case 7:
			System.out.println("Enter ctc to modify");
			int ctc=sc.nextInt();
			value.setCtcinlakhs(ctc);
			break;
		default:
			System.out.println("Enter valid choice");
				
		}
	}
	
	public static ArrayList generate_payslip(Employee value,String mop,int empid,int messbill,String date)
	{
		ArrayList details=new ArrayList<>();
		int basicsalary=value.getCtcinlakhs()/100*60;
		int vpp=value.getCtcinlakhs()/100*30;
		int pf=value.getCtcinlakhs()/100*5;
		int otherallowances=value.getCtcinlakhs()/100*5;
		if(value.getCtcinlakhs()<500000)
		{
			 incometax=value.getCtcinlakhs()/100*0;
			
		}
		else if(value.getCtcinlakhs()>=500000 && value.getCtcinlakhs()<1000000)
		{
			incometax=value.getCtcinlakhs()/100*5;
		}
		else if(value.getCtcinlakhs()>=1010000 && value.getCtcinlakhs()<1510000)
		{
			incometax=value.getCtcinlakhs()/100*10;
			
		}
		else if(value.getCtcinlakhs()>=1510000 && value.getCtcinlakhs()<2000000)
		{
			incometax=value.getCtcinlakhs()/100*15;
			
		}
		else
		{
			incometax=value.getCtcinlakhs()/100*20;
			
		}
		int grosspay=basicsalary+vpp+pf+otherallowances;
		int netpay=grosspay-incometax-messbill;
		details.add(date);
		details.add(empid);
		details.add(basicsalary);
		details.add(vpp);
		details.add(pf);
		details.add(otherallowances);
		details.add(incometax);
		details.add(grosspay);
		details.add(netpay);
		System.out.println(date+":");
		System.out.println("Basic Salary: "+basicsalary);
		System.out.println("VPP: "+vpp);
		System.out.println("Provident Fund: "+pf);
		System.out.println("Other allowances: "+otherallowances);
		System.out.println("Income Tax: "+incometax);
		System.out.println("Mess_BII"+messbill);
		System.out.println("Gross pay: "+grosspay);
		System.out.println("NetPay: "+netpay);	
		
		return details;
		
	}	

}
