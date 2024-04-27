package Sprint1;

public class PedradaFoto extends Pedrada{

    String nomeFicheiro;
    String legenda;


    public PedradaFoto(String username, String nomeFicheiro, String legenda) {
        super(username);
        this.nomeFicheiro = nomeFicheiro;
        this.legenda = legenda;
    }

    public String getNomeFicheiro() {
        return nomeFicheiro;
    }

    public void setNomeFicheiro(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }
}
