package fr.enzosandre;

public class LangueFrancaise implements LangueInterface {
    @Override
    public String Féliciter() {
        return Expressions.BienDit;
    }

    @Override
    public String Saluer(MomentDeLaJournée momentDeLaJournée) {
        if (momentDeLaJournée == MomentDeLaJournée.Matin) {
            return Expressions.Bonjour;
        }
        if (momentDeLaJournée == MomentDeLaJournée.AprèsMidi) {
            return Expressions.Bonjour;
        }
        if (momentDeLaJournée == MomentDeLaJournée.Soir) {
            return Expressions.Bonsoir;
        }
        if (momentDeLaJournée == MomentDeLaJournée.Nuit) {
            return Expressions.Bonsoir;
        }
        return Expressions.Bonjour;
    }

    @Override
    public String SeQuitter() {return Expressions.AuRevoir;}

    @Override
    public String toString() {
        return "Langue Française";
    }
}
