/**
 *
 * @author Araceli Velazquez Gutierrez
 * Materia: Programacion orientada a objetos
 * Periodo: 2017 enero-junio
 * 
 * Ejemplo de clase padre
 */
package figurasgeometricas;

import java.awt.Color;

public class Figura {
    private int x;
    protected int y;   //dejare esto como ejemplo
    private int width;
    private int height;
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
   
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    } 
   
    
}
