package models;

public class Bicicleta {
    private String modelo;
    private String cor;
    private String vaga;
    
    public Bicicleta() {}

    public Bicicleta(String modelo, String cor, String vaga) {
        this.modelo = modelo;
        this.cor = cor;
        this.vaga = vaga;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }
    
    
}
