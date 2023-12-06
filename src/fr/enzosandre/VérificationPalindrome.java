package fr.enzosandre;

public class VérificationPalindrome {
    public static String Vérifier(String chaîne) {
        return new StringBuilder(chaîne)
                .reverse()
                .toString();
    }
}
