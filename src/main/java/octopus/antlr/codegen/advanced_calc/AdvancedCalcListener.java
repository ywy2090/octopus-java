// Generated from
// /Users/octopus/octo/code/my-first-java/src/main/resources/g4/advanced_calc/AdvancedCalc.g4 by
// ANTLR 4.13.1
package octopus.antlr.codegen.advanced_calc;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by {@link
 * AdvancedCalcParser}.
 */
public interface AdvancedCalcListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link AdvancedCalcParser#prog}.
     *
     * @param ctx the parse tree
     */
    void enterProg(AdvancedCalcParser.ProgContext ctx);
    /**
     * Exit a parse tree produced by {@link AdvancedCalcParser#prog}.
     *
     * @param ctx the parse tree
     */
    void exitProg(AdvancedCalcParser.ProgContext ctx);
    /**
     * Enter a parse tree produced by the {@code printExpr} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     */
    void enterPrintExpr(AdvancedCalcParser.PrintExprContext ctx);
    /**
     * Exit a parse tree produced by the {@code printExpr} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     */
    void exitPrintExpr(AdvancedCalcParser.PrintExprContext ctx);
    /**
     * Enter a parse tree produced by the {@code assign} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     */
    void enterAssign(AdvancedCalcParser.AssignContext ctx);
    /**
     * Exit a parse tree produced by the {@code assign} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     */
    void exitAssign(AdvancedCalcParser.AssignContext ctx);
    /**
     * Enter a parse tree produced by the {@code cleanmem} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     */
    void enterCleanmem(AdvancedCalcParser.CleanmemContext ctx);
    /**
     * Exit a parse tree produced by the {@code cleanmem} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     */
    void exitCleanmem(AdvancedCalcParser.CleanmemContext ctx);
    /**
     * Enter a parse tree produced by the {@code blank} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     */
    void enterBlank(AdvancedCalcParser.BlankContext ctx);
    /**
     * Exit a parse tree produced by the {@code blank} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     */
    void exitBlank(AdvancedCalcParser.BlankContext ctx);
    /**
     * Enter a parse tree produced by the {@code number} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterNumber(AdvancedCalcParser.NumberContext ctx);
    /**
     * Exit a parse tree produced by the {@code number} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitNumber(AdvancedCalcParser.NumberContext ctx);
    /**
     * Enter a parse tree produced by the {@code parens} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterParens(AdvancedCalcParser.ParensContext ctx);
    /**
     * Exit a parse tree produced by the {@code parens} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitParens(AdvancedCalcParser.ParensContext ctx);
    /**
     * Enter a parse tree produced by the {@code MulDiv} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterMulDiv(AdvancedCalcParser.MulDivContext ctx);
    /**
     * Exit a parse tree produced by the {@code MulDiv} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitMulDiv(AdvancedCalcParser.MulDivContext ctx);
    /**
     * Enter a parse tree produced by the {@code AddSub} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterAddSub(AdvancedCalcParser.AddSubContext ctx);
    /**
     * Exit a parse tree produced by the {@code AddSub} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitAddSub(AdvancedCalcParser.AddSubContext ctx);
    /**
     * Enter a parse tree produced by the {@code pow} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterPow(AdvancedCalcParser.PowContext ctx);
    /**
     * Exit a parse tree produced by the {@code pow} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitPow(AdvancedCalcParser.PowContext ctx);
    /**
     * Enter a parse tree produced by the {@code fac} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterFac(AdvancedCalcParser.FacContext ctx);
    /**
     * Exit a parse tree produced by the {@code fac} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitFac(AdvancedCalcParser.FacContext ctx);
    /**
     * Enter a parse tree produced by the {@code id} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterId(AdvancedCalcParser.IdContext ctx);
    /**
     * Exit a parse tree produced by the {@code id} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitId(AdvancedCalcParser.IdContext ctx);
}
