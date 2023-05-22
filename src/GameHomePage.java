import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameHomePage extends JFrame implements ActionListener {

    private Utilisateur user;
    private Utilisateurs users;

    private JPanel panel = new JPanel();

    private JLabel welcomeLabel = new JLabel();
    private JLabel choiceLabel = new JLabel("Choisissez votre mode de jeu :");

    private JButton soloButton = new JButton("Jeu Solo");
    private JButton multiButton = new JButton("Jeu Multi");

    public GameHomePage(Utilisateur user, Utilisateurs users){
        super("FunQuiz");

        this.users = users;
        this.user = user;

        setSize(600,200);
        // On fait en sorte que le programme termine lorsqu'elle est fermée
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // On affiche la fenêtre au centre
        setLocationRelativeTo(null);
        // On affiche la fenetre
        setVisible(true);

        GridLayout grilleMain = new GridLayout(3,1); // On crée une grille 3,1
        this.setLayout(grilleMain); // On set le layout de la frame à cette grille

        GridLayout grilleSec = new GridLayout(1,2); // On crée une grille 1,2
        panel.setLayout(grilleSec); // On set le layout du panel à cette grille

        welcomeLabel.setText("Bienvenue " + user.getPseudo() + " !");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        choiceLabel.setHorizontalAlignment(SwingConstants.CENTER);

        soloButton.addActionListener(this);
        multiButton.addActionListener(this);

        this.add(welcomeLabel);
        this.add(choiceLabel);

        panel.add(soloButton);
        panel.add(multiButton);

        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
