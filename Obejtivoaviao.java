package instancia;

public class Obejtivoaviao {

	public static void main (String[] args) {
		aviao planador = new aviao();
		aviao teia= new aviao();
		
		planador.setTamanho("grande");
		planador.setModelo("123 MILHAS");
		planador.setCor("inedita");
		planador.setBanco("2.000.000.000");
		
		teia.setTamanho("metros");
		teia.setModelo("organica");
		teia.setCor("white");
		teia.setBanco("predio");
			
		
		System.out.println("PLANADOR");
		System.out.println(planador.getTamanho());
		System.out.println(planador.getModelo());
		System.out.println(planador.getCor());
		System.out.println(planador.getBanco());
		System.out.println(planador.voar());
		
		
		System.out.println("TEIA");
		System.out.println(teia.getTamanho());
		System.out.println(teia.getModelo());
		System.out.println(teia.getCor());
		System.out.println(teia.getBanco());
		System.out.println(teia.planar());


	}
}
