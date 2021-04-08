
package alapmuveletekgyakorlasa;

public class Muveletek extends javax.swing.JFrame {
    
    int ertek = 0;
    
    public Muveletek() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnUjFeladat = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        pnlGyakorlas = new javax.swing.JPanel();
        btnEllenorzes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEredmeny = new javax.swing.JTextPane();
        lblValasz = new javax.swing.JLabel();
        lblMuvelet = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsztasKerdes = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivnasProba = new javax.swing.JLabel();
        lblOsszKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuMegnyit = new javax.swing.JMenuItem();
        mnuMent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuKilep = new javax.swing.JMenuItem();
        mnuMuveletek = new javax.swing.JMenu();
        mnuOsszeadas = new javax.swing.JRadioButtonMenuItem();
        mnuKivonas = new javax.swing.JRadioButtonMenuItem();
        mnuOsztas = new javax.swing.JRadioButtonMenuItem();
        mnuSzorzas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapművelet gyakorlas");

        btnUjFeladat.setText("Új feladat");
        btnUjFeladat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjFeladatActionPerformed(evt);
            }
        });

        btnMegoldas.setText("Megoldás");
        btnMegoldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegoldasActionPerformed(evt);
            }
        });

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlas"));

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtEredmeny);

        lblValasz.setText("15 nem jó!");

        lblMuvelet.setText("5 + 12 =");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValasz)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblMuvelet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEllenorzes)))
                .addContainerGap())
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEllenorzes)
                    .addComponent(lblMuvelet))
                .addGap(15, 15, 15)
                .addComponent(lblValasz)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));
        jPanel2.setToolTipText("");

        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsztasKerdes.setText("Osztás: 0");

        lblOsztasProba.setText("Osztás: 0");

        lblEredmeny.setText("Eredmény: 0 %");

        lblOsszProba.setText("Össz Probálkozások száma: 1");

        lblSzorzasProba.setText("Szorzás: 0");

        lblOsszeadKerdes.setText("Összeadás: 1");

        lblOsszeadProba.setText("Összeadás: 1");

        lblKivnasProba.setText("Kivonás: 0");

        lblOsszKerdes.setText("Össz kérdések száma: 1");

        lblKivonasKerdes.setText("Kivonás: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEredmeny)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadKerdes)
                            .addComponent(lblOsszKerdes)
                            .addComponent(lblKivonasKerdes)
                            .addComponent(lblOsztasKerdes)
                            .addComponent(lblSzorzasKerdes))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszProba)
                            .addComponent(lblSzorzasProba)
                            .addComponent(lblOsztasProba)
                            .addComponent(lblKivnasProba)
                            .addComponent(lblOsszeadProba))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lblOsszProba))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblOsszeadKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasKerdes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivnasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasProba)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblEredmeny)
                .addContainerGap())
        );

        mnuFajl.setText("Fájl");

        mnuMegnyit.setText("Megnyit");
        mnuFajl.add(mnuMegnyit);

        mnuMent.setText("Ment");
        mnuFajl.add(mnuMent);
        mnuFajl.add(jSeparator1);

        mnuKilep.setText("Kilép");
        mnuFajl.add(mnuKilep);

        jMenuBar1.add(mnuFajl);

        mnuMuveletek.setText("Műveletek");

        buttonGroup1.add(mnuOsszeadas);
        mnuOsszeadas.setText("Összeadás");
        mnuMuveletek.add(mnuOsszeadas);

        buttonGroup1.add(mnuKivonas);
        mnuKivonas.setText("Kivonás");
        mnuMuveletek.add(mnuKivonas);

        buttonGroup1.add(mnuOsztas);
        mnuOsztas.setText("Osztás");
        mnuOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOsztasActionPerformed(evt);
            }
        });
        mnuMuveletek.add(mnuOsztas);

        buttonGroup1.add(mnuSzorzas);
        mnuSzorzas.setText("Szorzás");
        mnuMuveletek.add(mnuSzorzas);

        jMenuBar1.add(mnuMuveletek);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMegoldas)
                            .addComponent(btnUjFeladat))
                        .addGap(57, 57, 57)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUjFeladat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOsztasActionPerformed
        lblMuvelet.setText("10 / 2 =");
        lblOsztasKerdes.setText("Osztas: " + (ertek+1));
    }//GEN-LAST:event_mnuOsztasActionPerformed

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
        //int szam = Integer.parseInt(txtEredmeny.getText());
        
        if (txtEredmeny.getText().equals("")){
            lblValasz.setText("Nincs érték!");
        } else if (!"5".equals(txtEredmeny.getText())){
            lblValasz.setText("Rossz válasz!");
            txtEredmeny.setText("");
        } else {
            lblValasz.setText("Jó válasz!");
            btnEllenorzes.setEnabled(false);
        }
        
        lblOsztasProba.setText("Osztas: " + (ertek+1));
    }//GEN-LAST:event_btnEllenorzesActionPerformed

    private void btnUjFeladatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjFeladatActionPerformed
        lblMuvelet.setText("10 / 5 =");
        btnEllenorzes.setEnabled(true);
    }//GEN-LAST:event_btnUjFeladatActionPerformed

    private void btnMegoldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegoldasActionPerformed
        
    }//GEN-LAST:event_btnMegoldasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUjFeladat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblKivnasProba;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblMuvelet;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszProba;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenuItem mnuKilep;
    private javax.swing.JRadioButtonMenuItem mnuKivonas;
    private javax.swing.JMenuItem mnuMegnyit;
    private javax.swing.JMenuItem mnuMent;
    private javax.swing.JMenu mnuMuveletek;
    private javax.swing.JRadioButtonMenuItem mnuOsszeadas;
    private javax.swing.JRadioButtonMenuItem mnuOsztas;
    private javax.swing.JRadioButtonMenuItem mnuSzorzas;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JTextPane txtEredmeny;
    // End of variables declaration//GEN-END:variables
}
