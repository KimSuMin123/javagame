package packageas;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        calculator mycal =new calculator();
        
        mycal.powerOn();
        
     	
        System.out.println("1. ���ϱ�");
        System.out.println("2. ����");
        System.out.println("3. ���ϱ�");
        System.out.println("4. ������");
        System.out.println("5. ����");
        System.out.printf("��ȣ�� �Է��ϼ��� : ");
        int c = sc.nextInt();
     
      
        while(c != 5) { 
          
        	if(c == 1) {
        	
        		System.out.printf("���ڸ� �Է��ϼ��� : ");
        		int a = sc.nextInt();
        		System.out.printf("���ڸ� �Է��ϼ��� : ");
        		int b = sc.nextInt();
            
        		int result1= mycal.plus(a, b);
        		System.out.println("result : " + result1);
            
        	}else if(c == 2) {
        	
        		System.out.printf("���ڸ� �Է��ϼ��� : ");
        		int a = sc.nextInt();
        		System.out.printf("���ڸ� �Է��ϼ��� : ");
        		int b = sc.nextInt();
            
        		int result2= mycal.plus(a, b);
        		System.out.println("result : " + result2);	
            
        	}else if(c == 3) {
        	
        		System.out.printf("���ڸ� �Է��ϼ��� : ");
        		int a = sc.nextInt();
        		System.out.printf("���ڸ� �Է��ϼ��� : ");
        		int b = sc.nextInt();
            
        		int result3= mycal.multiply(a, b);
        		System.out.println("result : " + result3);
            
        	}else if(c == 4) {
        	
        		System.out.printf("���ڸ� �Է��ϼ��� : ");
        		int a = sc.nextInt();
        		System.out.printf("���ڸ� �Է��ϼ��� : ");
        		int b = sc.nextInt();
            
        		double result4= mycal.divide(a, b);
        		System.out.println("result : " + result4);
            
        	}
        	
        	System.out.println("1. ���ϱ�");
        	System.out.println("2. ����");
        	System.out.println("3. ���ϱ�");
        	System.out.println("4. ������");
        	System.out.printf("��ȣ�� �Է��ϼ��� : ");
        	c = sc.nextInt();
        }
    }
}
