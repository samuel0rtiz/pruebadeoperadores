/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package samuel.pruebadeoperadores;

/**
 *
 * @author samuelortiz
 */
public class Pruebadeoperadores {
    int x;
    int y = 2;
    double z = 3.0;
    
    public void calculo() {
        x = 5;
        System.out.println("x + y + z = " + (x + y + z));
        x += y;
        y++;
        z--;
        z *= x;
        System.out.println("x + y + z = " + (x + y + z));
    }

    public static void main (String[] args) {
        Pruebadeoperadores nuevocalculo = new Pruebadeoperadores();
        nuevocalculo.calculo();
    }
}


