package com.company;

import java.util.*;

public class Main {

    public static void createStudents(){
        Scanner input = new Scanner(System.in);

        System.out.println("How many students would you like to create? ");
        int amount = input.nextInt();

        Users[] students = new Users[amount];

        for(int i = 0; i < amount; i++){
            students[i] = new Users();

            System.out.println("What's the students name? ");
            String name = "";
            name = input.nextLine();

            while(name.equals("")){
                name = input.nextLine();

                if(name.equals("")){
                    System.out.println("Name can't be blank... ");
                }
            }

            students[i].setName(name);

            System.out.println("What will be the students PIN? ");
            int pin = input.nextInt();
            students[i].setPin(pin);

        }

        for(int i = 0; i < amount; i++){
            System.out.println(students[i].getName());
            System.out.println(students[i].getPin());

        }


    }

    public static void main(String[] args) {
    createStudents();
    }
}
