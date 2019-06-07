import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int night = Integer.parseInt(scanner.nextLine());
        double apartmentPrice = 0;
        double studioPrice = 0;

        switch (month) {
            case "May":
            case "October":
                apartmentPrice = 65;
                studioPrice = 50;
                if (night > 7 && night <= 14) {
                    studioPrice = 50 - 50 * 0.05;
                } else if (night > 14) {
                    studioPrice = 50 - 50 * 0.30;
                    apartmentPrice = 65 - 65 * 0.10;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (night > 14) {
                    studioPrice = 75.20 - 75.20 * 0.20;
                    apartmentPrice = 68.70 - 68.70 * 0.10;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                if (night > 14) {
                    apartmentPrice = 77 - 77 * 0.10;
                }
                break;
        }


        double apartmentCost = apartmentPrice * night;
        double studioCost = studioPrice * night;

        System.out.printf("Apartment: %.2f lv.%n",apartmentCost);
        System.out.printf("Studio: %.2f lv.", studioCost);

    }
}
