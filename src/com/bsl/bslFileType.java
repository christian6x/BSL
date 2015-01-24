package com.bsl;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by ksikora on 1/23/15.
 */
public class bslFileType extends LanguageFileType{

    public static final bslFileType INSTANCE = new bslFileType();

    private bslFileType()
    {
        super(bsl.INSTANCE);
    }
    @NotNull
    @Override
    public String getName() {
        return "BSL";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "BSL file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "bsl:";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return bslIcons.FILE;
    }
}
