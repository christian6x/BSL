// This is a generated file. Not intended for manual editing.
package com.bsl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.bsl.psi.bslTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class bslParser implements PsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == CODE) {
      r = code(b, 0);
    }
    else if (t == CODE_LINE) {
      r = codeLine(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return simpleFile(b, l + 1);
  }

  /* ********************************************************** */
  // X ";"
  public static boolean code(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code")) return false;
    if (!nextTokenIs(b, X)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, X);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, CODE, r);
    return r;
  }

  /* ********************************************************** */
  // code | codeLine code
  public static boolean codeLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "codeLine")) return false;
    if (!nextTokenIs(b, X)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code(b, l + 1);
    if (!r) r = codeLine_1(b, l + 1);
    exit_section_(b, m, CODE_LINE, r);
    return r;
  }

  // codeLine code
  private static boolean codeLine_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "codeLine_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = codeLine(b, l + 1);
    r = r && code(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // codeLine|COMMENT|CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = codeLine(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean simpleFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

}
