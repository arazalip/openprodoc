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

import java.awt.Component;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Vector;
import javax.swing.*;
import prodoc.*;
import prodocswing.ThesField;

/**
 *
 * @author jhierrot
 */
public class DialogEditDoc extends javax.swing.JDialog
{

private Record EditedDoc;
private boolean Cancel;
private boolean Modif=false;
private boolean SetRecordDocChanged=false;
private Vector InputFields=new Vector();
private HashSet AttrExcluded=new HashSet();
private boolean ViewMode=false;
/**
 * 
 */
//public File SelFile=null;

/** Creates new form DialogEditFold
 * @param parent
 * @param modal 
 */
public DialogEditDoc(java.awt.Frame parent, boolean modal)
{
super(parent, modal);
initComponents();
}

/**
 * 
 * @param parent
 * @param modal
 */
public DialogEditDoc(JDialog parent, boolean modal)
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
    private void initComponents()
    {

        LabelOperation = new javax.swing.JLabel();
        LabelFoldType = new javax.swing.JLabel();
        FoldTypeCB = new javax.swing.JComboBox();
        Attributes = new javax.swing.JTabbedPane();
        AttrBasic = new javax.swing.JPanel();
        IdLabel = new javax.swing.JLabel();
        IdField = new javax.swing.JTextField();
        ACLDescripLabel = new javax.swing.JLabel();
        ACLComboBox = new javax.swing.JComboBox();
        TitleLabel = new javax.swing.JLabel();
        TitleTextField = new javax.swing.JTextField();
        DateLabel = new javax.swing.JLabel();
        DateTextField = new javax.swing.JFormattedTextField();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        FilePathLabel = new javax.swing.JLabel();
        FilePathTextField = new javax.swing.JTextField();
        ButtonSelFile = new javax.swing.JButton();
        PathTextField = new javax.swing.JTextField();
        ButtonAcept = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(MainWin.TT("Maintenance_Documents"));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        LabelOperation.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        LabelOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelOperation.setText("jLabel1");

        LabelFoldType.setFont(MainWin.getFontDialog());
        LabelFoldType.setText(MainWin.TT("Document_type"));

        FoldTypeCB.setFont(MainWin.getFontDialog());
        FoldTypeCB.setModel(getComboModelFold());
        FoldTypeCB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FoldTypeCBActionPerformed(evt);
            }
        });

        IdLabel.setFont(MainWin.getFontDialog());
        IdLabel.setText("Id");

        IdField.setEditable(false);
        IdField.setColumns(32);
        IdField.setFont(MainWin.getFontDialog());
        IdField.setEnabled(false);

        ACLDescripLabel.setFont(MainWin.getFontDialog());
        ACLDescripLabel.setText(MainWin.TT("Document_ACL"));

        ACLComboBox.setFont(MainWin.getFontDialog());
        ACLComboBox.setModel(getComboModel());
        ACLComboBox.setPreferredSize(new java.awt.Dimension(43, 27));

        TitleLabel.setFont(MainWin.getFontDialog());
        TitleLabel.setText(MainWin.TT("Document_Title"));

        TitleTextField.setFont(MainWin.getFontDialog());
        TitleTextField.setPreferredSize(new java.awt.Dimension(32, 27));

        DateLabel.setFont(MainWin.getFontDialog());
        DateLabel.setText(MainWin.TT("Document_Date"));

        DateTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        DateTextField.setPreferredSize(new java.awt.Dimension(12, 27));

        NameLabel.setFont(MainWin.getFontDialog());
        NameLabel.setText(MainWin.TT("Name"));

        NameTextField.setEditable(false);
        NameTextField.setFont(MainWin.getFontDialog());
        NameTextField.setEnabled(false);

        FilePathLabel.setFont(MainWin.getFontDialog());
        FilePathLabel.setText(MainWin.TT("File_name"));

        FilePathTextField.setFont(MainWin.getFontDialog());

        ButtonSelFile.setFont(MainWin.getFontDialog());
        ButtonSelFile.setText("Sel");
        ButtonSelFile.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonSelFileActionPerformed(evt);
            }
        });

        PathTextField.setEditable(false);
        PathTextField.setFont(MainWin.getFontDialog());

        javax.swing.GroupLayout AttrBasicLayout = new javax.swing.GroupLayout(AttrBasic);
        AttrBasic.setLayout(AttrBasicLayout);
        AttrBasicLayout.setHorizontalGroup(
            AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttrBasicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AttrBasicLayout.createSequentialGroup()
                        .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ACLDescripLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(FilePathLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ACLComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AttrBasicLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(FilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonSelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(AttrBasicLayout.createSequentialGroup()
                        .addComponent(PathTextField)
                        .addContainerGap())))
        );

        AttrBasicLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ACLComboBox, DateTextField, IdField, NameTextField, TitleTextField});

        AttrBasicLayout.setVerticalGroup(
            AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AttrBasicLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdLabel))
                .addGap(18, 18, 18)
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACLComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACLDescripLabel))
                .addGap(18, 18, 18)
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateLabel))
                .addGap(18, 18, 18)
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel))
                .addGap(18, 18, 18)
                .addGroup(AttrBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSelFile)
                    .addComponent(FilePathLabel))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        Attributes.addTab(MainWin.TT("Common_Attributes"), AttrBasic);

        ButtonAcept.setFont(MainWin.getFontDialog());
        ButtonAcept.setText(MainWin.TT("Ok"));
        ButtonAcept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonAceptActionPerformed(evt);
            }
        });

        ButtonCancel.setFont(MainWin.getFontDialog());
        ButtonCancel.setText(MainWin.TT("Cancel"));
        ButtonCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LabelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelFoldType, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FoldTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(ButtonAcept)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Attributes)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelOperation)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFoldType)
                    .addComponent(FoldTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Attributes, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAcept)
                    .addComponent(ButtonCancel))
                .addContainerGap(16, Short.MAX_VALUE))
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
try {
if (!ViewMode)    
   {
    Attribute Attr = EditedDoc.getAttr(PDDocs.fACL);
    Attr.setValue(ACLComboBox.getSelectedItem());
    Attr = EditedDoc.getAttr(PDDocs.fDOCTYPE);
    Attr.setValue(FoldTypeCB.getSelectedItem());
    Attr = EditedDoc.getAttr(PDDocs.fTITLE);
    Attr.setValue(TitleTextField.getText());
    Attr = EditedDoc.getAttr(PDDocs.fDOCDATE);
    Attr.setValue(DateTextField.getValue());
    Attr = EditedDoc.getAttr(PDDocs.fNAME);
    Attr.setValue(NameTextField.getText());
    if (FilePathTextField.getText().length()>0)
        {
        Attr = EditedDoc.getAttr(PDDocs.fMIMETYPE);
        PDMimeType mt=new PDMimeType(MainWin.getSession());
        Attr.setValue(mt.SolveName(FilePathTextField.getText()));
        }
    RetrieveFields(EditedDoc, AttrExcluded, InputFields, Modif);
   }
Cancel = false;
this.dispose();
} catch (PDException ex)
    {
    MainWin.Message(ex.getLocalizedMessage());
    }
}//GEN-LAST:event_ButtonAceptActionPerformed

    private void FoldTypeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoldTypeCBActionPerformed
try {
PDDocs newDoc = new PDDocs(MainWin.getSession(), (String) FoldTypeCB.getSelectedItem());
if (!SetRecordDocChanged)
    {
    EditedDoc=newDoc.getRecord();
    setRecord(EditedDoc);
    }
} catch (PDException ex)
    {
    MainWin.Message(ex.getLocalizedMessage());
    }
    }//GEN-LAST:event_FoldTypeCBActionPerformed

    private void ButtonSelFileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonSelFileActionPerformed
    {//GEN-HEADEREND:event_ButtonSelFileActionPerformed
JFileChooser fc = new JFileChooser();
fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
int returnVal = fc.showOpenDialog(this);
if (returnVal == JFileChooser.APPROVE_OPTION)
    {
//    SelFile = fc.getSelectedFile();
    FilePathTextField.setText(fc.getSelectedFile().getAbsolutePath());
    NameTextField.setText(fc.getSelectedFile().getName());
    }
    }//GEN-LAST:event_ButtonSelFileActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
Cancel=true;
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ACLComboBox;
    private javax.swing.JLabel ACLDescripLabel;
    private javax.swing.JPanel AttrBasic;
    private javax.swing.JTabbedPane Attributes;
    private javax.swing.JButton ButtonAcept;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonSelFile;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JFormattedTextField DateTextField;
    private javax.swing.JLabel FilePathLabel;
    private javax.swing.JTextField FilePathTextField;
    private javax.swing.JComboBox FoldTypeCB;
    private javax.swing.JTextField IdField;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JLabel LabelFoldType;
    private javax.swing.JLabel LabelOperation;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField PathTextField;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField TitleTextField;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------------
/**
 * Obtains a list of ACL
 * @return a DefaultComboModel with names of ACL
 */
private DefaultComboBoxModel getComboModel()
{
return(ListObjects.getComboModel("ACL"));
}
//----------------------------------------------------------------
/**
 * Obtains a list of clases of type Doc allowed to the user
 * @return a DefaultComboModel with names of classes of Doc
 */
private DefaultComboBoxModel getComboModelFold()
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
Session.CloseCursor(CursorId);
} catch (PDException ex)
    {
    MainWin.Message(ex.getLocalizedMessage());
    }
return(new DefaultComboBoxModel(VObjects));
}
//----------------------------------------------------------------
/**
 * sets the Form in mode Add
 * Disabling fields and changint literals
 */
public void AddMode()
{
LabelOperation.setText(MainWin.TT("Add_Document"));
//AddButtonG.setEnabled(false);

}
//----------------------------------------------------------------
/**
 * sets the Form in mode Edition
 * Disabling fields and changing literals
 */
public void EditMode()
{
LabelOperation.setText(MainWin.TT("Update_Document"));
FoldTypeCB.setEnabled(false);
Modif=true;
}
//----------------------------------------------------------------
/**
 * sets the Form in mode View
 * Disabling fields and changing literals
 */
public void ViewMode()
{
LabelOperation.setText(MainWin.TT("Document_Attributes"));
FoldTypeCB.setEnabled(false);
ACLComboBox.setEnabled(false);
TitleTextField.setEnabled(false);
DateTextField.setEnabled(false);
//MimeTypeCB.setEnabled(false);
ButtonSelFile.setEnabled(false);
FilePathTextField.setEnabled(false);
ViewMode=true;
}
//----------------------------------------------------------------
/**
 * sets the Form in mode Delete
 * Disabling fields and changing literals
 */
public void DelMode()
{
LabelOperation.setText(MainWin.TT("Delete_Document"));
FoldTypeCB.setEnabled(false);
ACLComboBox.setEnabled(false);
TitleTextField.setEnabled(false);
DateTextField.setEnabled(false);
//MimeTypeCB.setEnabled(false);
ButtonSelFile.setEnabled(false);
FilePathTextField.setEnabled(false);
ViewMode=true;
}
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
* @param pFolder the User to set
*/
public void setRecord(Record pFolder) throws PDException
{
EditedDoc = pFolder;
AttrExcluded.clear();
Attribute Attr;
SetRecordDocChanged=true;
Attr=EditedDoc.getAttr(PDDocs.fDOCTYPE); //-----------------------------
AttrExcluded.add(PDDocs.fDOCTYPE);
//LabelFoldType.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    FoldTypeCB.setSelectedItem((String)Attr.getValue());
FoldTypeCB.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
SetRecordDocChanged=false;
Attr=EditedDoc.getAttr(PDDocs.fPDID); //-----------------------------
AttrExcluded.add(PDDocs.fPDID);
//IdLabel.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    IdField.setText((String)Attr.getValue());
IdField.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=EditedDoc.getAttr(PDDocs.fACL); //-----------------------------
AttrExcluded.add(PDDocs.fACL);
//ACLDescripLabel.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    ACLComboBox.setSelectedItem((String)Attr.getValue());
ACLComboBox.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=EditedDoc.getAttr(PDDocs.fTITLE); //-----------------------------
AttrExcluded.add(PDDocs.fTITLE);
//TitleLabel.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    TitleTextField.setText((String)Attr.getValue());
TitleTextField.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
Attr=EditedDoc.getAttr(PDDocs.fNAME); //-----------------------------
AttrExcluded.add(PDDocs.fNAME);
//NameLabel.setText(MainWin.DrvTT(Attr.getUserName()));
if (Attr.getValue()!=null)
    NameTextField.setText((String)Attr.getValue());
NameTextField.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
NameTextField.setEnabled(false);
Attr=EditedDoc.getAttr(PDDocs.fDOCDATE); //-----------------------------
AttrExcluded.add(PDDocs.fDOCDATE);
//DateLabel.setText(MainWin.DrvTT(Attr.getUserName()));
try {
DateTextField.setFormatterFactory(MainWin.getFormFacDate());
} catch(Exception e)
    {
    PDLog.Error(e.getLocalizedMessage());
    }
if (Attr.getValue()!=null)
    DateTextField.setValue(Attr.getValue());
DateTextField.setToolTipText(MainWin.DrvTT(Attr.getDescription())  +"( "+MainWin.getFormatDate()+" )" );
//Attr=EditedDoc.getAttr(PDDocs.fMIMETYPE); //-----------------------------
AttrExcluded.add(PDDocs.fMIMETYPE);
//MimeLabel.setText(MainWin.DrvTT(Attr.getUserName()));
//if (Attr.getValue()!=null)
//    MimeTypeCB.setSelectedItem((String)Attr.getValue());
//MimeTypeCB.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
SetRecordDocChanged=false;
if (!Modif)
    {
    AttrExcluded.add(ObjPD.fPDDATE);
    AttrExcluded.add(ObjPD.fPDAUTOR);
    }
AttrExcluded.add(PDDocs.fPARENTID);
AttrExcluded.add(PDDocs.fLOCKEDBY);
AttrExcluded.add(PDDocs.fREPOSIT);
AttrExcluded.add(PDDocs.fPURGEDATE);
AttrExcluded.add(PDDocs.fVERSION);
AttrExcluded.add(PDDocs.fSTATUS);
Component[] List=Attributes.getComponents();
for (int i = 0; i < List.length; i++)
    {
    JPanel component =(JPanel) List[i];
    if (component!=this.AttrBasic)
        {
        Attributes.remove(component);
        }
    }
GenerateTabs(EditedDoc, Attributes, 10, MainWin.TT("Other_Attributes"), AttrExcluded, Modif);
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
private void GenerateTabs(Record Rec, JTabbedPane Tabs, int MAXFIELDS, String Title, HashSet AttrExcluded, boolean Modif) throws PDException
{
InputFields.clear();
JPanel ActPanel=null;
GroupLayout layout= null;
int CountFields=0;
GroupLayout.SequentialGroup hGroup= null;
GroupLayout.SequentialGroup vGroup= null;
GroupLayout.ParallelGroup LGroup= null;
GroupLayout.ParallelGroup TGroup= null;
Rec.initList();
Attribute Attr=Rec.nextAttr();
while (Attr!=null)
    {
    if (!AttrExcluded.contains(Attr.getName()))
        {
        if (CountFields++%MAXFIELDS==0)
            {
            if (CountFields!=1)
                {
                hGroup.addGroup(LGroup);
                hGroup.addGroup(TGroup);
                layout.setHorizontalGroup(hGroup);
                layout.setVerticalGroup(vGroup);
                }
            ActPanel=new JPanel();
            ActPanel.setName(Title+(int)CountFields/MAXFIELDS);
            Tabs.add(ActPanel);
            layout = new GroupLayout(ActPanel);
            layout.setAutoCreateGaps(true);
            layout.setAutoCreateContainerGaps(true);
            hGroup = layout.createSequentialGroup();
            vGroup = layout.createSequentialGroup();
            LGroup=layout.createParallelGroup();
            TGroup=layout.createParallelGroup();
            ActPanel.setLayout(layout);
            }
        JLabel Lab=new JLabel(MainWin.DrvTT(Attr.getUserName()));
        Lab.setFont(MainWin.getFontDialog());
        JComponent JTF=genComponent(Attr, Modif);
        if (ViewMode)
            JTF.setEnabled(false);
        InputFields.add(JTF);
        LGroup.addComponent(Lab);
        TGroup.addComponent(JTF);
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Lab).addComponent(JTF));
        }
    Attr=Rec.nextAttr();
    }
if (CountFields==0)
    return;
hGroup.addGroup(LGroup);
hGroup.addGroup(TGroup);
layout.setHorizontalGroup(hGroup);
layout.setVerticalGroup(vGroup);
}
//----------------------------------------------------------------------
private void ShowEditList(java.awt.event.InputEvent  evt)
{
AttrMultiEdit MultAttrDlg = new AttrMultiEdit(new javax.swing.JFrame(), true);
Attribute Attr=((MultiField)evt.getComponent()).getAttr();
MultAttrDlg.setAttr(Attr);
MultAttrDlg.setLocationRelativeTo(null);
MultAttrDlg.setVisible(true);
if (MultAttrDlg.isCancel())
    return;
((MultiField)evt.getComponent()).setText(Attr.Export());
}
//----------------------------------------------------------------------
/**
 *
 * @param Attr
 * @param Modif
 * @return
 */
private JComponent genComponent(Attribute Attr, boolean Modif) throws PDException
{
JComponent JTF;
if (Attr.isMultivalued())
    {
    JTF=new MultiField(Attr.Export());
    ((MultiField)JTF).setAttr(Attr);
    if (!(ViewMode || Modif&&!Attr.isModifAllowed()))
        {
        JTF.addKeyListener(
            new java.awt.event.KeyAdapter() 
            {
            public void keyTyped(java.awt.event.KeyEvent evt) 
            {
            ShowEditList(evt);
            }
            });
        JTF.addMouseListener(
            new java.awt.event.MouseAdapter() 
            {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            ShowEditList(evt);
            }
            }); 
        }
    }
else if (Attr.getType()==Attribute.tSTRING)
    {
    if (Attr.getValue()!=null)
        JTF=new JTextField((String)Attr.getValue());
    else
        JTF=new JTextField();
    }
else if (Attr.getType()==Attribute.tTHES)
    {
    PDThesaur UseTerm=new PDThesaur(MainWin.getSession());    
    if (Attr.getValue()!=null)
        UseTerm.Load((String)Attr.getValue());
    JTF=new ThesField(this, UseTerm, ""+Attr.getLongStr());
    }
else if (Attr.getType()==Attribute.tDATE)
    {
    if (Attr.getValue()!=null)
        JTF=new JTextField((String)Attr.getValue());
    else
        JTF=new JTextField();
    if (!(ViewMode || Modif&&!Attr.isModifAllowed()))
        {
        JTF.addFocusListener(
            new java.awt.event.FocusAdapter() 
            {
            public void focusLost(java.awt.event.FocusEvent e)
            { 
            String Val=((JTextField)e.getComponent()).getText();
            if (Val.length()!=0)
                {
                try {
                MainWin.getFormatterDate().parse(Val);
                } catch (Exception ex)
                    {
                    ((JTextField)e.getComponent()).grabFocus();
                    }
                }
            }
            });
        }
//    JTF=new JFormattedTextField(MainWin.getFormatterDate());
//    if (Attr.getValue()!=null)
//        ((JFormattedTextField)JTF).setValue((Date)Attr.getValue());
//    else
//        ((JFormattedTextField)JTF).setValue(new Date());
    }
else if (Attr.getType()==Attribute.tTIMESTAMP)
    {
    if (Attr.getValue()!=null)
        JTF=new JTextField(MainWin.getFormatterTS().format((Date)Attr.getValue()));
    else
        JTF=new JTextField();
    if (!(Modif&&!Attr.isModifAllowed()))
        {
        JTF.addFocusListener(
            new java.awt.event.FocusAdapter() 
            {
            public void focusLost(java.awt.event.FocusEvent e)
            { 
            String Val=((JTextField)e.getComponent()).getText();
            if (Val.length()!=0)
                {
                try {
                MainWin.getFormatterTS().parse(Val);
                } catch (Exception ex)
                    {
                    ((JTextField)e.getComponent()).grabFocus();
                    }
                }
            }
            });
        }            
//    JTF=new JFormattedTextField(MainWin.getFormatterTS());
//    if (Attr.getValue()!=null)
//        ((JFormattedTextField)JTF).setValue((Date)Attr.getValue());
    }
else if (Attr.getType()==Attribute.tBOOLEAN)
    {
    JCheckBox JCB=new JCheckBox( );
    if (Attr.getValue()!=null)
        {
        JCB.setSelected(((Boolean)Attr.getValue()).booleanValue());
        }
    JTF=JCB;
    }
else if (Attr.getType()==Attribute.tINTEGER)
    {
    JTF=new JFormattedTextField(new DecimalFormat("#######0"));
    if (Attr.getValue()!=null)
        ((JFormattedTextField)JTF).setValue((Integer)Attr.getValue());
    else
        ((JFormattedTextField)JTF).setValue((Integer)0);
    }
else
     JTF=new JTextField("Error, unimplemented field type");
if (Modif && !Attr.isModifAllowed())
    JTF.setEnabled(false);
if (Attr.getType()==Attribute.tDATE )
    JTF.setToolTipText(MainWin.DrvTT(Attr.getDescription()) +"( "+MainWin.getFormatDate()+" )");
else if(Attr.getType() == Attribute.tTIMESTAMP)
    JTF.setToolTipText(MainWin.DrvTT(Attr.getDescription()) +"( "+MainWin.getFormatTS()+" )");
else
    JTF.setToolTipText(MainWin.DrvTT(Attr.getDescription()));
JTF.setFont(MainWin.getFontDialog());
return(JTF);
}
//--------------------------------------------------------------
/**
 *
 */
private void RetrieveFields(Record Rec, HashSet AttrExc, Vector CompList, boolean Modif) throws PDException
{
Rec.initList();
Attribute Attr=Rec.nextAttr();
int FieldNumber=0;
while (Attr!=null)
    {
    if (!AttrExc.contains(Attr.getName()))
        {
        FillAttr(Attr, (JComponent)CompList.get(FieldNumber++), Modif);
        }
    Attr=Rec.nextAttr();
    }
//MainWin.Message("Reg:"+Rec);
}
//--------------------------------------------------------------
/**
 * Fill the value of the attribute with the text o value of the fieldest1
 * @param Attr
 * @param jComponent
 */
private void FillAttr(Attribute Attr, JComponent JTF, boolean Modif) throws PDException
{    
if (Modif && !Attr.isModifAllowed())
    return;
if (Attr.isMultivalued())
    return; /// we where editing directly values
if (Attr.getType()==Attribute.tSTRING)
    {
    Attr.setValue(((JTextField)JTF).getText());
    }
else if (Attr.getType()==Attribute.tTHES)
    {
    PDThesaur SelTerm=((ThesField)JTF).getUseTerm();
    if (SelTerm!=null)
        Attr.setValue(SelTerm.getPDId());
    }
else if (Attr.getType()==Attribute.tDATE)
    {
    String Val=((JTextField)JTF).getText();
    if (Val.length()==0)
        Attr.setValue(null);
    else
        {
        try {
        Attr.setValue(MainWin.getFormatterDate().parse(Val));
        } catch (Exception exf)
            {
             Attr.setValue(null);
            }
        }
//    String Val=((JTextField)JTF).getText();
//    if (Val.length()==0)
//        Attr.setValue(null);
//    Attr.setValue((Date)((JFormattedTextField)JTF).getValue());
    }
else if (Attr.getType()==Attribute.tTIMESTAMP)
    {
    String Val=((JTextField)JTF).getText();
    if (Val.length()==0)
        Attr.setValue(null);
    else
        {
        try {
        Attr.setValue(MainWin.getFormatterTS().parse(Val));
        } catch (Exception exf)
            {
             Attr.setValue(null);
            }
        }        
//    Attr.setValue((Date)((JFormattedTextField)JTF).getValue());
    }
else if (Attr.getType()==Attribute.tBOOLEAN)
    {
    Boolean Act;
    if (((JCheckBox)JTF).isSelected())
        Act=true;
    else
        Act=false;
    Attr.setValue(Act);
    }
else if (Attr.getType()==Attribute.tINTEGER)
    {
//    Long l=(Long)((JFormattedTextField)JTF).getValue();
//    Attr.setValue(new Integer(l.intValue()));
    Attr.setValue(((JFormattedTextField)JTF).getValue());
    }
else
    Attr.setValue("Error, no implementado");
}
//--------------------------------------------------------------
public String GetSelectPath()
{
return(FilePathTextField.getText());
}
//--------------------------------------------------------------
/**
 * Assigns the path of parent folder to be show
 * @param ActFolderPath path of parent folder
 */
void setParentPath(String ActFolderPath)
{
PathTextField.setText(ActFolderPath);
}
//--------------------------------------------------------------
//=========================================
private class MultiField extends JTextField
{
private Attribute Attr;

public MultiField()
{
super();
this.setEditable(false);
}
//--------------------------------------------------------------
public MultiField(String Text)
{
super(Text);
this.setEditable(false);
}
//--------------------------------------------------------------
private void setAttr(Attribute pAttr)
{
Attr=pAttr;
}

/**
* @return the Attr
*/
public Attribute getAttr()
{
return Attr;
}
} //=========================================
}
