package fr.enzosandre;

import fr.enzosandre.test.utilities.VérificationPalindromeBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = {"test", "epsi"})
    public void testMiroir(String chaîne) {
        // ETANT DONNE une chaîne n'étant pas un palindrome
        // QUAND on vérifie si c'est un palindrome
        String résultat = VérificationPalindromeBuilder.Default().Vérifier(chaîne);

        // ALORS on obtient son miroir
        String inversion = new StringBuilder(chaîne)
                .reverse()
                .toString();

        assertTrue(résultat.contains(inversion));
    }

    static Stream<Arguments> casTestPalindrome() {
        return Stream.of(
                Arguments.of(new LangueAnglaise(),  Expressions.WellSaid),
                Arguments.of(new LangueFrançaise(),  Expressions.BienDit)
        );
    }

    @ParameterizedTest
    @MethodSource("casTestPalindrome")
    public void testPalindrome(LangueInterface langue, String félicitations){
        // ETANT DONNE un palindrome
        String palindrome = "radar";

        // ET un utilisateur parlant une <langue>
        var vérificateur = new VérificationPalindromeBuilder()
                .AyantPourLangue(langue)
                .Build();

        // QUAND on vérifie si c'est un palindrome
        String résultat = vérificateur.Vérifier(palindrome);

        // ALORS la chaîne est répétée, suivie de félicitations dans cette langue
        String attendu = palindrome + System.lineSeparator() + félicitations;
        assertTrue(résultat.contains(attendu));
    }

    @Test
    public void testPalindromeAnglais(){
        // ETANT DONNE un palindrome
        String palindrome = "radar";

        // ET un utilisateur parlant anglais
        LangueAnglaise langue = new LangueAnglaise();
        var vérificateur = new VérificationPalindromeBuilder()
                .AyantPourLangue(langue)
                .Build();

        // QUAND on vérifie si c'est un palindrome
        String résultat = vérificateur.Vérifier(palindrome);

        // ALORS la chaîne est répétée, suivie de "Well said !"
        String attendu = palindrome + System.lineSeparator() + Expressions.WellSaid;
        assertTrue(résultat.contains(attendu));
    }

    static Stream<Arguments> casTestBonjour() {
        return Stream.of(
                Arguments.of("test"),
                Arguments.of("radar")
        );
    }

    @ParameterizedTest
    @MethodSource("casTestBonjour")
    public void testBonjourFrançais(String chaîne){
        // ETANT DONNE une chaîne
        // ET un utilisateur parlant français
        var vérification = new VérificationPalindromeBuilder()
                .AyantPourLangue(new LangueFrançaise())
                .Build();

        // QUAND on vérifie si c'est un palindrome
        String résultat =  vérification.Vérifier(chaîne);

        // ALORS toute réponse est précédée de "Bonjour"
        String[] lines = résultat.split(System.lineSeparator());
        assertEquals(Expressions.Bonjour, lines[0]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "radar"})
    public void testAuRevoir(String chaîne){
        // ETANT DONNE une chaîne
        // QUAND on vérifie si c'est un palindrome
        String résultat =  VérificationPalindromeBuilder.Default().Vérifier(chaîne);

        // ALORS toute réponse est suivie de "Au Revoir"
        String[] lines = résultat.split(System.lineSeparator());
        String lastLine = lines[lines.length - 1];
        assertEquals(Expressions.AuRevoir, lastLine);
    }
}
