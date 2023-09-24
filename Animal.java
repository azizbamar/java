package test;

public class Animal {
	String family;
	String name;
	int age;
	boolean isMammal;
	public Animal(String family,String name, int age, boolean isMammal) {
		this.family = family;
		this.name = name ;
		this.age = age;
		this.isMammal = isMammal;
	}
	@Override
	public String toString() {
		return "Animal --> name : "+this.name+"--> \n"
				+ "family :" +this.family+"\n"
						+ "age :"+this.age+"--> \n"+
				"is mammal :" +this.isMammal;
		
	}

}
