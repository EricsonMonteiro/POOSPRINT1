package Sprint1;

public class Professor extends Isecmarini implements ModeradorGrupo{


    public int area;
    public String grau;
    public String departamento;

    public Professor(String userName, String email, String nome, String alcunha, double password, boolean visivel, int area, String grau, String departamento) {
        super(userName, email, nome, alcunha, password, visivel);
        this.area = area;
        this.grau = grau;
        this.departamento = departamento;
    }


    public void mandaColegas(Isecmarini[] membros) {}

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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

    @Override
    public void criar() {

    }

    @Override
    public void apagar() {

    }

    @Override
    public void adicionarMembro() {

    }

    @Override
    public void muteMembro() {

    }

    @Override
    public void removerMembro() {

    }

    @Override
    public void moderar() {

    }
}
