package View;


import Model.Carro;
import Model.Fun��es;

public class app {

	public static void main (String [] args) 
		{
			Fun��es f = new Fun��es();

			System.out.println("Testing ma fucking screen");
			System.out.println();
			
			f.setMarca("Chevrolet");
		
			f.setCombustivel(10);

			
			f.adicionarCombustivel(50);
	

			
			f.exibirCombustivel();
			
			f.andar(10);
			
		}
}
