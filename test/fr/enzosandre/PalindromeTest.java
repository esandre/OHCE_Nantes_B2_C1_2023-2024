package fr.enzosandre;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class PalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = {"test", "epsi"})
    public void testMiroir(String chaîne) {
        // ETANT DONNE une chaîne n'étant pas un palindrome
        // QUAND on vérifie si c'est un palindrome
        String résultat = VérificationPalindrome.Vérifier(chaîne);

        // ALORS on obtient son miroir
        String inversion = new StringBuilder(chaîne)
                .reverse()
                .toString();

        assertTrue(résultat.contains(inversion));
    }

    @Test
    public void testPalindrome(){
        // ETANT DONNE un palindrome
        String palindrome = "radar";

        // QUAND on vérifie si c'est un palindrome
        String résultat = VérificationPalindrome.Vérifier(palindrome);

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu = palindrome + System.lineSeparator() + Expressions.BienDit;
        assertTrue(résultat.contains(attendu));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "radar"})
    public void testBonjour(String chaîne){
        // ETANT DONNE une chaîne
        // QUAND on vérifie si c'est un palindrome
        String résultat = VérificationPalindrome.Vérifier(chaîne);

        // ALORS toute réponse est précédée de "Bonjour"
        String[] lines = résultat.split(System.lineSeparator());
        assertEquals(Expressions.Bonjour, lines[0]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "radar"})
    public void testAuRevoir(String chaîne){
        // ETANT DONNE une chaîne
        // QUAND on vérifie si c'est un palindrome
        String résultat = VérificationPalindrome.Vérifier(chaîne);

        // ALORS toute réponse est suivie de "Au Revoir"
        String[] lines = résultat.split(System.lineSeparator());
        String lastLine = lines[lines.length - 1];
        assertEquals(Expressions.AuRevoir, lastLine);
    } 
}
