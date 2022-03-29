package com.company;

import java.util.Locale;
import java.util.regex.Pattern;

public class Doc {


    //        - Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void twoBlocks(String doc1) {
        String[] doc1Array = doc1.split("-");
        System.out.println(doc1Array[0] + doc1Array[2]);
        System.out.println();
    }

    public static void lettersToAst1(String doc1) {
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
        System.out.println("lettersToAst1 - " + new String(doc1Chars));
    }

    public static void lettersToAst2(String doc1) {
        System.out.println();
        String[] docArray2 = doc1.split("-");
        char[] docArray24 = {docArray2[4].charAt(1), '/', docArray2[4].charAt(3)};
        String docArray22 = new String(docArray24);
        System.out.println("lettersToAst2 - " + (new String(docArray2[1].toLowerCase()) + '/' + docArray2[3].toLowerCase() +
                '/' + docArray22.toLowerCase()));
        System.out.println();
    }


    //        - Вывести на экран буквы из номера документа в формате
//        "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//        класса StringBuilder).
    public static void onlyLetterUp1(String doc1) {
        StringBuilder sb1 = new StringBuilder(doc1.toUpperCase());
        sb1.delete(0, 5);
        sb1.replace(3, 9, "/");
        sb1.replace(7, 9, "/");
        sb1.setCharAt(9, '/');
        System.out.println("onlyLetterUp1 - Letters:" + sb1);
        System.out.println();

    }

    //        - Вывести на экран буквы из номера документа в формате
//        "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//        класса StringBuilder).
    public static void onlyLetterUp2(String doc1) {
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
        System.out.println("onlyLetterUp2 - Letters:"  + sb23final);
        System.out.println();
    }


    //        - Проверить содержит ли номер документа последовательность abc и
//        вывети сообщение содержит или нет(причем, abc и ABC считается
//        одинаковой последовательностью).
    public static void searchAbcSequence(String doc1) {
        String x = "abc";
        if (doc1.contains(x.toLowerCase()) || doc1.contains(x.toUpperCase())) {
            System.out.println("searchAbcSequence - true");
        } else {
            System.out.println("searchAbcSequence - false");
        }
        System.out.println();
    }

    //        - Проверить начинается ли номер документа с последовательности
//        555. //        - Проверить заканчивается ли номер документа на
////        последовательность 1a2b.
    public static void startsWith555 (String doc1) {
        String x1 = "555";
        if (doc1.endsWith(x1.toUpperCase()) || doc1.endsWith(x1.toLowerCase())){
            System.out.println("Starts with 555 " + true);
        } else {
            System.out.println("Starts with 555 " + false);
        }
        System.out.println();
    }

    public static void endsWith1a2b(String doc1) {
        String x2 = "1a2b";
        if (doc1.endsWith(x2.toUpperCase()) || doc1.endsWith(x2.toLowerCase())){
            System.out.println("Ends with 1a2b " + true);
        } else {
            System.out.println("Ends with 1a2b " + false);
        }
        System.out.println();
    }


}
