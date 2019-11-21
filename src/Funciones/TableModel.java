/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Funciones.aEstudiante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jeison.zapata
 */
public class TableModel extends AbstractTableModel {
    
      
    
    private String[] columnNames ={"COD ESTUDIANTE","NOMBRE","APELLIDO","CEDULA"};
    private List<aEstudiante> data = new ArrayList<aEstudiante>();

    
   
    public TableModel(List<aEstudiante>lst){
        data=lst;
    }
    @Override
    public int getColumnCount() {
    return columnNames.length;
    }
    

    @Override
    public int getRowCount() {
    return data.size();
    }
    
 
    @Override
    public String getColumnName(int col) {
    return columnNames[col];
    }
    

    
    @Override
             public Object getValueAt(int row, int col) {
         
        
        if (col==0)
        return data.get(row).getIdEstudiante();
        if (col==1)
        return    data.get(row).getNomEstudiante();
        if (col==2)
        return    data.get(row).getApllEstudiante();
        if (col==3)
        return    data.get(row).getNumDocumento();
        
        return null;
    
    }
    
    @Override
    public void setValueAt(Object value, int row,int col)
    {
        if (col==0)
            data.get(row).setIdEstudiante((Integer)value);
        if (col==1)
            data.get(row).setNomEstudiante((String)value);
        if (col==2)
            data.get(row).setApllEstudiante((String)value);
        if (col==3)
            data.get(row).setNumDocumento((String)value);

        
       
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
    public List<aEstudiante>getData(){
        return data;
    }
    public void setData(List<aEstudiante>data){
        this.data=data;
    }
    
    
}
