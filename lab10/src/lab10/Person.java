package lab10;

public class Person extends LivingCreature implements MentalSkills {

	private String skills = "";

	private MovementType moves[] = new MovementType[MovementType.values().length];

	public Person(String id, int year, String skills) {
		super(id, year);
		if (skillsCheck(skills)) {
			this.skills = skills;
		} else
			throw new IllegalArgumentException("Invalid skills implemented");
	}

	@Override
	public String toString() {
		return "Name: " + super.getName() + ", of age: " + super.getAge() + skillsToString(this.getSkills())
				+ this.getMovements();
	}

	@Override
	public boolean canRead() {
		return this.can('R');
	}

	@Override
	public boolean canWrite() {
		return this.can('W');
	}

	@Override
	public boolean canSing() {
		return this.can('S');
	}

	private boolean properString(String str) {

		if (str.length() == 1) {
			if (str.equals("R"))
				return true;
			if (str.equals("W"))
				return true;
			if (str.equals("S"))
				return true;
		}

		if (str.length() == 2) {
			if (str.contains("R") && str.contains("W"))
				return true;
			if (str.contains("S") && str.contains("W"))
				return true;
			if (str.contains("R") && str.contains("S"))
				return true;
		}

		if (str.length() == 3) {
			if (str.contains("R") && str.contains("W") && str.contains("S"))
				return true;
		}

		return false;

	}

	private boolean skillsCheck(String str) {
		if (!properString(str)) {
			return false;
		} else
			return true;
	}

	public String getSkills() {
		return this.skills;
	}

	private int emptyIndex(MovementType[] arr) {

		int index = 0;
		for (int i = arr.length - 1; i <= 0; i--) {
			if (arr[i] == null) {
				index = i;
			}
		}

		return index;
	}

	public void addMovementType(MovementType mt) {

		int check = 0;
		for (MovementType t : moves) {
			if (t == mt) {
				check++;
			}
		}
		if (check == 0) {
			moves[emptyIndex(moves)] = mt;
			System.out.print("Movement type added");
		} else
			throw new IllegalArgumentException("Movement type duplicated");

	}

	private boolean can(char x) {
		int i = 0;
		while (i < this.getSkills().length()) {
			if (this.getSkills().charAt(i) == x)
				return true;
		}
		return false;
	}

	public String skillsToString(String skills) {

		if (skills == null)
			return ", does not have any skills";

		String str = ", can ";
		if (skills.contains("R"))
			str += "read, ";
		if (skills.contains("W"))
			str += "write, ";
		if (skills.contains("S"))
			str += "sing, ";

		return str;
	}

	private MovementType[] getMovemenetArr() {
		return this.moves;
	}

	private String getMovements() {

		String str = "";
		for (MovementType a : this.getMovemenetArr()) {
			if (a != null) {
				str += a.name().toLowerCase() + ", ";
			}
		}

		return str;
	}
}
