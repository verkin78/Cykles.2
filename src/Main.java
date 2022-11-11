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
            System.out.println(" В год " + year + " численность населения составил " + y + " человек ");
            y = y + y * 9 / 1000;
        }

        int Deposit = 15000;
        int month = 1;
        for (; Deposit <= 12_000_000; month++) {
            Deposit = Deposit + Deposit / 100 * 7;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + " сумма накоплений " + Deposit);
            }
        }

        int depForVas = 15000;
        int aMonth = 1;
        int allMonth = 9 * 12;
        for (; aMonth <= allMonth; aMonth++) {
            depForVas = depForVas + depForVas / 100 * 7;
            if (aMonth % 6 == 0) {
                System.out.println(" В " + aMonth + " месяце накопления составят " + depForVas + " рубля(ей)");
            }
        }
        int friday = 3;
        for ( ; friday <= 31; friday +=7) {
            System.out.println(" Сегодня пятница " + friday + "-tе число. Неообходимо подготовить отчёт.");
        }

        int year = 0;
        for (; year <= 2122; year += 79) {
            if (year >= 1822) {
            System.out.println(year);}
            }

        int number = 1;
        int number2 = 2;
        for (; number <= 10; number ++) {
            int iquel = number2 * number;
            System.out.println(number2 + "*" + number + "=" + iquel);
        }
    }
}