import java.awt.*; 
import java.awt.event.ActionListener; 
import java.awt.event.ItemEvent; 
import java.awt.event.ItemListener; 
import java.awt.event.ActionEvent;
public class MenuDialog {
    Dialog dialog;
    Label l;

    MenuDialog() {
        MenuBar mBar = new MenuBar();
        setMenuBar(mBar);

        Menu file = new Menu("File");
        MenuItem new_file = new MenuItem("New");
        MenuItem open_file = new MenuItem("Open");
        MenuItem save_file = new MenuItem("Save");
        new_file.addActionListener(this);
        open_file.addActionListener(this);
        save_file.addActionListener(this);

        file.add(new_file);
        file.add(open_file);
        file.add(save_file);
        mBar.add(file);

        Menu edit = new Menu("Edit");
        MenuItem undo_edit = new MenuItem("Undo");
        CheckboxMenuItem cut_edit = new CheckboxMenuItem("Cut");
        CheckboxMenuItem copy_edit = new CheckboxMenuItem("Copy");
        CheckboxMenuItem edit_edit = new CheckboxMenuItem("Paste");
        undo_edit.addActionListener(this);
        cut_edit.addActionListener(this);
        copy_edit.addActionListener(this);

        Menu sub = new Menu("Save Type");
        MenuItem sub1_sum = new MenuItem("Direct Save");
        MenuItem sub2_sum = new MenuItem("Save As");
        sub.add(sub1_sum);
        sub.add(sub2_sum);
        edit.add(sub);
        edit.add(undo_edit);
        edit.add(cut_edit);
        edit.add(copy_edit);
        edit.add(edit_edit);

        dialog = new Dialog(this,false);
        dialog.setSize(200, 200);
        dialog.setTitle("Dialog Box");

        Button b = new Button("Close");
        b.addActionListener(this);

        dialog.add(b);
        dialog.setLayout(new FlowLayout());
        l = new Label();
        dialog.add(l);
    }
    public void actionPerformed(ActionEvent e) {
        String selected_item = ie.getActionCommand();
        switch(selected_item) {
            case "New": l.setText("New");
                break;
            case "Open": l.setText("Open");
                break;
            case "Save": l.setText("Save");
                break;
            case "Undo": l.setText("Undo");
                break;
            case "Cut": l.setText("Cut");
                break;
            case "Copy": l.setText("Copy");
                break;
            case "Paste": l.setText("Paste");
                break;
            default: l.setText("Invalid Input");
        }
        dialog.setVisible(true);
        if(selected_item.equals("Close")) {
            dialog.dispose();
        }
    }
    public void itemStateChanged(ItemEvent ie) {
        this.repaint();
    }
    public static void main(String[] args) {
        MenuDialog md = new MenuDialog();
        md.setVisible(true);
        md.setSize(400, 400);
    }
}
