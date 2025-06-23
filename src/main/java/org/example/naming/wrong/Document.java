package org.example.naming.wrong;

import java.io.InputStream;

abstract class Document {
    // Wrong - it should return void
    abstract int write(InputStream content);
}
