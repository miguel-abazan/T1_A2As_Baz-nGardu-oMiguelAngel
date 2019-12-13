import java.util.Scanner;

class TDACadenaEspecialConStringBuilder{
	private String cadena;
	
	public TDACadenaEspecialConStringBuilder(String cadenaEx) {
		this.setCadena(cadenaEx);
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public String invertirCadenaPorLetras() {
		StringBuilder builder = new StringBuilder(this.getCadena());
		builder.reverse();
		return builder.toString();
	}

	public String invertirCadenaPorPalabra() {
		String inversa ="";

		String palabra[] = this.getCadena().split(" ");

		for (int j = 0; j < palabra.length; j++) {
			inversa = palabra[j]+" "+inversa;
		}
		return inversa;
	}

	public String agregarCaracterEnPosicion(String caracter,int posicion) {
		StringBuilder builder = new StringBuilder(this.getCadena());
		builder.insert(posicion,caracter);
		return builder.toString();
	}

	public String agregarCadenaEnPosicion(String caracter,int posicion) {
		StringBuilder sb = new StringBuilder(this.getCadena());
		sb.insert(posicion,caracter);
		return sb.toString();
	}

}
public class PruebaStringBuilder{

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		TDACadenaEspecialConStringBuilder palabra = new TDACadenaEspecialConStringBuilder("Estructutra De Datos");
		StringBuilder sCadena = new StringBuilder(palabra.getCadena());

		byte opc;
		do {
			
			System.out.println("Cadena: "+palabra.getCadena()+"\n Realizar: ");
			System.out.println("1) Invertir Cadena por Letras\n2) Invertir Cadena por Palabras\n3) Agregar un Palabra en cualquier porsicion de la cadena\n4) }Agregar Caulkquier Caracter Del teclado\n5) Salir");
			
			System.out.println();
			System.out.print("Elige una opcion: ");
			opc = e.nextByte();

			switch (opc) {
			case 1: 
				
				System.out.println("Cadena Invertida por letras: "+sCadena.reverse());
				
			break;
			
			case 2: 
				
				String pal = palabra.invertirCadenaPorPalabra();
				System.out.println("Cadena Invertida por palabras : "+pal);
				
			break;
			
			case 3: 
						
				System.out.println("Agregar Palabra: ");
				String texto = e.next();
				System.out.println("Ingrese la posicion numerica : ");
				int txt = e.nextInt(); 
				System.out.println("Se agregó la palabra a la Cadena.");
				System.out.println(palabra.agregarCaracterEnPosicion(texto,txt));	
				
			break;
			
			case 4:
				
				System.out.println("Agrega cualquier simbolo del teclado: ");
				String caracter = e.next();
				System.out.println("Ingrese la Posición: ");
				int posicion = e.nextInt(); 
				System.out.println("Se agregó Caracter a la Cadena.");
				System.out.println(palabra.agregarCaracterEnPosicion(caracter,posicion));
				
			break;
			
			case 5: 
				break;
			default: System.out.println("Opcion incorrecta");break;
			}
		}while(opc != 5);
		System.out.println("Saliendo.....");
	}
}
				
			