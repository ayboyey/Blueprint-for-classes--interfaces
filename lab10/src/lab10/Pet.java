package lab10;

public class Pet extends LivingCreature {

	private MovementType mt;
	private boolean isDog;

	public Pet(String id, int year, boolean isDog, MovementType mt) {
		super(id, year);
		this.isDog = isDog;
		this.mt=mt;
	}
	
	private String isDogString() {
		if(isDog) return "This pet is dog";
		else return "";
	}
	
	public String toString() {
		return "Name "+ super.getName() + ", age " + super.getAge()+", movemenet type " + mt.name().toLowerCase() + this.isDogString();
	}
}
