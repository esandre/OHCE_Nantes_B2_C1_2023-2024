package fr.enzosandre;

import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(inversion, résultat);
    }

    @Test
    public void testPalindrome(){
        // ETANT DONNE un palindrome
        String palindrome = "radar";

        // QUAND on vérifie si c'est un palindrome
        String résultat = VérificationPalindrome.Vérifier(palindrome);

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu = palindrome + System.lineSeparator() + Expressions.BienDit;
        assertEquals(attendu, résultat);
    }
}
