import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class Jogo extends JFrame {

    private static final long serialVersionUID = 1L;

    JButton [] botoes; //Vetor para Buttons;
    JPanel PainelJogo; //Painel para os botões;
    int vezJogador = 0; //Verificar a vez do jogador;
    String simbolo; //Para alocar o simbolo x ou o;
    int jogador1 = 0; //Pontuação Jogador 1;
    int jogador2 = 0; //Pontuação jogador 2;

    public Jogo() {
        super("Jogo da Velha"); //Título da Janela;
        ((JComponent)getContentPane()).setBorder(new EmptyBorder(5,5,5,5)); //Desenha borda ao redor dos componentes;

        PainelJogo = new JPanel(); //Cria novo painel;
        PainelJogo.setLayout(new GridLayout(3,3,10,10)); //Atribui Layout do tipo GridLayout;
        PainelJogo.setBackground(Color.BLACK);
        botoes = new JButton[9];

        for(int i = 0; i < 9; i++) {
            botoes[i] = new JButton("");
            botoes[i].setFont(new Font("Calibri", Font.BOLD, 70));
            PainelJogo.add(botoes[i]);
        }

        botoes[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(0);
                                
                if(Verifica(0)) {
                    JOptionPane.showMessageDialog(null, "You Win!");
                    Reset();
                } else {
                    if(verificaVelha()) {
                        JOptionPane.showMessageDialog(null, "Velha!");
                        Reset();
                    }
                }
            }
        });

        botoes[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(1);
                                                
                if(Verifica(1)) {
                    JOptionPane.showMessageDialog(null, "You Win!");
                    Reset();
                } else {
                    if(verificaVelha()) {
                        JOptionPane.showMessageDialog(null, "Velha!");
                        Reset();
                    }
                }
            }
        });
       
        botoes[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(2);
                                                
                if(Verifica(2)) {
                    JOptionPane.showMessageDialog(null, "You Win!");
                    Reset();
                } else {
                    if(verificaVelha()) {
                        JOptionPane.showMessageDialog(null, "Velha!");
                        Reset();
                    }
                }
            }
        });
        
        botoes[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(3);
                                                
                if(Verifica(3)) {
                    JOptionPane.showMessageDialog(null, "You Win!");
                    Reset();
                } else {
                    if(verificaVelha()) {
                        JOptionPane.showMessageDialog(null, "Velha!");
                        Reset();
                    }
                }
            }
        });
        
        botoes[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(4);
                
                if(Verifica(4)) {
                    JOptionPane.showMessageDialog(null, "You Win!");
                    Reset();
                } else {
                    if(verificaVelha()) {
                        JOptionPane.showMessageDialog(null, "Velha!");
                        Reset();
                    }
                }
            }
        });
        
        botoes[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(5);
                                                
                if(Verifica(5)) {
                    JOptionPane.showMessageDialog(null, "You Win!");
                    Reset();
                } else {
                    if(verificaVelha()) {
                        JOptionPane.showMessageDialog(null, "Velha!");
                        Reset();
                    }
                }
            }
        });
        
        botoes[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(6);
                                                
                if(Verifica(6)) {
                    JOptionPane.showMessageDialog(null, "You Win!");
                    Reset();
                } else {
                    if(verificaVelha()) {
                        JOptionPane.showMessageDialog(null, "Velha!");
                        Reset();
                    }
                }
            }
        });
        
        botoes[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(7);
                                                
                if(Verifica(7)) {
                    JOptionPane.showMessageDialog(null, "You Win!");
                    Reset();
                } else {
                    if(verificaVelha()) {
                        JOptionPane.showMessageDialog(null, "Velha!");
                        Reset();
                    }
                }
            }
        });
        
        botoes[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jogada(8);
                                                
                if(Verifica(8)) {
                    JOptionPane.showMessageDialog(null, "You Win!");
                    Reset();
                } else {
                    if(verificaVelha()) {
                        JOptionPane.showMessageDialog(null, "Velha!");
                        Reset();
                    }
                }
            }
        });

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

    public boolean Verifica(int simbol) {
        switch(simbol) {
            case 0:
                if(((botoes[0].getText()).equals((botoes[1].getText())) && (botoes[0].getText()).equals((botoes[2].getText())))
                    || ((botoes[0].getText()).equals((botoes[3].getText())) && (botoes[0].getText()).equals((botoes[6].getText())))
                    || ((botoes[0].getText()).equals((botoes[4].getText())) && (botoes[0].getText()).equals((botoes[8].getText())))) {
                    
                    Placar();
                    return true;
                } else {
                    return false;
                }
                
            case 1:
                if(((botoes[1].getText()).equals((botoes[0].getText())) && (botoes[1].getText()).equals((botoes[2].getText())))
                    || ((botoes[1].getText()).equals((botoes[4].getText())) && (botoes[1].getText()).equals((botoes[7].getText())))) {
                    
                    Placar();
                    return true;
                } else {
                    return false;
                }

            case 2:
                if(((botoes[2].getText()).equals((botoes[1].getText())) && (botoes[2].getText()).equals((botoes[0].getText())))
                    || ((botoes[2].getText()).equals((botoes[5].getText())) && (botoes[2].getText()).equals((botoes[8].getText())))
                    || ((botoes[2].getText()).equals((botoes[4].getText())) && (botoes[2].getText()).equals((botoes[6].getText())))) {
                    
                    Placar();
                    return true;
                } else {
                    return false;
                }
                
            case 3:
                if(((botoes[3].getText()).equals((botoes[0].getText())) && (botoes[3].getText()).equals((botoes[6].getText())))
                    || ((botoes[3].getText()).equals((botoes[4].getText())) && (botoes[3].getText()).equals((botoes[5].getText())))) {
                        
                    Placar();
                    return true;
                } else {
                    return false;
                }
                
            case 4:
                if(((botoes[4].getText()).equals((botoes[2].getText())) && (botoes[4].getText()).equals((botoes[6].getText())))
                    || ((botoes[4].getText()).equals((botoes[3].getText())) && (botoes[4].getText()).equals((botoes[5].getText())))
                    || ((botoes[4].getText()).equals((botoes[0].getText())) && (botoes[4].getText()).equals((botoes[8].getText()))
                    || ((botoes[4].getText()).equals((botoes[1].getText())) && (botoes[4].getText()).equals((botoes[7].getText()))))) {
                        
                    Placar();
                    return true;
                } else {
                    return false;
                }
                
            case 5:
                if(((botoes[5].getText()).equals((botoes[2].getText())) && (botoes[5].getText()).equals((botoes[8].getText())))
                    || ((botoes[5].getText()).equals((botoes[3].getText())) && (botoes[5].getText()).equals((botoes[4].getText())))) {
                    
                    Placar();
                    return true;
                } else {
                    return false;
                }
                
            case 6:
                if(((botoes[6].getText()).equals((botoes[3].getText())) && (botoes[6].getText()).equals((botoes[0].getText())))
                    || ((botoes[6].getText()).equals((botoes[7].getText())) && (botoes[6].getText()).equals((botoes[8].getText())))
                    || ((botoes[6].getText()).equals((botoes[4].getText())) && (botoes[6].getText()).equals((botoes[2].getText())))) {
                    
                    Placar();
                    return true;
                } else {
                    return false;
                }
                
            case 7:
                if(((botoes[7].getText()).equals((botoes[1].getText())) && (botoes[7].getText()).equals((botoes[4].getText())))
                    || ((botoes[7].getText()).equals((botoes[6].getText())) && (botoes[7].getText()).equals((botoes[8].getText())))) {
                    
                    Placar();
                    return true;
                } else {
                    return false;
                }
                
            case 8:
                if(((botoes[8].getText()).equals((botoes[0].getText())) && (botoes[8].getText()).equals((botoes[4].getText())))
                    || ((botoes[8].getText()).equals((botoes[7].getText())) && (botoes[8].getText()).equals((botoes[6].getText())))
                    || ((botoes[8].getText()).equals((botoes[5].getText())) && (botoes[8].getText()).equals((botoes[2].getText())))) {
                    
                    Placar();
                    return true;
                } else {
                    return false;
                }
            
            default:
                return false;
        }
    }

    public boolean verificaVelha() {
        if(botoes[0].isEnabled() && botoes[1].isEnabled() && botoes[2].isEnabled() && botoes[3].isEnabled() && botoes[4].isEnabled() && botoes[5].isEnabled() && botoes[6].isEnabled() && botoes[7].isEnabled() && botoes[8].isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    public void Reset() {
        vezJogador = 0;

        for(int i = 0; i < 9; i++) {
            botoes[i].setText("");
            botoes[i].setEnabled(true);
        }
    }

    public void Placar() {
        if(vezJogador == 0) {
            jogador1++;
        } else {
            jogador2++;
        }
    }
}
