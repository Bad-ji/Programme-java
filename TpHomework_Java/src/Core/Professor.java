package Core;

public class Professor extends Human {
 private int profiD;
 

 //constructor
public Professor(int iD, String lname, String fname, String gender, int profiD) {
	super(iD, lname, fname, gender);
	this.profiD = profiD;
}

//getter and setter
public int getProfiD() {
	return profiD;
}

public void setProfiD(int profiD) {
	this.profiD = profiD;
}

@Override
public String toString() {
	return "Professor [profiD=" + profiD + ", toString()=" + super.toString() + "]";
}


 
 

 
 
}
