public class TraditionalSwitch {

    public static void main(String[] args) {
        System.out.println(checkLetter('A'));
    }

    private static String checkLetter(char letter) {
        switch (letter) {
            case 'A': case 'a':
                return "Letter " + letter + ": Able";
            case 'B': case 'b':
                return "Letter " + letter + ": Baker";
            case 'C': case 'c':
                return "Letter " + letter + ": Charlie";
            case 'D': case 'd':
                return "Letter " + letter + ": Dog";
            case 'E': case 'e':
                return "Letter " + letter + ": Easy";
        }
        return "Unknown letter (" + letter + ")";
    }
}
