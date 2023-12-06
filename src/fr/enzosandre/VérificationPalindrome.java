package fr.enzosandre;

public class VérificationPalindrome {
    public static String Vérifier(String chaîne) {
        String miroir =  new StringBuilder(chaîne)
                .reverse()
                .toString();

        if(miroir.equals(chaîne))
            return miroir
                    + System.lineSeparator()
                    + Expressions.BienDit;
        return miroir;
    }
}
