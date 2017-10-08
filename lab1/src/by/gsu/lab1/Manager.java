package by.gsu.lab1;

public class Manager {
	String surname;
	int age;
	boolean trud;
	
	
	public Manager(String surname, int age, boolean trud){
		this.surname = surname;
		this.age = age;
		this.trud = trud;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public boolean getTrud(){
		return this.trud;
	}
}
