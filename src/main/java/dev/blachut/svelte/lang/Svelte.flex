// To regenerate ./src/main/gen/dev/blachut/svelte/lang/_SvelteLexer.java, execute the following
// java -jar jflex-1.7.0-2.jar -d ./src/main/gen/dev/blachut/svelte/lang/ --skel ./idea-flex.skeleton ./src/main/java/dev/blachut/svelte/lang/Svelte.flex --nobak

package dev.blachut.svelte.lang;

import java.util.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static dev.blachut.svelte.lang.psi.SvelteTypes.*;

%%

%{
  private char quote;
  private int leftBraceCount;
  private int leftParenCount;
  private int lastState;
  private boolean hadSpaces;
%}

//%debug
%public
%class _SvelteLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%eof{
  leftBraceCount = 0;
  leftParenCount = 0;
  hadSpaces = false;
%eof}

WHITE_SPACE=\s+
ID=[$_a-zA-Z0-9]+

%state VERBATIM_COMMENT
%state VERBATIM_HTML
%state HTML_TAG
%state TAG_STRING
%state SVELTE_INTERPOLATION_PRE
%state SVELTE_INTERPOLATION
%state SVELTE_ATTR
%state SVELTE_TAG_PRE
%state SVELTE_TAG
%state COMMA_OR_PAREN_AWARE
%state IF_AWARE
%state AS_AWARE

%%
<YYINITIAL> {
  "<!--"                  { yybegin(VERBATIM_COMMENT); return HTML_FRAGMENT; }
  "<script" | "<style"    { yybegin(VERBATIM_HTML); return HTML_FRAGMENT; }
  "<"                     { yybegin(HTML_TAG); return HTML_FRAGMENT; }
  "{"\s*"#"               { yybegin(SVELTE_TAG_PRE); return START_OPENING_MUSTACHE; }
  "{"\s*":"               { yybegin(SVELTE_TAG_PRE); return START_INNER_MUSTACHE; }
  "{"\s*"/"               { yybegin(SVELTE_TAG_PRE); return START_CLOSING_MUSTACHE; }
  "{"                     { yybegin(SVELTE_INTERPOLATION); return START_MUSTACHE; }
  {WHITE_SPACE}           { return WHITE_SPACE; }
}

<SVELTE_TAG_PRE> {
  "if"               { yybegin(SVELTE_TAG); return IF; }
  "each"             { hadSpaces = false; yybegin(AS_AWARE); return EACH; }
  "await"            { yybegin(SVELTE_TAG); return AWAIT; }
  "then"             { yybegin(SVELTE_TAG); return THEN; }
  "catch"            { yybegin(SVELTE_TAG); return CATCH; }
  "else"             { hadSpaces = false; yybegin(IF_AWARE); return ELSE; }
  {ID}               { yybegin(SVELTE_TAG); return BAD_CHARACTER; }
  {WHITE_SPACE}      { return BAD_CHARACTER; }
}

<AS_AWARE> {
  "as"{ID}           { hadSpaces = false; return CODE_FRAGMENT; }
  "as"               { if (hadSpaces) {yybegin(COMMA_OR_PAREN_AWARE); return AS; } else { return CODE_FRAGMENT; } }
  {WHITE_SPACE}      { hadSpaces = true; return WHITE_SPACE; }
}

<IF_AWARE> {
  "if"               { yybegin(SVELTE_TAG); return hadSpaces ? IF : BAD_CHARACTER; }
  {WHITE_SPACE}      { hadSpaces = true; return WHITE_SPACE; }
  "}"                { yybegin(YYINITIAL); return END_MUSTACHE; }
  [^]                { return BAD_CHARACTER; }
}

<COMMA_OR_PAREN_AWARE> {
  ","                { if (leftBraceCount == 0) { return COMMA; } else { return CODE_FRAGMENT; } }
  "("                { leftParenCount += 1; if (leftParenCount == 1) { return START_PAREN; } else { return CODE_FRAGMENT; } }
  ")"                { leftParenCount -= 1; if (leftParenCount == 0) { return END_PAREN; } else { return CODE_FRAGMENT; } }
}

<SVELTE_INTERPOLATION> {
  "@html"            { return HTML_PREFIX; }
  "@debug"           { return DEBUG_PREFIX; }
  "@"{ID}            { return BAD_CHARACTER; }
}

<SVELTE_INTERPOLATION, SVELTE_TAG, COMMA_OR_PAREN_AWARE, AS_AWARE> {
  "{"                { hadSpaces = false; leftBraceCount += 1; return CODE_FRAGMENT; }
  "}"                { if (leftBraceCount == 0) { yybegin(YYINITIAL); return END_MUSTACHE; } else { hadSpaces = false; leftBraceCount -= 1; return CODE_FRAGMENT; } }
  [^]                { hadSpaces = false; return CODE_FRAGMENT; }
}

<SVELTE_ATTR> {
  "{"                { leftBraceCount += 1; return CODE_FRAGMENT; }
  "}"                { if (leftBraceCount == 0) { yybegin(lastState); return END_MUSTACHE; } else { leftBraceCount -= 1; return CODE_FRAGMENT; } }
  [^]                { return CODE_FRAGMENT; }
}

<VERBATIM_COMMENT> {
  "-->"                       { yybegin(YYINITIAL); return HTML_FRAGMENT; }
}

<VERBATIM_HTML> {
  "</script>" | "</style>"    { yybegin(YYINITIAL); return HTML_FRAGMENT; }
}

<HTML_TAG> {
  "'"                         { yybegin(TAG_STRING); quote = '\''; return HTML_FRAGMENT; }
  "\""                        { yybegin(TAG_STRING); quote = '"'; return HTML_FRAGMENT; }
  ">"                         { yybegin(YYINITIAL); return HTML_FRAGMENT; }
  "{"                         { lastState = yystate(); yybegin(SVELTE_ATTR); return START_MUSTACHE; }
}

<TAG_STRING> {
  "'"                         { if (quote == '\'') yybegin(HTML_TAG); return HTML_FRAGMENT; }
  "\""                        { if (quote == '"') yybegin(HTML_TAG); return HTML_FRAGMENT; }
  "{"                         { lastState = yystate(); yybegin(SVELTE_ATTR); return START_MUSTACHE; }
}

[^]                           { return HTML_FRAGMENT; }
