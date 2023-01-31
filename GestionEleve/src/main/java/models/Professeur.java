package models;

public class Professeur {
    private int idProf;
    private String nomProf;
    private String PrenomProf;
    public Professeur(int ideleve,String teachertName, String teacherSurname)
    {
        this.idProf = ideleve;
        this.nomProf=teachertName;
        this.PrenomProf=teacherSurname;
    }
    public int getIdProf(){
        return idProf;
    }

    public void setIdProf(int ideleve) {
        this.idProf = ideleve;
    }

    public String getNomProf() {
        return nomProf;
    }

    public void setNomProf(String nomeleve) {
        this.nomProf = nomeleve;
    }
    public String getPrenomProf(){
        return PrenomProf;
    }

    public void setPrenomProf(String prenomProf) {
        PrenomProf = prenomProf;
    }
}
