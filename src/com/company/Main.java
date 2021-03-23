package com.company;

import java.util.Scanner;

public class Main {
//fermat's little theorem
    //bu kod ustlu ededin diger bir sade edede bolunmesinden alinan qaligi tapir(ustu ededin esasi ve bolen sade olmalidir)
    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
        System.out.println("ustlu ededin esasini daxil edin:");
        int esas=scanner.nextInt();
        System.out.println("ustlu ededin quvvetini daxil edin:");
        int quvvet=scanner.nextInt();
        System.out.println("boleni daxil edin:");
        int bolen=scanner.nextInt();
        for (int i=1;i<esas;i++){
            //check prime number
       if (esas%i!=0){
            int qaliq=esas%bolen;
            System.out.println("qaliq="+qaliq);
            break;
       }
        }

    }
}
