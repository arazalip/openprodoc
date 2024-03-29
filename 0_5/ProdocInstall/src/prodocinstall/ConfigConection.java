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
 * ConfigConection.java
 *
 * Created on 22-nov-2010, 19:46:32
 */

package prodocinstall;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import prodoc.DriverGeneric;

/**
 *
 * @author jhierrot
 */
public class ConfigConection extends javax.swing.JFrame
{
private static HashMap TransList=new HashMap();
private static String AppLang=null;

/** Creates new form ConfigConection */
public ConfigConection()
{
initComponents();
setLocationRelativeTo(null);
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Url = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DBType = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JDBCClass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AditionalCP = new javax.swing.JTextField();
        AcceptButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(TT("Prodoc_Configuration"));
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(TT("Connection_Config"));

        jLabel2.setText(TT("DataBase_User"));

        jLabel3.setText(TT("DataBase_Password"));

        jLabel4.setText(TT("DataBase_Server_Url"));

        jLabel5.setText(TT("Connection_Type"));

        DBType.setEditable(false);
        DBType.setText("JDBC");
        DBType.setEnabled(false);

        jLabel6.setText(TT("Connection_Java_Class"));

        jLabel7.setText(TT("Aditional_Classpath"));

        AcceptButton.setText(TT("Ok"));
        AcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptButtonActionPerformed(evt);
            }
        });

        CancelButton.setText(TT("Cancel"));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Url, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(DBType, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(JDBCClass, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AcceptButton)
                            .addGap(9, 9, 9)
                            .addComponent(CancelButton))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(AditionalCP, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addComponent(Url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(DBType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addComponent(JDBCClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addComponent(AditionalCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AcceptButton)
                    .addComponent(CancelButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CancelButtonActionPerformed
    {//GEN-HEADEREND:event_CancelButtonActionPerformed
dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void AcceptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AcceptButtonActionPerformed
    {//GEN-HEADEREND:event_AcceptButtonActionPerformed
try {
generateProps();
} catch(Exception ex)
    {
    Message(TT("Error_writing_properties_file")+" Prodoc.properties:"+ex.getLocalizedMessage());
    return;
    }
try {
generateScripts();
} catch(Exception ex)
    {
    Message(TT("Error_writing_script_file")+" Prodoc.sh(.bat):"+ex.getLocalizedMessage());
    return;
    }
dispose();

    }//GEN-LAST:event_AcceptButtonActionPerformed

/**
* @param args the command line arguments
*/
public static void main(String args[])
{
if (args.length>0)
    AppLang=args[0];
java.awt.EventQueue.invokeLater(new Runnable()
    {
    public void run()
    {
    new ConfigConection().setVisible(true);
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButton;
    private javax.swing.JTextField AditionalCP;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField DBType;
    private javax.swing.JTextField JDBCClass;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Url;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

//----------------------------------------------------------
static protected String TT(String Text)
{
String Lang=getLang();
if (Lang.equals("EN"))
    return(Text.replace("_", " "));
Properties Trans=getProperties(Lang);
if (Trans==null)
    return(Text);
String Translation=Trans.getProperty(Text);
if (Translation==null)
    return(Text.replace("_", " "));
else
    return(Translation);
}
//----------------------------------------------------------
static private String getLang()
{
if (AppLang==null)
    {
    Locale locale = Locale.getDefault();
    AppLang=locale.getLanguage().toUpperCase();
    }
return(AppLang);
}
//----------------------------------------------------------
static private Properties getProperties(String Lang)
{
Properties Trans=(Properties)TransList.get(Lang);
if (Trans!=null)
    return(Trans);
InputStream f=null;
try {
f= ConfigConection.class.getResourceAsStream("lang/Text_"+Lang+".properties");
Trans=new Properties();
Trans.load(f);
} catch (Exception ex)
    {
    ex.printStackTrace();
    return(null);
    }
finally
    {
    try {
        f.close();
    } catch (IOException ex)
        {
        System.out.println("------------------------------");
        ex.printStackTrace();
        }
    }
TransList.put(Lang, Trans);
return(Trans);
}
//---------------------------------------------------------------------
/**
 * 
 * @param pMessage
 */
static public void Message(String pMessage)
{
DialogInfo DI=new DialogInfo(null, true);
DI.SetMessage(pMessage);
DI.setLocationRelativeTo(null);
DI.setVisible(true);
}
//---------------------------------------------------------------------
/**
 * Creates a properties file to be used by any client, including to create metadata repository
 * @throws Exception
 */
private void generateProps() throws Exception
{
DriverGeneric.generateProps("Prodoc.properties", "PD", Url.getText(), UserName.getText(), Password.getText(), JDBCClass.getText());
}
//---------------------------------------------------------------------
/**
 * 
 * @throws Exception
 */
private void generateScripts() throws Exception
{
//--- client Swing ---
String Name="Prodoc.";
String OS=System.getProperty("os.name");
if (OS.contains("Win"))
    Name+="bat";
else
    Name+="sh";
PrintWriter FScript = new PrintWriter(Name, "UTF-8");
if (OS.contains("Win"))
    FScript.println("start javaw -Dfile.encoding=UTF-8 -classpath .;.\\lib;.\\lib\\Prodoc.jar;.\\lib\\log4j-1.2.16.jar;ProdocSwing.jar;"+AditionalCP.getText().trim()+"  prodocswing.forms.MainWin %1");
else
    FScript.println("java -Dfile.encoding=UTF-8 -classpath .:./lib:./lib/Prodoc.jar:ProdocSwing.jar:./lib/log4j-1.2.16.jar:"+AditionalCP.getText().trim()+"  prodocswing.forms.MainWin $1");
FScript.flush();
FScript.close();
File f=new File(Name);
f.setExecutable(true);
//--- DDBB Metadata Creation ---
Name="Setup.";
if (OS.contains("Win"))
    Name+="bat";
else
    Name+="sh";
FScript = new PrintWriter(Name, "UTF-8");
if (OS.contains("Win"))
    FScript.println("java -Dfile.encoding=UTF-8 -classpath .;.\\lib;.\\lib\\Prodoc.jar;ProdocSetup.jar;.\\lib\\log4j-1.2.16.jar;"+AditionalCP.getText().trim()+"  prodocsetup.CreateMetadata %1");
else
    FScript.println("java -Dfile.encoding=UTF-8 -classpath .:./lib:./lib/Prodoc.jar:ProdocSetup.jar:./lib/log4j-1.2.16.jar:"+AditionalCP.getText().trim()+"  prodocsetup.CreateMetadata $1");
FScript.flush();
FScript.close();
f=new File(Name);
f.setExecutable(true);
}
//---------------------------------------------------------------------
}
