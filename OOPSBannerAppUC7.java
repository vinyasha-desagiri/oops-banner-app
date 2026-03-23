public class OOPSBannerAppUC7 {

    // Inner class to store character and pattern
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

    // Create patterns for characters
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

    // Print banner message
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        message = message.toUpperCase();

        for (int i = 0; i < 7; i++) {   // 7 lines per character

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);

                for (CharacterPatternMap map : maps) {
                    if (map.getCharacter() == ch) {
                        System.out.print(map.getPattern()[i] + "  ");
                    }
                }
            }

            System.out.println(); // next line
        }
    }

    // MAIN METHOD (VERY IMPORTANT)
    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, maps);
    }
}