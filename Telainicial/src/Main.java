import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.border.Border;

public class Main extends JFrame implements ActionListener {
    private Container caixa;
    private JPanel tabuleiro, info;
    private Random gerador;

    public Main() {
        // Criando a janela do menu inicial:
        setTitle("Kung fu fodase");
        setBounds(300, 300, 600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Criando painel de menu inicial
        JPanel Telamenuinicial = new JPanel();
        Telamenuinicial.setLayout(null); // Aumente para 5 para adicionar espaço extra

        // Criando os botões do menu inicial:
        JButton novoJogoButton = new JButton("Iniciar");
        novoJogoButton.setBounds(150, 350, 300, 50);
        JButton sobreButton = new JButton("Sobre");
        sobreButton.setBounds(150, 400, 300, 50);
        JButton sairButton = new JButton("Sair");
        sairButton.setBounds(150, 450, 300, 50);

        // Criando um novo painel para o título e centralizando:
        JPanel tituloPanel = new JPanel();
        String caminhoDaImagem = "C:\\Users\\Elizabeth\\Downloads\\arcade-fire-logo.png";
        ImageIcon imagemIcone = new ImageIcon(caminhoDaImagem);
        JLabel labelTitulo = new JLabel(imagemIcone);
        labelTitulo.setBounds(24, 5, 564,328);
        Telamenuinicial.add(labelTitulo);

        // ActionListener do botão iniciar:
        novoJogoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                iniciarJogo();
            }
        });
        // ActionListener do botão sobre:
        sobreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                exibirCreditos();
            }
        });

        //ActionListener do botão sair:
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        // Adicionando o painel e os botões na janela do menu inicial:
        Telamenuinicial.add(new JPanel()); // Espaço extra antes do título
        Telamenuinicial.add(tituloPanel);
        Telamenuinicial.add(novoJogoButton);
        Telamenuinicial.add(sobreButton);
        Telamenuinicial.add(sairButton);
        setContentPane(Telamenuinicial);
        setVisible(true);
    }

    private void iniciarJogo() {
    }

    // Método: Tela de créditos (Ainda será aprimorada)
    public void exibirCreditos() {
        JFrame janelacreditos = new JFrame("Creditos");
        janelacreditos.setBounds(300, 300, 300, 300);
        janelacreditos.setLayout(new BorderLayout());

        JTextArea oi = new JTextArea("Alunos: \nJonatan\nJoão\nManu\nMoi\nBia\nItalo 1\nItalo 2\nDanilo");
        janelacreditos.add(oi, BorderLayout.CENTER);

        janelacreditos.setVisible(true);
    }



    public static void main(String[] args) {
        try {
            // Define o Look and Feel Windows (para sistemas Windows)
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> new Main());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}