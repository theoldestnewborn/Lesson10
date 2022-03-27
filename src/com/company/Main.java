package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.standard.MediaSize;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String doc1 = "1111-AAA-2222-BBB-1a2b";
        System.out.println(doc1);
        System.out.println();
        Doc.twoBlocks(doc1);
        Doc.pattern(doc1);
        Doc.pattern2(doc1);
        Doc.pattern3(doc1);
        Doc.pattern4(doc1);
        Doc.pattern5(doc1);
        Doc.pattern6(doc1);
        Doc.pattern7(doc1);
    }
}




//        Все эти методы реализовать в отдельном классе в статических методах,
//        которые на вход (входным параметром) будут принимать вводимую на вход
//        программы строку.