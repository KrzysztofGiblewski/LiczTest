import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LiczTest {
    Licz licz = new Licz();
    int x = 10;
    int y = 5;

    @Test
    public void liczTest() {

        int wynikOczekiwany = 15;
        int wynik = licz.sumuj(x, y);
        Assertions.assertThat(wynikOczekiwany).isEqualTo(wynik);
        System.out.println("test na sumę sprawdzał " + wynikOczekiwany + " = " + wynik);

    }

    @Test
    public void kwadratTest() {
        int wynikKwadratu = 25;
        int wynikK = licz.kwadratLiczby(y);
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
        int wynikFail = 16;

        Assertions.assertThat(licz.sumuj(x, y)).isNotEqualTo(wynikFail);

    }


}
