// This is a generated file. Not intended for manual editing.
package com.bsl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.bsl.psi.bslTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.bsl.psi.*;

public class bslCodeLineImpl extends ASTWrapperPsiElement implements bslCodeLine {

  public bslCodeLineImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof bslVisitor) ((bslVisitor)visitor).visitCodeLine(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public bslCode getCode() {
    return findNotNullChildByClass(bslCode.class);
  }

  @Override
  @Nullable
  public bslCodeLine getCodeLine() {
    return findChildByClass(bslCodeLine.class);
  }

}
