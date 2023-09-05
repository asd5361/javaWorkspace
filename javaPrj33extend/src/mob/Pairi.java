package mob;

public class Pairi extends Pokemon{

	public Pairi() {
		
	}
	
	
	
	public void skill() {
		System.out.println(getName() + "의 불꽃 발사!!");
		
	}


	@Override
	public String toString() {
		return "Pairi [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}

	
	
}
