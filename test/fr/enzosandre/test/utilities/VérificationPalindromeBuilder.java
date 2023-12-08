package fr.enzosandre.test.utilities;

import fr.enzosandre.LangueInterface;
import fr.enzosandre.MomentDeLaJournée;
import fr.enzosandre.VérificationPalindrome;

public class VérificationPalindromeBuilder {
    private LangueInterface langue = new LangueStub();
    private MomentDeLaJournée moment = MomentDeLaJournée.Inconnu;

    public static VérificationPalindrome Default() {
        return new VérificationPalindromeBuilder().Build();
    }

    public VérificationPalindromeBuilder AyantPourLangue(LangueInterface langue){
        this.langue = langue;
        return this;
    }

    public VérificationPalindrome Build() {
        return new VérificationPalindrome(this.langue, this.moment);
    }

    public VérificationPalindromeBuilder AyantPourMomentDeLaJournée(MomentDeLaJournée momentDeLaJournée) {
        this.moment = momentDeLaJournée;
        return this;
    }
}
