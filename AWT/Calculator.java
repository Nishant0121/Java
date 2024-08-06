
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener {

    Frame f = new Frame();

    Label l1 = new Label("First Number");
    Label l2 = new Label("Second Number");
    Label l3 = new Label("Result");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();

    Button b1 = new Button("+");
    Button b2 = new Button("-");
    Button b3 = new Button("*");
    Button b4 = new Button("/");
    Button b5 = new Button("Close");

    Calculator() {
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        l1.setBounds(50, 100, 100, 30);
        l2.setBounds(50, 150, 100, 30);
        l3.setBounds(50, 200, 100, 30);

        t1.setBounds(200, 100, 100, 30);
        t2.setBounds(200, 150, 100, 30);
        t3.setBounds(200, 200, 100, 30);

        b1.setBounds(50, 250, 50, 50);
        b2.setBounds(120, 250, 50, 50);
        b3.setBounds(190, 250, 50, 50);
        b4.setBounds(260, 250, 50, 50);
        b5.setBounds(330, 250, 100, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        f.setLayout(null);
        f.setTitle("Nishant Calce");
        f.setVisible(true);
        f.setSize(600, 600);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());

            if (e.getSource() == b5) {
                f.dispose();
            } else if (e.getSource() == b1) {
                int r = n1 + n2;
                t3.setText(String.valueOf(r));
            } else if (e.getSource() == b2) {
                int r = n1 - n2;
                t3.setText(String.valueOf(r));
            } else if (e.getSource() == b3) {
                int r = n1 * n2;
                t3.setText(String.valueOf(r));
            } else if (e.getSource() == b4) {
                if (n2 != 0) {
                    int r = n1 / n2;
                    t3.setText(String.valueOf(r));
                } else {
                    t3.setText("Error");
                }
            }
        } catch (NumberFormatException ex) {
            t3.setText("Error");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
