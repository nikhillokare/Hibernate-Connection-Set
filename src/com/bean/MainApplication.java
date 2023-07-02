package com.bean;
import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainApplication {

	public static void main(String[] args) {
		
        Session s = new AnnotationConfiguration().configure().buildSessionFactory().openSession(); 
        Transaction t = s.beginTransaction();
        
        Director d = new Director();
        d.setId(101);
        d.setName("Yash Chopra");
        
        HashSet<Movie>s1= new HashSet<Movie>();
        s1.add(new Movie(1,"DDLJ"));
        s1.add(new Movie(2,"Mohhobatein"));
        
        d.setMovies(s1);
        
        System.out.println("***********************************************************");
        
        Director d1 = new Director();
        d1.setId(102);
        d1.setName("Subhash Ghai");
        
        HashSet<Movie> s2 = new HashSet<Movie>();
        s2.add(new Movie(3,"Taal"));
        s2.add(new Movie(4,"Gadar"));
        s2.add(new Movie(5,"Prince"));
        s2.add(new Movie(6,"After"));
        s2.add(new Movie(7,"Avengers"));
        
        d1.setMovies(s2);
        s.save(d);
        s.save(d1);
        t.commit();
		
	}
	 

}
