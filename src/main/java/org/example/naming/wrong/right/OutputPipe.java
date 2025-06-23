package org.example.naming.wrong.right;

import java.io.InputStream;

interface OutputPipe {
    void write(InputStream content);
    int bytes();
    long time();
}
