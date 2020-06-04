package com.vista2;

import com.modelo.Cliente;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HikingCarrot7
 */
public class Menu extends JFrame
{

    public Menu()
    {
        initLookAndFeel();
        initComponents();
    }

    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    private void initLookAndFeel()
    {
        /* Set the Nimbus look and feel
        /*If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                if ("Windows".equals(info.getName()))
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        jPanel1 = new JPanel();
        filler3 = new Box.Filler(new Dimension(0, 5), new Dimension(0, 5), new Dimension(32767, 5));
        jLabel1 = new JLabel();
        filler1 = new Box.Filler(new Dimension(0, 10), new Dimension(0, 10), new Dimension(32767, 10));
        jLabel2 = new JLabel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jPanel5 = new JPanel();
        jScrollPane2 = new JScrollPane();
        listClientes = new JList<>();
        jPanel8 = new JPanel();
        jLabel5 = new JLabel();
        jPanel6 = new JPanel();
        jPanel7 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jPanel9 = new JPanel();
        jLabel4 = new JLabel();
        jPanel4 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Centro comercial");
        setMinimumSize(new Dimension(630, 430));
        setPreferredSize(new Dimension(630, 430));

        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
        jPanel1.add(filler3);

        jLabel1.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Centro comercial");
        jLabel1.setAlignmentX(0.5F);
        jPanel1.add(jLabel1);
        jPanel1.add(filler1);

        jLabel2.setIcon(new ImageIcon(getClass().getResource("/com/vista/images/logo_fmat.png"))); // NOI18N
        jLabel2.setAlignmentX(0.5F);
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, BorderLayout.PAGE_START);

        jPanel2.setLayout(new GridLayout(2, 1));

        jPanel3.setBorder(BorderFactory.createTitledBorder("Clientes disponibles"));
        jPanel3.setLayout(new GridLayout(1, 0));

        jPanel5.setLayout(new BorderLayout());

        listClientes.setBackground(new Color(240, 240, 240));
        jScrollPane2.setViewportView(listClientes);

        jPanel5.add(jScrollPane2, BorderLayout.CENTER);

        jPanel8.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel8.setLayout(new BorderLayout());

        jLabel5.setText("Seleccione a un cliente...");
        jPanel8.add(jLabel5, BorderLayout.PAGE_START);

        jPanel5.add(jPanel8, BorderLayout.PAGE_END);

        jPanel3.add(jPanel5);

        jPanel6.setLayout(new GridLayout(1, 2));

        jPanel7.setLayout(new GridBagLayout());

        jButton1.setText("Solicitar carrito");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new Insets(5, 15, 5, 15);
        jPanel7.add(jButton1, gridBagConstraints);

        jButton2.setText("Pagar carrito");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new Insets(5, 15, 5, 15);
        jPanel7.add(jButton2, gridBagConstraints);

        jPanel6.add(jPanel7);

        jPanel9.setLayout(new BorderLayout());

        jLabel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        jPanel9.add(jLabel4, BorderLayout.CENTER);

        jPanel6.add(jPanel9);

        jPanel3.add(jPanel6);

        jPanel2.add(jPanel3);

        jPanel4.setBorder(BorderFactory.createTitledBorder("Tiendas disponibles"));
        jPanel4.setLayout(new BorderLayout());

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tienda", "Ir a tienda"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(70);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(70);
        }

        jPanel4.add(jScrollPane1, BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        getContentPane().add(jPanel2, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JList<Cliente> getListClientes()
    {
        return listClientes;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Box.Filler filler1;
    private Box.Filler filler3;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JList<Cliente> listClientes;
    // End of variables declaration//GEN-END:variables
}
