// Generated from
// /Users/octopus/octo/code/my-first-java/src/main/resources/g4/advanced_calc/AdvancedCalc.g4 by
// ANTLR 4.13.1
package octopus.antlr.codegen.advanced_calc;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced by {@link
 * AdvancedCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
public interface AdvancedCalcVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link AdvancedCalcParser#prog}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProg(AdvancedCalcParser.ProgContext ctx);
    /**
     * Visit a parse tree produced by the {@code printExpr} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrintExpr(AdvancedCalcParser.PrintExprContext ctx);
    /**
     * Visit a parse tree produced by the {@code assign} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssign(AdvancedCalcParser.AssignContext ctx);
    /**
     * Visit a parse tree produced by the {@code cleanmem} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCleanmem(AdvancedCalcParser.CleanmemContext ctx);
    /**
     * Visit a parse tree produced by the {@code blank} labeled alternative in {@link
     * AdvancedCalcParser#stat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlank(AdvancedCalcParser.BlankContext ctx);
    /**
     * Visit a parse tree produced by the {@code number} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumber(AdvancedCalcParser.NumberContext ctx);
    /**
     * Visit a parse tree produced by the {@code parens} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParens(AdvancedCalcParser.ParensContext ctx);
    /**
     * Visit a parse tree produced by the {@code MulDiv} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMulDiv(AdvancedCalcParser.MulDivContext ctx);
    /**
     * Visit a parse tree produced by the {@code AddSub} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddSub(AdvancedCalcParser.AddSubContext ctx);
    /**
     * Visit a parse tree produced by the {@code pow} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPow(AdvancedCalcParser.PowContext ctx);
    /**
     * Visit a parse tree produced by the {@code fac} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFac(AdvancedCalcParser.FacContext ctx);
    /**
     * Visit a parse tree produced by the {@code id} labeled alternative in {@link
     * AdvancedCalcParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitId(AdvancedCalcParser.IdContext ctx);
}
