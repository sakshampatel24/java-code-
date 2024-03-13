package inheritance;

public class Animal {
	    public void makeSound() {
	        System.out.println("Animal makes a sound");
	  }
	}
	class Cat extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Dog barks");
	    }
	}

	