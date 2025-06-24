package org.example.avoidConstants.right;

import org.example.avoidConstants.wrong.Constants;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Rows {
   void print(PrintStream printStream){
       for(Row row: this.fetch()){
              try {
                printStream.print(new EOLString(row.toString()));
              } catch (Exception e) {
                e.printStackTrace();
              }
       }
   }

   public List<Row> fetch(){
       return new ArrayList<Row>();
   }

   public static class Row {
       
   }
}
