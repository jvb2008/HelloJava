package m10_UI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    static void main() {
        // ---------- VENTANA PRINCIPAL ----------
        JFrame ventana = new JFrame("Interfaz Completa en Swing");
        ventana.setSize(700, 450);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        // ---------- PANEL SUPERIOR ---------------
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout());

        JLabel etiqueta = new JLabel("Escribe tu nombre:");
        panelSuperior.add(etiqueta);

        JTextField campoTexto = new JTextField(10);
        panelSuperior.add(campoTexto);

        JButton botonSaludar = new JButton("Saludar");
        panelSuperior.add(botonSaludar);

        String[] opciones = {"Opción A", "Opción B", "Opción C"};
        JComboBox<String> combo = new JComboBox<>(opciones);
        panelSuperior.add(combo);

        // ---------- EVENTO DEL BOTÓN SALUDAR ----------
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoTexto.getText();
                String opcion = combo.getSelectedItem().toString();

                JOptionPane.showMessageDialog(
                        ventana,
                        "Hola " + nombre + "\nHas elegido: " + opcion,
                        "Saludo",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        ventana.add(panelSuperior, BorderLayout.NORTH);

        // ---------- TABLA EN PANEL CENTRAL ----------
        String[] columnas = {"Producto", "Cantidad", "Precio"};

        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(modeloTabla);

        // Añadimos filas de ejemplo
        modeloTabla.addRow(new Object[]{"Manzanas", 5, 2.50});
        modeloTabla.addRow(new Object[]{"Peras", 3, 3.10});
        modeloTabla.addRow(new Object[]{"Naranjas", 8, 1.80});

        // Scroll obligatorio para la tabla
        JScrollPane scrollTabla = new JScrollPane(tabla);
        ventana.add(scrollTabla, BorderLayout.CENTER);


        // ---------- PANEL INFERIOR: CAMPOS PARA AÑADIR FILAS ----------
        JPanel panelInferior = new JPanel(new FlowLayout());


        JTextField campoProd = new JTextField(8);
        panelInferior.add(new JLabel("Producto:"));
        panelInferior.add(campoProd);


        JTextField campoCant = new JTextField(5);
        panelInferior.add(new JLabel("Cantidad:"));
        panelInferior.add(campoCant);


        JTextField campoPrecio = new JTextField(5);
        panelInferior.add(new JLabel("Precio:"));
        panelInferior.add(campoPrecio);


        JButton botonAñadir = new JButton("Añadir a la tabla");
        panelInferior.add(botonAñadir);


        ventana.add(panelInferior, BorderLayout.SOUTH);


        // ---------- EVENTO PARA AÑADIR FILA A LA TABLA ----------
        botonAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String producto = campoProd.getText();
                String cantidadStr = campoCant.getText();
                String precioStr = campoPrecio.getText();

                int cantidad = Integer.parseInt(cantidadStr);
                double precio = Double.parseDouble(precioStr);

                modeloTabla.addRow(new Object[]{producto, cantidad, precio});

                // Limpiar campos
                campoProd.setText("");
                campoCant.setText("");
                campoPrecio.setText("");
            }
        });

        // Mostrar ventana
        ventana.setVisible(true);
    }
}
