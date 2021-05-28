package models;

public class Condominos {
    private String nome;
    private int Bloco;
    private int numero;
    private String telefone;
    private Bicicleta bicicleta;

    public Condominos(String nome, int Bloco, int numero, String telefone, Bicicleta bicicleta) {        
        this.nome = nome;
        this.Bloco = Bloco;
        this.numero = numero;
        this.telefone = telefone;
        this.bicicleta = bicicleta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBloco() {
        return Bloco;
    }

    public void setBloco(int Bloco) {
        this.Bloco = Bloco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setBicicleta(Bicicleta bicicleta){
        this.bicicleta = bicicleta;
    }
    
    public Bicicleta getBicicleta(){
        return bicicleta;
    }
    
    
}
