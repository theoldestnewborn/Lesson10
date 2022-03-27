package com.company;

public class Doc {


    //        - Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void twoBlocks(String doc1) {
        String[] doc1Array = doc1.split("-");
        System.out.println(doc1Array[0] + doc1Array[2]);
        System.out.println();
    }

    public static void pattern(String doc1) {
        char[] doc1Chars = doc1.toCharArray();
        for (int i = 0; i < doc1Chars.length - 4; i++) {
            if (doc1Chars[i] == '0' || doc1Chars[i] == '1' || doc1Chars[i] == '2' || doc1Chars[i] == '3' ||
                    doc1Chars[i] == '4' || doc1Chars[i] == '5' ||
                    doc1Chars[i] == '6' || doc1Chars[i] == '7' || doc1Chars[i] == '8' ||
                    doc1Chars[i] == '9' || doc1Chars[i] == '-') {
            } else {
                doc1Chars[i] = '*';
            }
        }
        System.out.println(new String(doc1Chars));
    }

    public static void pattern2(String doc1) {
        System.out.println();
        String[] docArray2 = doc1.split("-");
        char[] docArray24 = {docArray2[4].charAt(1), '/', docArray2[4].charAt(3)};
        String docArray22 = new String(docArray24);
        System.out.println(new String(docArray2[1].toLowerCase()) + '/' + docArray2[3].toLowerCase() +
                '/' + docArray22.toLowerCase());
        System.out.println();
    }


    //        - Вывести на экран только одни буквы из номера документа в формате
//        yyy/yyy/y/y в нижнем регистре.
    public static void pattern3(String doc1) {
        String doc2 = doc1.replace("1111-", "");
        String doc3 = doc2.replace("-2222-", "/");
        String doc4 = doc3.replace("-1", "/");
        System.out.println(new String(doc4.toLowerCase().replace('2', '/')));
        System.out.println();
    }

    //        - Вывести на экран буквы из номера документа в формате
//        "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//        класса StringBuilder).
    public static void pattern4(String doc1) {
        StringBuilder sb1 = new StringBuilder(doc1.toUpperCase());
        sb1.delete(0, 5);
        sb1.replace(3, 9, "/");
        sb1.replace(7, 9, "/");
        sb1.setCharAt(9, '/');
        System.out.println(sb1);
        System.out.println();

    }

    //        - Вывести на экран буквы из номера документа в формате
//        "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//        класса StringBuilder).
    public static void pattern5(String doc1) {
        StringBuilder sb2 = new StringBuilder(doc1.toUpperCase());
        char[] pos1 = new char[3];
        sb2.getChars(5, 8, pos1, 0);
        StringBuilder sb21new = new StringBuilder(new String(pos1));
        char[] pos2 = new char[3];
        sb2.getChars(14, 17, pos2, 0);
        StringBuilder sb22new = new StringBuilder(new String(pos2));
        char[] pos3 = new char[3];
        sb2.getChars(19, 22, pos3, 0);
        StringBuilder sb23new = new StringBuilder(new String(pos3));
        StringBuilder sb23final = sb21new.append('/').append(sb22new).append('/').
                append(sb23new.charAt(0)).append('/').append(sb23new.charAt(2));
        System.out.println(sb23final);
        System.out.println();
    }


    //        - Проверить содержит ли номер документа последовательность abc и
//        вывети сообщение содержит или нет(причем, abc и ABC считается
//        одинаковой последовательностью).
    public static void pattern6(String doc1) {
        String x = "abc";
        if (doc1.contains(x.toLowerCase()) || doc1.contains(x.toUpperCase())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println();
    }

    //        - Проверить начинается ли номер документа с последовательности
//        555. //        - Проверить заканчивается ли номер документа на
////        последовательность 1a2b.
    public static void pattern7(String doc1) {
        String x1 = "555";
        String x2 = "1a2b";
        if (doc1.startsWith(x1) || doc1.endsWith(x2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println();
    }

}
