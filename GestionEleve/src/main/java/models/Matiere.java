package models;

import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;

public class Matiere {
    private int idMat;
    private String nomMatiere;
    private LocalTime  Heure;
    public Matiere(int idMatiere,String nomMatiere,LocalTime Heure)
    {
        this.idMat=idMatiere;
        this.nomMatiere=nomMatiere;
        this.Heure=Heure;
    }

    public int getIdMat() {
        return idMat;
    }

    public void setIdMat(int idMat) {
        this.idMat = idMat;
    }

    public String getNomMatiere() {
        return nomMatiere;
    }

    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }

    public LocalTime getHeure() {
        return Heure;
    }

    public void setHeure(LocalTime heure) {
        Heure = heure;
    }

}
