/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.view;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class FrmShowUsers extends javax.swing.JFrame {

    /**
     * Creates new form FrmShowUsers
     */
    public FrmShowUsers() {
         
        connection();
        initComponents();
        showMongo();
        this.setLocationRelativeTo(null);
    }
    public static MongoClient connection(){
    String cluster;
    MongoClientURI uri;
    MongoClient mongoClient;
    MongoDatabase database; 
    MongoCollection collection;
    DBCursor cursor = null;
    cluster = "mongodb+srv://NullPointers:admin123@finalproyect.6vyqq.mongodb.net/ApplianceStore?retryWrites=true&w=majority";
        uri = new MongoClientURI(cluster);
        mongoClient = new MongoClient(uri);
        database= mongoClient.getDatabase("ApplianceStore");
        collection = database.getCollection("Users");
        return mongoClient;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblViewUsers = new javax.swing.JTable();
        BtnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Usuarios ");

        TblViewUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "N.Telefono", "Correo", "Genero", "Area", "Usuario", "Contrase??a "
            }
        ));
        jScrollPane1.setViewportView(TblViewUsers);

        BtnReturn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnReturn.setText("Regresar");
        BtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(BtnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
        FrmMenu frmMenu = new FrmMenu();
        frmMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnReturnActionPerformed
    private void showMongo(){
        try {
            DBCursor cursor = null;
            MongoClient conection = connection();
            DB db = conection.getDB("ApplianceStore");
            DBCollection collection = db.getCollection("Users");
            cursor = collection.find();
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                ObjectId id = (ObjectId) obj.get("_id");
                String firstName= (String) obj.get("firstName");
                String lastName = (String) obj.get("lastName");
                String phoneNumber = (String) obj.get("phoneNumber");
                String email = (String) obj.get("email");
                String gender = (String) obj.get("gender");
                String area = (String) obj.get("area");
                String username = (String) obj.get("username");
                String password = (String) obj.get("password");
                DefaultTableModel model = (DefaultTableModel) TblViewUsers.getModel();
                model.addRow(new Object[]{id,firstName,lastName,phoneNumber,email,gender,area,username,password});
            }
            cursor.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(FrmShowUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmShowUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmShowUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmShowUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmShowUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReturn;
    private javax.swing.JTable TblViewUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
