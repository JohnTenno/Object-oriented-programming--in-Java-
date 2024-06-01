import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraSwing {

    public static void main(String[] args) {
        // Crear la interfaz gráfica y mostrar la ventana
        JFrame ventana = new JFrame("Calculadora");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 200);

        // Crear componentes y agregarlos al panel
        JPanel panel = new JPanel();
        ventana.add(panel);

        JLabel etiquetaNumero1 = new JLabel("Número 1:");
        panel.add(etiquetaNumero1);

        JTextField campoNumero1 = new JTextField(10);
        panel.add(campoNumero1);

        JLabel etiquetaNumero2 = new JLabel("Número 2:");
        panel.add(etiquetaNumero2);

        JTextField campoNumero2 = new JTextField(10);
        panel.add(campoNumero2);

        JButton botonSuma = new JButton("+");
        panel.add(botonSuma);

        JButton botonResta = new JButton("-");
        panel.add(botonResta);

        JButton botonMultiplicacion = new JButton("*");
        panel.add(botonMultiplicacion);

        JButton botonDivision = new JButton("/");
        panel.add(botonDivision);

        JLabel etiquetaResultado = new JLabel("Resultado:");
        panel.add(etiquetaResultado);

        JTextField campoResultado = new JTextField(10);
        panel.add(campoResultado);

        ventana.pack();

        // Agregar acción a los botones
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(campoNumero1.getText());
                    double numero2 = Double.parseDouble(campoNumero2.getText());
                    double resultado = numero1 + numero2;
                    campoResultado.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    mostrarMensajeError("Error: Ingrese números válidos.");
                }
            }
        });

        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(campoNumero1.getText());
                    double numero2 = Double.parseDouble(campoNumero2.getText());
                    double resultado = numero1 - numero2;
                    campoResultado.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    mostrarMensajeError("Error: Ingrese números válidos.");
                }
            }
        });

        botonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(campoNumero1.getText());
                    double numero2 = Double.parseDouble(campoNumero2.getText());
                    double resultado = numero1 * numero2;
                    campoResultado.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    mostrarMensajeError("Error: Ingrese números válidos.");
                }
            }
        });

        botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(campoNumero1.getText());
                    double numero2 = Double.parseDouble(campoNumero2.getText());
                    if (numero2 == 0) {
                        mostrarMensajeError("Error: No se puede dividir por cero.");
                    } else {
                        double resultado = numero1 / numero2;
                        campoResultado.setText(String.valueOf(resultado));
                    }
                } catch (NumberFormatException ex) {
                    mostrarMensajeError("Error: Ingrese números válidos.");
                }
            }
        });
  

        // Hacer que la ventana sea visible
        ventana.setVisible(true);
    }
    
    private static void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}

