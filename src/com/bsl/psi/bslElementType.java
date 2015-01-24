package com.bsl.psi;

import com.bsl.bsl;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by ksikora on 1/23/15.
 */
public class bslElementType extends IElementType {
    public bslElementType(@NotNull @NonNls String debugName) {
        super(debugName, bsl.INSTANCE);
    }
}
