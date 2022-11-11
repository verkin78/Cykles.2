public class Main {
    public static void main(String[] args) {
        int deposit = 1500;
        int total = 0;
        int m = 1;
        while (total < 2459000) {
            total = total + total / 100;
            total = total + deposit;
            System.out.println(" Месяц " + m++ + ", сумма накоплений равна " + total + " рублей ");
        }

        int a = 0;
        while (a <= 10) {
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.print(a++ + " ");
            System.out.println(a++);
        }

        for (int b = 10; b >= 0; ) {
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.print(b-- + " ");
            System.out.println(b--);
        }

        int y = 12000000;
        for (int year = 1; year <= 10; year++) {
            System.out.println(" В год " + year + " xbcktyyjcnm населения составил " + y + " человек ");
            y = y + y * 9 / 1000;
        }

        int Deposit = 15000;
        int month = 1;
        while (Deposit <= 12_000_000) {
            System.out.println(" Месяц " + month++ + " сумма накоплений " + Deposit);
            Deposit = Deposit + Deposit / 100 * 7;
        }

    }
}