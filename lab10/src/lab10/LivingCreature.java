package lab10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class  LivingCreature {
	private int birthYear;
	private String name;
	public LivingCreature(String id, int year) {
	this.name=id;
	birthYear=year;
	}
	public int getAge() {
	GregorianCalendar gc= new GregorianCalendar();
	return gc.get(Calendar.YEAR)-birthYear;
	}
	public String getName() {
	return name;
	}
	public abstract String toString();
	}


