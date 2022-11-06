package ca.bcit.comp2522.step_04_events_part_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ButtonDisplayer.
 *
 * @author BCIT
 * @version 2022
 */
public final class ButtonDisplayer {

    /**
     * Constructs an object of type ButtonDisplayer.
     */
    private ButtonDisplayer() {
        JFrame frame = new JFrame("ButtonDisplayer");
        JPanel panel = new JPanel();
        JButton button = new JButton("Press me!");
        ButtonListener listener = new ButtonListener();
        button.addActionListener(listener); // THIS LINE HERE
        panel.add(button);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * ButtonListener implements ActionListener interface and
     * responds when a Button is pressed.
     *
     * @author BCIT
     * @version 2022
     */
    static class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(final ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Stop that");
        }
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        new ButtonDisplayer();
    }
}
