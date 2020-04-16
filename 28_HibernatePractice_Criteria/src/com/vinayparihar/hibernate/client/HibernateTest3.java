package com.vinayparihar.hibernate.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.vinayparihar.hibernate.beans.dto.UserDetails;

public class HibernateTest3 {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//Fetching data using criteria
		Criteria criteria=session.createCriteria(UserDetails.class);
		//condition in Criteria, it represent and relationship
		criteria.add(Restrictions.like("userName", "%VSP6%"))
				.add(Restrictions.between("userId",3,32));
				

		
		List<UserDetails> userDetails = (List<UserDetails>) criteria.list();
		for (UserDetails userDetails2 : userDetails) {
			System.out.println(userDetails2.getUserName());

		}

		session.getTransaction().commit();
		session.close();

		System.out.println("Total Number of Users : " + userDetails.size());

		}

		
	}


