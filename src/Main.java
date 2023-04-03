
public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // начальный остаток на счете
        int refill = 1000; // пополнение счета
        int bonus = 0; // бонус, начисляется при пополненни более 1000 руб., 1 бонус за 100 руб.
        int еndBalance = initialBalance + refill + bonus; // конечный остаток на счете
        if (refill > 1000) {
            bonus = refill / 100;
            еndBalance = initialBalance + refill + bonus;
        }
        System.out.println("Конечный остаток на счете:");
        System.out.println((еndBalance) + " рублей");


    }
}