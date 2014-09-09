package Game;

import javax.swing.JOptionPane;

public class Main {

    public static TicTakUI board = new TicTakUI();
   
   
    public static void main(String[] args) {
      
        if(board.isVisible()==false){
            board.setVisible(true);
        }
       
    }
    
    public static void checkforwin(){
        if(board.jButton1.getText().equals("X")){
            if(board.jButton5.getText().equals("X")){
                
                if(board.jButton9.getText().equals("X")){
                    JOptionPane.showMessageDialog(board, "Your win..", "Win", JOptionPane.OK_OPTION);
      
                }
            }
                    
            
            
        }
    }
    
}
 