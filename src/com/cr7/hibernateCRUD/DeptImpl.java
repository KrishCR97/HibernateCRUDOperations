package com.cr7.hibernateCRUD;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class  DeptImpl implements IDept {
private static Configuration configuration = null;
private static SessionFactory sessionFactory = null;
static {
		configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		
}
	@Override
	public void saveDepartment(Dept department) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transcation = session.beginTransaction();
		Serializable id = session.save(department);
		transcation.commit();
		System.out.println(id);
		
		session.close();
	}

	@Override
	public void getCustomers(int deptId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upateDepatments(Dept depatment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDepatment(Dept department) {
		// TODO Auto-generated method stub
		
	}

}
