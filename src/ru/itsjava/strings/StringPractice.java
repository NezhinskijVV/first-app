package ru.itsjava.strings;

public class StringPractice {

    public static void main(String[] args) {
        System.out.println("Строка -- это лучший в мире класс!");

        String str = "Я самая лучшая строка";
        String str2 = "Я самая лучшая строка";

        //неправильное сравнение (проверка ссылок)
        System.out.println(str == str2);

        //верное сравнение
        System.out.println("str.equals(str2) = " + str.equals(str2));

        System.out.println("str.charAt(2) = " + str.charAt(2));

        System.out.println("str.length() = " + str.length());
    }
}
