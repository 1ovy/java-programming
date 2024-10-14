package test8;

import java.util.Scanner;

public class lab6task7 {
    public static void main(String[] args) {
        int sum = 0,i=0;
        int j=5;
        for (i = 0; i < 10; i++) {
            sum+=1;
        }
        if(i<j)
            System.out.println(i);
        else
            System.out.println(j);
        while(j<10){
            j++;
        }
        do{
            j++;
        }while(j<10);
    }
}
