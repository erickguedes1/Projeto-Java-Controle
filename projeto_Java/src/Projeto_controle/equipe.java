package Projeto_controle;
import java.util.ArrayList;


public class equipe {
    private ArrayList<Colaborador> colaboradores;
    private ArrayList<ProdutoDeLimpeza> produtos;

    public equipe() {
        colaboradores = new ArrayList<>();
        produtos = new ArrayList<>();
    }

    public void adicionarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
        System.out.println("Colaborador " + colaborador.getNome() + " adicionado.");
    }
    	
    public void removerColaborador(String nome) {
        colaboradores.removeIf(c -> c.getNome().equals(nome));
        System.out.println("Colaborador " + nome + " removido.");
    }

    public void mostrarColaboradores() {
        System.out.println("Colaboradores:");
        for (Colaborador c : colaboradores) {
            System.out.println(c);
        }
    }

    public void adicionarProduto(ProdutoDeLimpeza produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado.");
    }

    public void removerProduto(String nome) {
        produtos.removeIf(p -> p.getNome().equals(nome));
        System.out.println("Produto " + nome + " removido.");
    }

    public void mostrarProdutos() {
        System.out.println("Produtos de Limpeza:");
        for (ProdutoDeLimpeza p : produtos) {
            System.out.println(p);
        }
    }
}
