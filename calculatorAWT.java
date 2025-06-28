import java.awt.TextField;

public class calculatorAWT extends Frame implements ActionListener{
    TextField t1, t2, result;
    Button add, multiply;

    calculatorAWT() {
        setLayout (new FlowLayout());
        t1 = new TextField(10);
        t2 = new TextField(10);
        result = new TextField(15);
        add = new Button("Add");
        multiply = new Button("Multiply");

        add(t1);
        add(t2);
        add(add);
        add(multiply);
        add(result);

        add.addActionListener(this);
        multiply.addActionListener(this);

        setSize (250, 150);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
    }
    if (e.getSource() == add) {
        result.setText("Sum: " + (a + b));
    }
    else if (e.getSource() == multiply) {
        result.setText("Product: " + (a * b));
    }

    public static void main(String[] args) {
        new calculatorAWT();
    }
}
