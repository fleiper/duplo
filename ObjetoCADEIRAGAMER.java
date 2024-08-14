package instancia;

public class ObjetoCADEIRAGAMER {

	public static void main(String[] args) {
		CADEIRAGAMER CADEIRAGAMER = new CADEIRAGAMER ();
		CADEIRAGAMER cadeira = new CADEIRAGAMER ();
		

		System.out.println("-----cadeira--------");
		CADEIRAGAMER.setmarca("PICHAU");
		CADEIRAGAMER.setquant("6 RODAS");
		CADEIRAGAMER.setvalor("1.000$$");
		CADEIRAGAMER.setcor("MULTICOLOR");
		
		System.out.println("-----cadeira--------");
		cadeira.setmarca("durateston");
		cadeira.setquant("6 rodas");
		cadeira.setvalor("150$$");
		cadeira.setcor("preto");
		
		System.out.println("------CADEIRA GAMER-------");
		System.out.println("MARCA"+CADEIRAGAMER.getmarca());
		System.out.println("QUANTIDADE DE RODAS"+CADEIRAGAMER.getquant());
		System.out.println("VALOR"+CADEIRAGAMER.getvalor());
		System.out.println("COR"+CADEIRAGAMER.getcor());
		System.out.println(CADEIRAGAMER.nop());
		
		System.out.println("------CADEIRA DE ESCRITORIO-------");
		System.out.println("MARCA"+cadeira.getmarca());
		System.out.println("QUANTIDADE DE RODAS"+cadeira.getquant());
		System.out.println("VALOR"+cadeira.getvalor());
		System.out.println("COR"+cadeira.getcor());
		System.out.println(cadeira.usado());

	}

}
