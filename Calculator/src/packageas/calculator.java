package packageas;

public class calculator {

    void powerOn() {
        System.out.println("������ ŵ�ϴ�.");
    }
   
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }
    
    int mistake(int x, int y){
    	int result = x - y;
    	return result;
    }
    
    int multiply(int x, int y) {
    	int result = x * y;
    	return result;
    }

    double divide(int x, int y) {
        double result = (double)x / (double)y;
        return result;
    }

    void powerOff() {
        System.out.println("������ ���ϴ�.");
    }
}