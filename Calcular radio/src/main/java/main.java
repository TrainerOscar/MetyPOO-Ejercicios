import modelos.Calculadora;
import modelos.Circle;

import javax.swing.*;

public class main {


    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido");
        double radius,  area;
        radius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del area"));
        area = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio"));
        Circle circle = new Circle(radius);
        Calculadora calc =  new Calculadora();
        JOptionPane.showInputDialog(null, "El area del circulo es:" +                                                                        calc.calcularArea(circle));

    }


}
