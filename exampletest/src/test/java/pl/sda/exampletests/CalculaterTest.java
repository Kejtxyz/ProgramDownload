package pl.sda.exampletests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculaterTest {
    @Test
    @DisplayName("whhen 1 add 2 return 3")
    public void test() {
        // given
        int a = 1;
        int b = 2;
        //when
        int sum = Calculater.add(a, b);
        //then
        assertThat(sum).isEqualTo(3);
    }
    @ParameterizedTest(name = "first {0}, second {1}, result{2}")
    @CsvSource({
            "1,2,3",
            "2,3,5",
            "4,5,9"
    })
    @DisplayName("given to numbers")
    public void test1(int a, int b, int expected) {
        //when
        int sum = Calculater.add(a, b);
        //then
        assertThat(sum).isEqualTo(expected);
    }
}
// testy jednostkowe - zasady :
// proste
// przyjmowac, wywolywac, zero logiki
// izolowane od siebie, nie moga zalezec od wzajemnego kontekstu
// nie moga pracowac na wspoldzielonej bazie danych
// musza byc deterministyczne - jesli przejdzie teraz to przjedzie po dowolnej ilosci operacji !!
// nie moga modyfikowac stanu
// powinny testowac jedna funkcjonalnosc, jeden futher

// test integracyujny  - np, wywoluje kilka metod

// tdd jest dobry do strowania logiki biznesowej, typu ksiegowosc
// tdd nie ndaje sie do aplikacji integracyjnych
// tdd obsluguje procesy , wymagana jest logika
// do baz danych lepiej napisac test integracyjny
