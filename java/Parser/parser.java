
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Mon Apr 05 23:04:42 CEST 2004
//----------------------------------------------------

package Parser;

import java_cup.runtime.*;

/** CUP v0.10k generated parser.
  * @version Mon Apr 05 23:04:42 CEST 2004
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\003\004\000\002\004" +
    "\010\000\002\006\007\000\002\007\003\000\002\007\005" +
    "\000\002\010\006\000\002\011\003\000\002\011\003\000" +
    "\002\012\003\000\002\012\005\000\002\005\014\000\002" +
    "\005\013\000\002\013\007\000\002\014\003\000\002\014" +
    "\004\000\002\016\012\000\002\020\005\000\002\020\005" +
    "\000\002\020\005\000\002\020\005\000\002\020\005\000" +
    "\002\020\005\000\002\020\004\000\002\020\003\000\002" +
    "\020\003\000\002\017\003\000\002\017\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\004\014\006\001\002\000\004\002\116\001" +
    "\002\000\004\042\036\001\002\000\004\050\007\001\002" +
    "\000\004\016\010\001\002\000\004\021\012\001\002\000" +
    "\004\020\033\001\002\000\004\005\013\001\002\000\004" +
    "\050\015\001\002\000\004\007\026\001\002\000\006\007" +
    "\ufff8\011\024\001\002\000\004\006\022\001\002\000\006" +
    "\006\ufffd\010\020\001\002\000\004\050\015\001\002\000" +
    "\004\006\ufffc\001\002\000\004\010\023\001\002\000\004" +
    "\020\ufffe\001\002\000\004\050\015\001\002\000\004\007" +
    "\ufff7\001\002\000\006\040\030\041\027\001\002\000\004" +
    "\034\ufff9\001\002\000\004\034\ufffa\001\002\000\004\034" +
    "\032\001\002\000\006\006\ufffb\010\ufffb\001\002\000\004" +
    "\010\034\001\002\000\004\042\uffff\001\002\000\004\002" +
    "\000\001\002\000\004\050\037\001\002\000\004\043\040" +
    "\001\002\000\004\050\041\001\002\000\004\016\042\001" +
    "\002\000\006\017\044\044\045\001\002\000\004\017\112" +
    "\001\002\000\004\050\053\001\002\000\004\050\015\001" +
    "\002\000\004\007\047\001\002\000\004\034\050\001\002" +
    "\000\004\010\051\001\002\000\004\017\ufff4\001\002\000" +
    "\006\020\ufff3\050\053\001\002\000\004\004\057\001\002" +
    "\000\004\020\055\001\002\000\004\010\056\001\002\000" +
    "\004\002\ufff5\001\002\000\004\036\060\001\002\000\014" +
    "\005\064\027\062\031\061\032\063\050\066\001\002\000" +
    "\020\006\uffe7\022\uffe7\023\uffe7\024\uffe7\025\uffe7\026\uffe7" +
    "\033\uffe7\001\002\000\014\005\064\027\062\031\061\032" +
    "\063\050\066\001\002\000\020\006\uffe6\022\uffe6\023\uffe6" +
    "\024\uffe6\025\uffe6\026\uffe6\033\uffe6\001\002\000\014\005" +
    "\064\027\062\031\061\032\063\050\066\001\002\000\016" +
    "\022\071\023\075\024\073\025\070\026\072\033\074\001" +
    "\002\000\020\006\uffe9\022\uffe9\023\uffe9\024\uffe9\025\uffe9" +
    "\026\uffe9\033\uffe9\001\002\000\020\006\uffe8\022\uffe8\023" +
    "\uffe8\024\uffe8\025\uffe8\026\uffe8\033\uffe8\001\002\000\014" +
    "\005\064\027\062\031\061\032\063\050\066\001\002\000" +
    "\014\005\064\027\062\031\061\032\063\050\066\001\002" +
    "\000\014\005\064\027\062\031\061\032\063\050\066\001" +
    "\002\000\014\005\064\027\062\031\061\032\063\050\066" +
    "\001\002\000\004\047\077\001\002\000\014\005\064\027" +
    "\062\031\061\032\063\050\066\001\002\000\020\006\uffef" +
    "\022\uffef\023\uffef\024\uffef\025\uffef\026\uffef\033\uffef\001" +
    "\002\000\004\030\100\001\002\000\004\010\101\001\002" +
    "\000\006\020\ufff1\050\ufff1\001\002\000\020\006\uffee\022" +
    "\uffee\023\uffee\024\uffee\025\uffee\026\uffee\033\uffee\001\002" +
    "\000\020\006\uffed\022\uffed\023\uffed\024\uffed\025\uffed\026" +
    "\uffed\033\uffed\001\002\000\020\006\ufff0\022\ufff0\023\ufff0" +
    "\024\ufff0\025\ufff0\026\ufff0\033\ufff0\001\002\000\020\006" +
    "\uffec\022\uffec\023\uffec\024\uffec\025\uffec\026\uffec\033\uffec" +
    "\001\002\000\016\006\107\022\071\023\075\024\073\025" +
    "\070\026\072\001\002\000\020\006\uffeb\022\uffeb\023\uffeb" +
    "\024\uffeb\025\uffeb\026\uffeb\033\uffeb\001\002\000\020\006" +
    "\uffea\022\uffea\023\uffea\024\uffea\025\uffea\026\uffea\033\uffea" +
    "\001\002\000\004\020\ufff2\001\002\000\004\050\053\001" +
    "\002\000\004\020\114\001\002\000\004\010\115\001\002" +
    "\000\004\002\ufff6\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\006\003\003\004\004\001\001\000\002\001" +
    "\001\000\004\005\034\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\010\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\007\015\010\016\012\013\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\007\020\010\016\012\013\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\024\001\001\000\002\001\001\000\004\011\030" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\013\042\001\001" +
    "\000\002\001\001\000\006\014\053\016\051\001\001\000" +
    "\004\012\045\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\014\110\016" +
    "\051\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\017" +
    "\066\020\064\001\001\000\002\001\001\000\006\017\066" +
    "\020\107\001\001\000\002\001\001\000\006\017\066\020" +
    "\105\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\017\066\020\104\001\001\000\006\017" +
    "\066\020\103\001\001\000\006\017\066\020\102\001\001" +
    "\000\006\017\066\020\101\001\001\000\002\001\001\000" +
    "\006\017\066\020\075\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\014\112\016\051\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



public void syntax_error(Symbol s) {
  report_error("Error de sintaxis en linea " + s.left, null);
}

public void unrecovered_syntax_error(Symbol s) throws
  java.lang.Exception {
  report_fatal_error("", null);
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // CLog ::= CERO 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(13/*CLog*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // CLog ::= UNO 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(13/*CLog*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Expr ::= CLog 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*Expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Expr ::= IDENT 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*Expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Expr ::= NOT Expr 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*Expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Expr ::= PAREN Expr TESIS 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*Expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Expr ::= Expr NAND Expr 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*Expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Expr ::= Expr NOR Expr 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*Expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Expr ::= Expr XOR Expr 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*Expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Expr ::= Expr OR Expr 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*Expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Expr ::= Expr AND Expr 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*Expr*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Concurrent_statement ::= IDENT ASOP TRANSPORT Expr AFTER CENT NANOSEG PUNTOCOMA 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(12/*Concurrent_statement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Architecture_statement_part ::= Concurrent_statement Architecture_statement_part 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(10/*Architecture_statement_part*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Architecture_statement_part ::= Concurrent_statement 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(10/*Architecture_statement_part*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Signal_declaration ::= SIGNAL Identifier_list DOSPUNTOS BIT PUNTOCOMA 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*Signal_declaration*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Architecture_body ::= ARCHITECTURE IDENT OF IDENT IS BEGIN Architecture_statement_part END PUNTOCOMA 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*Architecture_body*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Architecture_body ::= ARCHITECTURE IDENT OF IDENT IS Signal_declaration BEGIN Architecture_statement_part END PUNTOCOMA 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*Architecture_body*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Identifier_list ::= IDENT COMA Identifier_list 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*Identifier_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Identifier_list ::= IDENT 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*Identifier_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Mode ::= OUT 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*Mode*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Mode ::= IN 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*Mode*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Interface_element ::= Identifier_list DOSPUNTOS Mode BIT 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*Interface_element*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Interface_list ::= Interface_element PUNTOCOMA Interface_list 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*Interface_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Interface_list ::= Interface_element 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*Interface_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Port_clause ::= PORT PAREN Interface_list TESIS PUNTOCOMA 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*Port_clause*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Entity_declaration ::= ENTITY IDENT IS Port_clause END PUNTOCOMA 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*Entity_declaration*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Desig_unit ::= Entity_declaration Architecture_body 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*Desig_unit*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Desig_unit EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

