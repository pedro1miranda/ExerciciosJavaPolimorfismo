package polimorfismo.model;

public class Produto {
	private String nome;
	private double preco;
	private int qtd;
	
	public Produto(String nome) {
		this.nome = nome;
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco(){
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd(){
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public void exibir(String nome) {
		System.out.println("Nome do produto: "+nome);
		System.out.println();
	}
	public void exibir(String nome, double preco) {
		System.out.println("Nome do produto: "+nome);
		System.out.println("Preco do produto: "+preco);
		System.out.println();
	}
	public void exibir(String nome, double preco, int qtd) {
		System.out.println("Nome do produto: "+nome);
		System.out.println("Preço do produto: "+preco);
		System.out.println("Quantidade do produto: "+qtd);
		System.out.println();
	}
}
