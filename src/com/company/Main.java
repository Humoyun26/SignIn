package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =new Scanner(in);
        System.out.println("Ro'yxatdan o'tish:");
        System.out.println("Ismingizni kiriting: ");
        String name = scanner.nextLine();
        System.out.println("Email kiriting: ");
        String emayl = scanner.nextLine();

        if (emayl.equals("@")){
            System.out.println("Parolni kiriting: ");
            String password1 = scanner.nextLine();
            if (password1.length()<=8){
                System.out.println("Qayta parolni kiriting:");
                String password2 = scanner.nextLine();
                if (password1.equals(password2)) {
                    System.out.println("Hush kelibsiz: ");

                } else {
                    System.out.println("Parol bir xil emas :");
                }
            }else{
                System.out.println("Parol uzunligi 8 tadan kam:  ");


            }

        }
    }
}
