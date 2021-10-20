public class Main {
    public static void main(String[] args) {
        int ballance = 50;
        int amount = 1500;
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int total = ballance + amount + bonus;
        System.out.println(total);
        System.out.println(bonus);
    }
}
