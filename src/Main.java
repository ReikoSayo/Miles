public class Main {
    public static void main(String[] args) {
        int mile = 20;
        int ticket = 1500;
        int check;

        if (ticket >= 20) {
            check = ticket / mile;
            System.out.println("Количество миль за купленный билет = " + check);
        } else {
            System.out.println("Стоимость билета меньше положенного, мили не начисляются");
        }
    }
}