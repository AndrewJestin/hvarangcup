package main;

/**
 * Created by Daha on 24.04.2017.
 */



import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

    /**
     * Created by Andrew on 29.03.2017.
     */
    public class BookTableModel extends AbstractTableModel {
        private int columnCount = 5;

        private ArrayList<String []> dataArrayList;
        public BookTableModel(){
            dataArrayList = new ArrayList<String []>();
            for (int i=0; i<dataArrayList.size();i++ ){
                dataArrayList.add(new String[getColumnCount()]);
            }
        }
        @Override
        public int getRowCount() {
            return dataArrayList.size();
        }

        @Override
        public int getColumnCount() {
            return columnCount;
        }
        @Override

        public String getColumnName  (int columnIndex) {
            switch(columnIndex){
                case 0: return "Umpire ID";
                case 1: return "Round No";
                case 2: return "Time";
                case 3: return "Description";
                case 4: return "Total Score";
            }

            return "";
        }
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            String [] rows = dataArrayList.get(rowIndex);

            return rows[columnIndex];
        }
        public void addDate(String [] row){
            String []rowTable = new String[getColumnCount()];
            rowTable = row;
            dataArrayList.add(rowTable);
        }
    }



