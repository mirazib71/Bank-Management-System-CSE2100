package gui_main_project.pkg1;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import gui_main_project.pkg1.ControlPanel;
import gui_main_project.pkg1.Javaconnect;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ViewWindow extends javax.swing.JFrame {


    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    
    public ViewWindow() {
        initComponents();
        conn=Javaconnect.ConnecrDb();
        //setLabels();
        
    }
    
    public void pdf(){
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("F:\\Bank Management System\\Main project 1\\GUI_Main_project 1\\src\\gui_main_project\\pkg1\\test3.pdf"));
            document.open();
            PdfContentByte contentByte = writer.getDirectContent();
            System.out.println(PageSize.A4.getWidth());
            System.out.println(PageSize.A4.getHeight());
            PdfTemplate template = contentByte.createTemplate(PageSize.A4.getWidth(),PageSize.A4.getHeight() );
            Graphics2D g2 = template.createGraphics(PageSize.A4.getWidth(), PageSize.A4.getWidth());
            g2.scale(.7, 1);
            jPanel1.print(g2);
            g2.dispose();
            contentByte.addTemplate(template,0,250);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document.isOpen()) {
                document.close();
            }
        }
    }
    public ImageIcon ResizeImage(String imagePath, byte[] pic) {
        ImageIcon myImage = null;

        if (imagePath != null) {
            myImage = new ImageIcon(imagePath);
        } else {
            myImage = new ImageIcon(pic);
        }

        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        micr = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        acc_balance = new javax.swing.JLabel();
        cont_no = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        acc_no = new javax.swing.JTextField();
        lbl_close1 = new javax.swing.JLabel();
        Download = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("MY ACCOUNT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 850, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_main_project/pkg1/image/ibankingtotal4.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, -20, -1, 110));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Acoount Name :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Date of Birth :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Account Number:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Account Balance:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Email:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Gender:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_main_project/pkg1/image/noimage_thumbnail.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 240, 220));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("MICR Number:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Address :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Contact No:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address.setToolTipText("");
        address.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        address.setAutoscrolls(true);
        address.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        address.setDoubleBuffered(true);
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 220, 150));

        name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        name.setAutoscrolls(true);
        name.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        name.setDoubleBuffered(true);
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 220, 30));

        micr.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        micr.setAutoscrolls(true);
        micr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        micr.setDoubleBuffered(true);
        jPanel1.add(micr, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 220, 30));

        gender.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        gender.setAutoscrolls(true);
        gender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gender.setDoubleBuffered(true);
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 220, 30));

        dob.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dob.setAutoscrolls(true);
        dob.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dob.setDoubleBuffered(true);
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 220, 30));

        email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email.setAutoscrolls(true);
        email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        email.setDoubleBuffered(true);
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 220, 30));

        acc_balance.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        acc_balance.setForeground(new java.awt.Color(0, 153, 0));
        acc_balance.setAutoscrolls(true);
        acc_balance.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        acc_balance.setDoubleBuffered(true);
        jPanel1.add(acc_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 220, 30));

        cont_no.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cont_no.setAutoscrolls(true);
        cont_no.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cont_no.setDoubleBuffered(true);
        jPanel1.add(cont_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 220, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_main_project/pkg1/image/home16001 (2).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        search.setBackground(new java.awt.Color(0, 153, 51));
        search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 100, 40));

        acc_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acc_no.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        acc_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_noActionPerformed(evt);
            }
        });
        jPanel1.add(acc_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 210, 40));

        lbl_close1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lbl_close1.setForeground(new java.awt.Color(51, 51, 51));
        lbl_close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_close1.setText("X");
        lbl_close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_close1MousePressed(evt);
            }
        });
        jPanel1.add(lbl_close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, -1));

        Download.setBackground(new java.awt.Color(153, 0, 0));
        Download.setForeground(new java.awt.Color(153, 0, 0));
        Download.setText("Download");
        Download.setToolTipText("Path - User//Document");
        Download.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Download.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DownloadMousePressed(evt);
            }
        });
        jPanel1.add(Download, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, 80, -1));
        Download.getAccessibleContext().setAccessibleName("Download");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        ControlPanel cp = new ControlPanel();
        cp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void acc_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acc_noActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        setLabelsViewWindow();
    }//GEN-LAST:event_searchActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed
        int xx , xy ;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void lbl_close1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_close1MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_close1MousePressed

    private void DownloadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DownloadMousePressed
        // TODO add your handling code here:
            
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\User\\Documents\\"+xx+"test3.pdf"));
            document.open();
            PdfContentByte contentByte = writer.getDirectContent();
            System.out.println(PageSize.A4.getWidth());
            System.out.println(PageSize.A4.getHeight());
            PdfTemplate template = contentByte.createTemplate(PageSize.A4.getWidth(),PageSize.A4.getHeight() );
            Graphics2D g2 = template.createGraphics(PageSize.A4.getWidth(), PageSize.A4.getWidth());
            g2.scale(.7, 1);
            jPanel1.print(g2);
            g2.dispose();
            contentByte.addTemplate(template,0,250);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document.isOpen()) {
                document.close();
            }
        }
    
    }//GEN-LAST:event_DownloadMousePressed

    
    public void setLabelsViewWindow(){
        
        String sql="select * from Account_main where acc_no=?";
        
        try {
            
            pst = conn.prepareStatement(sql);
            pst.setString(1, acc_no.getText());
            rs = pst.executeQuery();
            System.out.println("Hi");
            System.out.println("Hi");
            if(rs.next())
            {               
                System.out.println("Hi");
                String add1=rs.getString("name");
                name.setText(add1);                
                String add2 = rs.getString("dob");
                dob.setText(add2);
                String add10 = rs.getString("micr");
                micr.setText(add10);
                System.out.println("Hi");
                jLabel12.setIcon(ResizeImage(null,rs.getBytes("image_id")));
                
                System.out.println("Hi");
                //String add3 = rs.getString("pin");
                //pin.setText(add3);
                
                String add4 = rs.getString("address");
                address.setText(add4);
                
                String add5 = rs.getString("gender");
                gender.setText(add5);
                System.out.println("Hi");
                String add6 = rs.getString("acc_no");
                acc_no.setText(add6);
                System.out.println("Hi");
                String add7 = rs.getString("email");
                email.setText(add7);
                
                String add8 = rs.getString("balance");
                acc_balance.setText(add8);
                
                String add9 = rs.getString("mobile");
                cont_no.setText(add9);
                               
                rs.close();
                pst.close();
                  
            }
            
            else
            {                
                JOptionPane.showMessageDialog(null, "Enter Correct Confedential:");
            }
                 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        
        finally
        {  
            try {
                
                rs.close();
                pst.close();
                
            } catch (Exception e) {
                
            }
                       
        }
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Download;
    private javax.swing.JLabel acc_balance;
    private javax.swing.JTextField acc_no;
    private javax.swing.JLabel address;
    private javax.swing.JLabel cont_no;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_close1;
    private javax.swing.JLabel micr;
    private javax.swing.JLabel name;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
