package org.example.avoidConstants.right;

import org.example.avoidConstants.wrong.Constants;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Records {
    List<Record> all = new ArrayList<>();
    void write(Writer out){
        for(Record record : all){
            try {
                out.write(new EOLString(record.toString()).toString()); // Avoid using constants for new line
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class Record {

    }
}
