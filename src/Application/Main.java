package Application;
import telas.FrameCadastro;
import connectionDAO.FactoryConnection;

public class Main {
    public static void main(String[] args) {
           FrameCadastro frame = new FrameCadastro();
           frame.setLocationRelativeTo(null);
           frame.setResizable(false);
           frame.setVisible(true);

    }     
}
