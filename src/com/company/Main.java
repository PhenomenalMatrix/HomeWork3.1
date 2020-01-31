package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String [] names = {"Улан", "Нурлан", "Богдан"};
        String [] namesCopy = new String[names.length +1];
        namesCopy[0] = "Васян";
        System.arraycopy(names, 0, namesCopy, 1, names.length);
        names = namesCopy;



        for (int i = 0; i <=namesCopy.length ; i++) {
            switch (i){
                case 1:
                    System.out.println("Доброе утро"+" "+ namesCopy[0]);
                    break;
                case 2:
                    System.out.println("Добрый день"+" "+ namesCopy[1]);
                    break;
                case 3:
                    System.out.println("Добрый вечер"+" "+ namesCopy[2]);
                    break;
                case 4:
                    System.out.println("И тебе добрый день"+" "+ namesCopy[3]);
                    break;


            }
            
        }
    }
}
