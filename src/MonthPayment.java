public class MonthPayment {

    public int calculate(int sum, int period) {
        float bet = 9.99F;
        float num = bet / (period * 100);
        float x = 1 + num;
        float val = (float) Math.pow(x, (float) period);
        return (int) ((sum * num * val) / (val - 1));

    }
}