package fr.enzosandre;

public class VerificationPalindrome {
    private final LangueInterface langue;
    private final MomentDeLaJournee momentDeLaJournee;

    public VerificationPalindrome(LangueInterface langue, MomentDeLaJournee momentDeLaJournee) {
        this.langue = langue;
    }

    public String Vérifier(String chaîne) {
        String miroir =  new StringBuilder(chaîne)
                .reverse()
                .toString();

        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(this.langue.Saluer(this.momentDeLaJournee));
        resultBuilder.append(System.lineSeparator());
        resultBuilder.append(miroir);
        resultBuilder.append(System.lineSeparator());

        if(miroir.equals(chaîne)) {
            resultBuilder.append(this.langue.Féliciter());
            resultBuilder.append(System.lineSeparator());
        }

        resultBuilder.append(this.langue.SeQuitter());
        resultBuilder.append(System.lineSeparator());
        return resultBuilder.toString();
    }
}
