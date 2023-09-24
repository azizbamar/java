package test;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ZooManagement {
	public static void main(String[] args) {
		Animal animal1 = new Animal("Elephant","Elephantidae",50,true);
		Animal animal2 = new Animal("Lion","Felidae",10,true);
		Animal animal3 = new Animal("Dolphin","Delphinidae",20,true);
		
		Zoo zoo = new Zoo("frigya","tunisie",10);
		System.out.println(zoo);
		System.out.println(zoo.toString());
		zoo.addAnimal(animal1);
		zoo.addAnimal(animal2);
		zoo.addAnimal(animal3);
		System.out.println(zoo.animals[1]);


		System.out.println(zoo.searchAnimal(animal1));
		Animal sameAnimal1 = new Animal("Elephant","Elephantidae",50,true);

		zoo.addAnimal(sameAnimal1);
		System.out.println(zoo.searchAnimal(sameAnimal1));
		
        System.out.println(zoo.removeAnimal(sameAnimal1));




	}
}
