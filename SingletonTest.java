import java.text.NumberFormat;

public class SingletonTest {
    public static void main(String[] args) {
        Renban r1 = Renban.getInstance();
        Renban r2 = Renban.getInstance();

        System.out.println(r1.getNumber());
        System.out.println(r2.getNumber());
        System.out.println(r1.getNumber());
    }
}
class Renban {
    private static Renban renban = new Renban();
    private int num;

    private Renban() {
    }

    public static Renban getInstance() {
        return renban;
    }

    public Renban getNumber() {
        for (int num = 1; num < 10000; num++)
        {
            NumberFormat nf = NumberFormat.getInstance();
            nf.setGroupingUsed(false);
            nf.setMinimumIntegerDigits(4);
            System.out.println(nf.format(num));
        }
        return getInstance();
    }
}