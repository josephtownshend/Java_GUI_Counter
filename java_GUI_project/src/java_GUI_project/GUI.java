package java_GUI_project;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{

  private int count = 0;
  private final JLabel label;
  private final JFrame frame;
  private final JButton button;
  private final JPanel panel;

  public GUI() {

    frame = new JFrame();

    button = new JButton("Click me");
    button.addActionListener(this);

    label = new JLabel("Number of clicks: 0");

    panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(30, 30 , 10 , 30));
    panel.setLayout(new GridLayout(0, 1));
    panel.add(button);
    panel.add(label);

    frame.add(panel, BorderLayout.CENTER); // add panel to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // behaviour for closing frame
    frame.setTitle("Our GUI"); // set title of frame
    frame.pack(); // set frame to certain size
    frame.setVisible(true); // set window to be visible and in focus

  }

  public static void main(String[] args) {
    new GUI();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    count++;
    label.setText("Number of clicks: " + count);
  }

}

