package models;

public class Classe {
    private int idclasse;
    private String nomclasse;
    public Classe(int ideleve,String name)
    {
        this.idclasse = ideleve;
        this.nomclasse=name;
    }
    public int getIdclasse(){
        return idclasse;
    }

    public void setIdclasse(int idclasse) {
        this.idclasse = idclasse;
    }

    public String getNomclasse() {
        return nomclasse;
    }

    public void setNomclasse(String nomclasse) {
        this.nomclasse = nomclasse;
    }
}
