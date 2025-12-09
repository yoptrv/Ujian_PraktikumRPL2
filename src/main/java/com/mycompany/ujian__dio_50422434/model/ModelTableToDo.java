/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian__dio_50422434.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableToDo extends AbstractTableModel {

    private List<ToDo> list;
    private String[] col = {"ID", "Title", "Description", "Deadline"};

    public ModelTableToDo(List<ToDo> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return col.length;
    }

    @Override
    public Object getValueAt(int row, int colIndex) {
        ToDo t = list.get(row);
        return switch (colIndex) {
            case 0 -> t.getId();
            case 1 -> t.getTitle();
            case 2 -> t.getDescription();
            case 3 -> t.getDeadline();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int colIndex) {
        return col[colIndex];
    }

    public void setList(List<ToDo> newList) {
        this.list = newList;
        fireTableDataChanged();
    }
}