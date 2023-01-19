public class Main {
    public static void main(String[] args) {
        MonthPayment service = new MonthPayment();

        System.out.println("Сумма кредита: 1 000 000 руб. Срок кредита: 1 год. Ежемесячный платеж составит: "
                + service.calculate(1_000_000, 12));
        System.out.println("Сумма кредита: 1 000 000 руб. Срок кредита: 2 года. Ежемесячный платеж составит: "
                + service.calculate(1_000_000, 24));
        System.out.println("Сумма кредита: 1 000 000 руб. Срок кредита: 3 года. Ежемесячный платеж составит: "
                + service.calculate(1_000_000, 36));


    }
}

        