public class Element {

    public final static int UNDEFINED = 0;
    public final static int INT = 1;
    public final static int DOUBLE = 2;
    public final static int STRING = 3;
    public  final static int CHAR = 4;

    private int type;
    private Element link;
    private int int_value;
    private double double_value;
    private String string_value;
    private String char_value;

    public Element() {
        this.type = Element.UNDEFINED;
    }

    public Element(int value) {
        this.int_value = value;
        this.type = Element.INT;
    }

    public Element(double value) {
        this.double_value = value;
        this.type = Element.DOUBLE;
    }

    public Element(String value) {
        this.string_value = value;
        this.type = Element.STRING;
        if(value.equals("+")){
            this.char_value = value;
            this.type = Element.CHAR;
        }
    }

    public void print() {
        if (type == Element.UNDEFINED)
            System.out.println("UNDEFINED");
        if (type == Element.INT)
            System.out.println(int_value);
        if (type == Element.DOUBLE)
            System.out.println(double_value);
        if (type == Element.STRING)
            System.out.println(string_value);
        if(type == Element.CHAR){
            System.out.println(char_value);
        }
    }

    private String getValueWithType() {
        if (type == Element.INT)
            return int_value + " [INT]";
        if (type == Element.DOUBLE)
            return double_value + " [DOUBLE]";
        if (type == Element.STRING)
            return string_value + " [STRING]";
        if(type == Element.CHAR){
            return char_value + " [CHAR]";
        }
        return "[UNDEFINED]";
    }

    public String toString() {
        return getValueWithType();
    }
    public void setLink(Element elem) {
        this.link =elem;
    }
    public Element getLink() {
        return link;
    }
}
