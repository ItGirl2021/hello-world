import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class Jogo extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton cor; //Para restaurar a cor dos botões;
    JButton [] botoes; //Vetor para Buttons;
    JPanel PainelJogo; //Painel para os botões;
    int vezJogador; //Verificar a vez do jogador;
    String simbolo; //Para alocar o simbolo x ou o;

    public Jogo() {
        super("Jogo da Velha"); //Título da Janela;
        ((JComponent)getContentPane()).setBorder(new EmptyBorder(5,5,5,5)); //Desenha borda ao redor dos componentes;

        PainelJogo = new JPanel(); //Cria novo painel;
        PainelJogo.setLayout(new GridLayout(3,3,10,10)); //Atribui Layout do tipo GridLayout;
        cor = new JButton();

        botoes = new JButton[9];

        for(int i = 0; i < 9; i++) {
            botoes[i] = new JButton("");
        }

        botoes[0].setFont(new Font("Calibri", Font.BOLD, 70));
        botoes[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(0);
            }
        });
        PainelJogo.add(botoes[0]);

        botoes[1].setFont(new Font("Calibri", Font.BOLD, 70));
        botoes[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(1);
            }
        });
        PainelJogo.add(botoes[1]);

        botoes[2].setFont(new Font("Calibri", Font.BOLD, 70));
        botoes[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(2);
            }
        });
        PainelJogo.add(botoes[2]);

        botoes[3].setFont(new Font("Calibri", Font.BOLD, 70));
        botoes[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(3);
            }
        });
        PainelJogo.add(botoes[3]);

        botoes[4].setFont(new Font("Calibri", Font.BOLD, 70));
        botoes[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(4);
            }
        });
        PainelJogo.add(botoes[4]);

        botoes[5].setFont(new Font("Calibri", Font.BOLD, 70));
        botoes[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(5);
            }
        });
        PainelJogo.add(botoes[5]);

        botoes[6].setFont(new Font("Calibri", Font.BOLD, 70));
        botoes[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(6);
            }
        });
        PainelJogo.add(botoes[6]);

        botoes[7].setFont(new Font("Calibri", Font.BOLD, 70));
        botoes[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(7);
            }
        });
        PainelJogo.add(botoes[7]);

        botoes[8].setFont(new Font("Calibri", Font.BOLD, 70));
        botoes[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(8);
            }
        });
        PainelJogo.add(botoes[8]);

        add(PainelJogo); //Adiciona painel a janela;
        setLocation(470, 200); //Determina a localização da janela;
        setSize(400, 400); //Determina tamanho da janela;
        setVisible(true); //Torna a janela visivel;
    }

    public void Jogada(int simbol) {
        if(vezJogador == 0) {
            simbolo = "X";
            vezJogador = 1;
        } else {
            simbolo = "O";
            vezJogador = 0;
        }

        botoes[simbol].setText(simbolo);
        botoes[simbol].setEnabled(false); //Desativa o botão;
    }
}
