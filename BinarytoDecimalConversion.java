import javax.swing.JOptionPane;


public class JavaApplication2 {

    public static void main(String[] args) 
    {
        String input;
        int one, two, three, four;

        input = JOptionPane.showInputDialog("ENTER A 4 DIGIT BINARY # TO BE CONVERTED TO DECIMAL "); //READS THE INPUT FROM KEYBOARD

        one = Integer.parseInt(input.substring(0, 1)); //CONVERTS THE 1ST DIGIT TO INT
        two = Integer.parseInt(input.substring(1, 2)); //CONVERTS THE 2ND DIGIT TO INT
        three = Integer.parseInt(input.substring(2,3));//CONVERTS THE 3RD DIGIT TO INT
        four = Integer.parseInt(input.substring(3, 4)); //CONVERTS THE 4TH DIGIT TO INT

        int oneAnswer, twoAnswer, threeAnswer, fourAnswer;

        oneAnswer = one * 2 * 2 * 2;
        twoAnswer = two * 2 * 2;
        threeAnswer = three * 2;
        fourAnswer = four * 1;

        int Answer = oneAnswer + twoAnswer + threeAnswer + fourAnswer;

        JOptionPane.showMessageDialog(null,"DECIMAL CONVERSION FROM THE BINARY INPUT \"" + input + "\" IS " + Answer);
    }
    
}
