package Sprint1;

public class PedradaMensagem extends Pedrada {
    String mensagem;

    public PedradaMensagem(String username, String mensagem) {
        super(username);
        this.mensagem = mensagem;
    }

    public String getTexto() {
        return mensagem;
    }
}
