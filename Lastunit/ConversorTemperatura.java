import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class ConversorTemperatura extends JFrame {

    private JLabel etiquetaEntrada, etiquetaSalida;
    private JTextField campoEntrada;
    private JComboBox<String> comboEntrada, comboSalida;
    private JButton botonConvertir;
    private JLabel resultado;

    public ConversorTemperatura() {
        JFrame frame = new JFrame("Conversor de temperatura");
        
        // Crear componentes
        etiquetaEntrada = new JLabel("Temperatura de entrada:");
        campoEntrada = new JTextField(10);
        comboEntrada = new JComboBox<>(new String[]{"Celsius", "Fahrenheit", "Kelvin"});
        etiquetaSalida = new JLabel("Temperatura de salida:");
        comboSalida = new JComboBox<>(new String[]{"Celsius", "Fahrenheit", "Kelvin"});
        botonConvertir = new JButton("Convertir");
        resultado = new JLabel("");

        // Crear panel y agregar componentes dentro de él
        JPanel panelPrincipal = new JPanel();

        panelPrincipal.add(etiquetaEntrada);
        panelPrincipal.add(campoEntrada);
        panelPrincipal.add(comboEntrada);

        panelPrincipal.add(etiquetaSalida);
        panelPrincipal.add(comboSalida);
        panelPrincipal.add(botonConvertir);
        panelPrincipal.add(resultado);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        frame.add(panelPrincipal);
        
        // Muestra los objetos del frame sin necesidad de agrandarlo
        frame.pack();
        frame.setVisible(true);

        // Qué es lo que el botón hace al hacer click en él
        botonConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirTemperatura();
            }
        });
    }

    private void convertirTemperatura() {
        // Obtener valores de entrada
        double valorEntrada = Double.parseDouble(campoEntrada.getText());
        String unidadEntrada = (String) comboEntrada.getSelectedItem();

        // Obtener unidad de salida
        String unidadSalida = (String) comboSalida.getSelectedItem();

        double valorConvertido = convertir(valorEntrada, unidadEntrada, unidadSalida);

        // Muestra el resultado cambiando el texto de la etiqueta
        resultado.setText("Temperatura convertida: " + valorConvertido);
    }

    private double convertir(double valor, String unidadEntrada, String unidadSalida) {
        switch (unidadEntrada) {
            case "Celsius":
                if (unidadSalida.equals("Fahrenheit")) {
                    return (valor * 9.0 / 5.0) + 32.0;
                } else if (unidadSalida.equals("Kelvin")) {
                    return valor + 273.15;
                } else {
                    return valor; 
                }
            case "Fahrenheit":
                if (unidadSalida.equals("Celsius")) {
                    return (valor - 32.0) * 5.0 / 9.0;
                } else if (unidadSalida.equals("Kelvin")) {
                    return (valor - 32.0) * 5.0 / 9.0 + 273.15;
                } else {
                    return valor; 
                }
            case "Kelvin":
                if (unidadSalida.equals("Celsius")) {
                    return valor - 273.15;
                } else if (unidadSalida.equals("Fahrenheit")) {
                    return (valor - 273.15) * 9.0 / 5.0 + 32.0;
                } else {
                    return valor; 
                }
            default:
                return 0.0; 
        }
    }

    public static void main(String[] args) {
        new ConversorTemperatura();
    }
}
