package Model;

public class Fun��es extends Carro{
	
	public void adicionarCombustivel(int quantidade) {
		int atual=0;
		atual=getCombustivel();
		setCombustivel(quantidade+atual);
		
	}
	
	public void andar(int distancia) {
		int timer =0;
		int combustivel = getCombustivel();
		float media= distancia/combustivel;
		 timer=distancia;
	
		
		if(media < combustivel) {
			while(timer!=0) {
			System.out.println("Andando... ");
			timer--;	}
			}
		else {
			System.out.println("Voc� n�o tem combust�vel para esta dist�ncia");
		}
		
	}
	
	public void exibirCombustivel() {
		int combustivel = getCombustivel();
		System.out.println("Voc� possu�: "+combustivel+"/l");
	}

}
