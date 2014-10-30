package Game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class Main {

    
   
   
    public static void main(String[] args) {
      
        //URL url = Main.class.getResource("BkMusic.wav");
      //  AudioClip clip = Applet.newAudioClip(url);
        //clip.play();
        System.out.println("lkfleff");
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            SelectMode game = new SelectMode();
            game.setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    } 
   
     public static char Findwinner(char mat[][]) {
        for (int i = 0; i <= 2; i++) {
            if (mat[i][0] == mat[i][1] && mat[i][1] == mat[i][2]) {   //check rows
                
                return mat[i][0];
            } else if (mat[0][i] == mat[1][i] && mat[1][i] == mat[2][i]) {  //check columns
                return mat[0][i];
            }
        }
        if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]) {   //check diagonals
            return mat[0][0];
        }
        if (mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0]) {   //check diagonals
            return mat[0][2];
        }
        return 0;

    }
public static int getNextStep(JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5, JButton btn6, JButton btn7, JButton btn8, JButton btn9) {
	
        if(btn1.getText().equals("0") && btn2.getText().equals("0") && btn3.getText().equals("")) {
                return 3;
    }
		else if(btn4.getText().equals("0") && btn5.getText().equals("0") && btn6.getText().equals(""))
			return 6;
		else if(btn7.getText().equals("0") && btn8.getText().equals("0") && btn9.getText().equals(""))
			return 9;
		
		else if(btn2.getText().equals("0") && btn3.getText().equals("0") && btn1.getText().equals(""))
			return 1;
		else if(btn5.getText().equals("0") && btn6.getText().equals("0") && btn4.getText().equals(""))
			return 4;
		else if(btn8.getText().equals("0") && btn9.getText().equals("0") && btn7.getText().equals(""))
			return 7;
		
		else if(btn1.getText().equals("0") && btn3.getText().equals("0") && btn2.getText().equals(""))
			return 2;
		else if(btn4.getText().equals("0") && btn6.getText().equals("0") && btn5.getText().equals(""))
			return 5;
		else if(btn7.getText().equals("0") && btn9.getText().equals("0") && btn8.getText().equals(""))
			return 8;
		
		else if(btn1.getText().equals("0") && btn4.getText().equals("0") && btn7.getText().equals(""))
			return 7;
		else if(btn2.getText().equals("0") && btn5.getText().equals("0") && btn8.getText().equals(""))
			return 8;
		else if(btn3.getText().equals("0") && btn6.getText().equals("0") && btn9.getText().equals(""))
			return 9;
		
		else if(btn4.getText().equals("0") && btn7.getText().equals("0") && btn1.getText().equals(""))
			return 1;
		else if(btn5.getText().equals("0") && btn8.getText().equals("0") && btn2.getText().equals(""))
			return 2;
		else if(btn6.getText().equals("0") && btn9.getText().equals("0") && btn3.getText().equals(""))
			return 3;
		
		else if(btn1.getText().equals("0") && btn7.getText().equals("0") && btn4.getText().equals(""))
			return 4;
		else if(btn2.getText().equals("0") && btn8.getText().equals("0") && btn5.getText().equals(""))
			return 5;
		else if(btn3.getText().equals("0") && btn9.getText().equals("0") && btn6.getText().equals(""))
			return 6;
		
		else if(btn1.getText().equals("0") && btn5.getText().equals("0") && btn9.getText().equals(""))
			return 9;
		else if(btn5.getText().equals("0") && btn9.getText().equals("0") && btn1.getText().equals(""))
			return 1;
		else if(btn1.getText().equals("0") && btn9.getText().equals("0") && btn5.getText().equals(""))
			return 5;
		
		else if(btn3.getText().equals("0") && btn5.getText().equals("0") && btn7.getText().equals(""))
			return 7;
		else if(btn7.getText().equals("0") && btn5.getText().equals("0") && btn3.getText().equals(""))
			return 3;
		else if(btn7.getText().equals("0") && btn3.getText().equals("0") && btn5.getText().equals(""))
			return 5;
		
		else if(btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals(""))
			return 3;
		else if(btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals(""))
			return 6;
		else if(btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals(""))
			return 9;
		
		else if(btn2.getText().equals("X") && btn3.getText().equals("X") && btn1.getText().equals(""))
			return 1;
		else if(btn5.getText().equals("X") && btn6.getText().equals("X") && btn4.getText().equals(""))
			return 4;
		else if(btn8.getText().equals("X") && btn9.getText().equals("X") && btn7.getText().equals(""))
			return 7;
		
		else if(btn1.getText().equals("X") && btn3.getText().equals("X") && btn2.getText().equals(""))
			return 2;
		else if(btn4.getText().equals("X") && btn6.getText().equals("X") && btn5.getText().equals(""))
			return 5;
		else if(btn7.getText().equals("X") && btn9.getText().equals("X") && btn8.getText().equals(""))
			return 8;

		else if(btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals(""))
			return 7;
		else if(btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals(""))
			return 8;
		else if(btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals(""))
			return 9;
		
		else if(btn4.getText().equals("X") && btn7.getText().equals("X") && btn1.getText().equals(""))
			return 1;
		else if(btn5.getText().equals("X") && btn8.getText().equals("X") && btn2.getText().equals(""))
			return 2;
		else if(btn6.getText().equals("X") && btn9.getText().equals("X") && btn3.getText().equals(""))
			return 3;
		
		else if(btn1.getText().equals("X") && btn7.getText().equals("X") && btn4.getText().equals(""))
			return 4;
		else if(btn2.getText().equals("X") && btn8.getText().equals("X") && btn5.getText().equals(""))
			return 5;
		else if(btn3.getText().equals("X") && btn9.getText().equals("X") && btn6.getText().equals(""))
			return 6;
		
		else if(btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals(""))
			return 9;
		else if(btn5.getText().equals("X") && btn9.getText().equals("X") && btn1.getText().equals(""))
			return 1;
		else if(btn1.getText().equals("X") && btn9.getText().equals("X") && btn5.getText().equals(""))
			return 5;
		
		else if(btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals(""))
			return 7;
		else if(btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals(""))
			return 3;
		else if(btn7.getText().equals("X") && btn3.getText().equals("X") && btn5.getText().equals(""))
			return 5;
		
		else if(btn1.getText().equals("X") && btn5.getText().equals("O") && btn9.getText().equals("X"))
			return 6;
			
		else if(btn3.getText().equals("X") && btn5.getText().equals("O") && btn7.getText().equals("X")) 
			return 4;
		
		else if(btn5.getText().equals(""))
			return 5;
		
		else if(btn1.getText().equals(""))
			return 1;
		else
			return 0;
	}    
}
 