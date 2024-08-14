package instancia;
public class CADEIRAGAMER {
	
	String marca;
	String quant;
	String valor;
	String cor;
	
	public String getmarca() {
		return marca;
	}
	public void setmarca (String marca) {
		this.marca = marca;
	}
	public String getquant() {
		return quant;
	}
	public void  setquant (String quant) {
		this.quant = quant;
	}
	public String getvalor () {
		return valor;
	}
	public void setvalor (String valor) {
		this.valor = valor;
	}
	public String getcor () {
		return cor;
	}
	public void setcor (String cor) {
		this.cor = cor;
	}
	public String usado () {
		return "SENDO UTILIZADA";
	}
	public String nop () {
		return "NINGUEM USANDO";
	}
}
