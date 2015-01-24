package com.bsl.psi;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import com.bsl.bsl;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
/**
 * Created by ksikora on 1/23/15.
 */
public class bslTokenType extends  IElementType {
    public bslTokenType(@NotNull @NonNls String debugName) {
        super(debugName, bsl.INSTANCE);
    }

    @Override
    public String toString()
    {
        return "bslTokenType." + super.toString();
    }
}
