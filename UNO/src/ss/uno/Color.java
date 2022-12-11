package ss.uno;

public enum Color {
    BLACK, RED, YELLOW, GREEN, BLUE;

    private String colorCodeString;
    static {
        BLACK.colorCodeString = "\033[0;30m";
        RED.colorCodeString = "\033[0;91m";
        YELLOW.colorCodeString = "\033[0;93m";
        GREEN.colorCodeString = "\033[0;92m";
        BLUE.colorCodeString = "\033[0;96m";
        //WHITE.colorCodeString = "\033[0;97m";
    }

    /**
     * This method return the ANSI code of the given color
     *
     * @param color : color
     * @return the ANSI code of the color
     */
    public static String getColorCodeString(Color color) {
        return color.colorCodeString;
    }
}
