import java.util.Scanner;

public class Test {

    public static void main(String[]args) {

       Scanner leitor = new Scanner(System.in);
        Stack stack = new Stack();
       while(leitor.hasNext()){
           try{
               int ivalor = leitor.nextInt();
                stack.push(new Element(ivalor));
           }catch (Exception e){
               try{
                   double dvalor = leitor.nextDouble();
                   stack.push(new Element(dvalor));
               }catch (Exception e1){
                   try {
                       String svalor = leitor.nextLine();
                       stack.push(new Element(svalor));

                   }catch (Exception e2){
                       System.out.println("fim");
                       break;
                   }
               }
           }
       stack.flush();
       }

    }
}