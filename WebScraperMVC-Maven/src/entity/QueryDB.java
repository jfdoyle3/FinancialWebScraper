package entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class QueryDB {

	private static SessionFactory factory = new Configuration().configure().addAnnotatedClass(Stock.class)
			.buildSessionFactory();

	private static Session session = factory.getCurrentSession();
			
	
			@SuppressWarnings("unchecked")
			public static List<Stock> GetAllStocks() {
			try {
			session.beginTransaction();

			List<Stock> stocks = session.createQuery("from Stock").getResultList();

			session.getTransaction().commit();
			System.out.println("Transaction Completed!");

			return stocks;

		} finally {
			factory.close();
		}
	}
}
