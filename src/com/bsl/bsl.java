package com.bsl;
import com.intellij.lang.Language;
/**
 * Created by ksikora on 1/23/15.
 */
public class bsl extends Language {
    public static final bsl INSTANCE = new bsl();
    private bsl()
    {
        super("BSL");
    }
}
