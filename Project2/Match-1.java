import java.io.*;
import java.util.*;
public class Match {
	private static String name;
	private static char gender;
	private static int year;
	private static int month;
	private static int day;
	private static int quiet;
	private static int music;
	private static int reading;
	private static int chat;
	public static int i = 0;
	public static int studentCount = 0;

	public static void main(String[] args) {
		String filename;
		System.out.print("Enter filename: ");
		Scanner kbd = new Scanner(System.in);
		filename = kbd.next();
		readFile(filename);

	}

	public static void check(ArrayList<Student> students) {
		int compareScore, maxScore;
		String bestMatchStudent;
		for (int j = 0; j<students.size(); j++) {
			if (students.get(j).getMatch() == false) {
				maxScore = 0;
				compareScore = 0;
				bestMatchStudent = null;
				for (int k = j+1; k < students.size(); k++) {
					if ((students.get(k).getMatch() == false) && (students.get(k).getGender() == students.get(j).getGender())) {
						compareScore = students.get(k).compare(students.get(j));
						if (compareScore > maxScore) {
							maxScore = compareScore;
							bestMatchStudent = students.get(k).getName();
						}
						//System.out.println("checking " + students.get(j).getName() + " & " + students.get(k).getName() + " current " + compareScore + " & max " + maxScore);
					}
					if (k == students.size()-1 && bestMatchStudent != null) {
						students.get(j).setMatch(true);
						for (int m = 0; m < students.size(); m++) {
							if (students.get(m).getName() == bestMatchStudent) {
								students.get(m).setMatch(true);
								break;
							}
						}
						System.out.println(students.get(j).getName() + " matches with " + bestMatchStudent + " with the score " + maxScore);
					}
					if (k == students.size()-1 && bestMatchStudent == null) {
						System.out.println(students.get(j).getName() + " has no matches.");
					}
				}
			}
		}
	}

	public static void readFile(String filename) {
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Date> dates = new ArrayList<Date>();
		ArrayList<Preference> prefs = new ArrayList<Preference>();
		try {
			Scanner input = new Scanner(new FileReader(filename));
			while (input.hasNextLine()) {
				Scanner line = new Scanner(input.nextLine());
				line.useDelimiter("[-|\\t]");
				while (line.hasNext()) {
					name = line.next();
					gender = line.next().charAt(0);
					month = line.nextInt();
					day = line.nextInt();
					year = line.nextInt();
					quiet = line.nextInt();
					music = line.nextInt();
					reading = line.nextInt();
					chat = line.nextInt();
					studentCount++;
					prefs.add(new Preference(quiet, music, reading, chat));
					dates.add(new Date(year, month, day));
					students.add(new Student(name, gender, dates.get(i), prefs.get(i)));
					i++;
					if (input.hasNextLine() != true) {
						check(students);
					}
					if (studentCount >= 100) {
						break;
					}
				}
			}
			input.close();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
