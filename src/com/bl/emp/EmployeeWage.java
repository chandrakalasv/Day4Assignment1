package com.bl.emp;

import java.sql.SQLOutput;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program");
        int check = (int) ((Math.random() * 10) % 2);
        if (check == 1) {
            System.out.println("employee is present");
        }
        else {
            System.out.println("employee is absent");
        }

    }
}
