package fr.enzosandre.test.utilities;

import fr.enzosandre.LangueInterface;
import fr.enzosandre.VerificationPalindrome;
import fr.enzosandre.MomentDeLaJournee;

public class VerificationPalindromeBuilder {
    private LangueInterface langue = new LangueStub();
    private MomentDeLaJournee moment = MomentDeLaJournee.Inconnu;
    public static VerificationPalindrome Default() {
        return new VerificationPalindromeBuilder().Build();
    }

    public VerificationPalindromeBuilder AyantPourLangue(LangueInterface langue){
        this.langue = langue;
        return this;
    }

    public VerificationPalindromeBuilder AyantPourMomentDeLaJournee(MomentDeLaJournee momentDeLaJournee) {
        this.moment = momentDeLaJournee;
        return this;
    }

    public VerificationPalindrome Build() {
        return new VerificationPalindrome(this.langue, this.moment);
    }
}
