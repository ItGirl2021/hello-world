import javax.swing.JFrame;

public class Jogo_da_Velha extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) throws Exception {
        Jogo jogo = new Jogo();
        jogo.setDefaultCloseOperation(EXIT_ON_CLOSE); //Determinar que a aplicação seja encerrada após o fechamento da janela;
        jogo.setResizable(false); //Faz com que a tela do jogo não seja maximizada;
    }
}
