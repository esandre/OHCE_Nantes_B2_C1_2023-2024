package fr.enzosandre;

public class MomentDeLaJournée {
    public static MomentDeLaJournée Matin = new MomentDeLaJournée("Matin");
    public static MomentDeLaJournée Inconnu = new MomentDeLaJournée("Inconnu");
    public static MomentDeLaJournée AprèsMidi = new MomentDeLaJournée("Après Midi");
    public static MomentDeLaJournée Soir = new MomentDeLaJournée("Soir");
    public static MomentDeLaJournée Nuit = new MomentDeLaJournée("Nuit");

    private final String representation;

    private MomentDeLaJournée(String label){
        this.representation = label;
    }

    @Override
    public String toString() {
        return this.representation;
    }
}
