package packageas;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        calculator mycal =new calculator();
        
        mycal.powerOn();
        
     	
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.println("5. 종료");
        System.out.printf("부호를 입력하세요 : ");
        int c = sc.nextInt();
     
      
        while(c != 5) { 
          
        	if(c == 1) {
        	
        		System.out.printf("숫자를 입력하세요 : ");
        		int a = sc.nextInt();
        		System.out.printf("숫자를 입력하세요 : ");
        		int b = sc.nextInt();
            
        		int result1= mycal.plus(a, b);
        		System.out.println("result : " + result1);
            
        	}else if(c == 2) {
        	
        		System.out.printf("숫자를 입력하세요 : ");
        		int a = sc.nextInt();
        		System.out.printf("숫자를 입력하세요 : ");
        		int b = sc.nextInt();
            
        		int result2= mycal.plus(a, b);
        		System.out.println("result : " + result2);	
            
        	}else if(c == 3) {
        	
        		System.out.printf("숫자를 입력하세요 : ");
        		int a = sc.nextInt();
        		System.out.printf("숫자를 입력하세요 : ");
        		int b = sc.nextInt();
            
        		int result3= mycal.multiply(a, b);
        		System.out.println("result : " + result3);
            
        	}else if(c == 4) {
        	
        		System.out.printf("숫자를 입력하세요 : ");
        		int a = sc.nextInt();
        		System.out.printf("숫자를 입력하세요 : ");
        		int b = sc.nextInt();
            
        		double result4= mycal.divide(a, b);
        		System.out.println("result : " + result4);
            
        	}
        	
        	System.out.println("1. 더하기");
        	System.out.println("2. 빼기");
        	System.out.println("3. 곱하기");
        	System.out.println("4. 나누기");
        	System.out.printf("부호를 입력하세요 : ");
        	c = sc.nextInt();
        }
    }
}
