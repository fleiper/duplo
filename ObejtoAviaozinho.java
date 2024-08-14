package instancia;
import herdeiro.carro;
public class ObejtoAviaozinho {

	public static void main(String[] args) {
		carro avião = new carro();
		aviaozinho aviao = new aviaozinho();
		aviaozinho zinho = new aviaozinho();

		System.out.println("-----AVIÃO--------");
		aviao.setModelo("aerovoô");
		aviao.setTamanho("gigante");
		aviao.setCor("azul");
		aviao.setBanco("99");


		System.out.println("-----ZINHO--------");
		zinho.setModelo("123 MILHAS");
		zinho.setTamanho("indecifravel");
		zinho.setCor("inedita");
		zinho.setBanco("2.000.000.000");
		
		System.out.println("-----AVIÃO--------");
		System.out.println(aviao.getModelo());
		System.out.println(aviao.getTamanho());
		System.out.println(aviao.getCor());
		System.out.println(aviao.getBanco());

		System.out.println("-----ZINHO--------");
		System.out.println(zinho.getModelo());
		System.out.println(zinho.getTamanho());
		System.out.println(zinho.getCor());
		System.out.println(zinho.getBanco());
	}
}

