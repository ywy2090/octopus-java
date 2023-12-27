// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/hive/v3/HintParser.g4
// by ANTLR 4.13.1
package octopus.antlr.codegen.hive.v3;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/** This interface defines a complete listener for a parse tree produced by {@link HintParser}. */
public interface HintParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link HintParser#hint}.
     *
     * @param ctx the parse tree
     */
    void enterHint(HintParser.HintContext ctx);
    /**
     * Exit a parse tree produced by {@link HintParser#hint}.
     *
     * @param ctx the parse tree
     */
    void exitHint(HintParser.HintContext ctx);
    /**
     * Enter a parse tree produced by {@link HintParser#hintList}.
     *
     * @param ctx the parse tree
     */
    void enterHintList(HintParser.HintListContext ctx);
    /**
     * Exit a parse tree produced by {@link HintParser#hintList}.
     *
     * @param ctx the parse tree
     */
    void exitHintList(HintParser.HintListContext ctx);
    /**
     * Enter a parse tree produced by {@link HintParser#hintItem}.
     *
     * @param ctx the parse tree
     */
    void enterHintItem(HintParser.HintItemContext ctx);
    /**
     * Exit a parse tree produced by {@link HintParser#hintItem}.
     *
     * @param ctx the parse tree
     */
    void exitHintItem(HintParser.HintItemContext ctx);
    /**
     * Enter a parse tree produced by {@link HintParser#hintName}.
     *
     * @param ctx the parse tree
     */
    void enterHintName(HintParser.HintNameContext ctx);
    /**
     * Exit a parse tree produced by {@link HintParser#hintName}.
     *
     * @param ctx the parse tree
     */
    void exitHintName(HintParser.HintNameContext ctx);
    /**
     * Enter a parse tree produced by {@link HintParser#hintArgs}.
     *
     * @param ctx the parse tree
     */
    void enterHintArgs(HintParser.HintArgsContext ctx);
    /**
     * Exit a parse tree produced by {@link HintParser#hintArgs}.
     *
     * @param ctx the parse tree
     */
    void exitHintArgs(HintParser.HintArgsContext ctx);
    /**
     * Enter a parse tree produced by {@link HintParser#hintArgName}.
     *
     * @param ctx the parse tree
     */
    void enterHintArgName(HintParser.HintArgNameContext ctx);
    /**
     * Exit a parse tree produced by {@link HintParser#hintArgName}.
     *
     * @param ctx the parse tree
     */
    void exitHintArgName(HintParser.HintArgNameContext ctx);
}
