package org.example.avoidConstants.wrong;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Records {
    List<Record> all = new ArrayList<>();
    void write(Writer out){
        for(Record record : all){
            try {
                out.write(record.toString());
                out.write(Constants.NEXT_LINE); // Avoid using constants for new line
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class Record {

    }
}
