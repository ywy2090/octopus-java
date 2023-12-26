// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/calc/Calc.g4 by ANTLR
// 4.13.1
package myfirstjava.demo.antlr.codegen.calc;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/** This interface defines a complete listener for a parse tree produced by {@link CalcParser}. */
public interface CalcListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link CalcParser#line}.
     *
     * @param ctx the parse tree
     */
    void enterLine(CalcParser.LineContext ctx);
    /**
     * Exit a parse tree produced by {@link CalcParser#line}.
     *
     * @param ctx the parse tree
     */
    void exitLine(CalcParser.LineContext ctx);
    /**
     * Enter a parse tree produced by the {@code multOrDiv} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterMultOrDiv(CalcParser.MultOrDivContext ctx);
    /**
     * Exit a parse tree produced by the {@code multOrDiv} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitMultOrDiv(CalcParser.MultOrDivContext ctx);
    /**
     * Enter a parse tree produced by the {@code addOrSubstract} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterAddOrSubstract(CalcParser.AddOrSubstractContext ctx);
    /**
     * Exit a parse tree produced by the {@code addOrSubstract} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitAddOrSubstract(CalcParser.AddOrSubstractContext ctx);
    /**
     * Enter a parse tree produced by the {@code float} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterFloat(CalcParser.FloatContext ctx);
    /**
     * Exit a parse tree produced by the {@code float} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitFloat(CalcParser.FloatContext ctx);
    /**
     * Enter a parse tree produced by the {@code parenExpr} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterParenExpr(CalcParser.ParenExprContext ctx);
    /**
     * Exit a parse tree produced by the {@code parenExpr} labeled alternative in {@link
     * CalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitParenExpr(CalcParser.ParenExprContext ctx);
}
