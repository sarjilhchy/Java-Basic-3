public class task73 {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("..................");

        String[] seats = { "Jenny", "Liam", "Angie", "Bo" };

        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat number " + i + " is taken by " + seats[i]);
        }
    }
}
