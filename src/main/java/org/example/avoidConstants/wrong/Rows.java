package org.example.avoidConstants.wrong;

import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Rows {
   void print(PrintStream printStream){
       for(Row row: this.fetch()){
              try {
                printStream.print(row.toString());
                printStream.print(Constants.NEXT_LINE);
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
