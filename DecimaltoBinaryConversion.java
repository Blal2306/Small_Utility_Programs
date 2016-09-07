import javax.swing.JOptionPane;

public class JavaApplication2 {

    public static void main(String[] args) 
    {
        int x,y,one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen;
        x = Integer.parseInt(JOptionPane.showInputDialog("ENTER A 4 DIGIT DECIMAL # TO BE CONVERTED TO BINARY :"));


        one = x/8192;
        y = x % 8192;
        two = y / 4096;
        y = y % 4096;
        three = y / 2048;
        y = y % 2048;
        four = y / 1024;
        y = y % 1024;
        five = y / 512;
        y = y % 512;
        six = y / 256;
        y = y % 256;
        seven = y / 128;
        y = y % 128;
        eight = y / 64;
        y = y % 64;
        nine = y / 32;
        y = y % 32;
        ten = y / 16;
        y = y % 16;
        eleven = y / 8;
        y = y % 8;
        twelve = y / 4;
        y = y % 4;
        thirteen = y / 2;
        y = y % 2;
        fourteen = y / 1;
        y = y % 1;

        System.out.print(one);
        System.out.print(two);
        System.out.print(three);
        System.out.print(four);
        System.out.print(five);
        System.out.print(six);
        System.out.print(seven);
        System.out.print(eight);
        System.out.print(nine);
        System.out.print(ten);
        System.out.print(eleven);
        System.out.print(twelve);
        System.out.print(thirteen);
        System.out.println(fourteen);
    }
    
}
