/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funciones;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jeison.Zapata
 */
public class tmodcert extends AbstractTableModel{
    
    
      private String[] columnNames ={"Materia", "NotaFinal"};
      private List<aCertificados> dts = new ArrayList<aCertificados>();

       
    
     public tmodcert(List<aCertificados>lst){
        dts=lst;
    }
     
     
          
    @Override
    public int getColumnCount() {
    return columnNames.length;
    }
   
      
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
             public Object getValueAt(int row, int col) {
         
        
        if (col==0)
        return dts.get(row).getMateria();
        if (col==1)
        return   dts.get(row).getMateria();
        
        return null;
    
    }

    @Override
    public void setValueAt(Object value, int row,int col)
    {
        if (col==0)
            dts.get(row).setMateria((String)value);
        if (col==1)
            dts.get(row).setNotaFinal((String)value);
   
        
       
        fireTableCellUpdated(row,col);
    }
    
    public boolean getValueat(int row,int col)
    {
        if(col <3){
            return false;
        }else{
            return true;}
    }
    
    public String[] getColumnNames(){
        return columnNames;
    }
    public void setColumnNames (String[] columnNames){
        this.columnNames=columnNames;
    }
    public List<aCertificados>getData(){
        return dts;
    }
    public void setData(List<aCertificados>data){
        this.dts=dts;
    }
    
    
}
