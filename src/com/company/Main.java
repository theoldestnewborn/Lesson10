package com.company;

public class Main {

    public static void main(String[] args) {

        String doc1 = "1241-ABA-2342-BAB-1A2b";
        System.out.println(doc1);
        System.out.println();
        Doc.twoBlocks(doc1);
        Doc.lettersToAst1(doc1);
        Doc.lettersToAst2(doc1);
        Doc.onlyLetterUp1(doc1);
        Doc.onlyLetterUp2(doc1);
        Doc.searchAbcSequence(doc1);
        Doc.endsWith1a2b(doc1);
        Doc.startsWith555(doc1);
    }
}
