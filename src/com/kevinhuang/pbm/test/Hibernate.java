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
         //1.新建configuration对象
        Configuration configuration=new Configuration().configure();

        configuration.addClass(Account.class);
        //2.通过configuration创建sessionFactory对象
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        SessionFactory sessionFactory=configuration.buildSessionFactory(serviceRegistry);

        //3.通过sessionFactory得到session
        Session session=sessionFactory.openSession();

        //4.通过session对象得到Transaction对象
        Transaction transaction=session.beginTransaction();
        //5.保存数据
        Account account = new Account();
		account.setPassword("12345");
		account.setBalance(100);
		account.setName("kevinhuang");
		
        session.save(account);
        //6.提交事务
        transaction.commit();
        
        //7.关闭session
        session.close();
        System.out.println("save ok");

    }
}
















