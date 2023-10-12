public class Main {
    public static void main(String[] args) {
        man(25, 45);
        man(55, -20);
        man(30, 18);
        man(2, 30);
        man(40, -30);
    }

    public static boolean man(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            System.out.println("mozhno idti gulyat");
        } else if (age < 20 || temperature >= 0 && temperature >= 28) {
            System.out.println("mozhno idti gulyat");
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            System.out.println("mozhno idti gulyat");
        } else {
            System.out.println("ostovaytes doma");
        }
        return true;
    }

}