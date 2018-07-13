/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssclubfair2017problema;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TSSClubFair2017ProblemA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader = new Scanner(System.in);
        int line = reader.nextInt();
        for(int i = 0; i < line; i++){
            String a = reader.next();
            String b = reader.next();
            String c = reader.next();
            String answer;
            answer = CheckTheWords(a,b,c);
            System.out.println(answer);
        }
    }

    private static String CheckTheWords(String a, String b, String c) {
        String answer;
        int check1;
        int check2;
        int check3;
        check1 = a.compareTo(b);
        check2 = a.compareTo(c);
        check3 = b.compareTo(c);
        if(check1 == 0){
            answer = a;
        }
        else if(check2 == 0){
            answer = a;
        }
        else if(check3 == 0){
            answer = b;
        }
        else{
            answer = "???";
        }
        return answer;
    }
    
}
