import java.util.HashSet;

public class CandidateCipher {

    public String calculateCipher(String FIO, int day, int month, int year) {
        char[] ch = FIO.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        int countOfLetters = set.size() - 1;

        int sumOfDateAndMonth = sumDays(day, month);

        int numOfLetter = numberOfLetter(ch[0]);

        int resultValue = countOfLetters + (sumOfDateAndMonth * 64) + (numOfLetter * 256);

        String resultHexString = Integer.toHexString(resultValue).toUpperCase();

        if (resultHexString.length() > 3) resultHexString = resultHexString.substring(resultHexString.length() - 3);

        return resultHexString;
    }

    public int sumDays(int day, int month){
        int sumOfDateAndMonth = 0;
        if (day > 9) {
            sumOfDateAndMonth += day/10;
            sumOfDateAndMonth += day%10;
        }else {
            sumOfDateAndMonth += day;
        }

        if (month > 9) {
            sumOfDateAndMonth += month/10;
            sumOfDateAndMonth += month%10;
        }else {
            sumOfDateAndMonth += month;
        }
        return sumOfDateAndMonth;
    }

    public int numberOfLetter(char letter){
        int result = 0;
        letter = String.valueOf(letter).toLowerCase().charAt(0);
        switch (letter){
            case 'a' : result = 1; break;
            case 'b' : result = 2; break;
            case 'c' : result = 3; break;
            case 'd' : result = 4; break;
            case 'e' : result = 5; break;
            case 'f' : result = 6; break;
            case 'g' : result = 7; break;
            case 'h' : result = 8; break;
            case 'i' : result = 9; break;
            case 'j' : result = 10; break;
            case 'k' : result = 11; break;
            case 'l' : result = 12; break;
            case 'm' : result = 13; break;
            case 'n' : result = 14; break;
            case 'o' : result = 15; break;
            case 'p' : result = 16; break;
            case 'q' : result = 17; break;
            case 'r' : result = 18; break;
            case 's' : result = 19; break;
            case 't' : result = 20; break;
            case 'u' : result = 21; break;
            case 'v' : result = 22; break;
            case 'w' : result = 23; break;
            case 'x' : result = 24; break;
            case 'y' : result = 25; break;
            case 'z' : result = 26; break;
        }
        return result;
    }
}
