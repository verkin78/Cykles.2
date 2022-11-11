public class Main {
public static void main(String[] args) {
    int deposit = 15000;
    int total = 0;
    int m = 1;
    while (total < 2459000){
    total = total + total / 100;
    total = total + deposit;
    System.out.println(" Месяц " + m ++ + ", сумма накоплений равна " + total + " рублей ");}
    }
}