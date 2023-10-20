package test;

public class Dolphin extends Aquatic{
	float swimmingSpeed;
	public Dolphin(String family, String name, int age, boolean isMammal, String habitat,float swimmingSpeed) {
		super(family, name, age, isMammal, habitat);
		this.swimmingSpeed = swimmingSpeed;
	}
	public void swim() {
		System.out.println("This dolphin animal is swimming.");
	}
	@Override
	public String toString() {
		return "Dolphin [swimmingSpeed=" + swimmingSpeed + ", habitat=" + habitat + ", family=" + family + ", name="
				+ name + ", age=" + age + ", isMammal=" + isMammal + "]";
	}

}
