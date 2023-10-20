package test;

public class Penguin extends Aquatic{
	float swimmingDepth;

	public Penguin(String family, String name, int age, boolean isMammal, String habitat,float swimmingDepth) {
		super(family, name, age, isMammal, habitat);
		this.swimmingDepth = swimmingDepth;
	}

	@Override
	public String toString() {
		return "Penguin [swimmingDepth=" + swimmingDepth + ", habitat=" + habitat + ", family=" + family + ", name="
				+ name + ", age=" + age + ", isMammal=" + isMammal + "]";
	}

	@Override
	public void swim() {
		System.out.println("this penguin is swimming");
	}


}
