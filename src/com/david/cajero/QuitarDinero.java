/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.cajero;

import com.quidave.cajero.Cajero;

/**
 *
 * @author quique
 */
public class QuitarDinero extends javax.swing.JFrame {

    /**
     * Creates new form Bototones
     */
    public QuitarDinero() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        menuBar4 = new java.awt.MenuBar();
        menu7 = new java.awt.Menu();
        menu8 = new java.awt.Menu();
        menuBar5 = new java.awt.MenuBar();
        menu9 = new java.awt.Menu();
        menu10 = new java.awt.Menu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        bo2 = new javax.swing.JButton();
        bo3 = new javax.swing.JButton();
        bo4 = new javax.swing.JButton();
        bo5 = new javax.swing.JButton();
        bo6 = new javax.swing.JButton();
        bo7 = new javax.swing.JButton();
        bo8 = new javax.swing.JButton();
        bo9 = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        bo1 = new javax.swing.JButton();
        cuerpotexto = new javax.swing.JTextField();
        bo0 = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        menu5.setLabel("File");
        menuBar3.add(menu5);

        menu6.setLabel("Edit");
        menuBar3.add(menu6);

        menu7.setLabel("File");
        menuBar4.add(menu7);

        menu8.setLabel("Edit");
        menuBar4.add(menu8);

        menu9.setLabel("File");
        menuBar5.add(menu9);

        menu10.setLabel("Edit");
        menuBar5.add(menu10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bo2.setText("2");
        bo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo2ActionPerformed(evt);
            }
        });

        bo3.setText("3");
        bo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo3ActionPerformed(evt);
            }
        });

        bo4.setText("4");
        bo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo4ActionPerformed(evt);
            }
        });

        bo5.setText("5");
        bo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo5ActionPerformed(evt);
            }
        });

        bo6.setText("6");
        bo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo6ActionPerformed(evt);
            }
        });

        bo7.setText("7");
        bo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo7ActionPerformed(evt);
            }
        });

        bo8.setText("8");
        bo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo8ActionPerformed(evt);
            }
        });

        bo9.setText("9");
        bo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo9ActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");

        bo1.setText("1");
        bo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo1ActionPerformed(evt);
            }
        });

        cuerpotexto.setEditable(false);

        bo0.setText("0");
        bo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cuerpotexto, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bo7)
                            .addComponent(bo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bo4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bo3)
                                .addGap(30, 30, 30)
                                .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bo5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bo6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bo8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bo9))
                                    .addComponent(bo0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(cuerpotexto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aceptar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bo1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bo4)
                        .addComponent(bo5)
                        .addComponent(bo6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bo7)
                        .addComponent(bo8)
                        .addComponent(bo9))
                    .addComponent(borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bo0)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed

        aceptar();
    }//GEN-LAST:event_aceptarActionPerformed

    private void bo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo2ActionPerformed
        bo2();
    }//GEN-LAST:event_bo2ActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        borrar();
    }//GEN-LAST:event_borrarActionPerformed

    private void bo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo3ActionPerformed
        bo3();
    }//GEN-LAST:event_bo3ActionPerformed

    private void bo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo4ActionPerformed
        bo4();
    }//GEN-LAST:event_bo4ActionPerformed

    private void bo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo5ActionPerformed
        bo5();
    }//GEN-LAST:event_bo5ActionPerformed

    private void bo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo6ActionPerformed
        bo6();
    }//GEN-LAST:event_bo6ActionPerformed

    private void bo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo7ActionPerformed
        bo7();
    }//GEN-LAST:event_bo7ActionPerformed

    private void bo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo8ActionPerformed
        bo8();
    }//GEN-LAST:event_bo8ActionPerformed

    private void bo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo9ActionPerformed
        bo9();
    }//GEN-LAST:event_bo9ActionPerformed

    private void bo0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo0ActionPerformed
        bo0();
    }//GEN-LAST:event_bo0ActionPerformed

    private void bo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo1ActionPerformed
        bo1();
    }//GEN-LAST:event_bo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton bo0;
    private javax.swing.JButton bo1;
    private javax.swing.JButton bo2;
    private javax.swing.JButton bo3;
    private javax.swing.JButton bo4;
    private javax.swing.JButton bo5;
    private javax.swing.JButton bo6;
    private javax.swing.JButton bo7;
    private javax.swing.JButton bo8;
    private javax.swing.JButton bo9;
    private javax.swing.JButton borrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancelar;
    public javax.swing.JTextField cuerpotexto;
    private javax.swing.JPanel jPanel1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu10;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.Menu menu7;
    private java.awt.Menu menu8;
    private java.awt.Menu menu9;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    private java.awt.MenuBar menuBar4;
    private java.awt.MenuBar menuBar5;
    // End of variables declaration//GEN-END:variables

    String completo = "";
    String bot;

    public void bo1() {
        bot = "1";
        completo = completo + bot;
        this.cuerpotexto.setText(completo);

    }

    public void bo2() {
        bot = "2";
        completo = completo + bot;
        this.cuerpotexto.setText(completo);

    }

    public void bo3() {
        bot = "3";
        completo = completo + bot;
        this.cuerpotexto.setText(completo);

    }

    public void bo4() {
        bot = "4";
        completo = completo + bot;
        this.cuerpotexto.setText(completo);

    }

    public void bo5() {
        bot = "5";
        completo = completo + bot;
        this.cuerpotexto.setText(completo);

    }

    public void bo6() {
        bot = "6";
        completo = completo + bot;
        this.cuerpotexto.setText(completo);

    }

    public void bo7() {
        bot = "7";
        completo = completo + bot;
        this.cuerpotexto.setText(completo);

    }

    public void bo8() {
        bot = "8";
        completo = completo + bot;
        this.cuerpotexto.setText(completo);

    }

    public void bo9() {
        bot = "9";
        completo = completo + bot;
        this.cuerpotexto.setText(completo);

    }

    public void bo0() {
        bot = "0";
        completo = completo + bot;
        this.cuerpotexto.setText(completo);

    }

    public void borrar() {

        completo = "";
        this.cuerpotexto.setText(completo);
    }

    private void aceptar() {

        Cajero caj = new Cajero();

        caj.quitarDinero(completo);

        setVisible(false);

        ElegirOpcion opc = new ElegirOpcion();
        opc.setVisible(true);
    }
}
