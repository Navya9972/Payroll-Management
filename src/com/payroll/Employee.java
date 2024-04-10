package com.payroll;

public class Employee {
	
	private String name,gender,address,doornumber,street,area,city,pin,location,department,employeetype,band,monthofpay;
	private int employeeid,pfnummber,bankaccountnumber,ctcinlakhs,basicsalary,varialblepay,providentfund,otherallowances,incometax,messbill,netpay,grosspay;
	public Employee(String name, String gender, String doornumber, String street, String area,
			String city, String pin, String location, String department, String employeetype, String band,
			int employeeid, int pfnummber, int bankaccountnumber, int ctcinlakhs) {
		super();
		this.name = name;
		this.gender = gender;
		this.doornumber = doornumber;
		this.street = street;
		this.area = area;
		this.city = city;
		this.pin = pin;
		this.location = location;
		this.department = department;
		this.employeetype = employeetype;
		this.band = band;
		this.employeeid = employeeid;
		this.pfnummber = pfnummber;
		this.bankaccountnumber = bankaccountnumber;
		this.ctcinlakhs = ctcinlakhs;
	}
	
	public Employee()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDoornumber() {
		return doornumber;
	}
	public void setDoornumber(String doornumber) {
		this.doornumber = doornumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmployeetype() {
		return employeetype;
	}
	public void setEmployeetype(String employeetype) {
		this.employeetype = employeetype;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getPfnummber() {
		return pfnummber;
	}
	public void setPfnummber(int pfnummber) {
		this.pfnummber = pfnummber;
	}
	public int getBankaccountnumber() {
		return bankaccountnumber;
	}
	public void setBankaccountnumber(int bankaccountnumber) {
		this.bankaccountnumber = bankaccountnumber;
	}
	public int getCtcinlakhs() {
		return ctcinlakhs;
	}
	public void setCtcinlakhs(int ctcinlakhs) {
		this.ctcinlakhs = ctcinlakhs;
	}
	
	
	

}
