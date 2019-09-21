import java.util.Scanner;
public class Prob_1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int num;
		int encrypt;
		int decrypt;
		int lastDecrypt;
		
		System.out.println("Enter a 4 digit number: ");
		num = scnr.nextInt();
		
		//Get single digits
		int firstDigit = num / 1000;
		int secondDigit = (num % 1000) / 100;
		int thirdDigit = (num % 100) / 10;
		int fourthDigit = num % 10;
		
		//Encrypting
		firstDigit = (firstDigit + 7) % 10;	
		secondDigit = (secondDigit + 7) % 10; 	
		thirdDigit = (thirdDigit + 7) % 10;
		fourthDigit = (fourthDigit + 7) % 10;
		
		
		//Rearranging the digits and putting them to encrypt
		encrypt = ((thirdDigit * 1000) + (fourthDigit * 100) + (firstDigit *10) + secondDigit);
		
		if (encrypt < 1000){
	        System.out.println("\nEncrypted number is: " + "0" + encrypt);
	    }
	    else {
	        System.out.println("\nEncrypted number is: " + "0" + encrypt);
	    }
		
		System.out.println("\nEnter a number to decrypt: ");
		decrypt = scnr.nextInt();
		
		//Isolate digits
		firstDigit = decrypt / 1000;
		secondDigit = (decrypt % 1000) / 100;
		thirdDigit = (decrypt % 100) / 10;
		fourthDigit = decrypt % 10;
		
		//Reversing encryption
		firstDigit = (firstDigit + 3) % 10;	
		secondDigit = (secondDigit + 3) % 10; 	
		thirdDigit = (thirdDigit + 3) % 10;
		fourthDigit = (fourthDigit + 3) % 10;
		
		lastDecrypt = ((thirdDigit * 1000) + (fourthDigit * 100) + (firstDigit *10) + secondDigit);
		
		if (lastDecrypt < 1000){
	        System.out.println("\nDecrypted number is: " + "0" + lastDecrypt);
	    }
	    else {
	        System.out.println("\nDecrypted number is: " + lastDecrypt);
	    }
		
		scnr.close();
	}
}

