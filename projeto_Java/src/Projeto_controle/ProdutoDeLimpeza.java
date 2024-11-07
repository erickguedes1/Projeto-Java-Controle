package Projeto_controle;

	public class ProdutoDeLimpeza {
	    private String nome;
	    private int quantidade;

	    public ProdutoDeLimpeza(String nome, int quantidade) {
	        this.nome = nome;
	        this.quantidade = quantidade;
	    }

	    // Getters e Setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getQuantidade() {
	        return quantidade;
	    }

	    public void setQuantidade(int quantidade) {
	        this.quantidade = quantidade;
	    }

	    public String toString() {
	        return "Produto: " + nome + ", Quantidade: " + quantidade;
	    }
	}
