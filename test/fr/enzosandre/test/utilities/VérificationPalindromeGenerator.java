package fr.enzosandre.test.utilities;

import fr.enzosandre.LangueInterface;
import fr.enzosandre.VérificationPalindrome;

import java.util.ArrayList;
import java.util.List;

public class VérificationPalindromeGenerator {
    private VérificationPalindromeBuilder builder = new VérificationPalindromeBuilder();

    public VérificationPalindromeGenerator AyantPourLangue(LangueInterface langue){
        this.builder = this.builder.AyantPourLangue(langue);
    }

    public Iterable<VérificationPalindrome> Generate(int howMany){
        List<VérificationPalindrome> instances = new ArrayList<VérificationPalindrome>();
        for (int i = 0; i<= howMany; i++)
            instances.add(this.builder.Build());

        return instances;
    }
}
