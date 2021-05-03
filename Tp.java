import java.util.Scanner;

public class Tp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String Fecha;
		String Producto1;
		String Producto2;
		int Cantidad1 = 0;
		int Cantidad2 =0;
		String Nombre;
		String Domicilio;
		int Precio1 = 0;
		int Precio2 = 0;
		Float ivacalculo = (float) 1.21;
		Float Ptotal1 = Precio1 * ivacalculo * Cantidad1;
		Float Ptotal2 = Precio2 * ivacalculo * Cantidad2;
		Float Total = Ptotal1 + Ptotal2 ;
		Float soloiva = (float) (Total - Total / 1.21) ;
		int Subtotal = Precio1*Cantidad1 + Precio2*Cantidad2;
	
		
		
		
		System.out.println("Ingrese Fecha");
		Fecha = scan.nextLine();
		
		System.out.println("Ingrese Nombre");
		Nombre = scan.nextLine();
		
		System.out.println("Ingrese Domicilio");
		Domicilio = scan.nextLine();
		
		System.out.println("Ingrese Cantidad");
		Cantidad1 = scan.nextInt();
		
		System.out.println("Ingrese Producto");
		Producto1 = scan.nextLine();
		
		System.out.println("Ingrese Precio Unitario");
		Precio1 = scan.nextInt();
		
		
        System.out.println("Ingrese Cantidad");
        Cantidad2 = scan.nextInt();
		
		System.out.println("Ingrese Producto");
		Producto2 = scan.nextLine();
		
		System.out.println("Ingrese Precio Unitario");
		Precio2 = scan.nextInt();
		
		System.out.println(Fecha);
		System.out.println(Nombre);
		System.out.println(Domicilio);
		System.out.println("Cant."+"Descripcion"+"P.unit"+"P.total");
		System.out.println(Cantidad1 + Producto1 + Precio1 + Ptotal1);
		System.out.println(Cantidad2 + Producto2 + Precio2 + Ptotal2);
		System.out.print("Iva:"+ soloiva);
		System.out.print("Subtotal:"+ Subtotal);
		System.out.print("Total:"+ Total);
		
	}		
}
