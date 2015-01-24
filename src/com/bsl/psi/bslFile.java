package com.bsl.psi;

import com.bsl.bsl;
import com.bsl.bslFileType;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.sun.istack.internal.NotNull;
import javax.swing.*;
/**
 * Created by ksikora on 1/23/15.
 */
public class bslFile extends PsiFileBase {
    public bslFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, bsl.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return bslFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "BSL File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
