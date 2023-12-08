package fr.enzosandre;

public class MomentDeLaJournee {
    public static MomentDeLaJournee Matin = new MomentDeLaJournee("Matin");
    public static MomentDeLaJournee AprèsMidi = new MomentDeLaJournee("AprèsMidi");
    public static MomentDeLaJournee Soir = new MomentDeLaJournee("Soir");
    public static MomentDeLaJournee Nuit = new MomentDeLaJournee("Nuit");
  public static MomentDeLaJournee Inconnu = new MomentDeLaJournee("Inconnu");

    private final String representation;



    public MomentDeLaJournee(String label) { this.representation = label;}


    public static MomentDeLaJournee DepuisHeure(int heure) {
        if(heure < 8) return  MomentDeLaJournee.Nuit;
        if(heure < 12) return  MomentDeLaJournee.Matin;
        if(heure < 18) return  MomentDeLaJournee.AprèsMidi;
        if(heure < 21) return  MomentDeLaJournee.Soir;
        return MomentDeLaJournee.Nuit;
    }
}
