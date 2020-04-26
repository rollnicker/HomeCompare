package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любые символы: ");
        String str = scan.nextLine();
        System.out.print("Введите другие символы: ");
        String str2 = scan.nextLine();
        int x = str.length();
        int y = str2.length();
        if (x > y){
            System.out.println(str);}
            else if (x ==y){
                System.out.println("Ваши строки равны");
            }
            else{
            System.out.println(str2);
        }
        }
    }

