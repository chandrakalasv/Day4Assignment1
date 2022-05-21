package com.bl.emp;

public class EmployeeWage {
    public static void main(String[] args) {
        DailyEmpWage wage = new DailyEmpWage();
        System.out.println("Welcome to employee wage computation program");
        int check = (int) ((Math.random() * 10) % 2);
        if (check == 1) {
            System.out.println("employee is present");
            int full_time_salary = wage.dailyWage(20, 8);
            System.out.println("full time employee daily wage" + " " + full_time_salary);
        }
        else {
            System.out.println("employee is absent");
        }
    }
}
