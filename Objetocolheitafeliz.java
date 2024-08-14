package instancia;
public class Objetocolheitafeliz {
	public static void main(String[] args) {
	
		colheitafeliz vaca = new colheitafeliz();
		colheitafeliz porco = new  colheitafeliz();
		colheitafeliz galinha = new  colheitafeliz();
		colheitafeliz pintinho = new  colheitafeliz();
		colheitafeliz cão = new  colheitafeliz();
		colheitafeliz cabrito = new  colheitafeliz();
		colheitafeliz bezerro = new  colheitafeliz();
		
		vaca.setraça("bovino");
		vaca.settamanho("123 MILHAS");
		vaca.setnome("gertrude");
		vaca.setidade("2.000.000.000");
		
		porco.setraça("suíno");
		porco.settamanho("normal");
		porco.setnome("peppa");
		porco.setidade("4 ANOS");
			
		galinha.setraça("futuristica");
		galinha.settamanho("pequno");
		galinha.setnome("chicken little");
		galinha.setidade("9 ANOS");
			
		pintinho.setraça("FIO DA GALINHA");
		pintinho.settamanho("atómos");
		pintinho.setnome("piu");
		pintinho.setidade("54 ANOS");
			
		cão.setraça("poodle");
		cão.settamanho("normal");
		cão.setnome("fredluke");
		cão.setidade("10 ANOS");
		
		cabrito.setraça("cabrito");
		cabrito.settamanho("normal");
		cabrito.setnome("blinblinboy");
		cabrito.setidade("4 ANOS");
		
		bezerro.setraça("berrrrrr");
		bezerro.settamanho("normal");
		bezerro.setnome("bill chipher");
		bezerro.setidade("1 trilhão");
			
		
		System.out.println("VACA");
		System.out.println("RAÇA:"+vaca.getraça());
		System.out.println("TAMANHO:"+vaca.gettamanho());
		System.out.println("NOME:"+vaca.getnome());
		System.out.println("IDADE:"+vaca.getidade());
		System.out.println(vaca.churras());
		System.out.println("====================================");
		
		System.out.println("PORCO");
		System.out.println("RAÇA:"+porco.getraça());
		System.out.println("TAMANHO:"+porco.gettamanho());
		System.out.println("NOME:"+porco.getnome());
		System.out.println("IDADE:"+porco.getidade());
		System.out.println(porco.vivo());
		System.out.println("====================================");

		System.out.println("GALINHA");
		System.out.println("RAÇA:"+galinha.getraça());
		System.out.println("TAMANHO:"+galinha.gettamanho());
		System.out.println("NOME:"+galinha.getnome());
		System.out.println("IDADE:"+galinha.getidade());
		System.out.println(galinha.churras());
		System.out.println("====================================");

		System.out.println("PINTINHO");
		System.out.println("RAÇA:"+pintinho.getraça());
		System.out.println("TAMANHO:"+pintinho.gettamanho());
		System.out.println("NOME:"+pintinho.getnome());
		System.out.println("IDADE:"+pintinho.getidade());
		System.out.println(pintinho.churras());
		System.out.println("====================================");

		System.out.println("CÃO");
		System.out.println("RAÇA:"+cão.getraça());
		System.out.println("TAMANHO:"+cão.gettamanho());
		System.out.println("NOME:"+cão.getnome());
		System.out.println("IDADE:"+cão.getidade());
		System.out.println(cão.vivo());
		System.out.println("====================================");

		System.out.println("CABRITO");
		System.out.println("RAÇA:"+cabrito.getraça());
		System.out.println("TAMANHO:"+cabrito.gettamanho());
		System.out.println("NOME:"+cabrito.getnome());
		System.out.println("IDADE:"+cabrito.getidade());
		System.out.println(cabrito.cru());
		System.out.println("====================================");

		System.out.println("BEZERRO");
		System.out.println("RAÇA:"+bezerro.getraça());
		System.out.println("TAMANHO:"+bezerro.gettamanho());
		System.out.println("NOME:"+bezerro.getnome());
		System.out.println("IDADE:"+bezerro.getidade());
		System.out.println(bezerro.cru());
		

}
}