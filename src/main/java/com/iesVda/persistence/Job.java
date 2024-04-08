package com.iesVda.persistence;
import javax.persistence.*;

@Entity
@Table(name="jobs")
public class Job {
	
	@Id
	 @Column(name="job_id")
	String jobId;
	@Column(name="job_title")
	String jobTitle;
	@Column(name="min_salary")
	float minSalary;
	@Column(name="max_salary")
	float maxSalary;

	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public float getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(float minSalary) {
		this.minSalary = minSalary;
	}
	public float getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(float maxSalary) {
		this.maxSalary = maxSalary;
	}
	

	
}
