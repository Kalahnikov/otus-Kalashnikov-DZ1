package ru.otus.java.basic.dz1;

import java.util.ArrayList;

public class MainArrayApp {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        for (int i = 0; i<10; i++){
            arr.add(5);
        }

        MinMax minMax = new MinMax();
        minMax.minMax(-10,10);

        SumArr sumArr = new SumArr();
        sumArr.sumArr(minMax.minMax(-10,10));

        ChangeNumber changeNumber = new ChangeNumber();
        changeNumber.changeNumber(6, minMax.minMax(-10,10));

        IncreaseNumber increaseNumber = new IncreaseNumber();
        increaseNumber.increaseNumber(10, minMax.minMax(-10,10));

        ArrayList<Employee> Employees = new ArrayList<>();
        Employees.add(new Employee("Никита", 25));
        Employees.add(new Employee("Вася", 27));
        Employees.add(new Employee("Петя", 30));
        Employees.add(new Employee("Сергей", 20));
        Employees.add(new Employee("Ярослав", 23));
        Employees.add(new Employee("Владимир", 40));
        Employees.add(new Employee("Антон", 31));
        Employees.add(new Employee("Александр", 34));

        ActionListEmployee actionListEmployee = new ActionListEmployee();
        actionListEmployee.nameEmployees(Employees);
        actionListEmployee.ageEmployees(30, Employees);
        actionListEmployee.averageAgeOfEmployees(25, Employees);
        actionListEmployee.youngEmployee(Employees);
    }

}
