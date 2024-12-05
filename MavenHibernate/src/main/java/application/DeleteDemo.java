package application;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Emp;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadat = new MetadataSources(registry).getMetadataBuilder().build();
		SessionFactory sf = metadat.getSessionFactoryBuilder().build();
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		Emp e = s.get(Emp.class, 7499);
		s.delete(e);
		
		tr.commit();
		
		
	}

}
