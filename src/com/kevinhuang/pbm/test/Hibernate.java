package com.kevinhuang.pbm.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.kevinhuang.pbm.entity.Account;

public class Hibernate {
    public static void main(String[] args) {
         //1.�½�configuration����
        Configuration configuration=new Configuration().configure();

        configuration.addClass(Account.class);
        //2.ͨ��configuration����sessionFactory����
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        SessionFactory sessionFactory=configuration.buildSessionFactory(serviceRegistry);

        //3.ͨ��sessionFactory�õ�session
        Session session=sessionFactory.openSession();

        //4.ͨ��session����õ�Transaction����
        Transaction transaction=session.beginTransaction();
        //5.��������
        Account account = new Account();
		account.setPassword("12345");
		account.setBalance(100);
		account.setName("kevinhuang");
		
        session.save(account);
        //6.�ύ����
        transaction.commit();
        
        //7.�ر�session
        session.close();
        System.out.println("save ok");

    }
}
















