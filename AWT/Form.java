
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Form implements ActionListener {

    Frame f = new Frame();

    Label label = new Label("Enter the Name");

    TextField name = new TextField(20);

    Checkbox terms = new Checkbox("Accept Terms");

    CheckboxGroup gender = new CheckboxGroup();
    Checkbox male = new Checkbox("Male", gender, true);
    Checkbox female = new Checkbox("Female", gender, false);

    List subject = new List(5, true);

    Choice choice = new Choice();

    TextArea result = new TextArea(10, 20);

    Button submit = new Button("Submit");
    Button close = new Button("Close");

    Form() {
        f.add(label);
        f.add(name);
        f.add(terms);
        f.add(male);
        f.add(female);

        subject.add("Java");
        subject.add("DSA");
        subject.add("DBMS");
        subject.add("CPPL");
        subject.add("M-III");
        f.add(subject);

        choice.add("AWT");
        choice.add("SWING");
        choice.add("FX");
        f.add(choice);

        f.add(result);

        f.add(submit);
        f.add(close);

        submit.addActionListener(this);
        close.addActionListener(this);

        f.setLayout(new FlowLayout());
        f.setTitle("Student Form");
        f.setVisible(true);
        f.setSize(400, 400);
    }

    public void actionPerformed(ActionEvent e) {
        String userName = name.getText();
        boolean acceptedTerms = terms.getState();
        String genderSelected = gender.getSelectedCheckbox().getLabel();
        String selectedSubjects = "";
        for (String subjectItem : subject.getSelectedItems()) {
            selectedSubjects += subjectItem + " ";
        }
        String selectedChoice = choice.getSelectedItem();
        if (e.getSource() == close) {
            System.exit(0);
        }
        if (acceptedTerms) {
            if (e.getSource() == submit) {
                result.setText("Name: " + userName + "\nGender: " + genderSelected + "\nSubjects: " + selectedSubjects + "\nChoice: " + selectedChoice);
            } else {
                System.exit(0);
            }
        } else {
            result.setText("Please accept the terms");
        }
    }

    public static void main(String[] args) {
        new Form();
    }

}
