package introo;

public class SartBloklari {

	public static void main(String[] args) {
		
		int not = 35;
		// 50 ve üzeri : geçti
		//40-49 arası : bütünleme
		//0-39 arası : kaldı
		
		if(not>= 50) {
			System.out.println("geçti");
		}
		else if(not>=40 && not<=49) {
			System.out.println("bütünleme");
		}
		else {
			System.out.println("kaldı");
		}

	}

}
