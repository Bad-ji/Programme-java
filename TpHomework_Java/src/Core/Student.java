package Core;

public class Student extends Human {
private int StudiD;
private String grade;
private String gender;

//constructor
public Student(int iD, String lname, String fname, String gender, int studiD, String grade, String gender2) {
	super(iD, lname, fname, gender);
	StudiD = studiD;
	this.grade = grade;
	gender = gender2;
}
//getter and setter
public int getStudiD() {
	return StudiD;
}

public void setStudiD(int studiD) {
	StudiD = studiD;
}

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Student [StudiD=" + StudiD + ", grade=" + grade + ", gender=" + gender + "]" + super.toString();
	
}






}

