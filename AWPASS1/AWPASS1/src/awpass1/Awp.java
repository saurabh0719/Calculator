
package awpass1;

public class Awp extends javax.swing.JFrame {

    int intsum1=0,intsum2=0,intnum1=0,intnum2=0;
    float floatsum1=0,floatsum2=0;
    int dot=0,op1=0,dot1=0;
    public Awp() {
        initComponents();
        jPanel2.setVisible(false);
        text.setText("0");
    }
     public void clrAll()
     {
     intsum1=0;
      intsum2=0;
      intnum1=0;
      intnum2=0;
      floatsum1=0;
      floatsum2=0;
      dot=0;
      dot1=0;
      op1=0;
      text.setText("");
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        text = new java.awt.TextField();
        jPanel2 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        Bdot = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        Beql = new javax.swing.JButton();
        Bsum = new javax.swing.JButton();
        Bsub = new javax.swing.JButton();
        Bmul = new javax.swing.JButton();
        Bdiv = new javax.swing.JButton();
        Bclr = new javax.swing.JButton();
        B00 = new javax.swing.JButton();
        Bmode = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        jLabel3.setText("jLabel3");

        jLabel1.setText("jLabel1");

        jLabel2.setText("2");

        jLabel5.setText("jLabel5");

        jLabel8.setText("jLabel8");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select key", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "00", "+", "-", "*", "/", "%", ".", "=", "CLR" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        text.setMaximumSize(new java.awt.Dimension(240, 50));
        text.setMinimumSize(new java.awt.Dimension(240, 50));
        text.setName(""); // NOI18N
        text.setPreferredSize(new java.awt.Dimension(240, 50));
        text.setText("textField1");
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(81, 79, 79));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(101, 20, 0)));
        jPanel2.setForeground(new java.awt.Color(66, 58, 58));
        jPanel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(210, 210));
        jPanel2.setMinimumSize(new java.awt.Dimension(210, 210));
        jPanel2.setPreferredSize(new java.awt.Dimension(210, 260));

        B1.setText("1");
        B1.setPreferredSize(new java.awt.Dimension(50, 50));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setText("2");
        B2.setMaximumSize(new java.awt.Dimension(50, 50));
        B2.setMinimumSize(new java.awt.Dimension(50, 50));
        B2.setPreferredSize(new java.awt.Dimension(50, 50));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setText("3");
        B3.setMaximumSize(new java.awt.Dimension(50, 50));
        B3.setMinimumSize(new java.awt.Dimension(50, 50));
        B3.setPreferredSize(new java.awt.Dimension(50, 50));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setText("4");
        B4.setMaximumSize(new java.awt.Dimension(50, 50));
        B4.setMinimumSize(new java.awt.Dimension(50, 50));
        B4.setPreferredSize(new java.awt.Dimension(50, 50));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setText("5");
        B5.setMaximumSize(new java.awt.Dimension(50, 50));
        B5.setMinimumSize(new java.awt.Dimension(50, 50));
        B5.setPreferredSize(new java.awt.Dimension(50, 50));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setText("6");
        B6.setPreferredSize(new java.awt.Dimension(50, 50));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setText("7");
        B7.setMaximumSize(new java.awt.Dimension(50, 50));
        B7.setMinimumSize(new java.awt.Dimension(50, 50));
        B7.setPreferredSize(new java.awt.Dimension(50, 50));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setText("8");
        B8.setMaximumSize(new java.awt.Dimension(50, 50));
        B8.setMinimumSize(new java.awt.Dimension(50, 50));
        B8.setPreferredSize(new java.awt.Dimension(50, 50));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setText("9");
        B9.setMaximumSize(new java.awt.Dimension(50, 50));
        B9.setMinimumSize(new java.awt.Dimension(50, 50));
        B9.setPreferredSize(new java.awt.Dimension(50, 50));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        Bdot.setText(".");
        Bdot.setMaximumSize(new java.awt.Dimension(50, 50));
        Bdot.setMinimumSize(new java.awt.Dimension(50, 50));
        Bdot.setPreferredSize(new java.awt.Dimension(50, 50));
        Bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdotActionPerformed(evt);
            }
        });

        B0.setText("0");
        B0.setMaximumSize(new java.awt.Dimension(50, 50));
        B0.setMinimumSize(new java.awt.Dimension(50, 50));
        B0.setPreferredSize(new java.awt.Dimension(50, 50));
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        Beql.setText("=");
        Beql.setMaximumSize(new java.awt.Dimension(50, 50));
        Beql.setMinimumSize(new java.awt.Dimension(50, 50));
        Beql.setPreferredSize(new java.awt.Dimension(50, 50));
        Beql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeqlActionPerformed(evt);
            }
        });

        Bsum.setText("+");
        Bsum.setMaximumSize(new java.awt.Dimension(50, 50));
        Bsum.setMinimumSize(new java.awt.Dimension(50, 50));
        Bsum.setPreferredSize(new java.awt.Dimension(50, 50));
        Bsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsumActionPerformed(evt);
            }
        });

        Bsub.setText("-");
        Bsub.setMaximumSize(new java.awt.Dimension(50, 50));
        Bsub.setMinimumSize(new java.awt.Dimension(50, 50));
        Bsub.setPreferredSize(new java.awt.Dimension(50, 50));
        Bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsubActionPerformed(evt);
            }
        });

        Bmul.setText("*");
        Bmul.setMaximumSize(new java.awt.Dimension(50, 50));
        Bmul.setMinimumSize(new java.awt.Dimension(50, 50));
        Bmul.setPreferredSize(new java.awt.Dimension(50, 50));
        Bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmulActionPerformed(evt);
            }
        });

        Bdiv.setText("/");
        Bdiv.setMaximumSize(new java.awt.Dimension(50, 50));
        Bdiv.setMinimumSize(new java.awt.Dimension(50, 50));
        Bdiv.setPreferredSize(new java.awt.Dimension(50, 50));
        Bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdivActionPerformed(evt);
            }
        });

        Bclr.setText("CLR");
        Bclr.setMaximumSize(new java.awt.Dimension(54, 50));
        Bclr.setMinimumSize(new java.awt.Dimension(54, 50));
        Bclr.setPreferredSize(new java.awt.Dimension(54, 50));
        Bclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BclrActionPerformed(evt);
            }
        });

        B00.setText("00");
        B00.setMaximumSize(new java.awt.Dimension(50, 50));
        B00.setMinimumSize(new java.awt.Dimension(50, 50));
        B00.setPreferredSize(new java.awt.Dimension(50, 50));
        B00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B00ActionPerformed(evt);
            }
        });

        Bmode.setText("%");
        Bmode.setMaximumSize(new java.awt.Dimension(50, 50));
        Bmode.setMinimumSize(new java.awt.Dimension(50, 50));
        Bmode.setPreferredSize(new java.awt.Dimension(50, 50));
        Bmode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Bclr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Bdot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Beql, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bsum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bmul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bmode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bsum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bmul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bdot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Beql, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bclr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bmode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Undo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Add");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Remove");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 556, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)))
                .addContainerGap(324, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       int index =jComboBox1.getSelectedIndex();
                
        switch(index)
        {
            case 1:
                  B1.setVisible(true);
                  break;
            case 2:
                  B2.setVisible(true);
                  break;
            case 3:
                  B3.setVisible(true);
                  break;
            case 4:
                  B4.setVisible(true);
                  break;
            case 5:
                  B5.setVisible(true);
                  break;
            case 6:
                  B6.setVisible(true);
                  break;
            case 7:
                  B7.setVisible(true);
                  break;
            case 8:
                  B8.setVisible(true);
                  break;
            case 9:
                  B9.setVisible(true);
                  break;
            case 10:
                  B0.setVisible(true);
                  break;
            case 11:
                  B00.setVisible(true);
                  break;
            case 12:
                  Bsum.setVisible(true);
                  break;
            case 13:
                  Bsub.setVisible(true);
                  break;
            case 14:
                  Bmul.setVisible(true);
                  break;
            case 15:
                  Bdiv.setVisible(true);
                  break;
            case 16:
                  Bmode.setVisible(true);
                  break;
            case 17:
                  Bdot.setVisible(true);
                  break;
            case 18:
                  Beql.setVisible(true);
                  break;
            case 19:
                  Bclr.setVisible(true);
                  break;       
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

          clrAll();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
         
             if(dot==0)
             {
                 intsum1=intsum1*10+3;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+3;
                 text.setText(""+intsum1+"."+intsum2);
             } // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B00ActionPerformed
          
             if(dot==0)
             {
                 intsum1=intsum1*100;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*100;
                 text.setText(""+intsum1+"."+intsum2);
             }// TODO add your handling code here:
    }//GEN-LAST:event_B00ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      jPanel2.setVisible(true); 
//      B1.setVisible(false); // TODO add your handling code here:
//      B2.setVisible(false);
//      B3.setVisible(false);
//      B4.setVisible(false);
//      B5.setVisible(false);
//      B6.setVisible(false);
//      B7.setVisible(false);
//      B8.setVisible(false);
//      B9.setVisible(false);
//      Bdot.setVisible(false);
//      B0.setVisible(false);
//      Beql.setVisible(false);
//      Bsum.setVisible(false);
//      Bsub.setVisible(false);
//      Bmul.setVisible(false);
//      Bdiv.setVisible(false);
//      Bclr.setVisible(false);
//      B00.setVisible(false);
//      Bmode.setVisible(false);     
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
 
             if(dot==0)
             {
                 intsum1=intsum1*10+1;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+1;
                 text.setText(""+intsum1+"."+intsum2);
             }// TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      B1.setVisible(false); // TODO add your handling code here:
      B2.setVisible(false);
      B3.setVisible(false);
      B4.setVisible(false);
      B5.setVisible(false);
      B6.setVisible(false);
      B7.setVisible(false);
      B8.setVisible(false);
      B9.setVisible(false);
      Bdot.setVisible(false);
      B0.setVisible(false);
      Beql.setVisible(false);
      Bsum.setVisible(false);
      Bsub.setVisible(false);
      Bmul.setVisible(false);
      Bdiv.setVisible(false);
      Bclr.setVisible(false);
      B00.setVisible(false);
      Bmode.setVisible(false);
clrAll();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if(dot==0)
             {
                 intsum1=intsum1*10+2;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+2;
                 text.setText(""+intsum1+"."+intsum2);
             }     // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
          
            if(dot==0)
             {
                 intsum1=intsum1*10+4;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+4;
                 text.setText(""+intsum1+"."+intsum2);
             }       // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        
             if(dot==0)
             {
                 intsum1=intsum1*10+5;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+5;
                 text.setText(""+intsum1+"."+intsum2);
             }     // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
       
             if(dot==0)
             {
                 intsum1=intsum1*10+6;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+6;
                 text.setText(""+intsum1+"."+intsum2);
             }        // TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        
             if(dot==0)
             {
                 intsum1=intsum1*10+7;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+7;
                 text.setText(""+intsum1+"."+intsum2);
             }       // TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
       
            if(dot==0)
             {
                 intsum1=intsum1*10+8;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+8;
                 text.setText(""+intsum1+"."+intsum2);
             }     // TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
         
             if(dot==0)
             {
                 intsum1=intsum1*10+9;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+9;
                 text.setText(""+intsum1+"."+intsum2);
             }      // TODO add your handling code here:
    }//GEN-LAST:event_B9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
         if(dot==0)
             {
                 intsum1=intsum1*10;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10;
                 text.setText(""+intsum1+"."+intsum2);
             }       // TODO add your handling code here:
    }//GEN-LAST:event_B0ActionPerformed

    private void BdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdotActionPerformed
               intnum1=intsum1;
               dot=1;
               dot1=1;
               text.setText(""+intnum1+"."); // TODO add your handling code here:
    }//GEN-LAST:event_BdotActionPerformed

    private void BsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsumActionPerformed
           floatsum1=Float.parseFloat(text.getText());
           op1=1;
           intsum1=0;
           intsum2=0;
           dot=0;
           text.setText("+");// TODO add your handling code here:
    }//GEN-LAST:event_BsumActionPerformed

    private void BsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsubActionPerformed
          floatsum1=Float.parseFloat(text.getText());
//          if(dot!=1){
//           intsum3=(int)floatsum1;
//           }
           op1=2; 
           intsum1=0;
           intsum2=0;
           dot=0;
           text.setText("-");
           // TODO add your handling code here:
    }//GEN-LAST:event_BsubActionPerformed

    private void BmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmulActionPerformed
           floatsum1=Float.parseFloat(text.getText());
//          if(dot!=1){
//           intsum3=(int)floatsum1;
//           }
           op1=3; 
           intsum1=0;
           intsum2=0;
           dot=0;
            text.setText("0");
                   // TODO add your handling code here:
    }//GEN-LAST:event_BmulActionPerformed

    private void BdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdivActionPerformed
            floatsum1=Float.parseFloat(text.getText());
//          if(dot!=1){
//           intsum3=(int)floatsum1;
//           }
           op1=4; 
           intsum1=0;
           intsum2=0;
           dot=0;
           text.setText("0");
                  // TODO add your handling code here:
    }//GEN-LAST:event_BdivActionPerformed

    private void BmodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmodeActionPerformed
             floatsum1=Float.parseFloat(text.getText());
           op1=5; 
           intsum1=0;
           intsum2=0;
           dot=0;
           text.setText("0");
                    // TODO add your handling code here:
    }//GEN-LAST:event_BmodeActionPerformed

    private void BeqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeqlActionPerformed
     switch(op1)
     {
         case 1:
            {
                floatsum2=Float.parseFloat(text.getText());
                floatsum1=floatsum1+floatsum2;
                if(dot1!=1){
                    intnum1=(int)floatsum1;
                     text.setText(""+intnum1);
                }  
                else{
                    text.setText(""+floatsum1);
                }
                intsum1=0;
                intsum2=0;
                dot=0;
                floatsum2=0;
                break;
            }
            case 2:
            {
                floatsum2=Float.parseFloat(text.getText());
                floatsum1=floatsum1-floatsum2;
                if(dot1!=1){
                    intnum1=(int)floatsum1;
                     text.setText(""+intnum1);
                }  
                else{
                    
                    text.setText(""+floatsum1);
                }
                intsum1=0;
                intsum2=0;
                dot=0;
                floatsum2=0;
                break;
            }
            case 3:
            { 
                 floatsum2=Float.parseFloat(text.getText());
                floatsum1=floatsum1*floatsum2;
                if(dot1!=1){
                    intnum1=(int)floatsum1;
                     text.setText(""+intnum1);
                }  
                else{
                    
                    text.setText(""+floatsum1);
                }
                intsum1=0;
                intsum2=0;
                dot=0;
                floatsum2=0;
                break;
            }
            case 4:
            {
                 floatsum2=Float.parseFloat(text.getText());
                 if(floatsum2!=0)
                 {
                    floatsum1=floatsum1/floatsum2;
                    if(floatsum1%1>0)
                    {
                        text.setText(""+floatsum1);
                    }  
                    else{
                            intnum1=(int)floatsum1;
                             text.setText(""+intnum1);  
                    }
                 }
                 else
                    text.setText("invalid");
                 
                 intsum1=0;
                 intsum2=0;
                 dot=0;
                 floatsum2=0;
                 break;
            }
            case 5:
            {
                floatsum2=Float.parseFloat(text.getText());
                if(floatsum2!=0)
                { 
                    if(dot1!=1)
                     {
                        intnum1=(int)floatsum1;
                        intnum2=(int)floatsum2;     
                        intnum1=intnum1%intnum2;
                        text.setText(""+intnum1);
                      }
                     else{ 
                           text.setText("invalid");
                        }
                }
                 else{ 
                        text.setText("invalid");
                      }
                intsum1=0;
                intsum2=0;
                dot=0;
                floatsum2=0;
                break;
            }
     }// TODO add your handling code here:
    }//GEN-LAST:event_BeqlActionPerformed

    private void BclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclrActionPerformed
//      intsum1=0;
//      intsum2=0;
//      intnum1=0;
//      intnum2=0;
//      floatsum1=0;
//      floatsum2=0;
//      dot=0;
//      dot1=0;
//      op1=0;
//      text.setText("");
clrAll();
      // TODO add your handling code here:
    }//GEN-LAST:event_BclrActionPerformed
    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Awp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B00;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton Bclr;
    private javax.swing.JButton Bdiv;
    private javax.swing.JButton Bdot;
    private javax.swing.JButton Beql;
    private javax.swing.JButton Bmode;
    private javax.swing.JButton Bmul;
    private javax.swing.JButton Bsub;
    private javax.swing.JButton Bsum;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private java.awt.TextField text;
    // End of variables declaration//GEN-END:variables

public void callPanel(){

    
}

}

