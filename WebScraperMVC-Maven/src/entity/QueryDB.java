package entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class QueryDB {

	public static List<Stock> GetAllStocks() {

		
		SessionFactory factory = new Configuration().configure() 
								 .addAnnotatedClass(Stock.class) 					
								 .buildSessionFactory(); 							

	
		Session session = factory.getCurrentSession();

		try {


			session.beginTransaction();
			

			
			List<Stock> stocks=session.createQuery("from Stock").getResultList();
			
		
			// System.out.println(">>--> All stocks in database <--<<");
			// displayStudents(stocks);
			
			
			session.getTransaction().commit();
			System.out.println("Transaction Completed!");
			
			return stocks;
		} finally {
			factory.close();
		}
	}
		private static void displayStudents(List<Stock> stocks) {
			for  (Stock stock : stocks) {
				System.out.println(stock);
			}
		}
}
