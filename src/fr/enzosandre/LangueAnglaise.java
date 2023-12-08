package fr.enzosandre;

public class LangueAnglaise implements LangueInterface {
    @Override
    public String Féliciter() {
        return Expressions.WellSaid;
    }

    @Override
    public String Saluer(MomentDeLaJournée momentDeLaJournée) {
        return Expressions.Hello;
    }

    @Override
    public String SeQuitter() {return Expressions.GoodBye;}

    @Override
    public String toString() {
        return "Langue Anglaise";
    }
}
