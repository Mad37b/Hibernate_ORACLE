package com.iesVda.persistence;


import java.util.*;

import javax.persistence.*;
@Entity
@Table(name="employees")
public class employees {
	@Id
	 @Column(name="employee_id")
	int employeeId;
	 @Column(name="job_id")
	String jobId;
	 @Column(name="manager_id")
	int managerId;
	 @Transient
	Job currentJob;
	 @Column(name="first_name")
	String firstName;
	 @Column(name="last_name")
	String lastName;
	 @Column(name="email")
	String email;
	 @Column(name="phone_number")
	String phoneNumber;
	 @Column(name="salary")
	float salary;
	 @Column(name="hire_date")
	 Date hireDate;
	 @Column(name="commission_pct")
	float commisionPCT;
  	 @Transient
	boolean isManager;
	 @Transient
	boolean isWorking;
	@Column(name="department_id")
	int departmentId;
 @Transient
	List<jobHistory> workerJobHistory=new ArrayList<jobHistory>();
	
	public void setEmployeeId(int anId) {
		this.employeeId=anId;
	}
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	public void setManagerId(int anId) {
		this.managerId=anId;
	}
	public void setFirstName(String aName) {
		
		this.firstName=aName;
	}

    public String getFirstName() {
		
		return firstName;
	}
	
	
	public void setLastName(String theLastName) {
		this.lastName=theLastName;
	}
	
	 public String getLasttName() {
			
			return lastName;
		}
	
	public void setHireDate(Date aHireDate) {
		this.hireDate=aHireDate;
	}
	public void setPhoneNumber(String aPhoneNumber) {
		this.phoneNumber=aPhoneNumber;
	}
	public void setEmail(String emailAddress) {
		
		this.email=emailAddress;
	}
	
    public void setJobId(String aJobId) {
		
		this.jobId=aJobId;
	}
    public void setDepartmentId(int departmentId) {
    	
    	this.departmentId=departmentId;
    }
	
public void setSalary(float theSalary) {
		
		this.salary=theSalary;
	}

	List<jobHistory> getJobHistory(){
		
		return workerJobHistory;
	}

}


