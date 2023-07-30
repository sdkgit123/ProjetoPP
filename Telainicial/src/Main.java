import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    public Main() {
        // Criando a janela do menu inicial:
        setTitle("BATALHA NAVAL");
        setBounds(300, 300, 600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crie um JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBorder(BorderFactory.createEmptyBorder());

        // Crie os painéis para as abas do JTabbedPane
        JPanel telaInicialPanel = criarTelaInicialPanel();
        JPanel creditosPanel = criarCreditosPanel();

        // Adicione os painéis como abas do JTabbedPane
        tabbedPane.addTab(null, telaInicialPanel); // Passamos null como o painel de título, já que não queremos exibi-lo
        tabbedPane.addTab(null, creditosPanel);

        // Adicione o JTabbedPane à janela
        add(tabbedPane);

        setVisible(true);
    }

    private JPanel criarTelaInicialPanel() {
        // Criando painel de menu inicial
        JPanel Telamenuinicial = new JPanel() {
            // Sobrescreva o método paintComponent para desenhar a imagem de fundo
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                String caminhoDati = "C:\\Users\\Elizabeth\\Documents\\GIT\\ProjetoPP\\Fotos\\WhatsApp Image 2023-07-30 at 01.18.49.jpeg";
                ImageIcon imagemti = new ImageIcon(caminhoDati);
                Image img = imagemti.getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        Telamenuinicial.setLayout(null); // Aumente para 5 para adicionar espaço extra


        // Criando os botões do menu inicial:
        String caminhonj = "C:\\Users\\Elizabeth\\Documents\\GIT\\ProjetoPP\\Fotos\\a763b44e9beb57f6fb2c7c981f5d8bad.png";
        ImageIcon fotonj = new ImageIcon(caminhonj);
        JButton novoJogoButton = new JButton("Iniciar", fotonj);
        novoJogoButton.setBounds(200, 250, 220, 136);
        String caminhoso = "C:\\Users\\Elizabeth\\Documents\\GIT\\ProjetoPP\\Fotos\\kisspng-football-boot-nike-cleat-sports-shoes-nike-women39s-magista-onda-fg-outdoor-soccer-cl-5ba9b593553bc9.0097233315378487233491.png";
        ImageIcon fotoso = new ImageIcon(caminhoso);
        JButton sobreButton = new JButton("Sobre", fotoso);
        sobreButton.setBounds(150, 310, 300, 50);
        JButton sairButton = new JButton("Sair");
        sairButton.setBounds(150, 370, 300, 50);

        // Criando um novo painel para o título e centralizando:
        JPanel tituloPanel = new JPanel();
        String caminhoDaImagem = "C:\\Users\\Elizabeth\\Documents\\GIT\\ProjetoPP\\Fotos\\dc3d2c5cc28562c174703cded1ed335e.png";
        ImageIcon imagemIcone = new ImageIcon(caminhoDaImagem);
        JLabel labelTitulo = new JLabel(imagemIcone);
        labelTitulo.setBounds(35, 50, 500, 99);
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

        // ActionListener do botão sair:
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        // Adicionando os botões ao painel de menu inicial:
        Telamenuinicial.add(novoJogoButton);
        Telamenuinicial.add(sobreButton);
        Telamenuinicial.add(sairButton);


        return Telamenuinicial;
    }

    private JPanel criarCreditosPanel() {
        JPanel creditosPanel = new JPanel();
        creditosPanel.setLayout(new BorderLayout());

        JTextArea oi = new JTextArea("Alunos: \nJonatan\nJoão\nManu\nMoi\nBia\nItalo 1\nItalo 2\nDanilo");
        creditosPanel.add(oi, BorderLayout.CENTER);

        return creditosPanel;
    }

    private void iniciarJogo() {
        // Coloque o código para iniciar o jogo aqui
    }

    public void exibirCreditos() {
        JFrame janelacreditos = new JFrame("Créditos");
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
        // Implemente as ações dos botões aqui, se necessário
    }
}
