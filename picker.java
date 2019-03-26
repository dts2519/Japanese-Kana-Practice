package kanapractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Random;
//import java.util.Timer;
//import java.util.TimerTask;

public class picker extends JFrame{
    
    private JButton newKana;
    private int selection = 0;
    private JLabel displayKana = new JLabel("Welcome");
    private Random pick = new Random();
    //private Timer nelly = new Timer();
    
    public picker()
    {
        super("Kana Practice");
        JPanel p = new JPanel();
        getContentPane().add(p);
        
        newKana = new JButton("New Kana");
        
        p.setLayout(null);
        newKana.setFont(new Font("Serif", Font.BOLD, 24));
        newKana.setBounds(140, 100, 300, 140);
        p.add(newKana);
        
        displayKana.setFont(new Font("Serif", Font.BOLD, 72));
        displayKana.setBounds(140, 20, 300, 80);
        p.add(displayKana);
        
        HandlerClass handoraa = new HandlerClass();
        newKana.addActionListener(handoraa);
        
        //nelly.schedule(new kanaClass(), 0, 1 * 5000);
    }
    
    private class HandlerClass implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            getKana();
        }
    }
    
    /*private class gaussClass extends TimerTask
    {
        public void run()
        {
           getKana();
        }
    */
    
    private void getKana()
    {
        int previous = 0;
        selection = pick.nextInt(10) + 1; //138 reveals all of them
        
        while (selection == previous)
        {
            selection = pick.nextInt(10) + 1;
        }
        switch(selection)
        {
            case 1:
                displayKana.setText("あ");
                break;
            case 2:
                displayKana.setText("い");
                break;
            case 3:
                displayKana.setText("う");
                break;
            case 4:
                displayKana.setText("え");
                break;
            case 5:
                displayKana.setText("お");
                break;
            case 6:
                displayKana.setText("か");
                break;
            case 7:
                displayKana.setText("き");
                break;
            case 8:
                displayKana.setText("く");
                break;
            case 9:
                displayKana.setText("け");
                break;
            case 10:
                displayKana.setText("こ");
                break;
            case 11:
                displayKana.setText("さ");
                break;
            case 12:
                displayKana.setText("し");
                break;
            case 13:
                displayKana.setText("す");
                break;
            case 14:
                displayKana.setText("せ");
                break; 
            case 15:
                displayKana.setText("そ");
                break;
            case 16:
                displayKana.setText("た");
                break;
            case 17:
                displayKana.setText("ち");
                break;
            case 18:
                displayKana.setText("つ");
                break;
            case 19:
                displayKana.setText("て");
                break; 
            case 20:
                displayKana.setText("と");
                break;
            case 21:
                displayKana.setText("な");
                break;
            case 22:
                displayKana.setText("に");
                break;
            case 23:
                displayKana.setText("ぬ");
                break;
            case 24:
                displayKana.setText("ね");
                break; 
            case 25:
                displayKana.setText("の");
                break;
            case 26:
                displayKana.setText("は");
                break;
            case 27:
                displayKana.setText("ひ");
                break;
            case 28:
                displayKana.setText("ふ");
                break;
            case 29:
                displayKana.setText("へ");
                break; 
            case 30:
                displayKana.setText("ほ");
                break;
            case 31:
                displayKana.setText("ま");
                break;
            case 32:
                displayKana.setText("み");
                break;
            case 33:
                displayKana.setText("む");
                break;
            case 34:
                displayKana.setText("め");
                break; 
            case 35:
                displayKana.setText("も");
                break;
            case 36:
                displayKana.setText("や");
                break;
            case 37:
                displayKana.setText("ゆ");
                break;
            case 38:
                displayKana.setText("よ");
                break;
            case 39:
                displayKana.setText("ら");
                break; 
            case 40:
                displayKana.setText("り");
                break;
            case 41:
                displayKana.setText("る");
                break;
            case 42:
                displayKana.setText("れ");
                break;
            case 43:
                displayKana.setText("ろ");
                break;
            case 44:
                displayKana.setText("わ");
                break; 
            case 45:
                displayKana.setText("を");
                break;
            case 46:
                displayKana.setText("ん");
                break;
            case 47:
                displayKana.setText("が");
                break;
            case 48:
                displayKana.setText("ぎ");
                break;
            case 49:
                displayKana.setText("ぐ");
                break; 
            case 50:
                displayKana.setText("げ");
                break;
            case 51:
                displayKana.setText("ご");
                break;
            case 52:
                displayKana.setText("ざ");
                break;
            case 53:
                displayKana.setText("じ");
                break;
            case 54:
                displayKana.setText("ず");
                break; 
            case 55:
                displayKana.setText("ぜ");
                break;
            case 56:
                displayKana.setText("ぞ");
                break;
            case 57:
                displayKana.setText("だ");
                break;
            case 58:
                displayKana.setText("で");
                break;
            case 59:
                displayKana.setText("ど");
                break;
            case 60:
                displayKana.setText("ば");
                break;
            case 61:
                displayKana.setText("び");
                break;
            case 62:
                displayKana.setText("ぶ");
                break;
            case 63:
                displayKana.setText("べ");
                break;
            case 64:
                displayKana.setText("ぼ");
                break; 
            case 65:
                displayKana.setText("ぱ");
                break;
            case 66:
                displayKana.setText("ぴ");
                break;
            case 67:
                displayKana.setText("ぷ");
                break;
            case 68:
                displayKana.setText("ぺ");
                break;
            case 69:
                displayKana.setText("ぽ");
                break; 
            case 70:
                displayKana.setText("ア");
                break;
            case 71:
                displayKana.setText("イ");
                break;
            case 72:
                displayKana.setText("ウ");
                break;
            case 73:
                displayKana.setText("エ");
                break;
            case 74:
                displayKana.setText("オ");
                break; 
            case 75:
                displayKana.setText("カ");
                break;
            case 76:
                displayKana.setText("キ");
                break;
            case 77:
                displayKana.setText("ク");
                break;
            case 78:
                displayKana.setText("ケ");
                break;
            case 79:
                displayKana.setText("コ");
                break; 
            case 80:
                displayKana.setText("サ");
                break;
            case 81:
                displayKana.setText("シ");
                break;
            case 82:
                displayKana.setText("ス");
                break;
            case 83:
                displayKana.setText("セ");
                break;
            case 84:
                displayKana.setText("ソ");
                break;
            case 85:
                displayKana.setText("タ");
                break;
            case 86:
                displayKana.setText("チ");
                break;
            case 87:
                displayKana.setText("ツ");
                break;
            case 88:
                displayKana.setText("テ");
                break;
            case 89:
                displayKana.setText("ト");
                break; 
            case 90:
                displayKana.setText("ナ");
                break;
            case 91:
                displayKana.setText("ニ");
                break;
            case 92:
                displayKana.setText("ヌ");
                break;
            case 93:
                displayKana.setText("ネ");
                break;
            case 94:
                displayKana.setText("ノ");
                break; 
            case 95:
                displayKana.setText("ハ");
                break;
            case 96:
                displayKana.setText("ヒ");
                break;
            case 97:
                displayKana.setText("フ");
                break;
            case 98:
                displayKana.setText("ヘ");
                break;
            case 99:
                displayKana.setText("ホ");
                break; 
            case 100:
                displayKana.setText("マ");
                break;
            case 101:
                displayKana.setText("ミ");
                break;
            case 102:
                displayKana.setText("ム");
                break;
            case 103:
                displayKana.setText("メ");
                break;
            case 104:
                displayKana.setText("モ");
                break; 
            case 105:
                displayKana.setText("ヤ");
                break;
            case 106:
                displayKana.setText("ユ");
                break;
            case 107:
                displayKana.setText("ヨ");
                break;
            case 108:
                displayKana.setText("ラ");
                break;
            case 109:
                displayKana.setText("リ");
                break;
            case 110:
                displayKana.setText("ル");
                break;
            case 111:
                displayKana.setText("レ");
                break;
            case 112:
                displayKana.setText("ロ");
                break;
            case 113:
                displayKana.setText("ワ");
                break;
            case 114:
                displayKana.setText("ヲ");
                break;
            case 115:
                displayKana.setText("ン");
                break; 
            case 116:
                displayKana.setText("ガ");
                break;
            case 117:
                displayKana.setText("ギ");
                break;
            case 118:
                displayKana.setText("グ");
                break;
            case 119:
                displayKana.setText("ゲ");
                break;
            case 120:
                displayKana.setText("ゴ");
                break;
            case 121:
                displayKana.setText("ザ");
                break; 
            case 122:
                displayKana.setText("ジ");
                break;
            case 123:
                displayKana.setText("ズ");
                break;
            case 124:
                displayKana.setText("ゼ");
                break;
            case 125:
                displayKana.setText("ゾ");
                break;
            case 126:
                displayKana.setText("ダ");
                break; 
            case 127:
                displayKana.setText("デ");
                break;
            case 128:
                displayKana.setText("ド");
                break;
            case 129:
                displayKana.setText("バ");
                break;
            case 130:
                displayKana.setText("ビ");
                break;
            case 131:
                displayKana.setText("ブ");
                break; 
            case 132:
                displayKana.setText("ベ");
                break;
            case 133:
                displayKana.setText("ボ");
                break;
            case 134:
                displayKana.setText("パ");
                break;
            case 135:
                displayKana.setText("ピ");
                break;
            case 136:
                displayKana.setText("プ");
                break;
            case 137:
                displayKana.setText("ペ");
                break;
            case 138:
                displayKana.setText("ポ");
                break;
            default: 
                displayKana.setText("Click for a new character!");
                break;
             
        }
    }
}
