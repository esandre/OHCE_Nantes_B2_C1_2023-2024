package fr.enzosandre;

public class DétectionPalindrome {
    public static String Détecter(String chaîne) {
        var miroir = new StringBuilder(chaîne).reverse().toString();

        if(!miroir.equals(chaîne)) return Expressions.Bonjour + System.lineSeparator() + miroir;
        return Expressions.Bonjour + System.lineSeparator() + miroir + System.lineSeparator() + Expressions.BienDit;
    }
}
