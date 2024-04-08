package com.iesVda.persistence;

import javax.persistence.*;

@Entity
@Table(name="countries")
public class countries {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="country_id")
	int country_id;
	@Column(name="country_name")
	String country_name;
	@Column(name="region_id")
	int region_id;
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	

}
