package mob;

public class Turtle extends Pokemon{

	public Turtle() {
		
	}
	
	
	
	public void skill() {
		System.out.println(getName() + "의 물대포!!");
		
	}


	@Override
	public String toString() {
		return "Turtle [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}
	
	

}
