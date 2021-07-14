package lab10;


public class Main {

	public static float averageOfPersonsAges(LivingCreature[] arr) {

		float sumAge = 0;
		float sumPersons = 0;

		for (LivingCreature c : arr) {
			if (c instanceof Person) {
				sumAge += c.getAge();
				sumPersons++;
			}
		}
		return (float) sumAge / sumPersons;
	}

	public static float averageOfPetsAges(LivingCreature[] arr) {

		float sumAge = 0;
		float sumPersons = 0;

		for (LivingCreature c : arr) {
			if (c instanceof Pet) {
				sumAge += c.getAge();
				sumPersons++;
			}
		}
		return (float) sumAge / sumPersons;
	}

	public static void main(String[] args) {
		Person ayberk = new Person("ayberk", 1998, "RW");
		Person elif = new Person("elif", 1990, "S");
		Person boran = new Person("boran", 1980, "R");
		Person ela = new Person("ela", 1997, "RW");
		Person emre = new Person("emre", 1998, "RW");

		ayberk.addMovementType(MovementType.WALK);
		

		System.out.println(ayberk.toString());

		Pet Cat = new Pet("Cat", 2005, false, MovementType.WALK);
		Pet lion = new Pet("lion", 2020, false, MovementType.SWIM);
		Pet Dog = new Pet("Dog", 2000, true, MovementType.RUN);
		Pet dragon = new Pet("Turtle", 1200, false, MovementType.CRAWL);
		Pet SmallDog = new Pet("SmallDog", 1998, true, MovementType.WALK);

		System.out.println(Cat.toString());

		LivingCreature[] array = new LivingCreature[10];
		array[0] = ayberk;
		array[1] = elif;
		array[2] = boran;
		array[3] = ela;
		array[4] = emre;
		array[5] = Cat;
		array[6] = lion;
		array[7] = Dog;
		array[8] = dragon;
		array[9] = SmallDog;

		System.out.println(averageOfPersonsAges(array));
		System.out.println(averageOfPetsAges(array));

	}

}

