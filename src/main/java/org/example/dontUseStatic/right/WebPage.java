package org.example.dontUseStatic.right;

public class WebPage {
    private final String uri;
    public WebPage(String uri){
        this.uri = uri;
    }
    public String read() {
        // Instead of using a static method, we use an instance method that operates on the instance's state.
        return uri;
    }
}
