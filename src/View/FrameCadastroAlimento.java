/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Control.Impl.ImplAlimentoDAO;
import Control.Impl.ImplRemedioDAO;
import Model.Alimento;
import Util.ComponentValidator;
import Util.Mensagens;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class FrameCadastroAlimento extends javax.swing.JFrame {

    private Alimento alimento;
    
    /**
     * Creates new form FrameCadastroAlimento
     */
    public FrameCadastroAlimento() {
        initComponents();
    }
    
    private void limparCadastro() {
        campoNome.setText("");
        campoQntEstoque.setText("");
        campoInfNutricional.setText("");
    }
    
    private void limparEdicao() {
        campoNomeEdicao.setText("");
        campoQntEstoqueEdicao.setText("");
        campoInfNutricionalEdicao.setText("");
        comboBoxAlimento.setSelectedIndex(0);
        habilitado(false);
    }
    
    private void habilitado(boolean flag) {
        campoNomeEdicao.setEnabled(flag);
        campoQntEstoqueEdicao.setEnabled(flag);
        campoInfNutricionalEdicao.setEnabled(flag);
        botaoSalvar.setEnabled(flag);
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
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        campoQntEstoque = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        campoInfNutricional = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        botaoConsultar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        campoNomeEdicao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoQntEstoqueEdicao = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        campoInfNutricionalEdicao = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        comboBoxAlimento = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Alimento");
        setResizable(false);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Quantidade em estoque:");

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        campoQntEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel3.setText("Informação nutricional:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoInfNutricional, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoQntEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(botaoCadastrar)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoQntEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoInfNutricional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(botaoCadastrar)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome:");

        campoNomeEdicao.setEnabled(false);

        jLabel9.setText("Quantidade em estoque:");

        campoQntEstoqueEdicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoQntEstoqueEdicao.setEnabled(false);

        jLabel10.setText("Informação nutricional:");

        campoInfNutricionalEdicao.setEnabled(false);

        botaoSalvar.setText("Salvar alterações");
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        comboBoxAlimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione alimento" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(10, 10, 10))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoInfNutricionalEdicao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNomeEdicao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoQntEstoqueEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboBoxAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoConsultar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(botaoSalvar)))
                .addGap(0, 107, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsultar)
                    .addComponent(comboBoxAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoNomeEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoQntEstoqueEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoInfNutricionalEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        Alimento r = new Alimento();
        if(!campoNome.getText().equals("")) {
            r.setNomeAlimento(campoNome.getText());
        }
        else {
            Mensagens.campoInvalido(this, "Campo Nome");
            return;
        }
        if(ComponentValidator.integerNotNegativeAndNotZero(campoQntEstoque)) {
            r.setQtdEstoque(Integer.parseInt(campoQntEstoque.getText()));
        }
        else {
            Mensagens.campoInvalido(this, "Campo Quantidade em Estoque");
            return;
        }
        if(!campoInfNutricionalEdicao.getText().equals("")) {
            r.setInfoNutricional(campoInfNutricional.getText());
        }
        else {
            Mensagens.campoInvalido(this, "Campo Unidade de Medida");
            return;
        }
        try {
            ImplAlimentoDAO.getInstance().inserir(r);
            limparCadastro();
            Mensagens.cadastradoComSucesso(this);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Alimento r = new Alimento();
        if(!campoNomeEdicao.getText().equals("")) {
            r.setNomeAlimento(campoNomeEdicao.getText());
        }
        else {
            Mensagens.campoInvalido(this, "Campo Nome");
            return;
        }
        if(ComponentValidator.integerNotNegativeAndNotZero(campoQntEstoque)) {
            r.setQtdEstoque(Integer.parseInt(campoQntEstoque.getText()));
        }
        else {
            Mensagens.campoInvalido(this, "Campo Quantidade em Estoque");
            return;
        }
        if(!campoInfNutricionalEdicao.getText().equals("")) {
            r.setInfoNutricional(campoInfNutricionalEdicao.getText());
        }
        else {
            Mensagens.campoInvalido(this, "Campo Unidade de Medida");
            return;
        }
        try {
            ImplAlimentoDAO.getInstance().atualizar(r);
            limparCadastro();
            Mensagens.cadastradoComSucesso(this);
            habilitado(false);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if(jTabbedPane1.getSelectedIndex() == 1) {
            try {
                comboBoxAlimento.removeAllItems();
                comboBoxAlimento.addItem("Selecione alimento");
                List<Alimento> lista = ImplAlimentoDAO.getInstance().encontrarTodos();
                if(lista != null) {
                    for (Iterator<Alimento> it = lista.iterator(); it.hasNext();) {
                        Alimento r = it.next();
                        comboBoxAlimento.addItem(r);
                    }
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        try {
            if(comboBoxAlimento.getSelectedIndex() != 0) {
                alimento = ImplAlimentoDAO.getInstance().encontrarPorNome(((Alimento)comboBoxAlimento.getSelectedItem()).getNomeAlimento());
                campoNomeEdicao.setText(alimento.getNomeAlimento());
                campoQntEstoqueEdicao.setText(alimento.getQtdEstoque() + "");
                campoInfNutricionalEdicao.setText(alimento.getInfoNutricional()+ "");
                habilitado(true);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoInfNutricional;
    private javax.swing.JTextField campoInfNutricionalEdicao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNomeEdicao;
    private javax.swing.JFormattedTextField campoQntEstoque;
    private javax.swing.JFormattedTextField campoQntEstoqueEdicao;
    private javax.swing.JComboBox comboBoxAlimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
