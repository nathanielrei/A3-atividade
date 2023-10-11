
public class Test {

    public static void main(String[]args) {

        Element testando = new Element(35);
        testando.print();
        testando.toString();

        Stack stack = new Stack();
        stack.push(new Element("OI"));
        stack.push(new Element(45));
        stack.push(new Element(4.7));
        stack.push(new Element('+'));
        stack.flush();

    }
}