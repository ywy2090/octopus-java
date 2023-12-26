package myfirstjava.demo.antlr;

import myfirstjava.demo.antlr.codegen.calc.CalcBaseVisitor;
import myfirstjava.demo.antlr.codegen.calc.CalcParser;

public class MyCalcVisitor extends CalcBaseVisitor<Object> {
    @Override
    public Object visitParenExpr(CalcParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitMultOrDiv(CalcParser.MultOrDivContext ctx) {
        Object obj0 = ctx.expr(0).accept(this);
        Object obj1 = ctx.expr(1).accept(this);

        if ("*".equals(ctx.getChild(1).getText())) {
            return (Float) obj0 * (Float) obj1;
        } else if ("/".equals(ctx.getChild(1).getText())) {
            return (Float) obj0 / (Float) obj1;
        }
        return 0f;
    }

    @Override
    public Object visitAddOrSubstract(CalcParser.AddOrSubstractContext ctx) {
        Object obj0 = ctx.expr(0).accept(this);
        Object obj1 = ctx.expr(1).accept(this);

        if ("+".equals(ctx.getChild(1).getText())) {
            return (Float) obj0 + (Float) obj1;
        } else if ("-".equals(ctx.getChild(1).getText())) {
            return (Float) obj0 - (Float) obj1;
        }
        return 0f;
    }

    @Override
    public Object visitFloat(CalcParser.FloatContext ctx) {
        return Float.parseFloat(ctx.getText());
    }
}
