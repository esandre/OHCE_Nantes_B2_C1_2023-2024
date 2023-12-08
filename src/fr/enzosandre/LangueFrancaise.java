package fr.enzosandre;

public class LangueFrancaise implements LangueInterface {
    @Override
    public String Féliciter() {
        return Expressions.BienDit;
    }

    @Override
    public String Saluer(MomentDeLaJournee momentDeLaJournee) {
        if(momentDeLaJournee == MomentDeLaJournee.Matin)        return Expressions.Bonjour;
        if(momentDeLaJournee == MomentDeLaJournee.AprèsMidi)    return Expressions.Bonjour;
        if(momentDeLaJournee == MomentDeLaJournee.Soir)         return Expressions.Bonsoir;
        return Expressions.Bonsoir;
    }

    @Override
    public String SeQuitter() {return Expressions.AuRevoir;}

    @Override
    public String toString() {
        return "Langue Française";
    }
}
