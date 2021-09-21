package Core;
import view.features;
public class Playbook {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Human clone= new Human(0,"Felix","Jean Joel","Masculin");

features.display(clone.toString());
Professor prof_Moise= new Professor(1,"Brutus","Edner","ghi",2);
String info = prof_Moise.toString();
features.display(info);
 Student Stud_Peter= new Student (4,"troisième","Masculin",info, 2, info, info);
 
Cours info1 = new Cours(1,150,"Java","SGBD",prof_Moise);
}

}
