package introo;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade  = 'D';
		
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : geçtiniz");
			break;
		case 'B':
			System.out.println("çok güzel : geçtiniz");
			break;
		case 'C':
			System.out.println("Mükemmel : geçtiniz");
			break;
		case 'D':
			System.out.println("iyi : geçtiniz");
			break;
		case 'E':
			System.out.println("fena değil : geçtiniz");
			break;
		case 'F':
			System.out.println("maaalesef : kaldınız");
			break;

		default:
			System.out.println("geçersiz not girdiniz");
			break;
		}

	}

}
