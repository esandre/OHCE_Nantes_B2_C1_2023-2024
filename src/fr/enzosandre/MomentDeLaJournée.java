package fr.enzosandre;

public class MomentDeLaJournée {
    public static MomentDeLaJournée Matin = new MomentDeLaJournée("Matin");
    public static MomentDeLaJournée AprèsMidi = new MomentDeLaJournée("AprèsMidi");
    public static MomentDeLaJournée Soir = new MomentDeLaJournée("Soir");
    public static MomentDeLaJournée Nuit = new MomentDeLaJournée("Nuit");
    public static MomentDeLaJournée Inconnu = new MomentDeLaJournée("Inconnu");


    private final String representation;

    public MomentDeLaJournée(String label) { this.representation = label;}


    public static MomentDeLaJournée DepuisHeure(int heure) {
        if(heure < 8) return  MomentDeLaJournée.Nuit;
        if(heure < 12) return  MomentDeLaJournée.Matin;
        if(heure < 18) return  MomentDeLaJournée.AprèsMidi;
        if(heure < 21) return  MomentDeLaJournée.Soir;
        return MomentDeLaJournée.Nuit;

    }
}
