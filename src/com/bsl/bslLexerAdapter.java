package com.bsl;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;

import java.io.Reader;

/**
 * Created by ksikora on 1/23/15.
 */
public class bslLexerAdapter extends FlexAdapter {

    public bslLexerAdapter(FlexLexer flex) {
        super(new bslLexer((Reader) null));
    }
}
