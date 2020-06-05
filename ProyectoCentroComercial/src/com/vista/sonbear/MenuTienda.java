package com.vista.sonbear;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author emman
 */
public class MenuTienda extends javax.swing.JFrame
{

    /**
     * Creates new form MenuPrincipal
     */
    public MenuTienda()
    {
        initComponents();
    }

    public JButton getBtnAgregarCarrito()
    {
        return btnAgregarCarrito;
    }

    public JButton getBtnComprar()
    {
        return btnComprar;
    }

    public JButton getBtnMostrarCarrito()
    {
        return btnMostrarCarrito;
    }

    public JButton getBtnSalir()
    {
        return btnSalir;
    }

    public JButton getBtnSelectCliente()
    {
        return btnSelectCliente;
    }

    public JLabel getLabelTienda()
    {
        return labelTienda;
    }

    public JList getListClientes()
    {
        return listClientes;
    }

    public JList getListArticulos()
    {
        return listArticulos;
    }

    public JLabel getLabelCliente()
    {
        return labelCliente;
    }

    public void error(String mensaje)
    {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(this, mensaje, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listArticulos = new javax.swing.JList();
        btnMostrarCarrito = new javax.swing.JButton();
        btnAgregarCarrito = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listClientes = new javax.swing.JList();
        labelCliente = new javax.swing.JLabel();
        btnSelectCliente = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        labelTienda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Lista articulos disponibles");

        listArticulos.setModel(new javax.swing.AbstractListModel()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listArticulos);

        btnMostrarCarrito.setText("Mostrar carrito");

        btnAgregarCarrito.setText("Añadir al carrito");

        btnComprar.setText("Comprar ahora");

        listClientes.setModel(new javax.swing.AbstractListModel()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listClientes);

        labelCliente.setText("Cliente Actual:  ");

        btnSelectCliente.setText("Seleccionar cliente");

        btnSalir.setText("Salir");

        labelTienda.setText("Tienda Actual");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(labelTienda)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarCarrito)
                            .addComponent(btnAgregarCarrito)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnComprar)
                                    .addComponent(btnSalir)
                                    .addComponent(btnSelectCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCliente))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTienda)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarCarrito)
                        .addGap(24, 24, 24)
                        .addComponent(btnMostrarCarrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSelectCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnComprar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnMostrarCarrito;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSelectCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelTienda;
    private javax.swing.JList listArticulos;
    private javax.swing.JList listClientes;
    // End of variables declaration//GEN-END:variables
}
