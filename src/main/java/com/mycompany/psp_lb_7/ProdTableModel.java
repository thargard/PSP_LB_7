package com.mycompany.psp_lb_7;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ProdTableModel extends AbstractTableModel {
    private int colnum = 5;
    private int rownum;

    /*private String[] colNames = {
            "CarID", "Name", "Type", "Vendor"
    };*/

    private String[] colNames = {
            "ProductId", "Name", "Price", "Amount", "Year"
    };

    private ArrayList<String[]> ResultSets;

    public ProdTableModel(ResultSet rs) {
        ResultSets = new ArrayList<>();
        try {
            while (rs.next()) {
                String[] row =
                        {
                                rs.getString(colNames[0]),
                                rs.getString(colNames[1]),
                                rs.getString(colNames[2]),
                                rs.getString(colNames[3]),
                                rs.getString(colNames[4])
                        };
                ResultSets.add(row);
            }
        } catch (Exception e) {
            System.out.println("Exception in CarTableModel");
        }
    }


    @Override
    public int getRowCount() {
        return ResultSets.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return ResultSets.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int param) {
        return colNames[param];
    }
}
