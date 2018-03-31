package com.kevinhuang.pbm.entity;

public class Account {
	private Long id;
	private String password;
	private double balance;
	private String name;
	
	public Account(){
		
	};
	public Account(Long id,String password,double balance,String name){
		this.id = id;
		this.password = password;
		this.balance = balance;
		this.name = name;
	};
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
