package secao08;
import java.util.Scanner;

//Criando funcoes
public class Programa20 {

	static String fruta[];
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int qntd;
			
		System.out.println("Informe a quantidade de frutas: ");
		qntd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qntd);
		mostrar_dados(qntd);
		
		teclado.close();
	}


	 //uma funcao deve ter 
	//a) tipo de retorno
	//b) nome - corresponde a ação que a função realiza 
	//c) paramentros/argumentos de entrada (OPCIONAL)
	//d) retorno (OPCIONAL - depende do tipo de retorno)
	
	// void = vazio (nao tem retorno)
	static void cadastrar_dados(int quantidade) {
		fruta = new String[quantidade];
		
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Informa a " + (i + 1) + " fruta: ");
			fruta[i] = teclado.nextLine();
		}
		
	}
	
	static void mostrar_dados(int quantidade) {
		
		for(int i = (quantidade - 1); i>= 0; i--) {
			System.out.println(fruta[i]);
		}
	}
	
}