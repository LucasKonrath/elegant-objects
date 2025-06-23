package org.example.naming.right;

import java.io.InputStream;

interface OutputPipe {
    void write(InputStream content);
    int bytes();
    long time();
}
