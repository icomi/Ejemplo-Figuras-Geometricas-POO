/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.awt.Color;
import java.awt.Graphics;


public class Oso extends Figura {
   
   protected int a;
   protected boolean sonriendo =false;

    public boolean estaSonriendo() {
        return sonriendo;
    }

    public void sonreir( ) {
        this.sonriendo = true;
    }
    public void noSonreir( ) {
        this.sonriendo = false;
    }
   public Oso (int x, int y, int alto) {     
      this.setX(x ); 
      this.setY(y) ; 
      this.setWidth(2 * alto /3) ;
      this.setHeight(alto);
  }

    public void dibujar(Graphics g) {
        g.setColor(Color.WHITE );
        a= this.getHeight() /2;
              //Poner la cabeza 
        g.fillOval(this.getX(), this.getY(), a, a );
        //Poner la panza
        g.fillOval(this.getX() -a/6, this.getY() +a, this.getWidth(),this.getWidth() );
        
        //dibujar contorno
        g.setColor(Color.BLACK );
        g.drawOval(this.getX(), this.getY(), a, a);
        g.drawOval(this.getX() -a/6, this.getY() +a, this.getWidth(),this.getWidth() );
        
        this.dibujaObjetosCara(g);
        this.dibujaManos(g);
        this.dibujaPies(g);
        
        if (sonriendo ) {
            this.dibujaSonrisa(g);
        }
    }
    
    protected void dibujaManos(Graphics g) {
         //Manos
        g.fillRoundRect(this.getX() + 2* a/3, this.getY() +a, 2*a/3, a/3, 3, 3);
        g.fillRoundRect(this.getX() - a/3, this.getY() +a, 2*a/3, a/3, 3, 3);
    }
    
    protected void dibujaPies(Graphics g) {     
        //Pies
        g.fillRoundRect(this.getX() + 2* a/3, this.getY() +a*2, a/2, a/3, 5, 5);
        g.fillRoundRect(this.getX() - a/3, this.getY() +a*2, a/2, a/3, 5, 5);
    }

     protected void dibujaObjetosCara(Graphics g) {          
        //orejas
        g.fillOval(this.getX(), this.getY()- a/10, a/3, a/3);
        g.fillOval(this.getX() +a*2/3, this.getY() - a/10, a/3, a/3);
        
        //Nariz
        g.fillOval(this.getX() + this.getWidth()/4, this.getY()+ 2*a/3, a/4, a/6);
        
         //Ojos
        g.fillOval(this.getX() + this.getWidth()/6, this.getY()+ a/3, a/6, a/4);
        g.fillOval(this.getX() + this.getWidth()/3, this.getY()+ a/3, a/6, a/4);
     }
     
     protected void dibujaSonrisa(Graphics g) {          
       g.drawArc(this.getX() + this.getWidth()/4, this.getY()+ a/3 +5, a/4, a/2, 200,120);
       
       }
}
