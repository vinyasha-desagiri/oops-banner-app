import java.util.Scanner;

public class OOPSBannerAppUC8 {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[]{

            new CharacterPatternMap('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }),

            new CharacterPatternMap('P', new String[]{
                    "****** ",
                    "*     *",
                    "*     *",
                    "****** ",
                    "*      ",
                    "*      ",
                    "*      "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            })
        };
    }

    public static void printMessage(String message, CharacterPatternMap[] maps) {

        message = message.toUpperCase();

        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                boolean found = false;

                for (CharacterPatternMap map : maps) {
                    if (map.getCharacter() == ch) {
                        System.out.print(map.getPattern()[i] + "  ");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.print("        ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = sc.nextLine();

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        printMessage(message, maps);

        sc.close();
    }
}