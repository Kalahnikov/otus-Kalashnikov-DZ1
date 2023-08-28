package ru.otus.java.basic.dz1;

import java.util.ArrayList;

public class ActionListEmployee {

    public ArrayList<String> nameEmployees(ArrayList<Employee> employees){
        ArrayList<String> name = new ArrayList<>();
        for ( int i = 0; i< employees.size(); i++) {
            name.add(employees.get(i).getName());
        }
        System.out.println(name);
        return name;
    }

    public ArrayList<Employee> ageEmployees(int age, ArrayList<Employee> employees){
        ArrayList<Employee> ageEmployees = new ArrayList<>();
        for ( int i = 0; i< employees.size(); i++) {
            if (employees.get(i).getAge() >= age) {
                ageEmployees.add(employees.get(i));
            }
        }
        System.out.println(ageEmployees);
        return ageEmployees;
    }

    public boolean averageAgeOfEmployees (int averageAge, ArrayList<Employee> employees){
        int averageAgeOfEmployees = 0;
        for ( int i = 0; i< employees.size(); i++) {
            averageAgeOfEmployees += employees.get(i).getAge();
        }
        if (averageAgeOfEmployees/employees.size() > averageAge){
            System.out.println("Средний возраст сотрудников превышает минимальный средний возраст");
            return true;
        }
        else {
            System.out.println("Средний возраст сотрудников не превышает минимальный средний возраст");
            return false;
        }
    }

    public Employee youngEmployee (ArrayList<Employee> employees){
        int maxAge = Integer.MAX_VALUE;
        Employee youngEmployee = null;
        for(int i = 0; i< employees.size(); i++){
            if(employees.get(i).getAge() < maxAge){
                maxAge = employees.get(i).getAge();
                youngEmployee = employees.get(i);
            }
        }
        System.out.println(youngEmployee);
        return youngEmployee;
    }
}
