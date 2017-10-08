package by.gsu.lab1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		int avgAge = 0;
		int countEmployers = 0;
		ArrayList<Manager> employers = new ArrayList<Manager>();
		employers.add(new Manager("Ivanov", 30, true));
		employers.add(new Manager("Petrov", 27, false));
		employers.add(new Manager("Sidorov", 34, true));
		employers.add(new Manager("Baranov", 21, true));
		employers.add(new Manager("Klimov", 19, false));
		employers.add(new Manager("Suslo", 18, true));
		employers.add(new Manager("Zubov", 23, true));
		employers.add(new Manager("Gromiko", 20, true));
		employers.add(new Manager("Labushev", 19, false));
		employers.add(new Manager("Zaletin", 26, true));
		for (Manager employer : employers) {
			if (employer.trud) {
				countEmployers++;
				avgAge += employer.getAge();
			}
		}
		avgAge = avgAge / countEmployers;

		System.out.println("Средний возраст: " + avgAge);
		System.out.println("Количество:  " + countEmployers);
	}

}
