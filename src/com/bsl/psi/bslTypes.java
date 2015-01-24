// This is a generated file. Not intended for manual editing.
package com.bsl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.bsl.psi.impl.*;

public interface bslTypes {

  IElementType CODE = new bslElementType("CODE");
  IElementType CODE_LINE = new bslElementType("CODE_LINE");

  IElementType COMMENT = new bslTokenType("COMMENT");
  IElementType CRLF = new bslTokenType("CRLF");
  IElementType X = new bslTokenType("X");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CODE) {
        return new bslCodeImpl(node);
      }
      else if (type == CODE_LINE) {
        return new bslCodeLineImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
