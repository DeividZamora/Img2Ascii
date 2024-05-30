package pruebasdeimagenesaversifunciona;
import java.util.Scanner;
public class aplicasao {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String nombre,tipo;
		System.out.println("Digite el nombre de la imagen");
		nombre=leer.next();
		System.out.println("Digite el tipo de archivo");
		tipo=leer.next();
		
		System.out.println("Guardando en C:\\Users\\johan\\OneDrive\\Escritorio\\"+nombre+"."+tipo);
		
		Img2Ascii obj = new Img2Ascii();
		obj.convertToAscii("C:\\Users\\johan\\OneDrive\\Escritorio\\"+nombre+"."+tipo);
		leer.close();
	}

}
