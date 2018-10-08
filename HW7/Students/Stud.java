package Lesson7.HW7.Students;

public class Stud {

	private String name;
	private int kurs;

	static NameComparator nameComparator = new NameComparator();
	static KursComparator kursComparator = new KursComparator();

	public Stud(String name, int kurs) {
		this.name = name;
		this.kurs = kurs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKurs() {
		return kurs;
	}

	public void setKurs(int kurs) {
		this.kurs = kurs;
	}

	@Override
	public String toString() {
		return "Stud [name=" + name + ", kurs=" + kurs + "]";
	}

	public static NameComparator getNameComparator() {
		return nameComparator;
	}

	public static void setNameComparator(NameComparator nameComparator) {
		Stud.nameComparator = nameComparator;
	}

	public static KursComparator getKursComparator() {
		return kursComparator;
	}

	public static void setKursComparator(KursComparator kursComparator) {
		Stud.kursComparator = kursComparator;
	}
}