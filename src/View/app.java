package View;


import Model.Carro;
import Model.Funções;

public class app {

	public static void main (String [] args) 
		{
			Funções f = new Funções();

			System.out.println("Testing ma fucking screen");
			System.out.println();
			
			f.setMarca("Chevrolet");
		
			f.setCombustivel(10);

			
			f.adicionarCombustivel(50);
	

			
			f.exibirCombustivel();
			
			f.andar(10);
			
		}
}
