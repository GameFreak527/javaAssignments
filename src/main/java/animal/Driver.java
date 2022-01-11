package animal;


public class Driver {
	
	public static void main(String[] args) {
		
		Animal parrot = new Parrot(2, 2, "Green");
		Animal parrot2 = new Parrot(2, 2, "Green");
		Animal tiger = new Tiger(4,1,"Red");
		
		check(parrot);
		check(tiger);
		
		//Only method that is in the Parent class can be used
		parrot.eat();
		
		//Casting down to Birds to use more methods
		((Birds)parrot).flap();
		((Birds)parrot).fly();
		
		//Equals
		compare(parrot,parrot2);
		
	}
	
	//Pass by reference 
	public static void check(Animal animal) {
		//instance of 
		if(Parrot.class.isInstance(animal)) {
			System.out.println("This is from the bird class");
		}
		else if (Tiger.class.isInstance(animal)) {
			System.out.println("This is from Animal class");
		}
	}
	
	public static void compare(Animal parrot, Animal parrot2) {
		System.out.println(parrot.equals(parrot2));
	}

}
