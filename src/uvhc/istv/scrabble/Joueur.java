package uvhc.istv.scrabble;

import java.util.ArrayList;

/**
 * @author Tristan Duwiquet
 */
public class Joueur {
    private String nom;
    private int score;
    private ArrayList<Lettre> chevalet;

    public Joueur(String nom, int score, ArrayList<Lettre> chevalet) {
        this.nom = nom;
        this.score = score;
        this.chevalet = chevalet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Lettre> getChevalet() {
        return chevalet;
    }

    public void setChevalet(ArrayList<Lettre> chevalet) {
        this.chevalet = chevalet;
    }
}
