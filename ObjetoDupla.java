package instancia;
public class ObjetoDupla {

	public static void main(String[] args) {
		
		dupla cliente = new dupla();
		dupla comprador = new dupla();
		dupla papel = new dupla();
		dupla pix = new dupla();
		
		
		System.out.println("-----DADOS DO CLIENTE--------");
		cliente.setnome("GIOVANNA MACHADO VIEIRA CEZÁRIO");
		cliente.settelefone("15 99875-9692");
		cliente.setcpf("150-759-159-08");
		cliente.setrg("69-256-46-19");
		
		System.out.println("-----DADOS DO CLIENTE--------");
		comprador.setnome("EDGAR RAIMUNDO NETO DA SILVA");
		comprador.settelefone("217 551196420");
		comprador.setcpf("852-759-123-08");
		comprador.setrg("12-345-678-09");
		
		System.out.println("-----DADOS DO CLIENTE--------");
		papel.setnome("MEU PAI");
		papel.settelefone("217 551196420");
		papel.setcpf("852-759-123-08");
		papel.setrg("12-345-678-09");
		
		System.out.println("-----DADOS DO CLIENTE--------");
		pix.setnome("SILVIO ESCOBAR SAM INACIO");
		pix.settelefone("217 00000000");
		pix.setcpf("123-456-789-00");
		pix.setrg("98-765-432-10");
		
		System.out.println("-----DADOS DO CLIENTE--------");
		System.out.println("NOME:"+cliente.getnome());
		System.out.println("TELEFONE:"+cliente.gettelefone());
		System.out.println("CPF:"+cliente.getcpf());
		System.out.println("RG:"+cliente.getrg());
		System.out.println(cliente.dinheiro());
		
		System.out.println("-----DADOS DO CLIENTE--------");
		System.out.println("NOME:"+comprador.getnome());
		System.out.println("TELEFONE:"+comprador.gettelefone());
		System.out.println("CPF:"+comprador.getcpf());
		System.out.println("RG:"+comprador.getrg());
		System.out.println(comprador.cartão());
		
		System.out.println("-----DADOS DO CLIENTE--------");
		System.out.println("NOME:"+papel.getnome());
		System.out.println("TELEFONE:"+papel.gettelefone());
		System.out.println("CPF:"+papel.getcpf());
		System.out.println("RG:"+papel.getrg());
		System.out.println(papel.boleto());
		
		System.out.println("-----DADOS DO CLIENTE--------");
		System.out.println("NOME:"+pix.getnome());
		System.out.println("TELEFONE:"+pix.gettelefone());
		System.out.println("CPF:"+pix.getcpf());
		System.out.println("RG:"+pix.getrg());
		System.out.println(pix.Qrcodepix());


	}

}
