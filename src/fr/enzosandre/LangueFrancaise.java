package fr.enzosandre;

public class LangueFrancaise implements LangueInterface {
    @Override
    public String Féliciter() {
        return Expressions.BienDit;
    }

    @Override
    public String Saluer(MomentDeLaJournée momentDeLaJournée) { return Expressions.Bonjour; }

    @Override
    public String SeQuitter() {return Expressions.AuRevoir;}

    @Override
    public String toString() {
        return "Langue Française";
    }
}
