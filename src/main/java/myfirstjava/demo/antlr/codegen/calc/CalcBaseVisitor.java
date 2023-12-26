// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/calc/Calc.g4 by ANTLR
// 4.13.1
package myfirstjava.demo.antlr.codegen.calc;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link CalcVisitor}, which can be extended to
 * create a visitor which only needs to handle a subset of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
@SuppressWarnings("CheckReturnValue")
public class CalcBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CalcVisitor<T> {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitLine(CalcParser.LineContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitMultOrDiv(CalcParser.MultOrDivContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitAddOrSubstract(CalcParser.AddOrSubstractContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitFloat(CalcParser.FloatContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitParenExpr(CalcParser.ParenExprContext ctx) {
        return visitChildren(ctx);
    }
}
