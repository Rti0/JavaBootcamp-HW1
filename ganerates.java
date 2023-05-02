import java.util.Scanner;
public class ganerates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = input.nextInt();
        if(num < 1 || num > 7) {
            System.out.println("Invalid number entered!");
        } else {
            String dayName = getWeekdayName(num);
            System.out.println( dayName );
        }
    }
    public static String getWeekdayName(int num) {
        String dayName = "";
        switch(num) {
            case 0:
                dayName = "Sunday";
                break;
                case 1:
                    dayName = "Monday";
                    break;
                    case 2:
                        dayName = "Tuesday";
                        break;
                        case 3:
                            dayName = "Wednesday";
                            break;
                            case 4:
                                dayName = "Thursday";
                                break;
                                case 5:
                                    dayName = "Friday";
                                    break;
                                    case 6:
                                        dayName = "Saturday";
                                        break;
                                        default:
                                            System.out.println("Invalid number entered!");
        }
        return dayName;
}
}
