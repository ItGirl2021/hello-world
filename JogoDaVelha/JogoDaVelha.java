import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JogoDaVelha extends JFrame {

    final int jogador1 = 1;
    final int jogador2 = 2;
    int vez = jogador1;
    int rodadas = 0;

    ImageIcon circulo = new ImageIcon(getClass().getResource("o.jpg"));
    ImageIcon xis = new ImageIcon(getClass().getResource("x.jpg"));

    JPanel tela = new JPanel(new GridLayout(3, 3, 10, 10));
    JLabel informacao = new JLabel("Jogador " + vez);
    Botao[] botoes = new Botao[9];

    public JogoDaVelha() {
        configurarJanela();
        configurarTela();
    }

    public void mudarVez() {
        if(jogador1 == vez) {         
            informacao.setText("Jogador " + vez);
            informacao.setForeground(new Color(50, 200, 50));
            vez = jogador2; 
            
        } else {
            informacao.setText("Jogador " + vez);
            informacao.setForeground(Color.BLACK);
            vez = jogador1;
        }
    }

    public boolean testarVitoria() {
        if(botoes[0].getIcon().equals(botoes[1].getIcon()) && botoes[1].getIcon().equals(botoes[2].getIcon())) return true;
        if(botoes[3].getIcon().equals(botoes[4].getIcon()) && botoes[4].getIcon().equals(botoes[5].getIcon())) return true;
        if(botoes[6].getIcon().equals(botoes[7].getIcon()) && botoes[7].getIcon().equals(botoes[8].getIcon())) return true;
        if(botoes[0].getIcon().equals(botoes[3].getIcon()) && botoes[3].getIcon().equals(botoes[6].getIcon())) return true;
        if(botoes[1].getIcon().equals(botoes[4].getIcon()) && botoes[4].getIcon().equals(botoes[7].getIcon())) return true;
        if(botoes[2].getIcon().equals(botoes[5].getIcon()) && botoes[5].getIcon().equals(botoes[8].getIcon())) return true;
        if(botoes[0].getIcon().equals(botoes[4].getIcon()) && botoes[4].getIcon().equals(botoes[8].getIcon())) return true;
        if(botoes[2].getIcon().equals(botoes[4].getIcon()) && botoes[4].getIcon().equals(botoes[6].getIcon())) return true;
        return false;
    }

    public void configurarTela() {
        add(BorderLayout.CENTER, tela);
        add(BorderLayout.NORTH, informacao);
        tela.setBackground(Color.BLACK);
        informacao.setFont(new Font("Arial", Font.BOLD, 20));
        informacao.setForeground(new Color(50, 200, 50));
        informacao.setHorizontalAlignment(SwingConstants.CENTER);

        for(int i = 0; i < botoes.length; i++) {
            Botao botao = new Botao();
            botoes[i] = botao;
            tela.add(botoes[i]); 
        }
    }

    public void configurarJanela() {
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 350);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JogoDaVelha();
    }

    public class Botao extends JButton {
        public Botao() {

            setBackground(Color.WHITE);

            addActionListener(e->{
                
                rodadas++;

                if(jogador1 == vez) {
                    setIcon(circulo);

                    if(testarVitoria()) {
                        JOptionPane.showMessageDialog(null, "Jogador " + vez + " venceu!");
                        System.exit(0);
                    }

                    mudarVez();

                } else {
                    setIcon(xis);
                    
                    if(testarVitoria()) {
                        JOptionPane.showMessageDialog(null, "Jogador " + vez + " venceu!");
                        System.exit(0);
                    }

                    mudarVez();
                }

                if(rodadas == 9) {
                    JOptionPane.showMessageDialog(null, "Deu velha!");
                    System.exit(0);
                }
            });
        }
    }
}