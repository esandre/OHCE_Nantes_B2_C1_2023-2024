package fr.enzosandre;

public class VérificationPalindrome {
    public static String Vérifier(String chaîne) {
        String miroir =  new StringBuilder(chaîne)
                .reverse()
                .toString();

        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(Expressions.Bonjour);
        resultBuilder.append(System.lineSeparator());
        resultBuilder.append(miroir);

        if(miroir.equals(chaîne)) {
            resultBuilder.append(System.lineSeparator());
            resultBuilder.append(Expressions.BienDit);
        }

        return resultBuilder.toString();
    }
}
