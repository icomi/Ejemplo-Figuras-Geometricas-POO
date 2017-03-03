/**
 *
 * @author Araceli Velazquez Gutierrez
 * Materia: Programacion orientada a objetos
 * Periodo: 2017 enero-junio
 * Ejemplo de clase heredada
 * 
 */
package figurasgeometricas;

import java.awt.Color;
import java.awt.Graphics;


public class Circulo extends Figura {
  int radio;
  
  public Circulo (int x, int y, int r) {
      this.radio = r /2; 
      this.setX(x + this.radio);
      this.y = y + this.radio;  //Se puede asignar directamente porque es protected
      
  }
   public Circulo (int x, int y, int r, Color color) {
      this.radio = r/2; 
      this.setX(x + this.radio); //Desplazarse hasta el punto medio
      this.y = y + this.radio; 
      this.setColor(color) ;
      
  }

    public void dibujar(Graphics g) {
        g.setColor(this.getColor() );
        g.drawOval(this.getX(), this.getY(), radio, radio);
    }
    
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
  
    
}
