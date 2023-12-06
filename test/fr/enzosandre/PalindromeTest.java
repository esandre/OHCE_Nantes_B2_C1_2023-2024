package fr.enzosandre;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = { "test", "epsi" })
    public void testMiroir(String chaîne) {
        // ETANT DONNE une chaîne n'étant pas un palindrome
        // QUAND on vérifie si c'est un palindrome
        String résultat = DétectionPalindrome.Détecter(chaîne);

        // ALORS on obtient son miroir
        String attendu = new StringBuilder(chaîne).reverse().toString();
        assertTrue(résultat.contains(attendu));
    }

    @Test
    public void testBienDit(){
        // ETANT DONNE un palindrome
        String palindrome = "radar";

        // QUAND on vérifie si c'est un palindrome
        String résultat = DétectionPalindrome.Détecter(palindrome);

        // ALORS j'obtiens la chaîne suivie de "Bien dit !"
        String attendu = palindrome + System.lineSeparator() + Expressions.BienDit;
        assertTrue(résultat.contains(attendu));
    }

    @ParameterizedTest
    @ValueSource(strings = { "test", "radar" })
    public void BonjourTest(String chaîne) {
        // ETANT DONNE une chaîne
        // QUAND on vérifie si c'est un palindrome
        String résultat = DétectionPalindrome.Détecter(chaîne);

        // ALORS "Bonjour" est envoyé avant toute réponse
        String firstLine = résultat.split(System.lineSeparator())[0];
        assertEquals(Expressions.Bonjour, firstLine);
    }
}
