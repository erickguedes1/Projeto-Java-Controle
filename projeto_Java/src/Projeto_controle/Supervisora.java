package Projeto_controle;

class Supervisora extends Pessoa {
    public equipe equipe;

    public Supervisora(String nome, int idade, String profissao) {
        super(nome, idade, profissao);
        this.equipe = new equipe();
    }

    public equipe getEquipe() {
        return equipe;
    }

    public void adicionarColaborador(Colaborador colaborador) {
        equipe.adicionarColaborador(colaborador);
    }
    
    public void visualizarColaboradores() {
        equipe.mostrarColaboradores();
    }
}

class Colaborador extends Pessoa {
    public Colaborador(String nome, int idade, String profissao) {
        super(nome, idade, profissao);
    }
}