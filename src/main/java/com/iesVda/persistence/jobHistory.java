package com.iesVda.persistence;

import java.util.*;

import javax.persistence.*;
@Entity
@Table (name="job_history")
public class jobHistory {
	@Id
	 @Column(name="employee_id")
	private int employeeId;
	@Column(name="start_date")
	private Date startDate;
	@Column(name="end_date")
	private Date endDate;
	@Column(name="job_id")
	private String jobId;
	@Column(name="department_id")
	private int departmentId;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Date getStartDate(Date sDate) {
		
		return startDate;
	}
	public void setStartDate(Date startDate) {
		
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
}
