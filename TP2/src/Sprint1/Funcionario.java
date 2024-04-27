package Sprint1;

public class Funcionario extends Isecmarini implements GestorEvento {

    private String uo;
    private String função;

    public Funcionario(String userName, String email, String nome, String alcunha, double password, boolean visivel, String uo, String função) {
        super(userName, email, nome, alcunha, password, visivel);
        this.uo = uo;
        this.função = função;
    }


    @Override
    public void novo() {

    }

    @Override
    public void novoRecorrente() {

    }

    @Override
    public void convidar() {

    }

    @Override
    public void manda(MembroRede membro) {

    }

    @Override
    public void mostrarPerfil() {

    }

    @Override
    public void mudarVisibilidade() {

    }
}
