/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Control.Impl.Exception.DAOException;
import Control.Impl.ImplIdosoDAO;
import Control.Impl.ImplPertenceDAO;
import Model.Idoso;
import Model.Pertence;
import Util.Mensagens;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class FrameCadastroPertence extends javax.swing.JFrame {

    private Idoso idosoSelecionado;
    
    /**
     * Creates new form FrameCadastraPertence
     */
    public FrameCadastroPertence() {
        initComponents();
        try {
            List<Idoso> lista = ImplIdosoDAO.getInstance().encontrarTodosIdosos();
            if(lista != null) {
                for (Iterator<Idoso> it = lista.iterator(); it.hasNext();) {
                    Idoso idoso = it.next();
                    comboBoxIdoso.addItem(idoso);
                    comboBoxIdosoEdicao.addItem(idoso);
                }
            }
        } catch(SQLException | DAOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    private void limparCadastro() {
        comboBoxIdoso.setSelectedIndex(0);
        campoNome.setText("");
        campoDescricao.setText("");
    }
    
    private void limparEdicao() {
        comboBoxIdosoEdicao.setSelectedIndex(0);
        campoNomeEdicao.setText("");
        campoDescricaoEdicao.setText("");
        comboBoxPertence.setSelectedIndex(0);
        habilitado(false);
    }
    
    private void habilitado(boolean flag) {
        campoNomeEdicao.setEnabled(flag);
        campoDescricaoEdicao.setEnabled(flag);
        comboBoxPertence.setEnabled(flag);
        botaoSalvar.setEnabled(flag);
        botaoConsultar.setEnabled(flag);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        comboBoxIdoso = new javax.swing.JComboBox();
        botaoCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        comboBoxIdosoEdicao = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        campoNomeEdicao = new javax.swing.JTextField();
        botaoConsultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoDescricaoEdicao = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        comboBoxPertence = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pertence");
        setResizable(false);

        jLabel3.setText("Descrição:");

        comboBoxIdoso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione idoso" }));

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome)
                            .addComponent(campoDescricao)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboBoxIdoso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(botaoCadastrar)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(comboBoxIdoso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(botaoCadastrar)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        comboBoxIdosoEdicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione idoso" }));
        comboBoxIdosoEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxIdosoEdicaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome:");

        campoNomeEdicao.setEnabled(false);

        botaoConsultar.setText("Consultar");
        botaoConsultar.setEnabled(false);
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        jLabel5.setText("Descrição:");

        campoDescricaoEdicao.setEnabled(false);

        botaoSalvar.setText("Salvar alterações");
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        comboBoxPertence.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione pertence" }));
        comboBoxPertence.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(comboBoxPertence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoConsultar)
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(comboBoxIdosoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDescricaoEdicao)
                            .addComponent(campoNomeEdicao))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(botaoSalvar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxIdosoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsultar)
                    .addComponent(comboBoxPertence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoNomeEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoDescricaoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        String nome;
        String descricao;
        if(comboBoxIdoso.getSelectedIndex() != 0) {
            idosoSelecionado = (Idoso) comboBoxIdoso.getSelectedItem();
        }
        else {
            Mensagens.campoInvalido(this, "Campo Idoso");
            return;
        }
        if(!campoNome.getText().equals("")) {
            nome = campoNome.getText();
        }
        else {
            Mensagens.campoInvalido(this, "Campo Nome");
            return;
        }
        if(!campoDescricao.getText().equals("")) {
            descricao = campoDescricao.getText();
        }
        else {
            Mensagens.campoInvalido(this, "Campo Descrição");
            return;
        }
        Pertence p = new Pertence(idosoSelecionado, nome, descricao);
        try {
            p.setNumeroPertence(ImplPertenceDAO.getInstance().ecnontrarCodMax(idosoSelecionado.getCodIdoso()));
            ImplPertenceDAO.getInstance().inserir(p);
            limparCadastro();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch(SQLException | DAOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void comboBoxIdosoEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxIdosoEdicaoActionPerformed
        if(comboBoxIdosoEdicao.getSelectedIndex() != 0) {
            comboBoxPertence.setEnabled(true);
            botaoConsultar.setEnabled(true);
            comboBoxPertence.removeAllItems();
            comboBoxPertence.addItem("Selecione pertence");
            try {
                List<Pertence> lista = ImplPertenceDAO.getInstance().encontrarTodos(((Idoso) comboBoxIdosoEdicao.getSelectedItem()).getCodIdoso());
                if(lista != null) {
                    for (Iterator<Pertence> it = lista.iterator(); it.hasNext();) {
                        Pertence pertence = it.next();
                        comboBoxPertence.addItem(pertence);
                    }
                }
            } catch(SQLException | DAOException ex) {
                JOptionPane.showMessageDialog(null, "Idoso não possui pertences cadastrados!");
                ex.printStackTrace();
            }
        }
        else {
            habilitado(false);
            comboBoxPertence.setSelectedIndex(0);
        }
    }//GEN-LAST:event_comboBoxIdosoEdicaoActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        if(comboBoxPertence.getSelectedIndex() != 0) {
            habilitado(true);
            Pertence p = (Pertence) comboBoxPertence.getSelectedItem();
            campoNomeEdicao.setText(p.getNomePertence());
            campoDescricaoEdicao.setText(p.getDescricao());
        }
        else {
            Mensagens.campoInvalido(this, "Campo Pertence");
        }
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Idoso i;
        String nome;
        String descricao;
        if(comboBoxIdosoEdicao.getSelectedIndex() != 0) {
            i = (Idoso) comboBoxIdosoEdicao.getSelectedItem();
        }
        else {
            Mensagens.campoInvalido(this, "Campo Idoso");
            return;
        }
        if(!campoNomeEdicao.getText().equals("")) {
            nome = campoNomeEdicao.getText();
        }
        else {
            Mensagens.campoInvalido(this, "Campo Nome");
            return;
        }
        if(!campoDescricaoEdicao.getText().equals("")) {
            descricao = campoDescricaoEdicao.getText();
        }
        else {
            Mensagens.campoInvalido(this, "Campo Descrição");
            return;
        }
        Pertence p = new Pertence(i, nome, descricao);
        try {
            ImplPertenceDAO.getInstance().atualizar(p);
            limparEdicao();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoDescricaoEdicao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNomeEdicao;
    private javax.swing.JComboBox comboBoxIdoso;
    private javax.swing.JComboBox comboBoxIdosoEdicao;
    private javax.swing.JComboBox comboBoxPertence;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
