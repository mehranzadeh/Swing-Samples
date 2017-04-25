package cardlyout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLyout {
  public static void main(String[] args) {
    JFrame frame = new JFrame("CardLayout Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(400, 200, 400, 500);
    Container contentPane = frame.getContentPane();

    JPanel buttonPanel = new JPanel();
    JButton nextButton = new JButton("Next");
    buttonPanel.add(nextButton);
    contentPane.add(buttonPanel, BorderLayout.SOUTH);

    final JPanel cardPanel = new JPanel();
    final CardLayout cardLayout = new CardLayout();
    cardPanel.setLayout(cardLayout);

    for (int i = 1; i <= 5; i++) {
      JButton card = new JButton("Card " + i);
      card.setPreferredSize(new Dimension(400, 500));
      String cardName = "card" + 1;
      card.setBackground(new Color(i*10, i*30, i*50));
      cardPanel.add(card, cardName);
    }
    contentPane.add(cardPanel, BorderLayout.CENTER);
    nextButton.addActionListener(e -> cardLayout.next(cardPanel));

   
    frame.setVisible(true);
  }
}