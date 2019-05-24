
public class Student {
	private String name;
	private char gender;
	private Date birthDay;
	private Preference pref;
	private boolean matched;
	private int score;

	public Student() {
		this.name = "";
		this.gender = gender;
		this.birthDay = birthDay;
		this.pref = pref;
		this.matched = false;
	}

	public Student(String name, char gender, Date birthDay, Preference pref) {
		this.name = name;
		this.gender = gender;
		this.birthDay = birthDay;
		this.pref = pref;
		this.matched = false;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getGender() {
		return gender;
	}

	public void setbirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Date getDate() {
		return birthDay;
	}

	public void setPref(Preference pref) {
		this.pref = pref;
	}

	public Preference getPref() {
		return pref;
	}

	public void setMatch(boolean matched) {
		this.matched = matched;
	}

	public boolean getMatch() {
		return matched;
	}

	public int compare(Student st) {
		int prefDiff = 0;
		int ageDiff = 0;
		prefDiff = this.getPref().compare(st.getPref());
		ageDiff = this.getDate().compare(st.getDate());
		int calc = (40 - prefDiff) + (60 - ageDiff);
		return calc;
	}

	@Override
	public String toString() {
		return name+" is a "+gender+" with a birthday on "+birthDay;
	}

}
