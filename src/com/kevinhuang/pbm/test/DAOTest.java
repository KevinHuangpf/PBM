package com.kevinhuang.pbm.test;


import com.kevinhuang.pbm.dao.AccountDao;
import com.kevinhuang.pbm.entity.Account;

public class DAOTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		AccountDao dao = new AccountDao();
//		Account a =new Account();
//		a.setName("zhuxundong");
//		a.setPassword("4321");
//		a.setBalance(200);
//		
//		dao.insertAccount(a);
		
		Account a = dao.queryAccountById((long) 4);
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getBalance());
		System.out.println(a.getPassword());
		a.setName("wanzhe");
		
		dao.updateAccount(a);

		

	}

}
