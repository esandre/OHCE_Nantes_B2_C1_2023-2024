package fr.enzosandre;

public class LangueAnglaise implements LangueInterface {
    @Override
    public String Féliciter() {
        return Expressions.WellSaid;
    }

    @Override
    public String Saluer() {
        return Expressions.Hello;
    }
}
