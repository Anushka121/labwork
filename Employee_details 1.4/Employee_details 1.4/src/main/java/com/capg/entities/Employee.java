package com.capg.entities;

public class Employee {
    private Int id;
    private String name;
    private int salary;
  

   

	public Employee(){

    }

    public Employee(int id, String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public Int getId() {
        return id;
    }

    public void setId(Int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
