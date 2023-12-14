package fr.enzosandre;

public class LangueAnglaise implements LangueInterface {
    @Override
    public String Féliciter() {
        return Expressions.WellSaid;
    }

    @Override
    public String Saluer(MomentDeLaJournée momentDeLaJournée) {
        if (momentDeLaJournée == MomentDeLaJournée.Matin) {
            return Expressions.GoodMorning;
        }
        if (momentDeLaJournée == MomentDeLaJournée.AprèsMidi) {
            return Expressions.GoodAfternoon;
        }
        if (momentDeLaJournée == MomentDeLaJournée.Soir) {
            return Expressions.GoodEvening;
        }
        if (momentDeLaJournée == MomentDeLaJournée.Nuit) {
            return Expressions.GoodEvening;
        }
        return Expressions.Hello;
    }

    @Override
    public String SeQuitter() {return Expressions.GoodBye;}

    @Override
    public String toString() {
        return "Langue Anglaise";
    }
}
