package gaujau;

import java.util.*;

public class jpt {
	
	    private List<Person> listPeople; 
	   
	    public void setListPeople(List<Person> list) { 
	        this.listPeople = new ArrayList<Person>(list); 
	    } 
	   
	    public List<Person> getListPeople() { 
	        return new ArrayList<Person>(this.listPeople); 
	    } 
	   
	    public static void main(String[] args) { 
	        jpt app = new jpt(); 
	   
	        List<Person> list1 = new ArrayList<Person>(); 
	        list1.add(new Person("Peter")); 
	        list1.add(new Person("Alice")); 
	        list1.add(new Person("Mary")); 
	   
	        app.setListPeople(list1); 
	   
	        System.out.println("List 1: " + list1); 
	   
	        list1.get(2).setName("Maryland"); 
	   
	        List<Person> list2 = app.getListPeople(); 
	        System.out.println("List 2: " + list2); 
	   
	        list1.get(0).setName("Peter Crouch"); 
	   
	        List<Person> list3 = app.getListPeople(); 
	        System.out.println("List 3: " + list3); 
	   
	    } 
	} 
	   
	class Person { 
	    private String name; 
	   
	    public Person(String name) { 
	        this.name = name; 
	    } 
	   
	    public String getName() { 
	        return this.name; 
	    } 
	   
	    public void setName(String name) { 
	        this.name = name; 
	    } 
	   
	    public String toString() { 
	        return this.name; 
	    } 
	}


