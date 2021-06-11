package javanotepad;


import java.awt.Color;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import java.util.*;
import java.io.*;

public class NotePadGui extends javax.swing.JFrame {

    JavaNotePad javaNotePad = new JavaNotePad();
    Clipboard clipboard = getToolkit().getSystemClipboard();
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();
    
    public NotePadGui() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        newButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        openFile = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        saveFile = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cutText = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        copyText = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        pasteText = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NotePad");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/find.png"))); // NOI18N
        searchButton.setToolTipText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchField.setToolTipText("Enter your word here ...");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(150, 98));

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setToolTipText("Files List");
        textArea.setPreferredSize(new java.awt.Dimension(150, 92));
        jScrollPane1.setViewportView(textArea);

        newButton.setBackground(new java.awt.Color(255, 255, 255));
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/new.png"))); // NOI18N
        newButton.setToolTipText("New File");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        openButton.setBackground(new java.awt.Color(255, 255, 255));
        openButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/open.png"))); // NOI18N
        openButton.setToolTipText("Open File");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/exit.png"))); // NOI18N
        jButton1.setToolTipText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Current Date & Time");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Today", "This Week", "This Month"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/new.png"))); // NOI18N
        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jMenu1.add(newFile);
        jMenu1.add(jSeparator1);

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/open.png"))); // NOI18N
        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);
        jMenu1.add(jSeparator2);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/save.png"))); // NOI18N
        saveFile.setText("Save As");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);
        jMenu1.add(jSeparator3);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        cutText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/cut.png"))); // NOI18N
        cutText.setText("Cut");
        cutText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutTextActionPerformed(evt);
            }
        });
        jMenu2.add(cutText);
        jMenu2.add(jSeparator4);

        copyText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/copy.png"))); // NOI18N
        copyText.setText("Copy");
        copyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTextActionPerformed(evt);
            }
        });
        jMenu2.add(copyText);
        jMenu2.add(jSeparator5);

        pasteText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/paste.png"))); // NOI18N
        pasteText.setText("Paste");
        pasteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteTextActionPerformed(evt);
            }
        });
        jMenu2.add(pasteText);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javanotepad/resources/help.png"))); // NOI18N
        jMenuItem1.setText("Programmer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void copyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTextActionPerformed

        String copyString = textArea.getSelectedText();
        StringSelection copyStringSelection = new StringSelection(copyString);
        clipboard.setContents(copyStringSelection, copyStringSelection);
        
    }//GEN-LAST:event_copyTextActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed

        AddNote addNote = new AddNote();
        addNote.setVisible(true);
        
        
        /*
        textArea.setText("");
        setTitle(javaNotePad.getName());
        */
        
    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed

        AddNote addNote = new AddNote();
        addNote.setVisible(true);
        
        
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed

        FileDialog fileDialog = new FileDialog(NotePadGui.this, "Save File" , FileDialog.SAVE);
        fileDialog.setVisible(true);
        
        if (fileDialog.getFile() != null) {
            javaNotePad.setName(fileDialog.getDirectory() + fileDialog.getFile());
            setTitle(javaNotePad.getName());
            
        }
        
       
        try {
            
            FileWriter fileWriter = new FileWriter(javaNotePad.getName());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //StringBuilder stringBuilder = new StringBuilder(textArea.getText());
            String[] str = textArea.getText().split("\n");
            for (int i = 0; i < str.length; i++) {
                //System.out.println(str[i]);
                bufferedWriter.append(str[i]);
                bufferedWriter.newLine();
            }
            
            bufferedWriter.flush();
            bufferedWriter.close();
            /*
            stringBuilder.replace(2, 3, "\n");
            System.out.println(textArea.getText());
            
            bufferedWriter.write(stringBuilder.toString());
            setTitle(fileName);
            bufferedWriter.close();
            fileWriter.close();
            */
            
            /*
            DataOutputStream d = new DataOutputStream(new FileOutputStream(fileName));
            String line = textArea.getText();
            d.writeBytes(line);
            d.close();
            */
            
        } catch (IOException e) {
            System.out.println("File Not Found !");
        }
        
    }//GEN-LAST:event_saveFileActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void cutTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutTextActionPerformed

        String cutString = textArea.getSelectedText();
        StringSelection cutStringSelection = new StringSelection(cutString);
        clipboard.setContents(cutStringSelection, cutStringSelection);
        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
        
    }//GEN-LAST:event_cutTextActionPerformed

    private void pasteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteTextActionPerformed

        try {
            Transferable pasteTransferable = clipboard.getContents(NotePadGui.this);
            String s = (String) pasteTransferable.getTransferData(DataFlavor.stringFlavor);
            textArea.replaceRange(s, textArea.getSelectionStart(), textArea.getSelectionEnd());
            
            
        } catch (Exception e) {
            System.out.println("Error !");
        }
    }//GEN-LAST:event_pasteTextActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        searchTextArea(textArea, searchField.getText());
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        JOptionPane.showMessageDialog(null, "Amirreza Hajizadeh", "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed

        newFileActionPerformed(evt);
    }//GEN-LAST:event_newButtonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed

        openFileActionPerformed(evt);
    }//GEN-LAST:event_openButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            
            @Override
            public void run() {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now();
                //System.out.println(dtf.format(now));
                jLabel1.setText(dtf.format(now));
            }
        };
        t.scheduleAtFixedRate(tt, 0, 1000);
    }//GEN-LAST:event_formWindowOpened

    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for (int i=0 ; i<23 ; i++){
            jTable1.setValueAt("", i, 0);
            jTable1.setValueAt("", i, 1);
            jTable1.setValueAt("", i, 2);
        }
        
        ArrayList<String> arrayListName = new ArrayList<>();
        ArrayList<String> arrayListDate = new ArrayList<>();
        
        
        try {
            FileReader fileReaderT = new FileReader("table.txt");
            BufferedReader bufferedReaderT = new BufferedReader(fileReaderT);
            
            
            String line = null;
            for (int i=0 ; (line = bufferedReaderT.readLine()) !=null ;i++){
                arrayListName.add(i, line);
            }
            
            bufferedReaderT.close();
            fileReaderT.close();
            
            
            
        } catch (IOException e) {
            System.out.println("File Not Found !");
        }
        
        ////////////////////////////////////////////////
        
        try {
            FileReader fileReaderD = new FileReader("date.txt");
            BufferedReader bufferedReaderD = new BufferedReader(fileReaderD);
            
            String line = null;
            for (int i=0 ; (line = bufferedReaderD.readLine()) !=null ;i++){
                arrayListDate.add(i, line);
            }
            bufferedReaderD.close();
            fileReaderD.close();
            
              
        } catch (IOException e) {
            System.out.println("File Not Found !");
        }
        
        //////////////////////////////////////////////////////////////////////
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
        LocalDateTime now = LocalDateTime.now();
        String currentDate = dtf.format(now);
        
        String[] underscope = new String[2];
        
        int currentRowToday = 0;
        int currentRowThisWeek = 0;
        int currentRowThisMonth = 0;
        
        /*
        
        String[] Week = new String[2];
        String[] Month = new String[2];
        
        if((Integer.parseInt(currentDate.substring(8, 9)))+1 >30){
            Week[0] = String.valueOf(Integer.parseInt(currentDate.substring(5, 6))+1).concat("01");
            Week[1] = String.valueOf(Integer.parseInt(currentDate.substring(5, 6))+1).concat("07");
        }
        else {
            Week[0] = currentDate.substring(5, 6).concat(String.valueOf(Integer.parseInt(currentDate.substring(8, 9))+1));
            Week[1] = 
        } 
            
        */
        /*
        int thisWeekRange = Integer.parseInt((currentDate.substring(5, 6)).concat(currentDate.substring(8, 9)));
        thisWeekRange+=7;
        
        int thisMonthRange = Integer.parseInt(currentDate.substring(5, 6));
        thisMonthRange++;
        */
        int integerCurrent = ((Integer.parseInt(currentDate.substring(0, 4))*365) + (Integer.parseInt(currentDate.substring(5, 7))*30) + Integer.parseInt(currentDate.substring(8, 10)));
        
        //System.out.println(integerCurrent);
       
        //////////////////////////////////////////////////////////////////////
        ArrayList<String> arrayListToday = new ArrayList<>();
        ArrayList<String> arrayListThisWeek = new ArrayList<>();
        ArrayList<String> arrayListThisMonth = new ArrayList<>();
        
        
        
        
        for (int i = 0 ; i<arrayListName.size() && i<arrayListDate.size() ; i++){
            
            underscope[0]=arrayListName.get(i);
            underscope[1]=arrayListDate.get(i);
            
            if(underscope[1].equals(currentDate)){
                
                arrayListToday.add(currentRowToday, underscope[0]);
                currentRowToday++;
            }
            
            else if (((Integer.parseInt(underscope[1].substring(0, 4))*365) + (Integer.parseInt(underscope[1].substring(5, 7))*30) + Integer.parseInt(underscope[1].substring(8, 10))) <= integerCurrent+7) {
                
                arrayListThisWeek.add(currentRowThisWeek, underscope[0]);
                currentRowThisWeek++;
            }
            
            else if (((Integer.parseInt(underscope[1].substring(0, 4))*365) + (Integer.parseInt(underscope[1].substring(5, 7))*30) + Integer.parseInt(underscope[1].substring(8, 10))) <= integerCurrent+30) {
                
                arrayListThisMonth.add(currentRowThisMonth, underscope[0]);
                currentRowThisMonth++;
            }
            
        }
        
        for (int i=0 ; i<arrayListToday.size() ; i++){
            jTable1.setValueAt(arrayListToday.get(i), i, 0);
        }
        for (int i=0 ; i<arrayListThisWeek.size() ; i++){
            jTable1.setValueAt(arrayListThisWeek.get(i), i, 1);
        }
        for (int i=0 ; i<arrayListThisMonth.size() ; i++){
            jTable1.setValueAt(arrayListThisMonth.get(i), i, 2);
        }
        
        /////////////////////////////////////////////////////////
        textArea.setText("");
        
        try {
            FileReader fileReaderR = new FileReader("table.txt");
            BufferedReader bufferedReaderR = new BufferedReader(fileReaderR);
            StringBuilder stringBuilder = new StringBuilder();
            
            String line = null;
            while((line = bufferedReaderR.readLine()) !=null){
                stringBuilder.append(line + "\n");
                textArea.setText(stringBuilder.toString());
            }
            bufferedReaderR.close();
            fileReaderR.close();
            
        } catch (IOException e) {
            System.out.println("File Not Found !");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        FileDialog fileDialog = new FileDialog(NotePadGui.this, "Delete File" , FileDialog.LOAD);
        fileDialog.setVisible(true);
        if (fileDialog.getFile() != null) {
            javaNotePad.setName(fileDialog.getDirectory() + fileDialog.getFile());
            setTitle(javaNotePad.getName());
        }
        int selection = JOptionPane.showConfirmDialog(null, "Are you sure ?", "delete", JOptionPane.YES_NO_OPTION);
        
        if (selection == JOptionPane.YES_OPTION){
            
        
        try {
            File file = new File(javaNotePad.getName());
            if (file.delete()){
                JOptionPane.showMessageDialog(null, "File Deleted", "Result", JOptionPane.INFORMATION_MESSAGE);
                
                StringBuilder stringBuilderT = new StringBuilder();
                StringBuilder stringBuilderD = new StringBuilder();
                int suspect =0;
                int goal=0;
                
                ////////////////////////////////////////////////////////////////
                
                try {
                    FileReader fileReader = new FileReader("table.txt");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
            
                    String line = null;
                    while((line = bufferedReader.readLine()) !=null){
                        suspect++;
                        if (line.equals(fileDialog.getFile())){
                //            suspect=lineNumberReader.getLineNumber();
                //            System.out.println("line number 1 : "+lineNumberReader.getLineNumber());
                //            System.out.println("line :"+suspect);
                //            stringBuilderT.append(""+"\n");
                            goal=suspect;
                            continue;
                        }
                        stringBuilderT.append(line + "\n");
                //        System.out.println("Line number in the end : "+lineNumberReader.getLineNumber());
                        
                    }
                    bufferedReader.close();
                    fileReader.close();
            
                    } catch (IOException e) {
                        System.out.println("File Not Found !");
                    }
                ////////////////////////////////////////////////////////////////
                
            //    System.out.println(stringBuilderT);

                ////////////////////////////////////////////////////////////////
                
                try {
            
                    FileWriter fileWriter = new FileWriter("table.txt");
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    
                    String[] str = stringBuilderT.toString().split("\n");
                    
                    for (int i = 0; i < str.length; i++) {
                        bufferedWriter.append(str[i]);
                        bufferedWriter.newLine();
                    }
            
                    bufferedWriter.flush();
                    bufferedWriter.close();
            
                } catch (Exception e) {
                System.out.println("Error !");
                }
                
                ////////////////////////////////////////////////////////////////
                
                try {
                    FileReader fileReader = new FileReader("date.txt");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
            
                    String line = null;
                    
                    int firstTime=0;
                    
                    suspect=0;
                    
                    while((line = bufferedReader.readLine()) !=null){
                        suspect++;
                        if (goal==suspect && firstTime==0){
                            firstTime++;
                        //    System.out.println("line number"+lineNumberReader.getLineNumber());
                        //    stringBuilderD.append(""+"\n");
                            continue;
                        }
                        stringBuilderD.append(line + "\n");
                    }
                    
                    bufferedReader.close();
                    fileReader.close();
            
                    } catch (IOException e) {
                        System.out.println("File Not Found !");
                    }
                
                ////////////////////////////////////////////////////////////////
                
            //    System.out.println(stringBuilderD);
                
                ////////////////////////////////////////////////////////////////
                
                try {
            
                    FileWriter fileWriter = new FileWriter("date.txt");
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
                    String[] str = stringBuilderD.toString().split("\n");
                    
                    for (int i = 0; i < str.length; i++) {
                        bufferedWriter.append(str[i]);
                        bufferedWriter.newLine();
                    }
                    
                    bufferedWriter.flush();
                    bufferedWriter.close();
            
                } catch (Exception e) {
                System.out.println("Error !");
                }
                ////////////////////////////////////////////////////////////////
                
            }
            
            else JOptionPane.showMessageDialog(null, "Operation was not successfull", "Result", JOptionPane.ERROR_MESSAGE);
            
            
        } catch (Exception e) {
            System.out.println("File Not Found !");
        }
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

class myHighlighter extends DefaultHighlighter.DefaultHighlightPainter{
    
        public myHighlighter(Color c) {
            super(c);
        }
    
}
DefaultHighlighter.DefaultHighlightPainter highlighter = new myHighlighter(Color.yellow);


public void removeHighlight(JTextComponent textComponent){
    Highlighter removeHighlighter = textComponent.getHighlighter();
    Highlighter.Highlight[] remove = removeHighlighter.getHighlights();
    
    for (int i=0 ; i<remove.length ; i++){
        if (remove[i].getPainter() instanceof myHighlighter) {
            removeHighlighter.removeHighlight(remove[i]);
        }
    }
}


public void searchTextArea(JTextComponent textComponent , String textString){
    removeHighlight(textComponent);
    try {
        Highlighter highlight = textComponent.getHighlighter();
        Document document = textComponent.getDocument();
        String text = document.getText(0, document.getLength());
        
        int pos = 0;
        while((pos = text.toUpperCase().indexOf(textString.toUpperCase(),pos))>=0){
            highlight.addHighlight(pos, pos+textString.length(), highlighter);
            pos += textString.length();
        }
        
    } catch (Exception e) {
        System.out.println("Error !");
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
            java.util.logging.Logger.getLogger(NotePadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotePadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotePadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotePadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotePadGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyText;
    private javax.swing.JMenuItem cutText;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton newButton;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JButton openButton;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem pasteText;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
