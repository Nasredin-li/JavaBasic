package slider;

import java.awt.event.ActionEvent;
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergey
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



	public class LearnToRead extends javax.swing.JFrame {

	    /**
	     * Creates new form NewJFrame
	     */
	    public LearnToRead() {
	        initComponents();
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {
	    	//new IteratorImages(new File("D:/Serge/����/"));
	    	
	        imageAndTextAndControlPanel = new javax.swing.JPanel();
	        imageAndControlPanel = new javax.swing.JPanel();
	        
	        imagePanel = new javax.swing.JPanel();
	        jFileChooser = new javax.swing.JFileChooser();
	        
	        imagePanel.add(jFileChooser); 
	        
	        
	        wrongButton = new javax.swing.JButton();
	        imageModeButton = new javax.swing.JButton();
	        imageAndTextModeButton = new javax.swing.JButton();
	        textModeButton = new javax.swing.JButton();
	        fileNameAndNavigationPanel = new javax.swing.JPanel();
	        fileNameTextField = new javax.swing.JTextField();
	        leftBigButton = new javax.swing.JButton();
	        rightBigButton = new javax.swing.JButton();
	        libraryPanel = new javax.swing.JPanel();
	        jPanel6 = new javax.swing.JPanel();
	        jPanel7 = new javax.swing.JPanel();
	        jPanel8 = new javax.swing.JPanel();
	        jPanel9 = new javax.swing.JPanel();
	        jPanel10 = new javax.swing.JPanel();
	        jPanel11 = new javax.swing.JPanel();
	        jPanel12 = new javax.swing.JPanel();
	        toolsPanel = new javax.swing.JPanel();
	        leftLittleButton = new javax.swing.JButton();
	        rightLittleButton = new javax.swing.JButton();
	        pathTextField = new javax.swing.JTextField();
	        renameButton = new javax.swing.JButton();
	        browseButton = new javax.swing.JButton();
	        libraryPathLabel = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("LEARN TO READ FOR CHILDREN");
	        setName("leardToRead"); // NOI18N
	        setPreferredSize(new java.awt.Dimension(900, 800));

	        imageAndTextAndControlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

	        imageAndControlPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
	        imageAndControlPanel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

	        imagePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

	        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
	        imagePanel.setLayout(imagePanelLayout);
	        imagePanelLayout.setHorizontalGroup(
	            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 0, Short.MAX_VALUE)
	        );
	        imagePanelLayout.setVerticalGroup(
	            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 0, Short.MAX_VALUE)
	        );

	        wrongButton.setText("wrong");

	        imageModeButton.setText("IMAGE");
	        imageModeButton.setMaximumSize(new java.awt.Dimension(80, 80));
	        imageModeButton.setMinimumSize(new java.awt.Dimension(80, 80));
	        imageModeButton.setPreferredSize(new java.awt.Dimension(80, 80));

	        imageAndTextModeButton.setText("IMAGE&TEXT");
	        imageAndTextModeButton.setMaximumSize(new java.awt.Dimension(80, 80));
	        imageAndTextModeButton.setMinimumSize(new java.awt.Dimension(80, 80));
	        imageAndTextModeButton.setPreferredSize(new java.awt.Dimension(80, 80));

	        textModeButton.setText("TEXT");
	        textModeButton.setMaximumSize(new java.awt.Dimension(80, 80));
	        textModeButton.setMinimumSize(new java.awt.Dimension(80, 80));
	        textModeButton.setPreferredSize(new java.awt.Dimension(80, 80));

	        javax.swing.GroupLayout imageAndControlPanelLayout = new javax.swing.GroupLayout(imageAndControlPanel);
	        imageAndControlPanel.setLayout(imageAndControlPanelLayout);
	        imageAndControlPanelLayout.setHorizontalGroup(
	            imageAndControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(imageAndControlPanelLayout.createSequentialGroup()
	                .addGap(117, 117, 117)
	                .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGap(18, 18, 18)
	                .addGroup(imageAndControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(wrongButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imageModeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imageAndTextModeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(textModeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(13, 13, 13))
	        );
	        imageAndControlPanelLayout.setVerticalGroup(
	            imageAndControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(imageAndControlPanelLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(imageAndControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(imageAndControlPanelLayout.createSequentialGroup()
	                        .addComponent(wrongButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
	                        .addComponent(imageModeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(imageAndTextModeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(textModeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	        );

	        fileNameAndNavigationPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

	        fileNameTextField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
	        fileNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        fileNameTextField.setText("FileName");
	        fileNameTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
	        fileNameTextField.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                fileNameTextFieldActionPerformed(evt);
	            }
	        });

	        leftBigButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
	        leftBigButton.setText("<<LEFT");
	        leftBigButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                leftBigButtonActionPerformed(evt);
	            }
	        });

	        rightBigButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
	        rightBigButton.setText("RIGHT>>");

	        javax.swing.GroupLayout fileNameAndNavigationPanelLayout = new javax.swing.GroupLayout(fileNameAndNavigationPanel);
	        fileNameAndNavigationPanel.setLayout(fileNameAndNavigationPanelLayout);
	        fileNameAndNavigationPanelLayout.setHorizontalGroup(
	            fileNameAndNavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(fileNameAndNavigationPanelLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(leftBigButton)
	                .addGap(16, 16, 16)
	                .addComponent(fileNameTextField)
	                .addGap(18, 18, 18)
	                .addComponent(rightBigButton)
	                .addGap(13, 13, 13))
	        );
	        fileNameAndNavigationPanelLayout.setVerticalGroup(
	            fileNameAndNavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fileNameAndNavigationPanelLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(fileNameAndNavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(rightBigButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(fileNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
	                    .addComponent(leftBigButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	        );

	        fileNameTextField.getAccessibleContext().setAccessibleName("fileName");

	        javax.swing.GroupLayout imageAndTextAndControlPanelLayout = new javax.swing.GroupLayout(imageAndTextAndControlPanel);
	        imageAndTextAndControlPanel.setLayout(imageAndTextAndControlPanelLayout);
	        imageAndTextAndControlPanelLayout.setHorizontalGroup(
	            imageAndTextAndControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(imageAndTextAndControlPanelLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(imageAndTextAndControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(imageAndControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(fileNameAndNavigationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	        );
	        imageAndTextAndControlPanelLayout.setVerticalGroup(
	            imageAndTextAndControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(imageAndTextAndControlPanelLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(imageAndControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGap(18, 18, 18)
	                .addComponent(fileNameAndNavigationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
	        );

	        libraryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "library", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

	        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 200, 200)));

	        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
	        jPanel6.setLayout(jPanel6Layout);
	        jPanel6Layout.setHorizontalGroup(
	            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );
	        jPanel6Layout.setVerticalGroup(
	            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );

	        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 200, 200)));

	        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
	        jPanel7.setLayout(jPanel7Layout);
	        jPanel7Layout.setHorizontalGroup(
	            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );
	        jPanel7Layout.setVerticalGroup(
	            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );

	        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 200, 200)));

	        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
	        jPanel8.setLayout(jPanel8Layout);
	        jPanel8Layout.setHorizontalGroup(
	            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );
	        jPanel8Layout.setVerticalGroup(
	            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );

	        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 60), 3));

	        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
	        jPanel9.setLayout(jPanel9Layout);
	        jPanel9Layout.setHorizontalGroup(
	            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 100, Short.MAX_VALUE)
	        );
	        jPanel9Layout.setVerticalGroup(
	            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 100, Short.MAX_VALUE)
	        );

	        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 200, 200)));

	        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
	        jPanel10.setLayout(jPanel10Layout);
	        jPanel10Layout.setHorizontalGroup(
	            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );
	        jPanel10Layout.setVerticalGroup(
	            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );

	        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 200, 200)));

	        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
	        jPanel11.setLayout(jPanel11Layout);
	        jPanel11Layout.setHorizontalGroup(
	            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );
	        jPanel11Layout.setVerticalGroup(
	            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );

	        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 200, 200)));

	        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
	        jPanel12.setLayout(jPanel12Layout);
	        jPanel12Layout.setHorizontalGroup(
	            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );
	        jPanel12Layout.setVerticalGroup(
	            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 104, Short.MAX_VALUE)
	        );

	        javax.swing.GroupLayout libraryPanelLayout = new javax.swing.GroupLayout(libraryPanel);
	        libraryPanel.setLayout(libraryPanelLayout);
	        libraryPanelLayout.setHorizontalGroup(
	            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(libraryPanelLayout.createSequentialGroup()
	                .addGap(44, 44, 44)
	                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(46, Short.MAX_VALUE))
	        );

	        libraryPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel10, jPanel11, jPanel12, jPanel6, jPanel7, jPanel8, jPanel9});

	        libraryPanelLayout.setVerticalGroup(
	            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, libraryPanelLayout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
	                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap())
	        );

	        libraryPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel10, jPanel11, jPanel12, jPanel6, jPanel7, jPanel8, jPanel9});

	        toolsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tools", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

	        leftLittleButton.setText("<< LEFT");

	        rightLittleButton.setText("RIGHT >>");

	        pathTextField.setText("enter new library path");

	        renameButton.setText("RENAME");
	        
	        browseButton.setText("browse");
	        browseButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					browseButtonActionPerformed(evt);
				}

				private void browseButtonActionPerformed(ActionEvent evt) {
					//new BrowsePanel();
					
				}
			});

	        libraryPathLabel.setText("librairy path");

	        javax.swing.GroupLayout toolsPanelLayout = new javax.swing.GroupLayout(toolsPanel);
	        toolsPanel.setLayout(toolsPanelLayout);
	        
	        toolsPanelLayout.setHorizontalGroup(
	            toolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(toolsPanelLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(leftLittleButton)
	                .addGap(18, 18, 18)
	                .addComponent(rightLittleButton)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(renameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(50, 50, 50)
	                .addComponent(libraryPathLabel)
	                .addGap(18, 18, 18)
	                .addComponent(pathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(browseButton)
	                .addContainerGap())
	        );
	        toolsPanelLayout.setVerticalGroup(
	            toolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(toolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                .addComponent(leftLittleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addComponent(rightLittleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addComponent(pathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addComponent(renameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addComponent(browseButton)
	                .addComponent(libraryPathLabel))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(toolsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(imageAndTextAndControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(libraryPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(toolsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(imageAndTextAndControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(libraryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
	        );

	        pack();
	        
	    }// </editor-fold>                        

	    private void leftBigButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    }                                             

	    private void fileNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
	        // TODO add your handling code here:
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
	            java.util.logging.Logger.getLogger(LearnToRead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(LearnToRead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(LearnToRead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(LearnToRead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new LearnToRead().setVisible(true);
	                
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton browseButton;
	    private javax.swing.JPanel fileNameAndNavigationPanel;
	    private javax.swing.JTextField fileNameTextField;
	    private javax.swing.JPanel imageAndControlPanel;
	    private javax.swing.JPanel imageAndTextAndControlPanel;
	    private javax.swing.JButton imageAndTextModeButton;
	    private javax.swing.JButton imageModeButton;
	    private javax.swing.JPanel imagePanel;
	    private javax.swing.JPanel jPanel10;
	    private javax.swing.JPanel jPanel11;
	    private javax.swing.JPanel jPanel12;
	    private javax.swing.JPanel jPanel6;
	    private javax.swing.JPanel jPanel7;
	    private javax.swing.JPanel jPanel8;
	    private javax.swing.JPanel jPanel9;
	    private javax.swing.JButton leftBigButton;
	    private javax.swing.JButton leftLittleButton;
	    private javax.swing.JPanel libraryPanel;
	    private javax.swing.JLabel libraryPathLabel;
	    private javax.swing.JTextField pathTextField;
	    private javax.swing.JButton renameButton;
	    private javax.swing.JButton rightBigButton;
	    private javax.swing.JButton rightLittleButton;
	    private javax.swing.JButton textModeButton;
	    private javax.swing.JPanel toolsPanel;
	    private javax.swing.JButton wrongButton;
	    //private BrowsePanel browsePanel;
	    private javax.swing.JFileChooser jFileChooser;
	    // End of variables declaration                   
	}