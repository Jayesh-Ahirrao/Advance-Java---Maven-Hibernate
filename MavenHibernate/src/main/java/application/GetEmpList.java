package application;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import entities.Emp;

public class GetEmpList {
	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		SessionFactory sf = metadata.buildSessionFactory();

		Session s = sf.openSession();

		String query = "FROM Emp";

		Query<Emp> q = s.createQuery(query, Emp.class);
		List<Emp> list = q.getResultList();
		for (Emp e : list) {
			System.out.println(e);
		}

	}

}
