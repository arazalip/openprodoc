/*
 * OpenProdoc
 * 
 * See the help doc files distributed with
 * this work for additional information regarding copyright ownership.
 * Joaquin Hierro licenses this file to You under:
 * 
 * License GNU GPL v3 http://www.gnu.org/licenses/gpl.html
 * 
 * you may not use this file except in compliance with the License.  
 * Unless agreed to in writing, software is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * author: Joaquin Hierro      2011
 * 
 */

/*
 * DialogEditFold.java
 *
 * Created on 28-mar-2010, 20:14:35
 */

package prodocswing.forms;

import java.io.File;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import prodoc.Attribute;
import prodoc.Cursor;
import prodoc.DriverGeneric;
import prodoc.PDException;
import prodoc.PDObjDefs;
import prodoc.Record;

/**
 *
 * @author jhierrot
 */
public class DialogImportFolders extends javax.swing.JDialog
{

private Record EditedDoc;
private boolean Cancel;

/**
 * 
 */
public File SelFolder=null;

/** Creates new form DialogEditFold
 * @param parent
 * @param modal 
 */
public DialogImportFolders(java.awt.Frame parent, boolean modal)
{
super(parent, modal);
initComponents();
}

/** This method is called from within the constructor to
 * initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is
 * always regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelOperation = new javax.swing.JLabel();
        OneLevel = new javax.swing.JLabel();
        CBOneLevel = new javax.swing.JCheckBox();
        IncMetadata = new javax.swing.JLabel();
        CBIncMetadata = new javax.swing.JCheckBox();
        IncDocs = new javax.swing.JLabel();
        CBIncDocs = new javax.swing.JCheckBox();
        LabelDocType = new javax.swing.JLabel();
        DocTypeCB = new javax.swing.JComboBox();
        FilePathLabel = new javax.swing.JLabel();
        FilePathTextField = new javax.swing.JTextField();
        ButtonSelFile = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        ButtonAcept = new javax.swing.JButton();
        FoldTypeCB = new javax.swing.JComboBox();
        LabelFoldType1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(MainWin.TT("Export_Folders"));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        LabelOperation.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        LabelOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelOperation.setText(MainWin.TT("Export_Folders"));

        OneLevel.setFont(MainWin.getFontDialog());
        OneLevel.setText(MainWin.TT("Import_One_level"));

        IncMetadata.setFont(MainWin.getFontDialog());
        IncMetadata.setText(MainWin.TT("Include_Metadata"));

        IncDocs.setFont(MainWin.getFontDialog());
        IncDocs.setText(MainWin.TT("Include_Documentos"));

        LabelDocType.setFont(MainWin.getFontDialog());
        LabelDocType.setText(MainWin.TT("Document_type"));

        DocTypeCB.setFont(MainWin.getFontDialog());
        DocTypeCB.setModel(getComboModelDoc());

        FilePathLabel.setFont(MainWin.getFontDialog());
        FilePathLabel.setText(MainWin.TT("Source_Folder"));

        FilePathTextField.setFont(MainWin.getFontDialog());

        ButtonSelFile.setFont(MainWin.getFontDialog());
        ButtonSelFile.setText("Sel");
        ButtonSelFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSelFileActionPerformed(evt);
            }
        });

        ButtonCancel.setFont(MainWin.getFontDialog());
        ButtonCancel.setText(MainWin.TT("Cancel"));
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        ButtonAcept.setFont(MainWin.getFontDialog());
        ButtonAcept.setText(MainWin.TT("Ok"));
        ButtonAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptActionPerformed(evt);
            }
        });

        FoldTypeCB.setFont(MainWin.getFontDialog());
        FoldTypeCB.setModel(getComboModelFold());

        LabelFoldType1.setFont(MainWin.getFontDialog());
        LabelFoldType1.setText(MainWin.TT("Folder_Type"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(LabelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IncMetadata, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(IncDocs)
                    .addComponent(OneLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(LabelDocType, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFoldType1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBOneLevel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CBIncMetadata)
                        .addComponent(CBIncDocs, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(DocTypeCB, 0, 340, Short.MAX_VALUE)
                    .addComponent(FoldTypeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonAcept)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FilePathLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonSelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {IncDocs, IncMetadata, LabelDocType, LabelFoldType1, OneLevel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelOperation)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(OneLevel)
                    .addComponent(CBOneLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(CBIncMetadata)
                    .addComponent(IncMetadata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(IncDocs)
                    .addComponent(CBIncDocs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDocType)
                    .addComponent(DocTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFoldType1)
                    .addComponent(FoldTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilePathLabel)
                    .addComponent(ButtonSelFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAcept)
                    .addComponent(ButtonCancel))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonCancelActionPerformed
    {//GEN-HEADEREND:event_ButtonCancelActionPerformed
Cancel=true;
this.dispose();
}//GEN-LAST:event_ButtonCancelActionPerformed

    private void ButtonAceptActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAceptActionPerformed
    {//GEN-HEADEREND:event_ButtonAceptActionPerformed
if (SelFolder==null)
    {
    SelFolder=new File(FilePathTextField.getText());
    }
Cancel = false;
this.dispose();
}//GEN-LAST:event_ButtonAceptActionPerformed

    private void ButtonSelFileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonSelFileActionPerformed
    {//GEN-HEADEREND:event_ButtonSelFileActionPerformed
JFileChooser fc = new JFileChooser();
fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
int returnVal = fc.showOpenDialog(this);
if (returnVal == JFileChooser.APPROVE_OPTION)
    {
    SelFolder = fc.getSelectedFile();
    FilePathTextField.setText(SelFolder.getAbsolutePath());
    }
    }//GEN-LAST:event_ButtonSelFileActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
Cancel=true;
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAcept;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonSelFile;
    private javax.swing.JCheckBox CBIncDocs;
    private javax.swing.JCheckBox CBIncMetadata;
    private javax.swing.JCheckBox CBOneLevel;
    private javax.swing.JComboBox DocTypeCB;
    private javax.swing.JLabel FilePathLabel;
    private javax.swing.JTextField FilePathTextField;
    private javax.swing.JComboBox FoldTypeCB;
    private javax.swing.JLabel IncDocs;
    private javax.swing.JLabel IncMetadata;
    private javax.swing.JLabel LabelDocType;
    private javax.swing.JLabel LabelFoldType1;
    private javax.swing.JLabel LabelOperation;
    private javax.swing.JLabel OneLevel;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------------
/**
* @return the Folder edited
*/
public Record getRecord()
{
return EditedDoc;
}
//----------------------------------------------------------------
/**
* @return the Cancel
*/
public boolean isCancel()
{
return Cancel;
}
//----------------------------------------------------------------
public boolean IsOneLevel()
{
return(CBOneLevel.isSelected());    
}
//----------------------------------------------------------------
public boolean IncludeMetadata()
{
return(CBIncMetadata.isSelected());    
}
//----------------------------------------------------------------
public boolean IncludeDocs()
{
return(CBIncDocs.isSelected());    
}
//----------------------------------------------------------------
/**
 * Return the Folder type to be used to create the migrated Folders.
 * In the future, an Array, with different types for different levels
 * @return String containing the type of Folder to be used in the migration
 */
public String FoldType()
{
return((String)FoldTypeCB.getSelectedItem());
//return(PDFolders.getTableName());           
}
//----------------------------------------------------------------
/**
 * Return the document type to be used to create the migrated documents.
 * In the future, an Array, with different types for different levels
 * @return String containing the type of document to be used in the migration
 */
public String DocType()
{
return((String)DocTypeCB.getSelectedItem());
//return(PDDocs.getTableName());    
}
//----------------------------------------------------------------
/**
 * Obtains a list of clases of type Doc allowed to the user
 * @return a DefaultComboModel with names of classes of Docs
 */
private DefaultComboBoxModel getComboModelDoc()
{
Vector VObjects=new Vector();
try {
DriverGeneric Session=MainWin.getSession();
PDObjDefs Obj = new PDObjDefs(Session);
Cursor CursorId = Obj.getListDocs();
Record Res=Session.NextRec(CursorId);
while (Res!=null)
    {
    Attribute Attr=Res.getAttr(PDObjDefs.fNAME);
    VObjects.add(Attr.getValue());
    Res=Session.NextRec(CursorId);
    }
} catch (PDException ex)
    {
    MainWin.Message(ex.getLocalizedMessage());
    }
return(new DefaultComboBoxModel(VObjects));
}
//----------------------------------------------------------------
/**
 * Obtains a list of clases of type folder allowed to the user
 * @return a DefaultComboModel with names of classes of folder
 */
private DefaultComboBoxModel getComboModelFold()
{
Vector VObjects=new Vector();
try {
DriverGeneric Session=MainWin.getSession();
PDObjDefs Obj = new PDObjDefs(Session);
Cursor CursorId = Obj.getListFold();
Record Res=Session.NextRec(CursorId);
while (Res!=null)
    {
    Attribute Attr=Res.getAttr(PDObjDefs.fNAME);
    VObjects.add(Attr.getValue());
    Res=Session.NextRec(CursorId);
    }
} catch (PDException ex)
    {
    MainWin.Message("Error"+ex.getLocalizedMessage());
    }
return(new DefaultComboBoxModel(VObjects));
}
//----------------------------------------------------------------

}
