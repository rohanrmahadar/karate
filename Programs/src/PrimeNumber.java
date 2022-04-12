import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String[] args) {
		int temp, num;
        boolean isPrime = true;
        
        num = 7;
 
        for (int i = 2; i<= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) 
            System.out.println(num + "number is prime");
            else
                System.out.println(num + "number is not a prime");
             
         
    }
	}

