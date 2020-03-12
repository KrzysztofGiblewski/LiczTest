import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LiczTest {
    Licz licz = new Licz();

    @Test
    public void liczTest() {
        int x = 10;
        int y = 5;
        int wynikOczekiwany = 15;
        int wynik = licz.sumuj(x, y);
        Assertions.assertThat(wynikOczekiwany).isEqualTo(wynik);
        System.out.println("test na sumę sprawdzał " + wynikOczekiwany + " = " + wynik);

    }

    @Test
    public void kwadratTest() {
        int xx = 5;
        int wynikKwadratu = 25;
        int wynikK = licz.kwadratLiczby(xx);
        Assertions.assertThat(wynikKwadratu).isEqualTo(wynikK);
        System.out.println("test sprawdził " + wynikKwadratu + " = " + wynikK);

    }

}
