package application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Emp;

public class SaveDemo {

	public static void main(String[] args) {
		// This creates Service
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		// Now read info from hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();

		// create a session factory
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();

		Session session = sf.openSession();

		// Transient object
		Emp e = new Emp(7399, "Milkha", "CLERK", 7902, null, 9999.99f, 1.6f, 20);

		Transaction tr = session.beginTransaction();
		session.save(e);
		tr.commit();

		System.out.println("Employee saved to table");

		sf.close();
		registry.close();
	}

}
