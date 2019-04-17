
package awpass1;

import java.io.*; 
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Awp extends javax.swing.JFrame {

    String server_text = "";
    
    long  intsum1=0,intsum2=0,intnum1=0,intnum2=0,num;
    float floatsum1=0,floatsum2=0;
    int dot=0,op1=0,dot1=0,count=0,panel=0;
    int eqlclick=0,eqlclick1=0;
    int[] a=new int[19];
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
      num=0;
      dot=0;
      dot1=0;
      op1=0;
      text.setText("");
      text1.setText("");
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
        text = new java.awt.TextField();
        text1 = new javax.swing.JTextField();
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
        setPreferredSize(new java.awt.Dimension(1001, 685));

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select key", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "00", "+", "-", "*", "/", "%", ".", "=", "CLR" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(81, 79, 79));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 20, 0), 1, true));
        jPanel2.setForeground(new java.awt.Color(66, 58, 58));
        jPanel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(210, 210));
        jPanel2.setMinimumSize(new java.awt.Dimension(210, 210));
        jPanel2.setPreferredSize(new java.awt.Dimension(210, 260));
        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

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

        text.setMaximumSize(new java.awt.Dimension(240, 50));
        text.setMinimumSize(new java.awt.Dimension(240, 50));
        text.setName(""); // NOI18N
        text.setText("textField1");
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        text1.setBackground(new java.awt.Color(204, 204, 204));
        text1.setMaximumSize(new java.awt.Dimension(24, 127));
        text1.setMinimumSize(new java.awt.Dimension(24, 127));
        text1.setPreferredSize(new java.awt.Dimension(24, 126));
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
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
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bsum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(B8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Bclr, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bmode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Bdot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(B0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Beql, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bmul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bdiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bsum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bmul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Beql, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bclr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bmode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(4, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 794, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     if(panel==1)
     {
       int index =jComboBox1.getSelectedIndex();
        switch(index)
        {
            case 1:
            {
                B1.setVisible(true);
                break;
            }
            case 2:
            {
                B2.setVisible(true);
                
                break;
            }
            case 3:
            {
                B3.setVisible(true);
                
                break;
            }
            case 4:
            {
                B4.setVisible(true);
                
                break;
            }
            case 5:
            {
                B5.setVisible(true);
                
                break;
            }
            case 6:
            {
                B6.setVisible(true);
                
                break;
            }
            case 7:
            {
                B7.setVisible(true);
                
                break;
            }
            case 8:
            {
                B8.setVisible(true);
                
                break;
            }
            case 9:
            {
                B9.setVisible(true);
                
                break;
            }
            case 10:
            {
                B0.setVisible(true);
                
                break;
            }
            case 11:
            {
                B00.setVisible(true);
                
                break;
            }
            case 12:
            {
                Bsum.setVisible(true);
                
                break;
            }
            case 13:
            {
                Bsub.setVisible(true);
                
                break;
            }
            case 14:
            {
                Bmul.setVisible(true);
                
                break;
            }
            case 15:
            {
                Bdiv.setVisible(true);
                
                break;
            }
            case 16:
            {
                Bmode.setVisible(true);
                
                break;
            }
            case 17:
            {
                Bdot.setVisible(true);
                
                break;
            }
            case 18:
            {
                Beql.setVisible(true);
                
                break;
            }
            case 19:
            {
                Bclr.setVisible(true);
    
                break;
            }
        }
        int i=0,found=0;
        while(i<=count)
        {
            if(a[i]==index)
            found=1;
            i++;
        }
        if(found==0&&index!=0)
        {
            
            count++;
            a[count]=index;
        }
    } 
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
jPanel2.setVisible(false);
          clrAll();
          panel=0;
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
         
        server_text = server_text + "3";
        eqlclick=0;
             if(dot==0)
             {
                 intsum1=intsum1*10+3;
                 text.setText(""+intsum1);
                 //text1.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+3;
                 text.setText(""+intsum1+"."+intsum2);
                 //text1.setText(""+intsum1+"."+intsum2);
             } // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B00ActionPerformed
          eqlclick=0;
             if(dot==0)
             {
                 intsum1=intsum1*100;
                 text.setText(""+intsum1);
                 //text1.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*100;
                 text.setText(""+intsum1+"."+intsum2);
                 //text1.setText(""+intsum1+"."+intsum2);
             }// TODO add your handling code here:
    }//GEN-LAST:event_B00ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      jPanel2.setVisible(true); 
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
      text.setText("0");
      panel=1;
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed

        server_text = server_text + "1";
        
        eqlclick=0;
             if(dot==0)
             {
                 intsum1=intsum1*10+1;
                 text.setText(""+intsum1);
                 //text1.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+1;
                 text.setText(""+intsum1+"."+intsum2);
                 //text1.setText(""+intsum1+"."+intsum2);
             }// TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(panel==1)
    {

        if(count>=0)
        {
        switch(a[count])
        {
            case 1:
            {
                B1.setVisible(false);
       
                break;
            }
            case 2:
            {
                B2.setVisible(false);
               
                break;
            }
            case 3:
            {
                B3.setVisible(false);
                
                break;
            }
            case 4:
            {
                B4.setVisible(false);
                
                break;
            }
            case 5:
            {
                B5.setVisible(false);
                
                break;
            }
            case 6:
            {
                B6.setVisible(false);
                
                break;
            }
            case 7:
            {
                B7.setVisible(false);
               
                break;
            }
            case 8:
            {
                B8.setVisible(false);
               
                break;
            }
            case 9:
            {
                B9.setVisible(false);
               
                break;
            }
            case 10:
            {
                B0.setVisible(false);
               
                break;
            }
            case 11:
            {
                B00.setVisible(false);
               
                break;
            }
            case 12:
            {
                Bsum.setVisible(false);
               
                break;
            }
            case 13:
            {
                Bsub.setVisible(false);
               
                break;
            }
            case 14:
            {
                Bmul.setVisible(false);
               
                break;
            }
            case 15:
            {
                Bdiv.setVisible(false);
               
                break;
            }
            case 16:
            {
                Bmode.setVisible(false);
               
                break;
            }
            case 17:
            {
                Bdot.setVisible(false);
               
                break;
            }
            case 18:
            {
                Beql.setVisible(false);
                
                break;
            }
            case 19:
            {
                Bclr.setVisible(false);
                
                break;
            }
        }
        count--;
     }
    }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        
        server_text = server_text + "2";
        eqlclick=0;
        if(dot==0)
             {
                 intsum1=intsum1*10+2;
                 text.setText(""+intsum1);
                 //text1.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+2;
                 text.setText(""+intsum1+"."+intsum2);
                 //text1.setText(""+intsum1+"."+intsum2);
             }     // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
         
        server_text = server_text + "4";
        eqlclick=0;
            if(dot==0)
             {
                 intsum1=intsum1*10+4;
                 text.setText(""+intsum1);
                 //text1.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+4;
                 text.setText(""+intsum1+"."+intsum2);
                 //text1.setText(""+intsum1+"."+intsum2);
             }       // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        
        server_text = server_text + "5";
        eqlclick=0;
             if(dot==0)
             {
                 intsum1=intsum1*10+5;
                 text.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+5;
                 text.setText(""+intsum1+"."+intsum2);
                // text1.setText(""+intsum1+"."+intsum2);
             }     // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
       
        server_text = server_text + "6";
        eqlclick=0;
             if(dot==0)
             {
                 intsum1=intsum1*10+6;
                 text.setText(""+intsum1);
                 //text1.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+6;
                 text.setText(""+intsum1+"."+intsum2);
             }        // TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        server_text = server_text + "7";
        eqlclick=0;
             if(dot==0)
             {
                 intsum1=intsum1*10+7;
                 text.setText(""+intsum1);
                 //text1.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+7;
                 text.setText(""+intsum1+"."+intsum2);
                 //text1.setText(""+intsum1+"."+intsum2);
             }       // TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
       server_text = server_text + "8";
        eqlclick=0;
            if(dot==0)
             {
                 intsum1=intsum1*10+8;
                 text.setText(""+intsum1);
                 //text1.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+8;
                 text.setText(""+intsum1+"."+intsum2);
                 //text1.setText(""+intsum1+"."+intsum2);
             }     // TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        server_text = server_text + "9"; 
        eqlclick=0;
             if(dot==0)
             {
                 intsum1=intsum1*10+9;
                 text.setText(""+intsum1);
                 //text1.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10+9;
                 text.setText(""+intsum1+"."+intsum2);
                 //text1.setText(""+intsum1+"."+intsum2);
             }      // TODO add your handling code here:
    }//GEN-LAST:event_B9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        server_text = server_text + "0";
        eqlclick=0; 
        if(dot==0)
             {
                 intsum1=intsum1*10;
                 text.setText(""+intsum1);
                 //text1.setText(""+intsum1);
             }
             else if(dot==1)
             {
                 intsum2=intsum2*10;
                 text.setText(""+intsum1+"."+intsum2);
                 //text1.setText(""+intsum1+"."+intsum2);
             }       // TODO add your handling code here:
    }//GEN-LAST:event_B0ActionPerformed

    private void BdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdotActionPerformed
        server_text = server_text + ".";       
        intnum1=intsum1;
               dot=1;
               dot1=1;
               text.setText(""+intnum1+".");
               //text1.setText(""+intsum1+".");// TODO add your handling code here:
    }//GEN-LAST:event_BdotActionPerformed

    public void opration(String str)
    {
       
        String str1="";
        if(eqlclick1!=1)
        if(op1>0)
           {
            str1=text.getText();
            result();
           }
        eqlclick1=0;
           floatsum1=Float.parseFloat(text.getText());
           if(dot1!=1){
           num=(long)floatsum1;
           text.setText(""+num);
           if(op1==0)
            text1.setText(""+num+str);
           else
           {
                String str2=text1.getText();
                text1.setText(""+str2+""+str1+str);     
           }
           }
           else
           {
            text.setText(""+floatsum1);
            if(op1==0)
                text1.setText(""+floatsum1+str);

            else
            {
                 String str2=text1.getText();
                 text1.setText(""+str2+""+str1+str);
            }
           }
           intsum1=0;
           intsum2=0;
           dot=0;
    }
    private void BsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsumActionPerformed
//        String str1="";
//        if(eqlclick1!=1)
//        if(op1>0)
//           {
//            str1=text.getText();
//            result();
//           }
//        eqlclick1=0;
//           floatsum1=Float.parseFloat(text.getText());
//           if(dot1!=1){
//           num=(long)floatsum1;
//           text.setText(""+num);
//           if(op1==0)
//            text1.setText(""+num+"+");
//           else
//           {
//                String str2=text1.getText();
//                text1.setText(""+str2+""+str1+"+");     
//           }
//           }
//           else
//           {
//            text.setText(""+floatsum1);
//            if(op1==0)
//                text1.setText(""+floatsum1+"+");
//
//            else
//            {
//                 String str2=text1.getText();
//                 text1.setText(""+str2+""+str1+"+");
//            }
//           }
//           intsum1=0;
//           intsum2=0;
//         dot=0;
op1=1;
opration("+");
server_text = server_text + "+";
           // TODO add your handling code here:
    }//GEN-LAST:event_BsumActionPerformed

    private void BsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsubActionPerformed
        
//       String str1="";
//       if(eqlclick1!=1)
//        if(op1>0)
//           {
//            str1=text.getText();
//           result();
//           }
//           eqlclick1=0;
//           floatsum1=Float.parseFloat(text.getText());
//           if(dot1!=1)
//           {
//                num=(long)floatsum1;
//                text.setText(""+num);
//                if(op1==0)
//                    text1.setText(""+num+"-");
//                else
//                {
//
//                     String str2=text1.getText();
//                     text1.setText(""+str2+""+str1+"-");     
//                }
//           }
//           else
//           {
//            text.setText(""+floatsum1);
//            if(op1==0)
//                text1.setText(""+floatsum1+"-");
//
//            else
//            {
//                 String str2=text1.getText();
//                 text1.setText(""+str2+""+str1+"-");
//            }
//           }
         //  op1=2; 
//           intsum1=0;
//           intsum2=0;
//           dot=0;
           // TODO add your handling code here:
           op1=2;
opration("-");
server_text = server_text + "-";
    }//GEN-LAST:event_BsubActionPerformed

    private void BmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmulActionPerformed
//        String str1=null;
//       if(eqlclick1!=1)
//        if(op1>0)
//           {
//            str1=text.getText();
//            result();
//           }
//          eqlclick1=0;
//           floatsum1=Float.parseFloat(text.getText());
//           if(dot1!=1){
//           num=(long)floatsum1;
//           text.setText(""+num);
//           if(op1==0)
//            text1.setText(""+num+"*");
//           else
//           {
//                String str2=text1.getText();
//                text1.setText(""+str2+""+str1+"*");     
//           }
//           }
//           else
//           {
//            text.setText(""+floatsum1);
//            if(op1==0)
//                text1.setText(""+floatsum1+"*");
//
//            else
//            {
//                 String str2=text1.getText();
//                 text1.setText(""+str2+""+str1+"*");
//            }
//           }
//           op1=3; 
//           intsum1=0;
//           intsum2=0;
//           dot=0;
           op1=3;
opration("*");
server_text = server_text + "*";
                   // TODO add your handling code here:
    }//GEN-LAST:event_BmulActionPerformed

    private void BdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdivActionPerformed
//          String str1=null;
//          if(eqlclick1!=1)
//          if(op1>0)
//           { 
//            str1=text.getText();
//            result();
//           }
//          eqlclick1=0;
//           floatsum1=Float.parseFloat(text.getText());
//           if(dot1!=1){
//           num=(long)floatsum1;
//           text.setText(""+num);
//           if(op1==0)
//            text1.setText(""+num+"/");
//           else
//           {
//                String str2=text1.getText();
//                text1.setText(""+str2+""+str1+"/");     
//           }
//           }
//           else
//           {
//            text.setText(""+floatsum1);
//            if(op1==0)
//                text1.setText(""+floatsum1+"/");
//
//            else
//            {
//                
//                 String str2=text1.getText();
//                 text1.setText(""+str2+""+str1+"/");
//            }
//           }
//           op1=4; 
//           intsum1=0;
//           intsum2=0;
//           dot=0;
           op1=4;
opration("/");
server_text = server_text + "/";
                  // TODO add your handling code here:
    }//GEN-LAST:event_BdivActionPerformed

    private void BmodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmodeActionPerformed
        server_text = server_text + "%";  
        String str1=null;
           if(eqlclick1!=1)
        if(op1>0)
           {
            str1=text.getText();
           result();
           }
           eqlclick1=0;
           floatsum1=Float.parseFloat(text.getText());
           if(dot1!=1)
           {
                num=(long)floatsum1;
                text.setText(""+num);
                if(op1==0)
                     text1.setText(""+num+"%");
                else
                {
                     String str2=text1.getText();
                     text1.setText(""+str2+""+str1+"%");     
                }
           }
           else
           {
            text1.setText("invalide");
           }
           op1=5; 
           intsum1=0;
           intsum2=0;
           dot=0;
                    // TODO add your handling code here:
    }//GEN-LAST:event_BmodeActionPerformed

    private void BeqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeqlActionPerformed
    
        server_text = server_text + "=";
        
        if(eqlclick!=1){
            //eqlclick=1;
        switch(op1)
        {
         case 1:
            {
                floatsum2=Float.parseFloat(text.getText());
                floatsum1=floatsum1+floatsum2;
                if(dot1!=1){
                    intnum1=(long)floatsum1;
                     text.setText(""+intnum1);
                }  
                else{
                    text.setText(""+floatsum1);
                }
             
                break;
            }
            case 2:
            {
                floatsum2=Float.parseFloat(text.getText());
                floatsum1=floatsum1-floatsum2;
                if(dot1!=1){
                    intnum1=(long)floatsum1;
                     text.setText(""+intnum1);
                }  
                else{
                    
                    text.setText(""+floatsum1);
                }
                break;
            }
            case 3:
            { 
                 floatsum2=Float.parseFloat(text.getText());
                floatsum1=floatsum1*floatsum2;
                if(dot1!=1){
                    intnum1=(long)floatsum1;
                     text.setText(""+intnum1);
                }  
                else{
                    
                    text.setText(""+floatsum1);
                   }
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
                            intnum1=(long)floatsum1;
                             text.setText(""+intnum1); 
                    }
                 }
                 else
                 {
                    text.setText("invalid");
                 }
                 
                  break;
            }
            case 5:
            {
                floatsum2=Float.parseFloat(text.getText());
                if(floatsum2!=0)
                { 
                    if(dot1!=1)
                     {
                        intnum1=(long)floatsum1;
                        intnum2=(long)floatsum2;     
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
                
                break;
            }
     }
                text1.setText(""+intnum1);
                intsum1=0;
                intsum2=0;
                dot=0;
               // floatsum2=0;
               
     }// TODO add your handling code here:
        else
        {
           text1.setText(""+intnum1); 
        }
        eqlclick1=1;
    }//GEN-LAST:event_BeqlActionPerformed

    private void BclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclrActionPerformed
        clrAll();
      // TODO add your handling code here:
    }//GEN-LAST:event_BclrActionPerformed

    private void jPanel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2AncestorAdded

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed
    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Awp().setVisible(true);
                try {
                    Socket s = new Socket("127.0.0.1", 5056);
                    
                    // obtaining input and out streams
                    DataInputStream dis = new DataInputStream(s.getInputStream()); 
                    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                } catch (IOException ex) {
                    Logger.getLogger(Awp.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JTextField text1;
    // End of variables declaration//GEN-END:variables
public void result(){
    
    String final_server_result = "";
eqlclick=1;
 if(op1>0){
        switch(op1)
     {
         case 1:
            {
                floatsum2=Float.parseFloat(text.getText());
                floatsum1=floatsum1+floatsum2;
                if(dot1!=1){
                    intnum1=(long)floatsum1;
                     text.setText(""+intnum1);
                     final_server_result = Long.toString(intnum1);
                }  
                else{
                    text.setText(""+floatsum1);
                    final_server_result = Float.toString(floatsum1);
                }
             
                break;
            }
            case 2:
            {
                floatsum2=Float.parseFloat(text.getText());
                floatsum1=floatsum1-floatsum2;
                if(dot1!=1){
                    intnum1=(long)floatsum1;
                     text.setText(""+intnum1);
                     final_server_result = Long.toString(intnum1);
                }  
                else{
                    
                    text.setText(""+floatsum1);
                    final_server_result = Float.toString(floatsum1);
                }
                break;
            }
            case 3:
            { 
                String str1=text.getText();
                String str2=text1.getText();
                text1.setText(""+str2+""+str1+"*");
                 floatsum2=Float.parseFloat(text.getText());
                floatsum1=floatsum1*floatsum2;
                if(dot1!=1){
                    intnum1=(long)floatsum1;
                     text.setText(""+intnum1);
                     final_server_result = Long.toString(intnum1);
                }  
                else{
                    
                    text.setText(""+floatsum1);
                    final_server_result = Float.toString(floatsum1);
                }
                break;
            }
            case 4:
            {
                String str1=text.getText();
                String str2=text1.getText();
                text1.setText(""+str2+""+str1+"+");
                 floatsum2=Float.parseFloat(text.getText());
                 if(floatsum2!=0)
                 {
                    floatsum1=floatsum1/floatsum2;
                    if(floatsum1%1>0)
                    {
                        text.setText(""+floatsum1);
                        final_server_result = Float.toString(floatsum1);
                    }  
                    else{
                            intnum1=(long)floatsum1;
                             text.setText(""+intnum1);
                             final_server_result = Long.toString(intnum1);
                    }
                 }
                 else
                 {
                    text.setText("invalid");
                    server_text = "Invalid calculation";\
                 }
                 
                  break;
            }
            case 5:
            {
                String str1=text.getText();
                String str2=text1.getText();
                text1.setText(""+str2+""+str1+"+");
                floatsum2=Float.parseFloat(text.getText());
                if(floatsum2!=0)
                { 
                    if(dot1!=1)
                     {
                        intnum1=(long)floatsum1;
                        intnum2=(long)floatsum2;     
                        intnum1=intnum1%intnum2;
                        text.setText(""+intnum1);
                        final_server_result = Long.toString(intnum1);
                      }
                     else{ 
                           text.setText("invalid");
                           server_text = "Invalid calculation";
                        }
                }
                 else{ 
                        text.setText("invalid");
                        server_text = "Invalid calculation";
                      }
                
                break;
            }
     }
                intsum1=0;
                intsum2=0;
                dot=0;
                floatsum2=0;
                
               // text1.setText("");
     }
}

}

