public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int adding = 1100;
        int bonus;
        if (adding > 1000) {
            bonus = adding / 100 + amount + adding;
        } else {
            bonus = amount + adding;
        }
        System.out.println(bonus);
    }
}

