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

package prodocswing.forms;

import javax.swing.JDialog;
import prodoc.ObjPD;
import prodoc.PDException;

/**
 *
 * @author jhierrot
 */
public class ListRepositories extends ListObjects
{
/**
 * 
 * @param parent
 * @param modal
 * @param pPDObject
 */
public ListRepositories(java.awt.Frame parent, boolean modal, ObjPD pPDObject)
{
super(parent, modal, pPDObject);
}
//--------------------------------------------------------------------
@Override
protected javax.swing.JDialog AddMode() throws PDException
{
MantRepositories MU = new MantRepositories(Fparent, true);
MU.setRecord(PDObject.getRecord());
MU.AddMode();
return(MU);
}
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
@Override
protected boolean AddModeOk()  throws PDException
{
MantRepositories MU=(MantRepositories)MantForm;
if (MU.isCancel())
    return(false);
PDObject.assignValues(MU.getRecord());
return(true);
}
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
@Override
protected JDialog DelMode() throws PDException
{
MantRepositories MU = new MantRepositories(Fparent, true);
MU.setRecord(getPDTableModel().getElement(getSelectedRow()));
MU.DelMode();
return(MU);
}
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
@Override
protected boolean DelModeOk() throws PDException
{
MantRepositories MU=(MantRepositories)MantForm;
if (MU.isCancel())
    return(false);
PDObject.assignValues(MU.getRecord());
return(true);
}
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
@Override
protected JDialog EditMode() throws PDException
{
MantRepositories MU = new MantRepositories(Fparent, true);
MU.setRecord(getPDTableModel().getElement(getSelectedRow()));
MU.EditMode();
return(MU);
}
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
@Override
protected boolean EditModeOk() throws PDException
{
MantRepositories MU=(MantRepositories)MantForm;
if (MU.isCancel())
    return(false);
//MU.getRecord().Verify();
PDObject.assignValues(MU.getRecord());
return(true);
}
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
@Override
protected JDialog CopyMode() throws PDException
{
MantRepositories MU = new MantRepositories(Fparent, true);
MU.setRecord(getPDTableModel().getElement(getSelectedRow()));
MU.CopyMode();
return(MU);
}
//--------------------------------------------------------------------
/**
 * 
 * @return
 * @throws PDException
 */
@Override
protected boolean CopyModeOk() throws PDException
{
MantRepositories MU=(MantRepositories)MantForm;
if (MU.isCancel())
    return(false);
PDObject.assignValues(MU.getRecord());
return(true);
}
//--------------------------------------------------------------------
/**
 * 
 */
@Override
protected void AssignLabels()
{
setTitle(MainWin.TT("Mantenimiento de Repositorios"));
getAddButton().setToolTipText(MainWin.TT("Añadir Repositorios"));
getDelButton().setToolTipText(MainWin.TT("Borrado Repositorios"));
getEditButton().setToolTipText(MainWin.TT("Modificación de Repositorios"));
getCopyButton().setToolTipText(MainWin.TT("Copia de Repositorios"));
getExportButton().setToolTipText(MainWin.TT("Exportar Repositorios"));
getExportAllButton().setToolTipText(MainWin.TT("Export_All"));
getImportButton().setToolTipText(MainWin.TT("Import_Repository"));
getjLabel1().setText(MainWin.TT("Filter_Repository"));
getUserFilter().setToolTipText(MainWin.TT("Type_partial_or_complete_Repository_name"));
}
//--------------------------------------------------------------------
}
