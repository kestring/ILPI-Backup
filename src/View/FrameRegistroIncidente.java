/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Control.Impl.ImplIdosoDAO;
import Control.Impl.ImplIncidenteDAO;
import Model.Idoso;
import Model.Incidente;
import Util.ComponentValidator;
import Util.DataConverter;
import Util.Mensagens;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class FrameRegistroIncidente extends javax.swing.JFrame {

    /**
     * Creates new form RegistroIncidente
     */
    public FrameRegistroIncidente() {
        initComponents();
        try {
        List<Idoso> listaI = ImplIdosoDAO.getInstance().encontrarTodosIdosos();
            if(listaI != null) {
                for (Iterator<Idoso> it = listaI.iterator(); it.hasNext();) {
                    Idoso i = it.next();
                    comboBoxIdoso.addItem(i);
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void limpar() {
        comboBoxIdoso.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxIdoso = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        campoData = new javax.swing.JFormattedTextField();
        checkBoxHoje = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        campoOcorrido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDescricao = new javax.swing.JTextArea();
        botaoRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        comboBoxIdoso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione idoso" }));

        jLabel4.setText("Data:");

        try {
            campoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        checkBoxHoje.setText("hoje");
        checkBoxHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHojeActionPerformed(evt);
            }
        });

        jLabel1.setText("Ocorrido:");

        jLabel2.setText("Descrição:");

        areaDescricao.setColumns(20);
        areaDescricao.setRows(5);
        jScrollPane1.setViewportView(areaDescricao);

        botaoRegistrar.setText("Registrar");
        botaoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxIdoso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoData, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(campoOcorrido))
                                .addGap(18, 18, 18)
                                .addComponent(checkBoxHoje))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(botaoRegistrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxIdoso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxHoje))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoOcorrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxHojeActionPerformed
        if(checkBoxHoje.isSelected()) {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
            Date hoje = new Date();
            campoData.setText(format.format(hoje));
        }
        else {
            campoData.setText("");
        }
    }//GEN-LAST:event_checkBoxHojeActionPerformed

    private void botaoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarActionPerformed
        Incidente in = new Incidente();
        if(ComponentValidator.date(campoData)) {
            in.setDataIncidente(DataConverter.stringTypeToSQLDate(campoData.getText()));
        }
        else {
            Mensagens.campoInvalido(this, "Campo Data");
            return;
        }
        if(!campoOcorrido.getText().equals("")) {
            
        }
        else {
            Mensagens.campoInvalido(this, "Campo Ocorrido");
            return;
        }
        if(!areaDescricao.getText().equals("")) {
            in.setDescricaoIncidente(areaDescricao.getText());
        }
        else {
            Mensagens.campoInvalido(this, "Campo Descrição");
            return;
        }
        try {
            ImplIncidenteDAO.getInstance().inserir(in);
            limpar();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDescricao;
    private javax.swing.JButton botaoRegistrar;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JTextField campoOcorrido;
    private javax.swing.JCheckBox checkBoxHoje;
    private javax.swing.JComboBox comboBoxIdoso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
