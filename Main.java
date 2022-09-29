import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int account = 200;
        int transfer = 1_000;

        int bonus;
        bonus = 0;
        System.out.println("Счет: " + (account + transfer + bonus) + " рублей");
        for (String s : Arrays.asList("Сумма пополнения: " + transfer + " рублей", "Бонусные рубли: " + bonus + " рублей")) {
            System.out.println(s);
        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        //
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}