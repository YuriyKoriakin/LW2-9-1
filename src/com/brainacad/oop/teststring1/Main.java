package com.brainacad.oop.teststring1;

/**
 * Created by Yuriy on 02.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myString="abracadabra"; //create string
        System.out.println(myString.indexOf("ra")); //Find the index of first “ra” substring  of myStr value and print
        // result to console.
        System.out.println(myString.lastIndexOf("ra")); //Find the index of last “ra” substring of myStr value and
        // print result to console.
        System.out.println(myString.substring(3,8));//Get substring of myStr from 3 to 7 char index and print
        // result to console.
        System.out.println(reverseString("abcd"));//Invoke reverseString method with myStr argument and print
        // result to console.

    }
    public static String reverseString(String str){//-	Create static method “reverseString(String)” which
        // return String value as result with changed order of letters (reverse it, for example “abcd” ->”dcba”)
        char[]arr=str.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            char temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        return new String(arr);
    }

}
