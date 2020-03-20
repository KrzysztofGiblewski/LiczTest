import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LiczTest {

    int y = 5;
    int x = 10;
    Licz licz = new Licz();

    @Test
    public void liczTest() {

        long wynikOczekiwany = 15;
        long wynik = licz.sumuj(x, y);
        Assertions.assertThat(wynikOczekiwany).isEqualTo(wynik);
        System.out.println("test na sumę sprawdzał " + wynikOczekiwany + " = " + wynik);

    }

    @Test
    public void kwadratTest() {
        long wynikKwadratu = 25;
        long wynikK = licz.kwadratLiczby(y);
        Assertions.assertThat(wynikKwadratu).isEqualTo(wynikK);
        System.out.println("test sprawdził " + wynikKwadratu + " = " + wynikK);

    }

    @Test
    public void kwadratTestFail() {
        int wynikBledny = 26;
        Assertions.assertThat(licz.kwadratLiczby(y)).isNotEqualTo(wynikBledny);
    }


    @Test
    public void liczTestFail() {
        //test na nie prawde bo wynik 10+5 nie rowna sie 16
        long wynikFail = 16;

        Assertions.assertThat(licz.sumuj(x, y)).isNotEqualTo(wynikFail);

    }


}
