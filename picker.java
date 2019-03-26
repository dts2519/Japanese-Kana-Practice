//This file lets the user click a button, and a kana (either hiragana or katakana) will appear above the button

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
    private int selection = 0, previous = 0;
    private JLabel displayKana = new JLabel("Welcome");
    private Random pick = new Random();
    //private Timer kanaTimer = new Timer();
    
    public picker()
    {
        super("Kana Practice");
        JPanel p = new JPanel();
        getContentPane().add(p);
        
        newKana = new JButton("New Kana");
        
        p.setLayout(null); //Allows for manual placement of each element
        newKana.setFont(new Font("Serif", Font.BOLD, 24));
        newKana.setBounds(140, 100, 300, 140);
        p.add(newKana);
        
        displayKana.setFont(new Font("Serif", Font.BOLD, 72));
        displayKana.setBounds(140, 20, 300, 80);
        p.add(displayKana);
        
        HandlerClass handler = new HandlerClass();
        newKana.addActionListener(handler);
        
        //kanaTimer.schedule(new kanaClass(), 0, 1 * 5000);
    }
    
    private class HandlerClass implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            getKana(); //When the button is pressed, get a new Kana
        }
    }
    
    /*private class kanaClass extends TimerTask
    {
        public void run()
        {
           getKana();
        }
    */
    
    
    private void getKana()
    {
        selection = pick.nextInt(138) + 1; 
        
        while (selection == previous) //This makes sure a new Kana is always selected
        {
            selection = pick.nextInt(138) + 1;
        }
        previous = selection;
        
        switch(selection)
        {
            case 1:
                displayKana.setText("あ"); //Hiragana a
                break;
            case 2:
                displayKana.setText("い"); //Hiragana i
                break;
            case 3:
                displayKana.setText("う"); //Hiragana u
                break;
            case 4:
                displayKana.setText("え"); //Hiragana e
                break;
            case 5:
                displayKana.setText("お"); //Hiragana o
                break;
            case 6:
                displayKana.setText("か"); //Hiragana ka
                break;
            case 7:
                displayKana.setText("き"); //Hiragana ki
                break;
            case 8:
                displayKana.setText("く"); //Hiragana ku
                break;
            case 9:
                displayKana.setText("け"); //Hiragana ke
                break;
            case 10:
                displayKana.setText("こ"); //Hiragana ko
                break;
            case 11:
                displayKana.setText("さ"); //Hiragana sa
                break;
            case 12:
                displayKana.setText("し"); //Hiragana shi
                break;
            case 13:
                displayKana.setText("す"); //Hiragana su
                break;
            case 14:
                displayKana.setText("せ"); //Hiragana se
                break; 
            case 15:
                displayKana.setText("そ"); //Hiragana so
                break;
            case 16:
                displayKana.setText("た"); //Hiragana ta
                break;
            case 17:
                displayKana.setText("ち"); //Hiragana chi
                break;
            case 18:
                displayKana.setText("つ"); //Hiragana tsu
                break;
            case 19:
                displayKana.setText("て"); //Hiragana te
                break; 
            case 20:
                displayKana.setText("と"); //Hiragana to
                break;
            case 21:
                displayKana.setText("な"); //Hiragana na
                break;
            case 22:
                displayKana.setText("に"); //Hiragana ni
                break;
            case 23:
                displayKana.setText("ぬ"); //Hiragana nu
                break;
            case 24:
                displayKana.setText("ね"); //Hiragana ne
                break; 
            case 25:
                displayKana.setText("の"); //Hiragana no
                break;
            case 26:
                displayKana.setText("は"); //Hiragana ha
                break;
            case 27:
                displayKana.setText("ひ"); //Hiragana hi
                break;
            case 28:
                displayKana.setText("ふ"); //Hiragana fu
                break;
            case 29:
                displayKana.setText("へ"); //Hiragana he
                break; 
            case 30:
                displayKana.setText("ほ"); //Hiragana ho
                break;
            case 31:
                displayKana.setText("ま"); //Hiragana ma
                break;
            case 32:
                displayKana.setText("み"); //Hiragana mi
                break;
            case 33:
                displayKana.setText("む"); //Hiragana mu
                break;
            case 34:
                displayKana.setText("め"); //Hiragana me
                break; 
            case 35:
                displayKana.setText("も"); //Hiragana mo
                break;
            case 36:
                displayKana.setText("や"); //Hiragana ya
                break;
            case 37:
                displayKana.setText("ゆ"); //Hiragana yu
                break;
            case 38:
                displayKana.setText("よ"); //Hiragana yo
                break;
            case 39:
                displayKana.setText("ら"); //Hiragana ra
                break; 
            case 40:
                displayKana.setText("り"); //Hiragana ri
                break;
            case 41:
                displayKana.setText("る"); //Hiragana ru
                break;
            case 42:
                displayKana.setText("れ"); //Hiragana re
                break;
            case 43:
                displayKana.setText("ろ"); //Hiragana ro
                break;
            case 44:
                displayKana.setText("わ"); //Hiragana wa
                break; 
            case 45:
                displayKana.setText("を"); //Hiragana wo
                break;
            case 46:
                displayKana.setText("ん"); //Hiragana n
                break;
            case 47:
                displayKana.setText("が"); //Hiragana ga
                break;
            case 48:
                displayKana.setText("ぎ"); //Hiragana gi
                break;
            case 49:
                displayKana.setText("ぐ"); //Hiragana gu
                break; 
            case 50:
                displayKana.setText("げ"); //Hiragana ge
                break;
            case 51:
                displayKana.setText("ご"); //Hiragana go
                break;
            case 52:
                displayKana.setText("ざ"); //Hiragana za
                break;
            case 53:
                displayKana.setText("じ"); //Hiragana ji
                break;
            case 54:
                displayKana.setText("ず"); //Hiragana zu
                break; 
            case 55:
                displayKana.setText("ぜ"); //Hiragana ze
                break;
            case 56:
                displayKana.setText("ぞ"); //Hiragana zo
                break;
            case 57:
                displayKana.setText("だ"); //Hiragana da
                break;
            case 58:
                displayKana.setText("で"); //Hiragana de
                break;
            case 59:
                displayKana.setText("ど"); //Hiragana do
                break;
            case 60:
                displayKana.setText("ば"); //Hiragana ba
                break;
            case 61:
                displayKana.setText("び"); //Hiragana bi
                break;
            case 62:
                displayKana.setText("ぶ"); //Hiragana bu
                break;
            case 63:
                displayKana.setText("べ"); //Hiragana be
                break;
            case 64:
                displayKana.setText("ぼ"); //Hiragana bo
                break; 
            case 65:
                displayKana.setText("ぱ"); //Hiragana pa
                break;
            case 66:
                displayKana.setText("ぴ"); //Hiragana pi
                break;
            case 67:
                displayKana.setText("ぷ"); //Hiragana pu
                break;
            case 68:
                displayKana.setText("ぺ"); //Hiragana pe
                break;
            case 69:
                displayKana.setText("ぽ"); //Hiragana po
                break; 
            case 70:
                displayKana.setText("ア"); //Katakana a
                break;
            case 71:
                displayKana.setText("イ"); //Katakana i
                break;
            case 72:
                displayKana.setText("ウ"); //Katakana u
                break;
            case 73:
                displayKana.setText("エ"); //Katakana e
                break;
            case 74:
                displayKana.setText("オ"); //Katakana o
                break; 
            case 75:
                displayKana.setText("カ"); //Katakana ka
                break;
            case 76:
                displayKana.setText("キ"); //Katakana ki
                break;
            case 77:
                displayKana.setText("ク"); //Katakana ku
                break;
            case 78:
                displayKana.setText("ケ"); //Katakana ke
                break;
            case 79:
                displayKana.setText("コ"); //Katakana ko
                break; 
            case 80:
                displayKana.setText("サ"); //Katakana sa
                break;
            case 81:
                displayKana.setText("シ"); //Katakana shi
                break;
            case 82:
                displayKana.setText("ス"); //Katakana su
                break;
            case 83:
                displayKana.setText("セ"); //Katakana se
                break;
            case 84:
                displayKana.setText("ソ"); //Katakana so
                break;
            case 85:
                displayKana.setText("タ"); //Katakana ta
                break;
            case 86:
                displayKana.setText("チ"); //Katakana chi
                break;
            case 87:
                displayKana.setText("ツ"); //Katakana tsu
                break;
            case 88:
                displayKana.setText("テ"); //Katakana te
                break;
            case 89:
                displayKana.setText("ト"); //Katakana to
                break; 
            case 90:
                displayKana.setText("ナ"); //Katakana na
                break;
            case 91:
                displayKana.setText("ニ"); //Katakana ni
                break;
            case 92:
                displayKana.setText("ヌ"); //Katakana nu
                break;
            case 93:
                displayKana.setText("ネ"); //Katakana ne
                break;
            case 94:
                displayKana.setText("ノ"); //Katakana no
                break; 
            case 95:
                displayKana.setText("ハ"); //Katakana ha
                break;
            case 96:
                displayKana.setText("ヒ"); //Katakana hi
                break;
            case 97:
                displayKana.setText("フ"); //Katakana fu
                break;
            case 98:
                displayKana.setText("ヘ"); //Katakana he
                break;
            case 99:
                displayKana.setText("ホ"); //Katakana ho
                break; 
            case 100:
                displayKana.setText("マ"); //Katakana ma
                break;
            case 101:
                displayKana.setText("ミ"); //Katakana mi
                break;
            case 102:
                displayKana.setText("ム"); //Katakana mu
                break;
            case 103:
                displayKana.setText("メ"); //Katakana me
                break;
            case 104:
                displayKana.setText("モ"); //Katakana mo
                break; 
            case 105:
                displayKana.setText("ヤ"); //Katakana ya
                break;
            case 106:
                displayKana.setText("ユ"); //Katakana yu
                break;
            case 107:
                displayKana.setText("ヨ"); //Katakana yo
                break;
            case 108:
                displayKana.setText("ラ"); //Katakana ra
                break;
            case 109:
                displayKana.setText("リ"); //Katakana ri
                break;
            case 110:
                displayKana.setText("ル"); //Katakana ru
                break;
            case 111:
                displayKana.setText("レ"); //Katakana re
                break;
            case 112:
                displayKana.setText("ロ"); //Katakana ro
                break;
            case 113:
                displayKana.setText("ワ"); //Katakana wa
                break;
            case 114:
                displayKana.setText("ヲ"); //Katakana wo
                break;
            case 115:
                displayKana.setText("ン"); //Katakana n
                break; 
            case 116:
                displayKana.setText("ガ"); //Katakana ga
                break;
            case 117:
                displayKana.setText("ギ"); //Katakana gi
                break;
            case 118:
                displayKana.setText("グ"); //Katakana gu
                break;
            case 119:
                displayKana.setText("ゲ"); //Katakana ge
                break;
            case 120:
                displayKana.setText("ゴ"); //Katakana go
                break;
            case 121:
                displayKana.setText("ザ"); //Katakana za
                break; 
            case 122:
                displayKana.setText("ジ"); //Katakana ji
                break;
            case 123:
                displayKana.setText("ズ"); //Katakana zu
                break;
            case 124:
                displayKana.setText("ゼ"); //Katakana ze
                break;
            case 125:
                displayKana.setText("ゾ"); //Katakana zo
                break;
            case 126:
                displayKana.setText("ダ"); //Katakana da
                break; 
            case 127:
                displayKana.setText("デ"); //Katakana de
                break;
            case 128:
                displayKana.setText("ド"); //Katakana do
                break;
            case 129:
                displayKana.setText("バ"); //Katakana ba
                break;
            case 130:
                displayKana.setText("ビ"); //Katakana bi
                break;
            case 131:
                displayKana.setText("ブ"); //Katakana bu
                break; 
            case 132:
                displayKana.setText("ベ"); //Katakana be
                break;
            case 133:
                displayKana.setText("ボ"); //Katakana bo
                break;
            case 134:
                displayKana.setText("パ"); //Katakana pa
                break;
            case 135:
                displayKana.setText("ピ"); //Katakana pi
                break;
            case 136:
                displayKana.setText("プ"); //Katakana pu
                break;
            case 137:
                displayKana.setText("ペ"); //Katakana pe
                break;
            case 138:
                displayKana.setText("ポ"); //Katakana po
                break;
            default: 
                displayKana.setText("Click for a new character!");
                break;
             
        }
    }
}
