package javanotepad;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class JavaNotePad {

    
    private String fileName;
    private String fileDate;

    
    public String getName() {
        return fileName;
    }

    public void setName(String name) {
        this.fileName = name;
    }
    
    public String getDate() {
        return fileDate;
    }

    public void setDate(String date) {
        this.fileDate = date;
    }
    
    
    
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Run from NotePadGui !!!", "info", JOptionPane.INFORMATION_MESSAGE);
        
        /*
        NotePadGui obj = new NotePadGui();
        obj.setBounds(0, 0, 700, 500);
        obj.setTitle("NotePad");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
        
    }
    
}
