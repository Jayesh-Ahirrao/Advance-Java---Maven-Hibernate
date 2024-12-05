package application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Emp;

public class UpdateDemo {
	public static void main(String[] args) {
		// registry to create service
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		// read info from hibernate.cfg.xml
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		Session s = sf.openSession();
		
		Emp e = s.get(Emp.class, 7499);
		
		Transaction tr = s.beginTransaction();
		e.setDeptNumber(0000);
//		s.update(e);
		tr.commit();
		
		e = s.get(Emp.class, 7499);
		System.out.println(e);
	}

}
