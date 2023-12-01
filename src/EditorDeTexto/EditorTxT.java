package EditorDeTexto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class EditorTxT extends javax.swing.JFrame {
    

    JToolBar menuherramientas = new JToolBar();
    JMenuBar barra = new JMenuBar();
    String fuente = "Arial";
    int size=12;
    int estado = Font.PLAIN;
    Color color = new Color(0,0,0);
    
    public EditorTxT() {
        initComponents();
        setLocationRelativeTo(null);
        AbrirArchivoBtn();
        AceptarBtn();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Fuente = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        AzulBtn = new javax.swing.JButton();
        RojoBtn = new javax.swing.JButton();
        VerdeBtn = new javax.swing.JButton();
        AmarilloBtn = new javax.swing.JButton();
        MoradoBtn = new javax.swing.JButton();
        CafeBtn = new javax.swing.JButton();
        AnaranjadoBtn = new javax.swing.JButton();
        NegroBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NegrillaBtn = new javax.swing.JButton();
        ItalicaBtn = new javax.swing.JButton();
        AceptarBtn = new javax.swing.JButton();
        CancelarBtn = new javax.swing.JButton();
        Abrir = new javax.swing.JButton();
        Size = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextPane = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Times New Roman", "Calibri", "Arial", "Comic Sans", "Segoe UI", "Magneto" }));
        Fuente.setSelectedIndex(2);
        Fuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FuenteItemStateChanged(evt);
            }
        });
        jPanel1.add(Fuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 180, -1));

        jPanel2.setLayout(new java.awt.GridLayout(2, 4));

        AzulBtn.setBackground(new java.awt.Color(0, 0, 255));
        AzulBtn.setForeground(new java.awt.Color(0, 0, 255));
        AzulBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AzulBtn);

        RojoBtn.setBackground(new java.awt.Color(255, 0, 51));
        RojoBtn.setForeground(new java.awt.Color(255, 0, 51));
        RojoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RojoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(RojoBtn);

        VerdeBtn.setBackground(new java.awt.Color(0, 153, 0));
        VerdeBtn.setForeground(new java.awt.Color(0, 153, 0));
        VerdeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdeBtnActionPerformed(evt);
            }
        });
        jPanel2.add(VerdeBtn);

        AmarilloBtn.setBackground(new java.awt.Color(255, 255, 0));
        AmarilloBtn.setForeground(new java.awt.Color(255, 255, 0));
        AmarilloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmarilloBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AmarilloBtn);

        MoradoBtn.setBackground(new java.awt.Color(153, 0, 153));
        MoradoBtn.setForeground(new java.awt.Color(153, 0, 153));
        MoradoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoradoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(MoradoBtn);

        CafeBtn.setBackground(new java.awt.Color(153, 51, 0));
        CafeBtn.setForeground(new java.awt.Color(153, 51, 0));
        CafeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CafeBtnActionPerformed(evt);
            }
        });
        jPanel2.add(CafeBtn);

        AnaranjadoBtn.setBackground(new java.awt.Color(255, 102, 0));
        AnaranjadoBtn.setForeground(new java.awt.Color(255, 102, 0));
        AnaranjadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnaranjadoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AnaranjadoBtn);

        NegroBtn.setBackground(new java.awt.Color(0, 0, 0));
        NegroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegroBtnActionPerformed(evt);
            }
        });
        jPanel2.add(NegroBtn);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 240, 90));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fuente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tamaño");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        NegrillaBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NegrillaBtn.setText("B");
        NegrillaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegrillaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(NegrillaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 50, 30));

        ItalicaBtn.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        ItalicaBtn.setText("I");
        ItalicaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalicaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ItalicaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 40, 30));

        AceptarBtn.setBackground(new java.awt.Color(0, 153, 204));
        AceptarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AceptarBtn.setForeground(new java.awt.Color(255, 255, 255));
        AceptarBtn.setText("Guardar");
        jPanel1.add(AceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        CancelarBtn.setBackground(new java.awt.Color(0, 153, 204));
        CancelarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CancelarBtn.setForeground(new java.awt.Color(255, 255, 255));
        CancelarBtn.setText("Cancelar");
        CancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        Abrir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Abrir.setText("≡");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        jPanel1.add(Abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 30));

        Size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "8", "12", "16", "24", "28", "32", "36", "40", "48", "60", "72", "80", "82", "100" }));
        Size.setSelectedIndex(2);
        Size.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SizeItemStateChanged(evt);
            }
        });
        jPanel1.add(Size, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 180, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jScrollPane3.setViewportView(TextPane);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 470));
        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));
        jPanel1.add(jTextPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
   
    }//GEN-LAST:event_AbrirActionPerformed

    private void FuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FuenteItemStateChanged
        EscogerFuente();
    }//GEN-LAST:event_FuenteItemStateChanged

    private void SizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SizeItemStateChanged
        EscogerSize();
    }//GEN-LAST:event_SizeItemStateChanged

    private void NegrillaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegrillaBtnActionPerformed
        setNegrilla();
    }//GEN-LAST:event_NegrillaBtnActionPerformed

    private void ItalicaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItalicaBtnActionPerformed
        setItalica();
    }//GEN-LAST:event_ItalicaBtnActionPerformed

    private void AzulBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulBtnActionPerformed
         String text=TextPane.getSelectedText();
        if(text!=null && !text.isBlank()){
            
        replaceColor(text,new Color(0,0,255));
        }else{
            JOptionPane.showMessageDialog(this,"Por favor seleccione algo");
        }
        
        color = new Color(0,0,255);
        
    }//GEN-LAST:event_AzulBtnActionPerformed

    private void RojoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RojoBtnActionPerformed
         String text=TextPane.getSelectedText();
        if(text!=null && !text.isBlank()){
            
        replaceColor(text,new Color(255,0,51));
        }else{
            JOptionPane.showMessageDialog(this,"Por favor seleccione algo");
        }
        
        color = new Color(255,0,51);
    }//GEN-LAST:event_RojoBtnActionPerformed

    private void VerdeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdeBtnActionPerformed
        String text=TextPane.getSelectedText();
        if(text!=null && !text.isBlank()){
            
        replaceColor(text,new Color(0,153,0));
        }else{
            JOptionPane.showMessageDialog(this,"Por favor seleccione algo");
        }
        
        color = new Color(0,153,0);
    }//GEN-LAST:event_VerdeBtnActionPerformed

    private void AmarilloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmarilloBtnActionPerformed
        String text=TextPane.getSelectedText();
        if(text!=null && !text.isBlank()){
            
        replaceColor(text,new Color(255,255,0));
        }else{
            JOptionPane.showMessageDialog(this,"Por favor seleccione algo");
        }
        
        color = new Color(255,255,0);
    }//GEN-LAST:event_AmarilloBtnActionPerformed

    private void MoradoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoradoBtnActionPerformed
        String text=TextPane.getSelectedText();
        if(text!=null && !text.isBlank()){
            
        replaceColor(text,new Color(153,0,153));
        }else{
            JOptionPane.showMessageDialog(this,"Por favor seleccione algo");
        }
        
        color = new Color(153,0,153);
    }//GEN-LAST:event_MoradoBtnActionPerformed

    private void CafeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CafeBtnActionPerformed
        String text=TextPane.getSelectedText();
        if(text!=null && !text.isBlank()){
            
        replaceColor(text,new Color(153,51,0));
        }else{
            JOptionPane.showMessageDialog(this,"Por favor seleccione algo");
        }
        
        color = new Color(153,51,0);
    }//GEN-LAST:event_CafeBtnActionPerformed

    private void AnaranjadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnaranjadoBtnActionPerformed
        String text=TextPane.getSelectedText();
        if(text!=null && !text.isBlank()){
            
        replaceColor(text,new Color(255,102,0));
        }else{
            JOptionPane.showMessageDialog(this,"Por favor seleccione algo");
        }
        
        color = new Color(255,102,0);
    }//GEN-LAST:event_AnaranjadoBtnActionPerformed

    private void NegroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegroBtnActionPerformed
        String text=TextPane.getSelectedText();
        if(text!=null && !text.isBlank()){
            
        replaceColor(text,new Color(0,0,0));
        }else{
            JOptionPane.showMessageDialog(this,"Por favor seleccione algo");
        }
        
        color = new Color(0,0,0);
    }//GEN-LAST:event_NegroBtnActionPerformed

    private void CancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelarBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorTxT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir;
    private javax.swing.JButton AceptarBtn;
    private javax.swing.JButton AmarilloBtn;
    private javax.swing.JButton AnaranjadoBtn;
    private javax.swing.JButton AzulBtn;
    private javax.swing.JButton CafeBtn;
    private javax.swing.JButton CancelarBtn;
    private javax.swing.JComboBox<String> Fuente;
    private javax.swing.JButton ItalicaBtn;
    private javax.swing.JButton MoradoBtn;
    private javax.swing.JButton NegrillaBtn;
    private javax.swing.JButton NegroBtn;
    private javax.swing.JButton RojoBtn;
    private javax.swing.JComboBox<String> Size;
    private javax.swing.JTextPane TextPane;
    private javax.swing.JButton VerdeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    public void EscogerFuente(){
        String fuentetxt = String.valueOf(Fuente.getSelectedItem());
       
        String text= TextPane.getSelectedText();
        replaceFont(text,fuentetxt);
        
    }
    
    public void EscogerSize(){
        int size = Integer.valueOf(String.valueOf(Size.getSelectedItem()));
        this.size=size;
        String text= TextPane.getSelectedText();
        changeSize(text,size);
    }
    
    public void setNegrilla(){
       int estado;
       String text= TextPane.getSelectedText();
       
       tipodeFuente(text,"negrita");
            }
    
    public void setItalica(){
        int estado;
        String text= TextPane.getSelectedText();
       
       tipodeFuente(text,"italic");
    }
    
    public void AbrirArchivoBtn(){
    Abrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser elector = new JFileChooser();
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
                
                elector.setFileFilter(filtro);
                
                int eleccion = elector.showOpenDialog(barra);
                if (eleccion==elector.APPROVE_OPTION) {
                    File fichero = elector.getSelectedFile();
                    
                    try (FileReader arch=new FileReader(fichero)) {
                        String cadena ="";
                        int valor=arch.read();
                        while(valor !=-1) {
                            cadena = cadena+(char) valor;
                            valor = arch.read();
                        }
                        TextPane.setText(cadena);
                        arch.close();
                    } catch(IOException ex) {
                        System.out.println("no file");
                    }
                }
            };
        });
    }
    
    public void AceptarBtn(){
        AceptarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser selector2 = new JFileChooser();
                int seleccion2 = selector2.showSaveDialog(menuherramientas);

                if (seleccion2 == JFileChooser.APPROVE_OPTION) {
                    File fichero2 = selector2.getSelectedFile();
                    if (fichero2.exists()) {
                        int abrir = JOptionPane.showConfirmDialog(null, "El archivo ya existe. ¿Desea sobrescribirlo?");
                        if (abrir != 0) {
                            return;
                        }
                    } else {
                        File dir = fichero2.getParentFile();
                        dir.mkdirs();
                        try {
                            fichero2.createNewFile();
                        } catch (IOException ex) {
                            System.out.println("No se pudo crear el archivo.");
                            
                        }
                    }
                    try {
                        FileWriter escritor = new FileWriter(fichero2);
                        String texto2 = TextPane.getText();
                        String lineas[] = texto2.split("\n");
                        for (String linea : lineas) {
                            escritor.write(linea + "\n");
                        }
                        escritor.close();
                    } catch (IOException ex) {
                        System.out.println("No se pudo realizar esta acción.");
                    }
                }
            }
        });
    }

 private void replaceColor(String replacementText, Color textColor) {
          
        StyledDocument doc = TextPane.getStyledDocument();
        int selectionStart = TextPane.getSelectionStart();
        int selectionEnd = TextPane.getSelectionEnd();

        if (selectionStart != selectionEnd) {
           Element element = doc.getCharacterElement(selectionStart);
            AttributeSet existingAttributes = element.getAttributes();
            
            SimpleAttributeSet attributes = new SimpleAttributeSet();
            if(existingAttributes!=null){
            int size=StyleConstants.getFontSize(existingAttributes);
            StyleConstants.setFontSize(attributes, size);}
            StyleConstants.setForeground(attributes, textColor);

            try {
                doc.remove(selectionStart, selectionEnd - selectionStart);
                doc.insertString(selectionStart, replacementText, attributes);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }
 }
private void replaceFont(String text,String font){
    StyledDocument doc = TextPane.getStyledDocument();
        int selectionStart = TextPane.getSelectionStart();
        int selectionEnd = TextPane.getSelectionEnd();

        if (selectionStart != selectionEnd) {
            Element element = doc.getCharacterElement(selectionStart);
            AttributeSet existingAttributes = element.getAttributes();
            
            SimpleAttributeSet attributes = new SimpleAttributeSet();
            if(existingAttributes!=null){
            int size=StyleConstants.getFontSize(existingAttributes);
            StyleConstants.setFontSize(attributes, size);}
            StyleConstants.setFontFamily(attributes, font);
            if(existingAttributes!=null){
                
            }

            try {
                doc.remove(selectionStart, selectionEnd - selectionStart);
                doc.insertString(selectionStart, text, attributes);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }
}
private void changeSize(String text,int size){
    StyledDocument doc = TextPane.getStyledDocument();
        int selectionStart = TextPane.getSelectionStart();
        int selectionEnd = TextPane.getSelectionEnd();

        if (selectionStart != selectionEnd) {
            
             
            SimpleAttributeSet attributes = new SimpleAttributeSet();
            StyleConstants.setFontSize(attributes, size);
           

            try {
                doc.remove(selectionStart, selectionEnd - selectionStart);
                doc.insertString(selectionStart, text, attributes);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }
}
private void tipodeFuente(String text, String type){
     StyledDocument doc = TextPane.getStyledDocument();
        int selectionStart = TextPane.getSelectionStart();
        int selectionEnd = TextPane.getSelectionEnd();

        if (selectionStart != selectionEnd) {
            Element element = doc.getCharacterElement(selectionStart);
            AttributeSet existingAttributes = element.getAttributes();
            
            SimpleAttributeSet attributes = new SimpleAttributeSet();
            if(existingAttributes!=null){
            int size=StyleConstants.getFontSize(existingAttributes);
            StyleConstants.setFontSize(attributes, size);}
            
            if(type.equals("negrita")){
                boolean isBold = StyleConstants.isBold(existingAttributes);
            StyleConstants.setBold(attributes, !isBold);
                
        }
            else if(type.equals("italic")){
                
                 boolean isItalic = StyleConstants.isItalic(existingAttributes);
            StyleConstants.setItalic(attributes, !isItalic);
            }

            try {
                doc.remove(selectionStart, selectionEnd - selectionStart);
                doc.insertString(selectionStart, text, attributes);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }
}}
