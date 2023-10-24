package test;

public class Zoo {
	Animal [] animals;
	String name;
	String city;
	final int nbrCages = 3;
    int nbrAnimals;
    Aquatic[] aquaticAnimals;
    int nbraquaticAnimals;

	public Zoo(String name, String city) {
		animals = new Animal[nbrCages];
		this.name = name;
		this.city = city;
		aquaticAnimals = new Aquatic[10];
		nbraquaticAnimals = 0;
		}
	
    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", n Cages" + nbrCages);
    }
    
    
    
    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", n Cages :" + nbrCages;
    }
    public void addAquaticAnimal(Aquatic aquatic) {
    	aquaticAnimals[nbraquaticAnimals] = aquatic;
    	nbraquaticAnimals++;
    	
    }
    
    public float maxPenguinSwimmingDepth() {
    	float max = 0;
    	for (int i=0;i<aquaticAnimals.length;i++){
    		if(aquaticAnimals[i] instanceof Penguin) {
    			Penguin p = (Penguin) aquaticAnimals[i];
    			if(max<p.swimmingDepth) {
    				max = p.swimmingDepth;
    			}
    		}
    		
    	}
    	return max;
    }
    public void displayNumberOfAquaticsByType() {
    	int nbPenguin = 0;
    	int nbDolphin = 0;
    	for (int i=0;i<aquaticAnimals.length;i++){
    		if(aquaticAnimals[i] instanceof Penguin) {
    			nbDolphin++;
    		}
    		else {
    			nbPenguin++;
    		}

    		
    	}
    	System.out.println("nb penguin "+nbPenguin+"------nb Dolphin  : " +nbDolphin);
    }
    
    void addAnimal(Animal animal) throws ZooFullException,InvalidAgeException{
    if(animal.age>0) {
    	if (nbrAnimals<nbrCages) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
    	}
    	else {
    		throw new ZooFullException("zoo is full !");
    	}
    	
    }
    else {
    	throw new InvalidAgeException("negatif age");
    }

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
