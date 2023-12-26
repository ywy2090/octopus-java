// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/hello/Hello.g4 by
// ANTLR 4.13.1
package myfirstjava.demo.antlr.codegen.hello;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link HelloListener}, which can be extended to
 * create a listener which only needs to handle a subset of the available methods.
 */
@SuppressWarnings("CheckReturnValue")
public class HelloBaseListener implements HelloListener {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void enterR(HelloParser.RContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void exitR(HelloParser.RContext ctx) {}

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void visitTerminal(TerminalNode node) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void visitErrorNode(ErrorNode node) {}
}
