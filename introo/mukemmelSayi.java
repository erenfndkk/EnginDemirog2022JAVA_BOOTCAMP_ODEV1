package introo;

public class mukemmelSayi {

	public static void main(String[] args) {
		// 6 --> 1,2,3
		 int number = 10;
		 int total = 0;
		 for (int i = 1; i < number; i++) {
			if(number%i==0) {
				total = total + i;
			}
		}
		 if(total == number) {
			 System.out.println(number + " sayısı mükemmel sayıdır.");
		 }
		 else {
			 System.out.println(number + " sayısı mükemmel sayı değildir.");
		 }
			

	}

}
