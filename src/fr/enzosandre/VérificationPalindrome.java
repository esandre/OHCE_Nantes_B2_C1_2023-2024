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
        resultBuilder.append(System.lineSeparator());

        if(miroir.equals(chaîne)) {
            resultBuilder.append(Expressions.BienDit);
            resultBuilder.append(System.lineSeparator());
        }

        resultBuilder.append(Expressions.AuRevoir);
        return resultBuilder.toString();
    }
}
