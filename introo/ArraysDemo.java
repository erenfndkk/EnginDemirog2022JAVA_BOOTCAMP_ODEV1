package introo;

public class ArraysDemo {

	public static void main(String[] args) {
		String ogrenci1 = "Ali";
		String ogrenci2 = "Veli";
		String ogrenci3 = "Zeki";
		String ogrenci4 = "Deli";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("---------------------------");
		
		String ogrenciler [] = new String[4];
		ogrenciler[0] = "Ali";
		ogrenciler[1] = "Veli";
		ogrenciler[2] = "Zeki";
		ogrenciler[3] = "Deli";
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

	}

}
