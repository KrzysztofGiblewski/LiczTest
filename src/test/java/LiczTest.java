import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LiczTest {
    @Test
    public void liczTest() {
        Licz licz = new Licz();
        int x = 10;
        int y = 5;
        int wynikOczekiwany = 15;
        int wynik = licz.sumuj(x, y);
        Assertions.assertThat(wynik).isEqualTo(wynikOczekiwany);

    }

}
