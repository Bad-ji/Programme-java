package Core;

public class Cours {
private int classesiD;
private int hcredit;
private String matter;
private Professor prof;

//the constructor
public Cours(int classesiD, int hcredit, String name, String matter, Professor prof) {
	super();
	this.classesiD = classesiD;
	this.hcredit = hcredit;
	this.matter = matter;
	this.prof = prof;
}
//getter and setter
public int getClassesiD() {
	return classesiD;
}

public void setClassesiD(int classesiD) {
	this.classesiD = classesiD;
}

public int getHcredit() {
	return hcredit;
}

public void setHcredit(int hcredit) {
	this.hcredit = hcredit;
}

public String getMatter() {
	return matter;
}

public void setMatter(String matter) {
	this.matter = matter;
}

public Professor getProf() {
	return prof;
}

public void setProf(Professor prof) {
	this.prof = prof;
}
@Override
public String toString() {
	return "Cours [classesiD=" + classesiD + ", hcredit=" + hcredit + ", matter=" + matter + ", prof=" + prof
			+ ", toString()=" + super.toString() + "]";
}



	

}
