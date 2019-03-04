
public class Dog implements Animal{

	String name;
	int legs;
	
	public Dog(String n, int l) {
		name = n;
		legs = l;
	}
	
	@Override
	public String toString() {
		return "[" + name + ", " + legs + "]"; 
	}
	
	public int getLegs() {
		return legs;
	}

}
