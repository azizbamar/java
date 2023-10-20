package test;

public abstract class Aquatic extends Animal{
	String habitat;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aquatic other = (Aquatic) obj;
		if (habitat == null) {
			if (other.habitat != null)
				return false;
		} else if (!habitat.equals(other.habitat))
			return false;
		else if (!super.name.contentEquals(other.name))
			  return false;
		else if (super.age != other.age)
			return false;
		return true;
	}
	public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
		super(family, name, age, isMammal);
		this.habitat = habitat;
	}
	public 	abstract void swim();
	@Override
	public String toString() {
		return "Aquatic [habitat=" + habitat + ", family=" + family + ", name=" + name + ", age=" + age + ", isMammal="
				+ isMammal + "]";
	}

}
