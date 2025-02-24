/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Bicicleta;
import models.Condominos;
import connectionDAO.BicicletarioDAO;
import javax.swing.JTable;
/**
 *
 * @author user
 */
public class FrameCadastro extends javax.swing.JFrame {
    ArrayList<Condominos> condominosLista = BicicletarioDAO.listarTodos();
    
    /**
     * Creates new form FrameCadastro
     */
    public FrameCadastro() {
        initComponents();
        desativarCampos();
        if(condominosLista != null)carregarTabela();
        desativarCampos();
        int n_ids = condominosLista.size();
        int ids_valores[] = BicicletarioDAO.getIds(n_ids);
        id_combobox.addItem(null);
        for(int i=0;i<n_ids;i++)id_combobox.addItem(String.valueOf(ids_valores[i]));
        btn_procurar.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jColorChooser1 = new javax.swing.JColorChooser();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nome_text = new javax.swing.JTextField();
        bloco_text = new javax.swing.JTextField();
        numero_text = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefone_text = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cpf_text = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        modelo_text = new javax.swing.JTextField();
        cor_text = new javax.swing.JTextField();
        vaga_text = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_procurar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        id_combobox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaRegistros = new javax.swing.JTable();

        jButton3.setText("Procurar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Proprietário"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Bloco:");

        jLabel3.setText("Número:");

        nome_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_textActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone:");

        jLabel8.setText("CPF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero_text, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nome_text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addComponent(bloco_text, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefone_text)
                            .addComponent(cpf_text))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(bloco_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telefone_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Bicicleta"));

        jLabel5.setText("Modelo:");

        jLabel6.setText("Cor:");

        jLabel7.setText("Vaga");

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modelo_text)
                    .addComponent(cor_text)
                    .addComponent(vaga_text, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(modelo_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(cor_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaga_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_salvar))
                .addContainerGap())
        );

        btn_novo.setText("NOVO");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_excluir.setText("EXCLUIR");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_procurar.setText("PROCURAR");
        btn_procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procurarActionPerformed(evt);
            }
        });

        jLabel9.setText("ID:");

        id_combobox.setModel(id_combobox.getModel());
        id_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_comboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_procurar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_procurar)
                    .addComponent(jLabel9)
                    .addComponent(id_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jTabbedPane2.addTab("REGISTRAR", jPanel2);

        tabelaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Condômino", "Número", "Bloco", "Modelo", "Cor", "Vaga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaRegistros);
        if (tabelaRegistros.getColumnModel().getColumnCount() > 0) {
            tabelaRegistros.getColumnModel().getColumn(0).setResizable(false);
            tabelaRegistros.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaRegistros.getColumnModel().getColumn(1).setResizable(false);
            tabelaRegistros.getColumnModel().getColumn(2).setResizable(false);
            tabelaRegistros.getColumnModel().getColumn(3).setResizable(false);
            tabelaRegistros.getColumnModel().getColumn(4).setResizable(false);
            tabelaRegistros.getColumnModel().getColumn(5).setResizable(false);
            tabelaRegistros.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("REGISTROS", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_textActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        id_combobox.setSelectedIndex(0);
        desativarCampos();
        ativarCampos();
    }//GEN-LAST:event_btn_novoActionPerformed
    
    
    
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        desativarCampos();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        String nome = nome_text.getText();
        int bloco = Integer.parseInt(bloco_text.getText());
        int numero = Integer.parseInt(numero_text.getText());
        String telefone = telefone_text.getText();
        String cpf = cpf_text.getText();
        String modelo = modelo_text.getText();
        String vaga = vaga_text.getText();
        String cor = cor_text.getText();
    
    	Bicicleta bicicleta = new Bicicleta(modelo, cor, vaga);
        Condominos condomino = new Condominos(nome, bloco, numero,telefone, bicicleta);
        
        condominosLista.add(condomino);
        BicicletarioDAO.salvar(condomino, null);
        
        if(condominosLista != null)carregarTabela();
        desativarCampos();

        
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procurarActionPerformed
        String id = id_combobox.getSelectedItem().toString();        
        Condominos condomino = BicicletarioDAO.buscar(id);
        if(condomino != null){
            ativarCampos();
            nome_text.setText(condomino.getNome());
            bloco_text.setText(String.valueOf(condomino.getBloco()));
            numero_text.setText(String.valueOf(condomino.getNumero()));
            telefone_text.setText(String.valueOf(condomino.getTelefone()));
            cpf_text.setText("");
            modelo_text.setText(condomino.bicicleta.getModelo());
            vaga_text.setText(condomino.bicicleta.getVaga());
            cor_text.setText(condomino.bicicleta.getCor());
            
            btn_salvar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            btn_editar.setEnabled(true);
            btn_excluir.setEnabled(true);
        }

    }//GEN-LAST:event_btn_procurarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        String id = id_combobox.getSelectedItem().toString();
        String nome = nome_text.getText();
        int bloco = Integer.parseInt(bloco_text.getText());
        int numero = Integer.parseInt(numero_text.getText());
        String telefone = telefone_text.getText();
        String cpf = cpf_text.getText();
        String modelo = modelo_text.getText();
        String vaga = vaga_text.getText();
        String cor = cor_text.getText();
     	Bicicleta bicicleta = new Bicicleta(modelo, cor, vaga);
        Condominos condomino = new Condominos(nome, bloco, numero,telefone, bicicleta);
        
        BicicletarioDAO.salvar(condomino, id);
        desativarCampos();
        id_combobox.setSelectedIndex(0);
        
        carregarTabela();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void id_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_comboboxActionPerformed
        if (id_combobox.getSelectedItem() != null) {
            btn_procurar.setEnabled(true);
        }else{
            btn_procurar.setEnabled(false);
        }
    }//GEN-LAST:event_id_comboboxActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        String id = id_combobox.getSelectedItem().toString();
        BicicletarioDAO.deletar(id);
        desativarCampos();
        id_combobox.setSelectedIndex(0);
        if(condominosLista != null)carregarTabela();
    }//GEN-LAST:event_btn_excluirActionPerformed
    
    public void carregarTabela(){
        condominosLista = BicicletarioDAO.listarTodos();
        Object linhas[] = {"ID","Nome","Bloco", "Numero", "Telefone","Modelo","Cor","Vaga"};
        DefaultTableModel modelo = new DefaultTableModel(linhas,0);
        
        for(int i=0; i<condominosLista.size();i++){
            
            modelo.addRow(new Object[]{i+1,
                                       condominosLista.get(i).getNome(), 
                                       condominosLista.get(i).getBloco(),
                                       condominosLista.get(i).getNumero(),
                                       condominosLista.get(i).getTelefone(),
                                       condominosLista.get(i).getBicicleta().getModelo(),
                                       condominosLista.get(i).getBicicleta().getCor(),
                                       condominosLista.get(i).getBicicleta().getVaga(),
            });
        }
  
        tabelaRegistros.setModel(modelo);
        
    }
    public void ativarCampos(){
        nome_text.setText("");
        bloco_text.setText("");
        numero_text.setText("");
        telefone_text.setText("");
        cpf_text.setText("");
        modelo_text.setText("");
        vaga_text.setText("");
        cor_text.setText("");
        
        nome_text.setEnabled(true);
        bloco_text.setEnabled(true);
        numero_text.setEnabled(true);
        telefone_text.setEnabled(true);
        cpf_text.setEnabled(true);
        modelo_text.setEnabled(true);
        vaga_text.setEnabled(true);
        cor_text.setEnabled(true);
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
    }
    public void desativarCampos(){
        nome_text.setText("");
        bloco_text.setText("");
        numero_text.setText("");
        telefone_text.setText("");
        cpf_text.setText("");
        modelo_text.setText("");
        vaga_text.setText("");
        cor_text.setText("");
        
        nome_text.setEnabled(false);
        bloco_text.setEnabled(false);
        numero_text.setEnabled(false);
        telefone_text.setEnabled(false);
        cpf_text.setEnabled(false);
        modelo_text.setEnabled(false);
        vaga_text.setEnabled(false);
        cor_text.setEnabled(false);
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_excluir.setEnabled(false);
    }
    public void alert(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloco_text;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_procurar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField cor_text;
    private javax.swing.JTextField cpf_text;
    private javax.swing.JComboBox<String> id_combobox;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField modelo_text;
    private javax.swing.JTextField nome_text;
    private javax.swing.JTextField numero_text;
    private javax.swing.JTable tabelaRegistros;
    private javax.swing.JTextField telefone_text;
    private javax.swing.JTextField vaga_text;
    // End of variables declaration//GEN-END:variables
}
