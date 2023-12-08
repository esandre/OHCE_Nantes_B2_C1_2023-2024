package fr.enzosandre;

public class LangueAnglaise implements LangueInterface {
    @Override
    public String Féliciter() {
        return Expressions.WellSaid;
    }

    @Override
    public String Saluer(MomentDeLaJournee momentDeLaJournee) {
        if(momentDeLaJournee == MomentDeLaJournee.Matin)        return Expressions.Hello;
        if(momentDeLaJournee == MomentDeLaJournee.AprèsMidi)    return Expressions.GoodAfternoon;
        return Expressions.GoodEvening;
    }

    @Override
    public String SeQuitter() {return Expressions.GoodBye;}

    @Override
    public String toString() {
        return "Langue Anglaise";
    }
}
