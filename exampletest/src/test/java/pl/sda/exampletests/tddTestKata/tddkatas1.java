package pl.sda.exampletests.tddTestKata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import static org.assertj.core.api.Fail.fail;

public class tddkatas1 {
    //wszystko co robimy wynika z przykladu napisanego podczas testu//
    // tree laws od tdd //
    // dyscyplina  i fremwork tdd //
    // nie nadpisywac kodu produkcyjnego
    // pisac tylko tyle tesotw ile jest potrzebne by aplikacja przechodizla
    // nie wolno napisac wiecej kodu niz jest wystarczjace by test przeszedl
    // refactor kodu po kazdym cyklu testow
    //

    // prosty przyklad tdd

    // napisania funkcja ktora przyjmuje int ,zwraca stirng
    // jesli 3 to napis fizz
    // jezeli podzielna przez 5 to napis buzzz

    // rygresja

    @DisplayName(" given 1 , then return '1' as string")
    @Test
    void test() throws Exception{
        // given
        // when

        // then
        fail("write your test");
    }


}
