package fr.enzosandre;

public class LangueFrançaise implements LangueInterface {
    @Override
    public String Féliciter() {
        return Expressions.BienDit;
    }

    @Override
    public String Saluer(MomentDeLaJournée moment) {
        if(moment == MomentDeLaJournée.Soir ||moment == MomentDeLaJournée.Nuit)
            return Expressions.Bonsoir;
        return Expressions.Bonjour;
    }

    @Override
    public String toString() {
        return "Langue Française";
    }
}
