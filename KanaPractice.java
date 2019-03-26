package kanapractice;

import javax.swing.JFrame;

public class KanaPractice {

    public static void main(String[] args) {
        picker kana = new picker();
        kana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kana.setSize(600, 400);
        kana.setVisible(true);
    }
    
}

// Uncomment everything on the picker.java to enable timed selections (more challenging).