package uade.edu.ar.ui.menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu2 extends JFrame implements ActionListener {

    public Menu2(String title) {
        super(title);
        setBounds(40,40,600,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu file = new JMenu("File");
        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(this);
        file.add(quit);
        menuBar.add(file);
        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(this);
        file.add(open);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        if (choice.equals("Quit")) {
            System.exit(0);
        }
        else if (choice.equals("Open")) {
            JOptionPane.showMessageDialog(this,"You hit Open");
        }
    }

    public static void main(String[] args) {
        Menu2 menu = new Menu2("Menu Dialog");
        menu.setVisible(true);
    }

}
