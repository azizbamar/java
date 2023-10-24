package test;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ZooManagement {
	public static void main(String[] args) throws ZooFullException {
		Animal animal1 = new Animal("Elephant","Elephantidae",-1,true);
		Animal animal2 = new Animal("Lion","Felidae",10,true);
		Animal animal3 = new Animal("Dolphin","Delphinidae",20,true);
		Animal animal4 = new Animal("Dolphin","Delphinidae",20,true);

//		
		Zoo zoo = new Zoo("frigya","tunisie");
//		Zoo zoo2 = new Zoo("zoo2","hammamet");
//		
//		System.out.println(zoo);
//		System.out.println(zoo.toString());
		try {
			zoo.addAnimal(animal1);
			
		}
		catch(InvalidAgeException e) {
			System.out.println(e);

		}
		
		catch(ZooFullException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("nbre animals -> "+zoo.nbrAnimals);
		}
		try {
			zoo.addAnimal(animal2);
			
		}
		catch(InvalidAgeException e) {
			System.out.println(e);

		}
		catch(ZooFullException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("nbre animals -> "+zoo.nbrAnimals);
		}		
		try {
			zoo.addAnimal(animal3);
			
		}
		catch(InvalidAgeException e) {
			System.out.println(e);

		}
		catch(ZooFullException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("nbre animals -> "+zoo.nbrAnimals);
		}
		try {
			zoo.addAnimal(animal4);
			
		}
		catch(InvalidAgeException e) {
			System.out.println(e);

		}
		catch(ZooFullException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("nbre animals -> "+zoo.nbrAnimals);
		}
		
		
		
		
		
		//		System.out.println(zoo.animals[1]);
//		System.out.println("**************le Zoo avec le plus  d'animaux. **********");
//
//		System.out.println(Zoo.comparerZoo(zoo, zoo2));
//
//
//		System.out.println(zoo.searchAnimal(animal1));
//////		Animal sameAnimal1 = new Animal("Elephant","Elephantidae",50,true);
////
//////		zoo.addAnimal(sameAnimal1);
//////		System.out.println(zoo.searchAnimal(sameAnimal1));
//////		
//////        System.out.println(zoo.removeAnimal(sameAnimal1));
//        int i=0;
//        System.out.println(i++);
//        System.out.println(++i);
        
        
//        Aquatic aquatic = new Aquatic("test", "test", 0, false, "test") ;
//        Terrestrial terrestrial = new Terrestrial("test", "test", 0, false, 4) ;
//        Dolphin dolphin = new Dolphin("test", "test", 0, false, "test", 20);
//        Penguin penguin = new Penguin("test", "test", 0, false, "test", 40);
//        System.out.println(terrestrial);
//
//
//        
//        
//        zoo.addAquaticAnimal(dolphin);
//        zoo.addAquaticAnimal(penguin);
//        System.out.println(dolphin);
//        System.out.println(penguin);
//        dolphin.swim();
//        penguin.swim();







	}
}
