package numberToString;

public class NumberToStringSolver {
    public static void main(String[] args) {
        int number = 999;

        String[] numberString = {""," one", " two"," three"," four"," five"," six"," seven"," eight"," nine"," ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen",
                " eighteen"," nineteen"};
        String[] tensString = {"", "ten", "twenty ","thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};

        if (number < 20) {System.out.println(numberString[number]);}
        if (number >= 20 && number < 100) {System.out.println(tensString[Math.floorDiv(number, 10)] + numberString[number%10]);}
        if (number >= 100 && number < 1000) {System.out.println(numberString[Math.floorDiv(number, 100)] + " hundred and "
        + tensString[Math.floorDiv(number%100, 10)] + numberString[(number%100)%10]);}
    }
}
