// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/calc/Calc.g4 by ANTLR
// 4.13.1
package myfirstjava.demo.antlr.codegen.calc;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced by {@link
 * CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link CalcParser#line}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLine(CalcParser.LineContext ctx);
    /**
     * Visit a parse tree produced by the {@code multOrDiv} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMultOrDiv(CalcParser.MultOrDivContext ctx);
    /**
     * Visit a parse tree produced by the {@code addOrSubstract} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddOrSubstract(CalcParser.AddOrSubstractContext ctx);
    /**
     * Visit a parse tree produced by the {@code float} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloat(CalcParser.FloatContext ctx);
    /**
     * Visit a parse tree produced by the {@code parenExpr} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParenExpr(CalcParser.ParenExprContext ctx);
}
