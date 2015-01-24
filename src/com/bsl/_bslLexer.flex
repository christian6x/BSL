package com.bsl;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.bsl.psi.bslTypes.*;

%%

%{
  public _bslLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _bslLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+


%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "<codeLine>"       { return <CODELINE>; }
  "COMMENT"          { return COMMENT; }
  "CRLF"             { return CRLF; }
  "<code>"           { return <CODE>; }
  "X"                { return X; }


  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
