/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

// To regenerate ./src/main/gen/dev/blachut/svelte/lang/_SvelteLexer.java, execute the following
// java -jar jflex-1.7.0-2.jar -d ./src/main/gen/dev/blachut/svelte/lang/ --skel ./idea-flex.skeleton ./src/main/java/dev/blachut/svelte/lang/Svelte.flex --nobak

package dev.blachut.svelte.lang;

import java.util.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static dev.blachut.svelte.lang.psi.SvelteTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>./src/main/java/dev/blachut/svelte/lang/Svelte.flex</tt>
 */
public class _SvelteLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int VERBATIM_COMMENT = 2;
  public static final int VERBATIM_HTML = 4;
  public static final int HTML_TAG = 6;
  public static final int TAG_STRING = 8;
  public static final int SVELTE_INTERPOLATION_PRE = 10;
  public static final int SVELTE_INTERPOLATION = 12;
  public static final int SVELTE_ATTR = 14;
  public static final int SVELTE_TAG_PRE = 16;
  public static final int SVELTE_TAG = 18;
  public static final int COMMA_OR_PAREN_AWARE = 20;
  public static final int IF_AWARE = 22;
  public static final int AS_AWARE = 24;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\5\1\22\0\1\1\1\4\1\44\1\20\1\2\2\0\1\43\1\32\1\33\2\0\1\31\1\5\1\0\1"+
    "\22\12\2\1\21\1\0\1\3\1\0\1\42\1\0\1\34\32\2\4\0\1\2\1\0\1\24\1\37\1\7\1\36"+
    "\1\16\1\23\1\41\1\25\1\11\2\2\1\15\1\35\1\27\1\2\1\12\1\2\1\10\1\6\1\13\1"+
    "\40\1\2\1\26\1\2\1\14\1\2\1\17\1\0\1\30\7\0\1\1\32\0\1\1\337\0\1\1\177\0\13"+
    "\1\35\0\2\1\5\0\1\1\57\0\1\1\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\15\0\1\1\1\2\1\3\1\4\2\1\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\13"+
    "\1\16\1\17\1\20\1\21\6\22\1\23\1\24\1\25"+
    "\1\21\1\26\1\21\1\27\1\13\3\0\1\30\1\31"+
    "\1\32\2\0\3\21\1\22\1\33\4\22\1\34\1\35"+
    "\4\0\2\21\5\22\1\13\1\36\4\0\2\21\1\22"+
    "\1\37\1\40\1\41\1\22\4\0\1\42\1\21\1\43"+
    "\1\44\1\0\1\45\2\0\1\46\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[104];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\112\0\157\0\224\0\271\0\336\0\u0103"+
    "\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\u01e1\0\u0206\0\u022b"+
    "\0\u0250\0\u0275\0\u029a\0\u01e1\0\u01e1\0\u01e1\0\u01e1\0\u01e1"+
    "\0\u01e1\0\u01e1\0\u01e1\0\u01e1\0\u02bf\0\u01e1\0\u01e1\0\u01e1"+
    "\0\u02e4\0\u0309\0\u032e\0\u0353\0\u0378\0\u039d\0\u03c2\0\u01e1"+
    "\0\u01e1\0\u01e1\0\u01e1\0\u03e7\0\u040c\0\u01e1\0\u0431\0\u0456"+
    "\0\u047b\0\u0250\0\u01e1\0\u01e1\0\u01e1\0\u04a0\0\u04c5\0\u04ea"+
    "\0\u050f\0\u0534\0\u0559\0\u0309\0\u057e\0\u05a3\0\u05c8\0\u05ed"+
    "\0\u01e1\0\u0612\0\u0637\0\u065c\0\u0681\0\u06a6\0\u06cb\0\u06f0"+
    "\0\u0715\0\u073a\0\u075f\0\u0784\0\u07a9\0\u0612\0\u01e1\0\u07ce"+
    "\0\u07f3\0\u0818\0\u083d\0\u0862\0\u0887\0\u08ac\0\u0309\0\u0309"+
    "\0\u0309\0\u08d1\0\u08f6\0\u091b\0\u0940\0\u0965\0\u04ea\0\u098a"+
    "\0\u0309\0\u0309\0\u09af\0\u01e1\0\u09d4\0\u09f9\0\u04ea\0\u0a1e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[104];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\16\1\17\1\16\1\20\13\16\1\21\32\16\1\22"+
    "\42\16\1\23\60\16\1\24\22\16\1\25\1\26\1\27"+
    "\17\16\1\24\23\16\1\30\1\31\45\16\17\32\1\33"+
    "\10\32\1\34\3\32\1\35\10\32\17\36\1\37\10\36"+
    "\1\40\14\36\1\16\1\41\1\42\3\16\1\42\1\43"+
    "\1\42\1\44\1\42\1\45\2\42\1\46\4\16\1\42"+
    "\1\47\3\42\5\16\5\42\3\16\17\32\1\33\10\32"+
    "\1\34\33\32\1\33\10\32\1\34\1\50\1\51\1\52"+
    "\11\32\1\53\1\54\7\53\1\55\16\53\1\56\14\53"+
    "\1\32\1\54\15\32\1\33\4\32\1\57\3\32\1\34"+
    "\14\32\46\0\1\17\47\0\1\60\1\0\1\61\37\0"+
    "\1\62\16\0\1\63\1\64\1\65\27\0\1\66\61\0"+
    "\1\67\24\0\1\70\3\0\11\70\4\0\2\70\1\71"+
    "\2\70\5\0\1\70\1\72\3\70\4\0\1\41\45\0"+
    "\1\42\3\0\11\42\4\0\5\42\5\0\5\42\5\0"+
    "\1\42\3\0\11\42\4\0\1\42\1\73\3\42\5\0"+
    "\5\42\5\0\1\42\3\0\11\42\4\0\1\74\4\42"+
    "\5\0\5\42\5\0\1\42\3\0\11\42\4\0\2\42"+
    "\1\75\2\42\5\0\5\42\5\0\1\42\3\0\7\42"+
    "\1\76\1\42\4\0\1\42\1\77\3\42\5\0\5\42"+
    "\5\0\1\42\3\0\11\42\4\0\3\42\1\100\1\42"+
    "\5\0\5\42\4\0\1\54\66\0\1\101\27\0\1\102"+
    "\43\0\1\103\46\0\1\104\3\0\1\105\73\0\1\25"+
    "\10\0\1\106\40\0\1\70\3\0\11\70\4\0\5\70"+
    "\5\0\5\70\5\0\1\70\3\0\5\70\1\107\3\70"+
    "\4\0\5\70\5\0\5\70\5\0\1\70\3\0\10\70"+
    "\1\110\4\0\5\70\5\0\5\70\5\0\1\42\3\0"+
    "\5\42\1\111\3\42\4\0\5\42\5\0\5\42\5\0"+
    "\1\42\3\0\10\42\1\112\4\0\5\42\5\0\5\42"+
    "\5\0\1\42\3\0\1\113\10\42\4\0\5\42\5\0"+
    "\5\42\5\0\1\42\3\0\1\42\1\114\7\42\4\0"+
    "\5\42\5\0\5\42\5\0\1\42\3\0\11\42\4\0"+
    "\1\42\1\115\3\42\5\0\5\42\5\0\1\116\3\0"+
    "\11\116\4\0\5\116\5\0\5\116\10\0\1\117\47\0"+
    "\1\120\50\0\1\121\37\0\1\122\3\0\1\123\33\0"+
    "\1\70\3\0\11\70\4\0\5\70\5\0\1\124\4\70"+
    "\5\0\1\70\3\0\11\70\4\0\5\70\5\0\2\70"+
    "\1\125\2\70\5\0\1\42\3\0\1\42\1\126\7\42"+
    "\4\0\5\42\5\0\5\42\5\0\1\42\3\0\11\42"+
    "\4\0\4\42\1\127\5\0\5\42\5\0\1\42\3\0"+
    "\10\42\1\130\4\0\5\42\5\0\5\42\5\0\1\42"+
    "\3\0\11\42\4\0\2\42\1\131\2\42\5\0\5\42"+
    "\5\0\1\42\3\0\3\42\1\132\5\42\4\0\5\42"+
    "\5\0\5\42\14\0\1\133\50\0\1\134\37\0\1\135"+
    "\50\0\1\136\32\0\1\70\3\0\7\70\1\137\1\70"+
    "\4\0\5\70\5\0\5\70\5\0\1\70\3\0\11\70"+
    "\4\0\5\70\5\0\3\70\1\140\1\70\5\0\1\42"+
    "\3\0\11\42\4\0\2\42\1\141\2\42\5\0\5\42"+
    "\5\0\1\42\3\0\5\42\1\142\3\42\4\0\5\42"+
    "\5\0\5\42\15\0\1\143\50\0\1\144\37\0\1\145"+
    "\50\0\1\146\31\0\1\70\3\0\11\70\4\0\5\70"+
    "\5\0\4\70\1\147\16\0\1\144\43\0\1\150\50\0"+
    "\1\66\41\0\1\66\31\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2627];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\15\0\1\11\5\1\11\11\1\1\3\11\7\1\4\11"+
    "\2\1\1\11\1\1\3\0\3\11\2\0\11\1\1\11"+
    "\1\1\4\0\10\1\1\11\4\0\7\1\4\0\4\1"+
    "\1\0\1\11\2\0\1\1\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[104];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private char quote;
  private int leftBraceCount;
  private int leftParenCount;
  private int lastState;
  private boolean hadSpaces;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _SvelteLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
      leftBraceCount = 0;
  leftParenCount = 0;
  hadSpaces = false;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return HTML_FRAGMENT;
            } 
            // fall through
          case 39: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 40: break;
          case 3: 
            { yybegin(HTML_TAG); return HTML_FRAGMENT;
            } 
            // fall through
          case 41: break;
          case 4: 
            { yybegin(SVELTE_INTERPOLATION); return START_MUSTACHE;
            } 
            // fall through
          case 42: break;
          case 5: 
            { lastState = yystate(); yybegin(SVELTE_ATTR); return START_MUSTACHE;
            } 
            // fall through
          case 43: break;
          case 6: 
            { yybegin(YYINITIAL); return HTML_FRAGMENT;
            } 
            // fall through
          case 44: break;
          case 7: 
            { yybegin(TAG_STRING); quote = '\''; return HTML_FRAGMENT;
            } 
            // fall through
          case 45: break;
          case 8: 
            { yybegin(TAG_STRING); quote = '"'; return HTML_FRAGMENT;
            } 
            // fall through
          case 46: break;
          case 9: 
            { if (quote == '\'') yybegin(HTML_TAG); return HTML_FRAGMENT;
            } 
            // fall through
          case 47: break;
          case 10: 
            { if (quote == '"') yybegin(HTML_TAG); return HTML_FRAGMENT;
            } 
            // fall through
          case 48: break;
          case 11: 
            { hadSpaces = false; return CODE_FRAGMENT;
            } 
            // fall through
          case 49: break;
          case 12: 
            { hadSpaces = false; leftBraceCount += 1; return CODE_FRAGMENT;
            } 
            // fall through
          case 50: break;
          case 13: 
            { if (leftBraceCount == 0) { yybegin(YYINITIAL); return END_MUSTACHE; } else { hadSpaces = false; leftBraceCount -= 1; return CODE_FRAGMENT; }
            } 
            // fall through
          case 51: break;
          case 14: 
            { return CODE_FRAGMENT;
            } 
            // fall through
          case 52: break;
          case 15: 
            { leftBraceCount += 1; return CODE_FRAGMENT;
            } 
            // fall through
          case 53: break;
          case 16: 
            { if (leftBraceCount == 0) { yybegin(lastState); return END_MUSTACHE; } else { leftBraceCount -= 1; return CODE_FRAGMENT; }
            } 
            // fall through
          case 54: break;
          case 17: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 55: break;
          case 18: 
            { yybegin(SVELTE_TAG); return BAD_CHARACTER;
            } 
            // fall through
          case 56: break;
          case 19: 
            { if (leftBraceCount == 0) { return COMMA; } else { return CODE_FRAGMENT; }
            } 
            // fall through
          case 57: break;
          case 20: 
            { leftParenCount += 1; if (leftParenCount == 1) { return START_PAREN; } else { return CODE_FRAGMENT; }
            } 
            // fall through
          case 58: break;
          case 21: 
            { leftParenCount -= 1; if (leftParenCount == 0) { return END_PAREN; } else { return CODE_FRAGMENT; }
            } 
            // fall through
          case 59: break;
          case 22: 
            { hadSpaces = true; return WHITE_SPACE;
            } 
            // fall through
          case 60: break;
          case 23: 
            { yybegin(YYINITIAL); return END_MUSTACHE;
            } 
            // fall through
          case 61: break;
          case 24: 
            { yybegin(SVELTE_TAG_PRE); return START_OPENING_MUSTACHE;
            } 
            // fall through
          case 62: break;
          case 25: 
            { yybegin(SVELTE_TAG_PRE); return START_INNER_MUSTACHE;
            } 
            // fall through
          case 63: break;
          case 26: 
            { yybegin(SVELTE_TAG_PRE); return START_CLOSING_MUSTACHE;
            } 
            // fall through
          case 64: break;
          case 27: 
            { yybegin(SVELTE_TAG); return IF;
            } 
            // fall through
          case 65: break;
          case 28: 
            { yybegin(SVELTE_TAG); return hadSpaces ? IF : BAD_CHARACTER;
            } 
            // fall through
          case 66: break;
          case 29: 
            { if (hadSpaces) {yybegin(COMMA_OR_PAREN_AWARE); return AS; } else { return CODE_FRAGMENT; }
            } 
            // fall through
          case 67: break;
          case 30: 
            { yybegin(VERBATIM_COMMENT); return HTML_FRAGMENT;
            } 
            // fall through
          case 68: break;
          case 31: 
            { yybegin(SVELTE_TAG); return THEN;
            } 
            // fall through
          case 69: break;
          case 32: 
            { hadSpaces = false; yybegin(IF_AWARE); return ELSE;
            } 
            // fall through
          case 70: break;
          case 33: 
            { hadSpaces = false; yybegin(AS_AWARE); return EACH;
            } 
            // fall through
          case 71: break;
          case 34: 
            { return HTML_PREFIX;
            } 
            // fall through
          case 72: break;
          case 35: 
            { yybegin(SVELTE_TAG); return CATCH;
            } 
            // fall through
          case 73: break;
          case 36: 
            { yybegin(SVELTE_TAG); return AWAIT;
            } 
            // fall through
          case 74: break;
          case 37: 
            { yybegin(VERBATIM_HTML); return HTML_FRAGMENT;
            } 
            // fall through
          case 75: break;
          case 38: 
            { return DEBUG_PREFIX;
            } 
            // fall through
          case 76: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
