/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTA;

import MODELOreg.*;
import MODELOobj.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ReporteVentana extends javax.swing.JFrame {

    private registroActas ppa;
    private registroElecciones re;
    public ReporteVentana() {
        initComponents();
    }
    public ReporteVentana(registroActas b,registroElecciones e) {
        initComponents();
        ppa=b;
        this.re=e;
        generarReporte();
    }

    private void generarReporte() {
    String texto = "";

    for (int i = 0; i < ppa.longitud(); i++) {
        actaElectoral a = ppa.iesimo(i);

        eleccion e = a.getEleccion();
        if (e == null) {
            continue;
        }

        texto += "Elección: " + e.getTipo() + " - " + e.getFecha() + "\n";

        candidato[] lista = a.getCandidatos();
        int[] votos = a.getVotosCandidatos();

        int mayor = -1;
        int posGanador = -1;

        for (int j = 0; j < lista.length; j++) {
            if (votos[j] > mayor) {
                mayor = votos[j];
                posGanador = j;
            }
        }

        if (posGanador != -1) {
            texto += "Ganador: " + lista[posGanador].getNombreCompleto();
            texto += " (" + lista[posGanador].getPartidoPolitico() + ")";
            texto += " con " + votos[posGanador] + " votos.\n";
        } else {
            texto += "No hay votos en esta acta.\n";
        }

        texto += "\n";
    }

    areaReporte.setText(texto);
    areaReporte.setEditable(false);
}

    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areaReporte = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaReporte.setColumns(20);
        areaReporte.setRows(5);
        jScrollPane1.setViewportView(areaReporte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReporteVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaReporte;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
