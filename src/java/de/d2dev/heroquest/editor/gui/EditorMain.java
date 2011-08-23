/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditorMain.java
 *
 * Created on 23.08.2011, 12:59:07
 */

package de.d2dev.heroquest.editor.gui;

import de.d2dev.heroquest.editor.Editor;

/**
 *
 * @author Batti
 */
public class EditorMain extends javax.swing.JFrame {
	
	private Editor editor;
	private Java2DRenderWindow java2DRenderWindow = null;
	
    /** Creates new form EditorMain */
    public EditorMain(Editor editor) {
        initComponents();
        
        this.editor = editor;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        renderWindowsMenu = new javax.swing.JMenu();
        java2DRenderWindowMenuItem = new javax.swing.JMenuItem();
        jMonkeyRenderWindowMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Heroquest Editor");
        setResizable(false);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        renderWindowsMenu.setText("Render Windows");

        java2DRenderWindowMenuItem.setText("Java 2D Render Windwo");
        java2DRenderWindowMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                java2DRenderWindowMenuItemActionPerformed(evt);
            }
        });
        renderWindowsMenu.add(java2DRenderWindowMenuItem);

        jMonkeyRenderWindowMenuItem.setText("jMonkey Render Window");
        renderWindowsMenu.add(jMonkeyRenderWindowMenuItem);

        jMenuBar1.add(renderWindowsMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void java2DRenderWindowMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_java2DRenderWindowMenuItemActionPerformed
    	if ( this.java2DRenderWindow == null ) {
    		this.java2DRenderWindow = new Java2DRenderWindow( this.editor.renderModel, this.editor.resourceProvider );
    	}
    	
    	this.java2DRenderWindow.setVisible(true);
    }//GEN-LAST:event_java2DRenderWindowMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMonkeyRenderWindowMenuItem;
    private javax.swing.JMenuItem java2DRenderWindowMenuItem;
    private javax.swing.JMenu renderWindowsMenu;
    // End of variables declaration//GEN-END:variables

}
