package introo;

public class miniProjeAsalsayi {

	public static void main(String[] args) {
		int number = 6;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean asalmi = true ;
		
		if(number==1) {
			System.out.println(number + " asal sayı değildir");
			return; // altta kalan kodların çalışmaması için.
			
		}if(number<1) {
			System.out.println("geçersiz sayı");
		}
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				asalmi = false;
			}
		}
		if(asalmi) {
			System.out.println(number + " sayısı asal sayıdır.");
		}
		else {
			System.out.println(number + " sayısı asal değildir.");
		}

	}

}
