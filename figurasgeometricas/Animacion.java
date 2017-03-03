
package figurasgeometricas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;
/**
 *
 * @author Araceli Velazquez Gutierrez
 * Materia: Programacion orientada a objetos
 * Periodo: 2017 enero-junio
 * 
 */
public class Animacion extends JFrame implements ActionListener {
    Timer timer; 
    Random r;
    Circulo c1, c2 , c3;
    Oso oso;
   
    
    public Animacion(){
        super("Programa ejemplo de Programacion Orientada a Objetos en java");   
        
        c1= new Circulo( 50,50,50 ) ;   //usar primer constructor
        c2 = new Circulo (150,200, 20, Color.BLUE) ; 
        c3 = new Circulo (150,200, 100, Color.GREEN) ; 
        oso = new Oso(200,100,100);
        
        this.setBounds(10, 10, 800, 400);
        this.setVisible(true); 
        
        //Crear un Timer para poder simular movimiento
        timer = new Timer(20, this);
        timer.setInitialDelay(50);
        timer.start();
        r = new Random(5 );
        
    }
    
    
    
  @Override
  public void paint (Graphics g)    {
        super.paint(g);    
        
        g.setColor(Color.RED );        
        c1.dibujar(g);
                
        c2.dibujar(g);
        c3.dibujar(g);
        
        //Cambiar posicion de los objetos en la ventana
        c3.setX(c3.getX() +2 );
        c2.setY(c2.getY() + r.nextInt( ));
        
        oso.dibujar(g);
        oso.setX(oso.getX() +2);
        oso.sonreir();
      
    } 
  
    @Override
    public void actionPerformed(ActionEvent e) {
        //Cada vez que ocurre el Timer
       repaint();
    }
}
