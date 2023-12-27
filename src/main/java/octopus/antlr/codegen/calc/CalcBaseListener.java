// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/calc/Calc.g4 by ANTLR
// 4.13.1
package octopus.antlr.codegen.calc;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link CalcListener}, which can be extended to
 * create a listener which only needs to handle a subset of the available methods.
 */
@SuppressWarnings("CheckReturnValue")
public class CalcBaseListener implements CalcListener {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void enterLine(CalcParser.LineContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void exitLine(CalcParser.LineContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void enterMultOrDiv(CalcParser.MultOrDivContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void exitMultOrDiv(CalcParser.MultOrDivContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void enterAddOrSubstract(CalcParser.AddOrSubstractContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void exitAddOrSubstract(CalcParser.AddOrSubstractContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void enterFloat(CalcParser.FloatContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void exitFloat(CalcParser.FloatContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void enterParenExpr(CalcParser.ParenExprContext ctx) {}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.
     */
    @Override
    public void exitParenExpr(CalcParser.ParenExprContext ctx) {}

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
