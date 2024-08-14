package instancia;

public class colheitafeliz {
	String raça;
	String tamanho;
	String nome;
	String idade;

	public String getraça() {
		return raça;
	}
	public void setraça (String raça) {
		this.raça = raça;
	}
	public String gettamanho() {
		return tamanho;
	}
	public void  settamanho (String tamanho) {
		this.tamanho = tamanho;
	}
	public String getnome () {
		return nome;
	}
	public void setnome (String nome) {
		this.nome = nome;
	}
	public String getidade () {
		return idade;
	}
	public void setidade (String idade) {
		this.idade = idade;
	}
	public String churras() {
		return "dorme";
	}
	public String cru() {
		return "acorda";
	}
	public String vivo () {
		return "acordado";

	}
}
