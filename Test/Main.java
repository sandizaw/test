package Test;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
    
    String input;
    int count=0;
    String num1=rollNumber();
    String num2=rollNumber();
    String num3=rollNumber();
    String ans=num1+num2+num3;
    System.out.println(ans);
    char[] arr=ans.toCharArray();

    input=inputNumber();
    char[] num=input.toCharArray();
                
    for(int i=0; i<3; i++){
        if (arr[i]==num[i]) {
            count++;
        }
    }
    

    System.out.println(count);
    if (count==3) {
        System.out.println("Your ar correct!...");
    }else if (count==2) {
        System.out.println("Tow number are correst!!...");
        inputNumber();
    }else if (count==1) {
        System.out.println("Only One Number is Correct");
        inputNumber();
    }else{
        System.out.println("Your are wrong!!... ");
        inputNumber();
    }
   

  
}
 public  static String rollNumber(){
       Random r=new Random();
        int result=r.nextInt(9);
        String num=Integer.toString(result);
        return num;
    }


public static String inputNumber(){
    System.out.println("Enter Your 3 Digits Number");
     String input=s.nextLine();
     return input;
}


}
