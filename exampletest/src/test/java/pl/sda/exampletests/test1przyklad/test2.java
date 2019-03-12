package pl.sda.exampletests.test1przyklad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class test2 {
    // @formatter:off

    @DisplayName("given an empty string,+" +
            " then 0 is returned")
    @ParameterizedTest(name = "string numbers : {0}, expectec {1}")
    @CsvSource()
    @Test
    void test(String stringNumbers) throws Exception{
        //when
        int sum = StringCalculator.add(stringNumbers);

        //then
        assertThat(sum).isEqualTo(expectedSum);
    }
}
