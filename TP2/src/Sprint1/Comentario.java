package Sprint1;

import java.time.LocalDateTime;

public class Comentario extends Pedrada{
    private String texto;
    private LocalDateTime datahora;
    private int gostos;

    public Comentario(String username, String texto, LocalDateTime datahora, int gostos) {
        super(username);
        this.texto = texto;
        this.datahora = datahora;
        this.gostos = gostos;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public void setDatahora(LocalDateTime datahora) {
        this.datahora = datahora;
    }

    @Override
    public int getGostos() {
        return gostos;
    }

    @Override
    public void setGostos(int gostos) {
        this.gostos = gostos;
    }


    public Comentario responder(){
        return null;
    }
    public void gostos(){}

    public void tragosto(){}
}
