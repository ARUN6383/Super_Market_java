package com.smi.supermarket.design;

import com.smi.supermarket.logiccode.ConnectionLogic;
import com.smi.supermarket.pojos.ProductPojo;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Arun Hiruthik
 */
public class BillingPoint extends javax.swing.JFrame {

    public String temp = "";
    ConnectionLogic cl = new ConnectionLogic();
    ProductPojo ppp = new ProductPojo();
    double Uprice, prodtot = 0.0, grandtot = 0.0;
    double priceDelete = 0.0;
    int avaQuantity, newQuan;
    int productId;

    /**
     * Creates new form BillingPoint
     */
    public BillingPoint() {
        initComponents();
        viewbilling();
        disCat();
    }

    private void viewbilling() {
        tableview.setModel(DbUtils.resultSetToTableModel(cl.viewbiling()));

    }

    private void disCat() {
        for (int i = 0; i < cl.disCatgorys().size(); i++) {
            Poption.addItem((String) cl.disCatgorys().get(i));
        }
    }
    private String poptionbill = "";

    public String poptionbillmethod() {
        return poptionbill;
    }
    int i = 0;

    public void clearText() {

        Pname.setText("");
        Pbquan.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pbid = new javax.swing.JTextField();
        bpprice = new javax.swing.JTextField();
        bcphone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bcname = new javax.swing.JTextField();
        Pname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Poption = new javax.swing.JComboBox<>();
        Pbquan = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableview = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        billarea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        EbuttonClear = new javax.swing.JButton();
        Grandtotals = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Bbillingadd = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Bpayed = new javax.swing.JTextField();
        Brem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));
        jPanel3.setFocusCycleRoot(true);

        jLabel1.setText("Product id");

        jLabel2.setText("Product Price");

        jLabel3.setText("Customer Phone");

        pbid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        bpprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bppriceActionPerformed(evt);
            }
        });

        bcphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcphoneActionPerformed(evt);
            }
        });

        jLabel4.setText("Customer Name");

        Pname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Pname.setForeground(new java.awt.Color(0, 204, 51));
        Pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnameActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("Product Name");

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("Product Quantity");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Select Catogory");

        Poption.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PoptionItemStateChanged(evt);
            }
        });
        Poption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PoptionMouseClicked(evt);
            }
        });
        Poption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoptionActionPerformed(evt);
            }
        });

        Pbquan.setBackground(new java.awt.Color(204, 255, 255));
        Pbquan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PbquanActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Filter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View All");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pbid, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bpprice, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bcphone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bcname, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Poption, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pbquan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(Poption, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Pbquan))))
                .addGap(52, 52, 52))
        );

        tableview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableviewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableview);

        billarea.setColumns(20);
        billarea.setRows(5);
        billarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billareaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(billarea);

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add to bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        EbuttonClear.setBackground(new java.awt.Color(0, 153, 153));
        EbuttonClear.setForeground(new java.awt.Color(255, 255, 255));
        EbuttonClear.setText("Clear");
        EbuttonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EbuttonClearMouseClicked(evt);
            }
        });
        EbuttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EbuttonClearActionPerformed(evt);
            }
        });

        Grandtotals.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Bbillingadd.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Bbillingadd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product name", "Product price", "Product quantity", "Product total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Bbillingadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BbillingaddMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Bbillingadd);

        jButton5.setBackground(new java.awt.Color(204, 0, 204));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Gentrate bill");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Bpayed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpayedActionPerformed(evt);
            }
        });

        jLabel6.setText("Total Amount");

        jLabel7.setText("Payed amount");

        jLabel8.setText("Remaining");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(EbuttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Grandtotals, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bpayed, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Brem, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jButton5)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton6)
                                        .addGap(176, 176, 176))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EbuttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(193, 193, 193))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Grandtotals, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Bpayed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Brem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Back");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("  logout");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bppriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bppriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bppriceActionPerformed

    private void bcphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcphoneActionPerformed

    private void PnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnameActionPerformed

    private void PoptionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PoptionItemStateChanged

    }//GEN-LAST:event_PoptionItemStateChanged

    private void PoptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PoptionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PoptionMouseClicked

    private void PoptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoptionActionPerformed

    private void PbquanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PbquanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PbquanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        temp = Poption.getSelectedItem().toString();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_management", "root", "arun@123");
            ps = con.prepareStatement("select pro_id,pro_name,pro_price,pro_quantity,pro_status,categoryItems from product where categoryItems='" + temp + "'");
            rs = ps.executeQuery();
            tableview.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (ClassNotFoundException | SQLException e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        viewbilling();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableviewMouseClicked

        DefaultTableModel mod = (DefaultTableModel) tableview.getModel();
        int indexTable = tableview.getSelectedRow();
        pbid.setText(mod.getValueAt(indexTable, 0).toString());
        bpprice.setText(mod.getValueAt(indexTable, 2).toString());
        productId = Integer.valueOf(mod.getValueAt(indexTable, 0).toString());
        Pname.setText(mod.getValueAt(indexTable, 1).toString());
        Uprice = Double.valueOf(mod.getValueAt(indexTable, 2).toString());
        prodtot = Uprice * Integer.valueOf(Pbquan.getText());
        avaQuantity = Integer.valueOf(mod.getValueAt(indexTable, 3).toString());
        newQuan = avaQuantity - Integer.valueOf(Pbquan.getText());

        //        pro_name = mod.getValueAt(indexTable, 1).toString();
        //        pro_priceuu = mod.getValueAt(indexTable, 2).toString();
        //        Pname.setText(pro_name);
        //        Pdesc.setText(mod.getValueAt(indexTable, 2).toString());
        //        Punit.setText(mod.getValueAt(indexTable, 3).toString());
        //        Pprice.setText(mod.getValueAt(indexTable, 4).toString());
        //        Pstatus.setText(mod.getValueAt(indexTable, 6).toString());
        //        Psup.setText(mod.getValueAt(indexTable, 7).toString());
        //        Pcat.setText(mod.getValueAt(indexTable, 8).toString());
    }//GEN-LAST:event_tableviewMouseClicked

    private void billareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billareaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_billareaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Pbquan.getText().isEmpty() || Pname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Missing Information");
        } else if (avaQuantity <= Integer.parseInt(Pbquan.getText())) {
            JOptionPane.showMessageDialog(null, "Product is out of stock");
        } else {

            //            i++;
            prodtot = Uprice * Integer.valueOf(Pbquan.getText());
            grandtot = grandtot + prodtot;
            //            if(i==1)
            //            {
            //                billarea.setText(billarea.getText()+"==========================Welcome !!! have a nice day========================\n"+"\t Num   PRODUCT     PRICE   QUANTITY    TOTAL\n\t"+i+"           "+Pname.getText()+"                  "+Uprice+"            "+Pbquan.getText()+"            "+prodtot+"\n");
            //            }
            //            else
            //            {
            //                billarea.setText(billarea.getText()+"\t"+i+"           "+Pname.getText()+"                  "+Uprice+"            "+Pbquan.getText()+"            "+prodtot+"\n");
            //
            //            }

            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) Bbillingadd.getModel();
            model.addRow(new Object[]{
                Pname.getText(),
                Uprice,
                Pbquan.getText(),
                prodtot
            });

            Grandtotals.setText("RS : " + grandtot);
            cl.update(productId, newQuan);
            viewbilling();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int id_cus_order = 0;
        String cus_phone = bcphone.getText();
        String cus_name = bcname.getText();
        double tota = grandtot;
        cl.order_deatils(cus_phone, cus_name, tota);

        ResultSet rs = cl.billingAddOrderId(cus_phone);
        try {
            id_cus_order = rs.getInt("order_detail_id");
        } catch (SQLException ex) {
            Logger.getLogger(BillingPoint.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(id_cus_order);

        Balance();
        bill();
        DefaultTableModel mod = (DefaultTableModel) Bbillingadd.getModel();
        // String cus_phone = bcphone.getText();
        String pro_name;
        double pro_price, pro_tot;
        int pro_quan;

        try {
            Connection con;
            PreparedStatement ps;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_management", "root", "arun@123");

            for (int i = 0; i < Bbillingadd.getRowCount(); i++) {
                pro_name = (String) mod.getValueAt(i, 0);
                pro_price = (double) mod.getValueAt(i, 1);
                pro_quan = Integer.parseInt(mod.getValueAt(i, 2).toString());
                pro_tot = (double) mod.getValueAt(i, 3);

                String query = "insert into billing_details(cus_phone,product_name,product_price,product_quantity,product_total,order_id)values(?,?,?,?,?,?)";
                ps = con.prepareStatement(query);
                ps.setString(1, cus_phone);
                ps.setString(2, pro_name);
                ps.setDouble(3, pro_price);
                ps.setInt(4, pro_quan);
                ps.setDouble(5, pro_tot);
                ps.setInt(6, id_cus_order);
                int res = ps.executeUpdate();

            }
        } catch (Exception e) {

        }

        try {

            // TODO add your handling code here:
            billarea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(BillingPoint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public double pay, res;

   public void Balance() {
    Double total = grandtot;
    String inputText = Bpayed.getText();

    if (inputText.isEmpty()) {
        // Handle the case where the input is empty (e.g., show an error message)
        JOptionPane.showMessageDialog(null, "Please enter a valid payment amount");
        return;
    }

    pay = Double.parseDouble(inputText);
    res = pay - total;
    Brem.setText(String.valueOf(res));
}

    public String Ppname = "", Ppquan = "";
    public double Ppprice, Pptot;

    public void bill() {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) Bbillingadd.getModel();

        billarea.setText(billarea.getText() + "\t\t" + "*************************************\n" + "\t\t");
        billarea.setText(billarea.getText() +          "**THIRUMURUGAN GARMENTS**\n" + "\t\t");
        billarea.setText(billarea.getText() +          "***********MEN'S WEAR***********\n" + "\t\t");
        billarea.setText(billarea.getText() +          "*********(Valka Valamutan)*********\n" + "\t");
        billarea.setText(billarea.getText() +          "          Vengamedu, Pandian Nagar,Uthukuli Rode, Chennimalai\n" + "\t");
        billarea.setText(billarea.getText() +          "          PH:9080790167, 9698878212, 8903709399, 8526919170 \n" + "\t\t");
        billarea.setText(billarea.getText() +          "          GST NO: 33ANSPV3873F1ZF \n" + "\t\t");
        billarea.setText(billarea.getText() +          "***************************************\n");
        billarea.setText(billarea.getText() + "NAME" + "  \t" + "HSN CODE" + "  \t" + "PRICE" + "  \t" + "QUANTITY" + "  \t" + "TOTAL" + "\n");
        
        int i;
        for (i = 0; i < model.getRowCount(); i++) { 
            Ppname = (String) model.getValueAt(i, 0);
            Ppprice = (double) model.getValueAt(i, 1);
            Ppquan = (String) model.getValueAt(i, 2);
            Pptot = (double) model.getValueAt(i, 3);
            billarea.setText(billarea.getText() + Ppname + "  \t" + Ppprice + "  \t" + Ppprice + "  \t" + Ppquan + "  \t" + Pptot + "\n");
        }

        double percentage = 2.5;
        double sgst = (percentage / 100 ) * grandtot;
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedResult = df.format(sgst);
        String cgst = formattedResult;
         // Format the result to two decimal places
        double percentage2 = 5.0;
        double gstCalculation = (percentage2/100)*grandtot;
        DecimalFormat df2 = new DecimalFormat("#.##");
        String formattedResulttot = df2.format(gstCalculation);
        
        
double roundOffValue = Double.parseDouble(formattedResulttot) + grandtot;
        billarea.setText(billarea.getText() + "\n");
        billarea.setText(billarea.getText() + "\t\t" + "***************************************\n" + "\t\t");
        billarea.setText(billarea.getText() + "\t" + "Total Amount = " + grandtot + "\n" + "\t\t");
        billarea.setText(billarea.getText() + "\t" + "cgst         = " + cgst + "\n" + "\t\t");
        billarea.setText(billarea.getText() + "\t" + "sgst         = " + formattedResult + "\n" + "\t\t");
        billarea.setText(billarea.getText() + "\t" + "Round Off    = " + roundOffValue + "\n" + "\t\t");

//        billarea.setText(billarea.getText() + "\t" + "Payed Amount = " + Bpayed.getText() + "\n" + "\t\t");
//        billarea.setText(billarea.getText() + "\t" + "Balance Amount = " + Brem.getText() + "\n" + "\t\t");
    }


    private void EbuttonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EbuttonClearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EbuttonClearMouseClicked

    private void EbuttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EbuttonClearActionPerformed
        // TODO add your handling code here:
        clearText();
        DefaultTableModel model = (DefaultTableModel) Bbillingadd.getModel();
        model.setRowCount(0);
        billarea.setText("");
        grandtot = 0;
        pay = 0;
        res = 0;
        bcphone.setText("");
        bcname.setText("");
        Grandtotals.setText("");
        Bpayed.setText("");
        Brem.setText("");

    }//GEN-LAST:event_EbuttonClearActionPerformed

    private void BbillingaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BbillingaddMouseClicked
        // TODO add your handling code here:
        DefaultTableModel mod = (DefaultTableModel) Bbillingadd.getModel();
        int indexTable = Bbillingadd.getSelectedRow();
        Pname.setText(mod.getValueAt(indexTable, 0).toString());
        bpprice.setText(mod.getValueAt(indexTable, 1).toString());
        Pbquan.setText(mod.getValueAt(indexTable, 2).toString());
        priceDelete = Double.valueOf(mod.getValueAt(indexTable, 3).toString());
    }//GEN-LAST:event_BbillingaddMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//         TODO add your handling code here:
//        Balance();
//        bill();
//        DefaultTableModel mod = (DefaultTableModel) Bbillingadd.getModel();
//        String cus_phone = bcphone.getText();
//        String pro_name;
//        double pro_price,pro_tot;
//        int pro_quan;
//
//        try{
//            Connection con;
//            PreparedStatement ps;
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_management", "root", "arun@123");
//
//            for(int i=0;i<Bbillingadd.getRowCount();i++)
//            {
//                pro_name = (String)mod.getValueAt(i,0);
//                pro_price = (double) mod.getValueAt(i,1);
//                pro_quan = Integer.parseInt(mod.getValueAt(i, 2).toString());
//                pro_tot = (double)mod.getValueAt(i,3);
//
//                String query = "insert into billing_details(cus_phone,product_name,product_price,product_quantity,product_total)values(?,?,?,?,?)";
//                ps = con.prepareStatement(query);
//                ps.setString(1,cus_phone);
//                ps.setString(2,pro_name);
//                ps.setDouble(3,pro_price);
//                ps.setInt(4,pro_quan);
//                ps.setDouble(5,pro_tot);
//
//                int res = ps.executeUpdate();
//
//            }
//        }
//        catch(Exception e)
//        {
//
//        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int proquan=0;
        DefaultTableModel mod = (DefaultTableModel) Bbillingadd.getModel();
        int nn = Bbillingadd.getSelectedRow();
        String indexTableStr = (String) mod.getValueAt(nn, 2); // Corrected line
        String porname = (String)mod.getValueAt(nn, 0);
        int indexTable = Integer.parseInt(indexTableStr); // Convert String to int
           
         try{
            ResultSet rs;
            Connection con;
            PreparedStatement ps;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_management", "root", "arun@123");
            // Use a placeholder in the query and set the parameter value
            ps = con.prepareStatement("SELECT pro_quantity FROM product WHERE pro_name = ?");
            ps.setString(1, porname);
            rs = ps.executeQuery();        
            if (rs.next()) {
            proquan = rs.getInt("pro_quantity");
            System.out.println("Category ID for " + "hhh" + ": " + proquan);
        } else {
            System.out.println("No category found for ");
        }
            
         } catch(Exception e)
           {
           }
        int supTotal =  proquan+indexTable;
        System.out.println(supTotal+"suptotallllllllllllllll");
       
        //--------updating the oroduct quantity
            try {
          Connection con;
            PreparedStatement ps;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_management", "root", "arun@123");
            // Use a placeholder in the query and set the parameter value
            ps = con.prepareStatement("UPDATE product SET pro_quantity = ? WHERE pro_name = ?");
            ps.setInt(1, supTotal);
            ps.setString(2, porname);
            int res = ps.executeUpdate();
            System.out.println("Rows affected: " + res);
        } catch (Exception ex) {
            Logger.getLogger(ConnectionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
//            grandtot = grandtot - priceDelete;
//            Grandtotals.setText("RS : " + grandtot);
            System.out.println(indexTableStr + "%%%%%44444");
      if (nn != -1) {
            // remove selected row from the model
            System.out.println(nn+"nnnnnnnnnnnnnnnn");
            mod.removeRow(nn);
            grandtot = grandtot - priceDelete;
            Grandtotals.setText("RS : " + grandtot);    
            JOptionPane.showMessageDialog(null, "Selected product deleted successfully from table");

        }
        viewbilling();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void BpayedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpayedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BpayedActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new Catogory().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new LoginAdmine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(BillingPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingPoint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Bbillingadd;
    private javax.swing.JTextField Bpayed;
    private javax.swing.JTextField Brem;
    private javax.swing.JButton EbuttonClear;
    private javax.swing.JLabel Grandtotals;
    private javax.swing.JTextField Pbquan;
    private javax.swing.JTextField Pname;
    private javax.swing.JComboBox<String> Poption;
    private javax.swing.JTextField bcname;
    private javax.swing.JTextField bcphone;
    private javax.swing.JTextArea billarea;
    private javax.swing.JTextField bpprice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField pbid;
    private javax.swing.JTable tableview;
    // End of variables declaration//GEN-END:variables
}
