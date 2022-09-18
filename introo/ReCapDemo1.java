package introo;

public class ReCapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 50;
		
		if(sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("en büyük sayı : " + sayi1);
		}
		else if (sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("en büyük sayı : " + sayi2);
		}
		else {
			System.out.println("en büyük sayi : " + sayi3);
		}
		int enBuyukSayi = sayi1;
		if(enBuyukSayi<sayi2) {
			enBuyukSayi = sayi2;
		}
		if(enBuyukSayi<sayi3) {
			enBuyukSayi=sayi3;
		}
		System.out.println("en buyuk sayi : " + enBuyukSayi);

	}

}
