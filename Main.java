package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
           String string=sc.next();
           int max=1;
           int l=1;
           for (int i=1;i<string.length();i++){
               if (string.charAt(i-1)!=string.charAt(i)){
                   l++;
                   if (l>max){
                       max=l;
                   }
               }
               else {
                   l=1;
               }

           }
           System.out.println(max);
        }
    }
}
