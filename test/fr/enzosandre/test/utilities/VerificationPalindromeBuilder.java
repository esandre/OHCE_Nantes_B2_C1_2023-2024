package fr.enzosandre.test.utilities;

import fr.enzosandre.LangueInterface;
import fr.enzosandre.MomentDeLaJournée;
import fr.enzosandre.VerificationPalindrome;

public class VerificationPalindromeBuilder {
    private LangueInterface langue = new LangueStub();
    private MomentDeLaJournée momentDeLaJournée = MomentDeLaJournée.Inconnu;

    public static VerificationPalindrome Default() {
        return new VerificationPalindromeBuilder().Build();
    }

    public VerificationPalindromeBuilder AyantPourLangue(LangueInterface langue){
        this.langue = langue;
        return this;
    }

    public VerificationPalindrome Build() {
        return new VerificationPalindrome(this.langue, this.momentDeLaJournée);
    }

    public VerificationPalindromeBuilder AyantPourMomentDeLaJournée(MomentDeLaJournée momentDeLaJournée) {
        this.momentDeLaJournée = momentDeLaJournée;
        return this;
    }
}
