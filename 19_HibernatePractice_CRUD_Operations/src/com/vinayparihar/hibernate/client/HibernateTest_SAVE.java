package com.vinayparihar.hibernate.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vinayparihar.hibernate.beans.dto.Address;
import com.vinayparihar.hibernate.beans.dto.FourWheller;
import com.vinayparihar.hibernate.beans.dto.TwoWheller;
import com.vinayparihar.hibernate.beans.dto.UserDetails;
import com.vinayparihar.hibernate.beans.dto.Vehicle;

public class HibernateTest_SAVE {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		for (int i = 1; i < 11; i++) {
			//Saving Data to DB
			UserDetails userDetails = new UserDetails();
			userDetails.setUserName("VSP" + i);
			session.save(userDetails);

		}

		session.getTransaction().commit();
		session.close();

	}

}
