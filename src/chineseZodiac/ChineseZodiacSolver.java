package chineseZodiac;

public class ChineseZodiacSolver {
    public static void main(String[] args) {
        String[] animals = {"Monkey", "Rooster", "Dog", "Goat", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Pig"};
        String text = " year for ";
        int year = 1982;
        int check = year%12;
        switch (check) {
            case 0: System.out.println(animals[0] + text + year);
                break;
            case 1: System.out.println(animals[1] + text + year);
                break;
            case 2: System.out.println(animals[2] + text + year);
                break;
            case 3: System.out.println(animals[3] + text + year);
                break;
            case 4: System.out.println(animals[4] + text + year);
                break;
            case 5: System.out.println(animals[5] + text + year);
                break;
            case 6: System.out.println(animals[6] + text + year);
                break;
            case 7: System.out.println(animals[7] + text + year);
                break;
            case 8: System.out.println(animals[8] + text + year);
                break;
            case 9: System.out.println(animals[9] + text + year);
                break;
            case 10: System.out.println(animals[10] + text + year);
                break;
            case 11: System.out.println(animals[11] + text + year);
                break;
            default:
        }
    }
}
