/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafis;
import java.awt. *;
/**
 *
 * @author User
 */
public class Grafis extends Panel{
Grafis(){
    setBackground(Color.gray); //Konstanta dalam class color
    
}
public void paint(Graphics g){
    //buat alas
    g.fillRect(0, 250, 290, 50);
    
    g.drawLine(125, 250, 125, 160);
    g.drawLine(175, 250, 175, 160);
    g.drawArc(85, 157, 130, 50, -65, 312);
    g.drawArc(85, 87, 130, 50, 62, 58);
    g.drawLine(215, 177, 181, 89);
    //coraknya
    g.fillArc(78, 120, 40, 40, 63, -174);
    g.fillOval(120, 96, 30, 40);
    g.fillArc(173, 100, 40, 40, 110, 180);

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Frame f = new Frame("test grafik panel");
    Grafis gp = new Grafis();
    f.add(gp);
    f.setSize(900, 900);
    f.setVisible(true);
    
    
    
    }
    
    
    
}
