package com.payroll;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Employee> employeedetails = new HashMap<Integer, Employee>();
		int employeeid = 212854;
		Employer ep = new Employer();
		while (true) {
			System.out.println("1 Add user");
			System.out.println("2. modify user");
			System.out.println("3 Remove employee");
			System.out.println("4 search employee");
			System.out.println("5 print all employee details");
			System.out.println("6 Generate pay slip");
			System.out.println("7 Exit");
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:

					System.out.println("Enter employee name");
					String name = sc.next();
					System.out.println("Enter employee gender");
					String gender = sc.next();
					System.out.println("doornumber");
					String doornumber = sc.next();
					System.out.println("Enter employee street");
					String street = sc.next();
					System.out.println("Enter area");
					String area = sc.next();
					System.out.println("enter city");
					String city = sc.next();
					System.out.println("Enter pincode");
					String pincode = sc.next();
					System.out.println("Enter Employee base location");
					String location = sc.next();
					System.out.println("Enter Employee department");
					String department = sc.next();
					employeeid++;
					System.out.println("Enter Employee type");
					String employeetype = sc.next();
					System.out.println("Enter Employee Band");
					String employeeband = sc.next();
					System.out.println("Enter Employee PF number");
					int employeepfnumber = sc.nextInt();
					System.out.println("Enter Employee Bank account number");
					int employeeaccno = sc.nextInt();
					System.out.println("Enter Employee CTC in lakhs");
					int ctc = sc.nextInt();
					employeedetails.put(employeeid,
							new Employee(name, gender, doornumber, street, area, city, pincode, location, department,
									employeetype, employeeband, employeeid, employeepfnumber, employeeaccno, ctc));
					break;

				case 2:
					System.out.println("Enter employee id");
					int empid1 = sc.nextInt();
					for (Map.Entry<Integer, Employee> map : employeedetails.entrySet()) {
						Integer key = map.getKey();
						Employee value = map.getValue();
						if (key.equals(empid1)) {

							Employer.modify_user(value);

						}

					}
					break;
				case 3:
					System.out.println("Enter employee id");
					employeeid = sc.nextInt();
					for (Map.Entry<Integer, Employee> map : employeedetails.entrySet()) {
						Integer key = map.getKey();
						Employee value = map.getValue();
						if (key.equals(employeeid)) {
							System.out.println(key);

							Employer.employee_details(value);
							employeedetails.remove(employeeid);

						}
					}
					break;
				case 4:
					System.out.println("Enter employee id");
					int employeid = sc.nextInt();
					for (Map.Entry<Integer, Employee> map : employeedetails.entrySet()) {
						Integer key = map.getKey();
						Employee value = map.getValue();
						if (key.equals(employeid)) {
							System.out.println(key);
							Employer.employee_details(value);
						} else {
							System.out.println("Invaid Employee ID");
						}

					}
					break;
				case 5:
					System.out.println("All the employees details");
					System.out.println("--------------------------------------");
					for (Map.Entry<Integer, Employee> map : employeedetails.entrySet()) {
						Integer key = map.getKey();
						Employee value = map.getValue();

						System.out.println("Emp id : " + key);
						Employer.employee_details(value);
					}
					System.out.println("----------------------------------------");
					break;
				case 6:
					System.out.println("Enter month of pay");
					String monthofpay = sc.next();
					System.out.println("Enter mess bill");
					int messbill = sc.nextInt();
					LocalDateTime myDateObj = LocalDateTime.now();
					DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HHmm");
					String time = myDateObj.format(myFormatObj);
					DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("MM-YYYY");
					String date1 = myDateObj.format(myFormatObj1);
					System.out.println("Enter employee id");
					int empid3 = sc.nextInt();
					for (Map.Entry<Integer, Employee> map : employeedetails.entrySet()) {
						Integer key = map.getKey();
						Employee value = map.getValue();
						if (key.equals(empid3)) {
							System.out.println(key);
							ArrayList id = Employer.generate_payslip(value, monthofpay, empid3, messbill, date1);

						}
					}
					break;

				case 7:
					System.exit(1);
					break;
				default:
					System.out.println("Enter valid choice");

			}
		}
	}
}
