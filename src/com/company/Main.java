package com.company;

public class Main {

    public static void main(String[] args) {

        //з1
        int clientOS = 1;
        boolean isIos = clientOS == 1;
        if (isIos) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылкее");
        }

        //з2
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && isIos) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //з3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //з4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        }

        //з5
        int monthNumber = 1;
        switch (monthNumber) {
            case (12):
            case (1):
            case (2):
                System.out.println(" Время года - зима");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println(" Время года - весна");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println("Время года - лето");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println("Время года - осень");
                break;

        }
    }
}

