// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/hive/v3/HintParser.g4
// by ANTLR 4.13.1
package myfirstjava.demo.antlr.codegen.hive.v3;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link HintParserVisitor}, which can be extended
 * to create a visitor which only needs to handle a subset of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
@SuppressWarnings("CheckReturnValue")
public class HintParserBaseVisitor<T> extends AbstractParseTreeVisitor<T>
        implements HintParserVisitor<T> {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitHint(HintParser.HintContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitHintList(HintParser.HintListContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitHintItem(HintParser.HintItemContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitHintName(HintParser.HintNameContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitHintArgs(HintParser.HintArgsContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
     * ctx}.
     */
    @Override
    public T visitHintArgName(HintParser.HintArgNameContext ctx) {
        return visitChildren(ctx);
    }
}
