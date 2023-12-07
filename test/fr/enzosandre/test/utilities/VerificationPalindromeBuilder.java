package fr.enzosandre.test.utilities;

import fr.enzosandre.LangueInterface;
import fr.enzosandre.VerificationPalindrome;

public class VerificationPalindromeBuilder {
    private LangueInterface langue = new LangueStub();

    public static VerificationPalindrome Default() {
        return new VerificationPalindromeBuilder().Build();
    }

    public VerificationPalindromeBuilder AyantPourLangue(LangueInterface langue){
        this.langue = langue;
        return this;
    }

    public VerificationPalindrome Build() {
        return new VerificationPalindrome(this.langue);
    }
}
