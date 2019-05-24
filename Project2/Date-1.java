
public class Date {

	private int year;
	private int month;
	private int day;

	public Date() {
		this.year = 0;
		this.month = 0;
		this.day = 0;
	}

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int dayOfYear() {
		int totalDays = 0;
		switch (month) {
		case 12: totalDays += 30;
		case 11: totalDays += 31;
		case 10: totalDays += 30;
		case 9: totalDays += 31;
		case 8: totalDays += 31;
		case 7: totalDays += 30;
		case 6: totalDays += 31;
		case 5: totalDays += 30;
		case 4: totalDays += 31;
		case 3: totalDays += 28;
		case 2: totalDays += 31;
		}
		totalDays += day;
		return totalDays;
	}
	
	public int compare(Date st) {
		int monthDiff = Math.abs((this.dayOfYear() + (365 * this.getYear())) - (st.dayOfYear() + (365 * st.getYear())));
		int yearDiff = monthDiff / 30;
		if (yearDiff > 60) {
			yearDiff = 60;
		}
		return yearDiff;
	}
	
	public String getDate() {
		return "";
	}

}
