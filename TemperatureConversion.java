import javax.swing.JOptionPane;


public class JavaApplication2 {

    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        String input=JOptionPane.showInputDialog("Enter the temp in Fahrenheit");
        int n = Integer.parseInt(input);
        int tempc = (5*(n -32)/9);
        System.out.println("This is the temp in c " + tempc);
    }
    
}
