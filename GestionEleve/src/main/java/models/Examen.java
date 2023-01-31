package models;

import java.time.YearMonth;
import java.util.Date;

public class Examen {
    private int idExam;
    private String NomExam;
    private Date date;
    private int sequence;
    private YearMonth Annee;
    public Examen(int idExamen, String NomExamen, Date date, int Sequence, YearMonth Annee){
        this.idExam=idExamen;
        this.NomExam=NomExamen;
        this.date=date;
        this.sequence=Sequence;
        this.Annee=Annee;
    }

    public int getIdExam() {
        return idExam;
    }

    public String getNomExam() {
        return NomExam;
    }

    public Date getDate() {
        return date;
    }

    public int getSequence() {
        return sequence;
    }

    public YearMonth getAnnee() {
        return Annee;
    }

    public void setIdExam(int idExam) {
        this.idExam = idExam;
    }

    public void setNomExam(String nomExam) {
        NomExam = nomExam;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setAnnee(YearMonth annee) {
        Annee = annee;
    }
}
