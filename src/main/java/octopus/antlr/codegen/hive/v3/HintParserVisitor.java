// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/hive/v3/HintParser.g4
// by ANTLR 4.13.1
package octopus.antlr.codegen.hive.v3;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced by {@link
 * HintParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
public interface HintParserVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link HintParser#hint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHint(HintParser.HintContext ctx);
    /**
     * Visit a parse tree produced by {@link HintParser#hintList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHintList(HintParser.HintListContext ctx);
    /**
     * Visit a parse tree produced by {@link HintParser#hintItem}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHintItem(HintParser.HintItemContext ctx);
    /**
     * Visit a parse tree produced by {@link HintParser#hintName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHintName(HintParser.HintNameContext ctx);
    /**
     * Visit a parse tree produced by {@link HintParser#hintArgs}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHintArgs(HintParser.HintArgsContext ctx);
    /**
     * Visit a parse tree produced by {@link HintParser#hintArgName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHintArgName(HintParser.HintArgNameContext ctx);
}
