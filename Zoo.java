package test;

public class Zoo {
	Animal [] animals;
	String name;
	String city;
	final int nbrCages = 25;
    int nbrAnimals;

	public Zoo(String name, String city) {
		animals = new Animal[nbrCages];
		this.name = name;
		this.city = city;
		}
	
    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", n Cages" + nbrCages);
    }
    
    
    
    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", n Cages :" + nbrCages;
    }
    
    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (nbrAnimals == nbrCages)
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    
    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }
    
    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1)
            return false;
        for (int i = index; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }
    boolean isZooFull() {
    	return this.nbrAnimals == this.nbrCages;
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
    	if (z1.nbrAnimals >= z2.nbrAnimals) {
    		return z1;
    	}
    	else return z2;
    	
    }
}
