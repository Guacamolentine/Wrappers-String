package ua.ithilel.java;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        String str = "Danil";
        char[] arr = {'D', 'A', 'N', 'I', 'L'};
        String str2 = new String(arr);
        byte[] arr2 = {0x44, 0x61, 0x6e, 0x69, 0x6c};
        String str3 = new String(arr2);
        StringBuilder builder = new StringBuilder("Danil");
        String str4 = builder.toString();


        String str5 = "Orange, Apple, Pomegranate, Pear";
        String[] words = str5.split(" ");
        for (String word : words){
            System.out.println(word);
        }

        int maxWord = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > words[maxWord].length()){
                maxWord = i;
            }
        }
        System.out.println(words[maxWord]);

        str5.substring(0,3);
        System.out.println(str5.substring(0,3));

        String str7 = "   I am_new_line      ";
        str7 = str7.trim();
        str7 = str7.replace("_", " ");
        System.out.println(str7);

        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter text: ");

        String text = myInput.nextLine();
        if (text.contains("Start")) {
            System.out.println("Start process");
        } else if (text.contains("Finish")){
            System.out.println("Process finish");
        }else if (text.toLowerCase().contains("Error")){
            System.out.println("An error has occurred");
        }else {
            System.out.println("You enter " + text);
        }
        StringBuilder builder1 = new StringBuilder(str + str2 + str3 + "\n" + str4 + str5 + str7 + "\n");
        String str8 = builder1.toString();
        System.out.println(str8);
    }
}
