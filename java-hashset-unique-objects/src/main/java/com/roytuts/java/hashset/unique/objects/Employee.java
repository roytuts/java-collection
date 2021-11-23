package com.roytuts.java.hashset.unique.objects;

import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private String address;

	public Employee() {
	}

	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
