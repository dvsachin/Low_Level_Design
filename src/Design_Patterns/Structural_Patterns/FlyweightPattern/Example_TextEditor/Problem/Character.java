package Design_Patterns.Structural_Patterns.FlyweightPattern.Example_TextEditor.Problem;

public class Character {
    char character;
    String fontType;
    int sise;
    int row;

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String getFontType() {
        return fontType;
    }

    public void setFontType(String fontType) {
        this.fontType = fontType;
    }

    public int getSise() {
        return sise;
    }

    public void setSise(int sise) {
        this.sise = sise;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    int column;

    public Character(char character, String fontType, int sise, int row, int column) {
        this.character = character;
        this.fontType = fontType;
        this.sise = sise;
        this.row = row;
        this.column = column;
    }
}
