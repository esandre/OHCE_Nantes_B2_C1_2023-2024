package fr.enzosandre.test.utilities;

import fr.enzosandre.LangueInterface;
import fr.enzosandre.VérificationPalindrome;

public class VerificationPalindromeBuilder {
    private LangueInterface langue = new LangueStub();

    public static VérificationPalindrome Default() {
        return new VerificationPalindromeBuilder().Build();
    }

    public VerificationPalindromeBuilder AyantPourLangue(LangueInterface langue){
        this.langue = langue;
        return this;
    }

    public VérificationPalindrome Build() {
        return new VérificationPalindrome(this.langue);
    }
}
