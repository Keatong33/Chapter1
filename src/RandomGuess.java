import javax.swing
public class RandomGuess {
    public static void main(String [] args)
    {
        JOptionPane.showmessageDialog( parentComponent null, message:"The number is " +
            ((int) (Math.random() * 10));
    }

}
