public class Stack {
    private Element topo;
    public Stack () {
        topo = null;
    }
    public Boolean isEmpty() {
        return topo == null;
    }
    public void push (Element e) {
        e.setLink(topo);
        this.topo = e;

    }


    public Element pop() {
        if(topo==null) {
            System.out.println("pilha vazia");
            return null;

        }
        Element aux = topo;
        topo = topo.getLink();
        aux.setLink(null);
        return aux;
    }
    public void flush() {
        Element e;
        while(!isEmpty()) {
            e = pop();
            System.out.println(e);
        }
    }
}
