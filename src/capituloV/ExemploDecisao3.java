package capituloV;

public class ExemploDecisao3 {

	public static void main(String[] args) {
		
		int num = 10;
		
		switch(num) {
		case 5: System.out.println("� cinco");
		break;
		case 10: System.out.println("� dez");
				 System.out.println("pode haver mais de um comando em cada case");
		break;
		case 20: System.out.println("� vinte");
		break;
		}
	}
}

