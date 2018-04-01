package com.kevinhuang.pbm.dao;

import org.hibernate.*;
import com.kevinhuang.pbm.entity.Account;
import com.kevinhuang.pbm.util.*;

//DAO interface
public class AccountDao {
	public void insertAccount(Account account) throws Exception{
		Session session =null;
		Transaction t = null;
		try{
			session = HibernateUtil.getSession();
			t = session.beginTransaction();
			session.save(account);
			t.commit();
			
		}catch(Exception e){
			t.rollback();
			throw e;
		}finally{
			if(session != null)
				session.close();
		}
		
		
	}
	
	public void updateAccount(Account account) throws Exception{
		Session session =null;
		Transaction t = null;
		try{
			session = HibernateUtil.getSession();
			t = session.beginTransaction();
			session.saveOrUpdate(account);
			t.commit();
			
		}catch(Exception e){
			t.rollback();
			throw e;
		}finally{
			if(session != null)
				session.close();
		}
	}
	
	public Account queryAccountById(Long id) throws Exception{
		Session session =null;
		try{
			session = HibernateUtil.getSession();		
			Account a = (Account)session.load(Account.class,id);
			return a;
		}finally{
			if(session != null)
				session.close();
		}
	}
	
	public void deleteAccountById(Long id) throws Exception{
		Session session =null;
		Transaction t = null;
		try{
			session = HibernateUtil.getSession();
			t = session.beginTransaction();
			Account a = session.load(Account.class, id);
			session.delete(a);
			t.commit();

		}finally{
			if(session != null)
				session.close();
		}
	}

}
