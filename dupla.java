package instancia;
public class dupla {
	String nome;
	String telefone;
	String cpf;
	String rg;

	public String getnome() {
		return nome;
	}
	public void setnome (String nome) {
		this.nome = nome;
	}
	public String gettelefone() {
		return telefone;
	}
	public void  settelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getcpf () {
		return cpf;
	}
	public void setcpf (String cpf) {
		this.cpf = cpf;
	}
	public String getrg () {
		return rg;
	}
	public void setrg (String rg) {
		this.rg = rg;
	}
	public String cartão() {
		return "PAGOU NO CARTÃO";
	}
	public String boleto() {
		return "PAGOU NO BOLETO";
	}
	public String dinheiro () {
		return "PAGOU NO DINHEIRO";
	}
	public String Qrcodepix() {
		return "PAGOU EM PIX";
}
}