package myen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class BasicFrameApp
{
    public static void main(String[] argv) throws Exception
    {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);

        JPanel pane = new JPanel();
        NoteLayout layout = new NoteLayout();
        pane.setLayout(layout);
        pane.add(new JTextPane());
        pane.add(new JTextPane());

        JScrollPane jScrollPane = new JScrollPane(pane);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(jScrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
