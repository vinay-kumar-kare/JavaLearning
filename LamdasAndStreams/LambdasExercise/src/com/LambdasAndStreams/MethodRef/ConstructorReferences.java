package com.LambdasAndStreams.MethodRef;

public class ConstructorReferences {

	class Movie{
		//Constructor 1
		public Movie(int id) {
			
		}
		
		//Constructor 2
		public Movie(int id, String name) {
					
		}
		
		
		interface MovieFactory {
			public Movie create(int id);
		}
		MovieFactory m1= i->new Movie(i);
		MovieFactory m2 = Movie::new;
		
		interface MovieFactory2 {
			public Movie create(int id, String name);
		}
		
		
		public static void main(String[] args) {
			ConstructorReferences client = new ConstructorReferences();
		}
	}
}
