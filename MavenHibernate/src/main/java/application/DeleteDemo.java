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

		// 1. using methods
		Emp e = s.get(Emp.class, 7654);
		Emp e2 = s.get(Emp.class, 7654);
//		s.remove(e);	//JPA compliant method
		s.delete(e); // Hibernate specific method
		tr.commit();

		Transaction tr2 = s.beginTransaction();
		System.out.println("Before persist\n" + e);
		s.persist(e); // query
		System.out.println("After persist\n" + e);

//		HQL query
//		String hql = "DELETE FROM Emp WHERE id = :id";
//		int deleteCount = s.createQuery(hql).setParameter("id", 7566).executeUpdate();
//		System.out.println("Deleted count : " + deleteCount);
		tr2.commit();
	}

}
