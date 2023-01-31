package models;

public class Eleve {
    private int ideleve;
    private String nomeleve;
    private String PrenomEleve;
    public Eleve(int ideleve,String StudentName, String StudentSurname)
    {
        this.ideleve = ideleve;
        this.nomeleve=StudentName;
        this.PrenomEleve=StudentSurname;
    }
    public int getIdeleve(){
        return ideleve;
    }

    public void setIdeleve(int ideleve) {
        this.ideleve = ideleve;
    }

    public String getNomeleve() {
        return nomeleve;
    }

    public void setNomeleve(String nomeleve) {
        this.nomeleve = nomeleve;
    }
    public String getPrenomEleve(){
        return PrenomEleve;
    }
}
