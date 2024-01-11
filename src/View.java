import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private Parser parser;
    private JTextArea queryInput;
    private JButton submit;

    public View(){
        super("Relational Algebra Query");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new BorderLayout());

        parser = new Parser();

        queryInput = new JTextArea();
        this.add(queryInput, BorderLayout.CENTER);

        JPanel submitPanel = new JPanel();
        submitPanel.setLayout(new GridLayout(1,3));
        this.add(submitPanel, BorderLayout.SOUTH);

        submit = new JButton("Submit Query");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = queryInput.getText();
                System.out.println(query);
            }
        });

        submit.setPreferredSize(new Dimension(50,40));

        submitPanel.add(new JPanel());
        submitPanel.add(submit);
        submitPanel.add(new JPanel());


        this.setVisible(true);

    }
}
