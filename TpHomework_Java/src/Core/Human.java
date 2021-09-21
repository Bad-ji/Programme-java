package Core;

public class Human {
	
private int iD;	
private String lname;
private String fname;
private String gender;
public Human(int iD, String lname, String fname, String gender) {
	
	
	//the constructeur
	super();
	this.iD = iD;
	this.lname = lname;
	this.fname = fname;
	this.gender = gender;
}
public int getiD() {
	return iD;
}
public void setiD(int iD) {
	this.iD = iD;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Human [iD=" + iD + ", lname=" + lname + ", fname=" + fname + ", gender=" + gender + ", toString()="
			+ super.toString() + "]";
}


	
}

 