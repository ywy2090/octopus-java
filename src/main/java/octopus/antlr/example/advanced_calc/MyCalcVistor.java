package octopus.antlr.example.advanced_calc;

import octopus.antlr.codegen.advanced_calc.AdvancedCalcBaseVisitor;
import octopus.antlr.codegen.advanced_calc.AdvancedCalcParser;
import org.apache.commons.math3.util.ArithmeticUtils;

public class MyCalcVistor<T extends IType> extends AdvancedCalcBaseVisitor<T> {

    @Override
    public T visitCleanmem(AdvancedCalcParser.CleanmemContext ctx) {
        CalcVarb.cleanmem();
        return super.visitCleanmem(ctx);
    }

    @Override
    public T visitPrintExpr(AdvancedCalcParser.PrintExprContext ctx) {
        IType iType = ctx.expr().accept(this);
        if (iType.isValue()) {
            System.out.println(iType.getValue());
        } else if (iType.isVarb()) {
            System.out.println(ctx.getText().trim() + " = " + iType.getValue());
        }
        return (T) iType;
    }

    @Override
    public T visitAssign(AdvancedCalcParser.AssignContext ctx) {
        CalcVarb CalcVarb = new CalcVarb(ctx.ID().getText());
        IType iType = ctx.expr().accept(this);
        CalcVarb.setValue(iType.getValue());
        return (T) CalcVarb;
    }

    @Override
    public T visitFac(AdvancedCalcParser.FacContext ctx) {
        IType iType = ctx.expr().accept(this);
        Double l = ArithmeticUtils.factorialDouble(iType.getValue().intValue());
        return (T) new CalcNumber(l.toString());
    }

    @Override
    public T visitPow(AdvancedCalcParser.PowContext ctx) {
        AdvancedCalcParser.ExprContext left = ctx.expr().get(0);
        AdvancedCalcParser.ExprContext right = ctx.expr().get(1);
        IType leftItype = left.accept(this);
        IType rightItype = right.accept(this);

        Integer l =
                ArithmeticUtils.pow(
                        leftItype.getValue().intValue(), rightItype.getValue().intValue());
        return (T) new CalcNumber(l.toString());
    }

    @Override
    public T visitParens(AdvancedCalcParser.ParensContext ctx) {
        IType iType = ctx.expr().accept(this);
        return (T) iType;
    }

    @Override
    public T visitMulDiv(AdvancedCalcParser.MulDivContext ctx) {
        AdvancedCalcParser.ExprContext left = ctx.expr().get(0);
        AdvancedCalcParser.ExprContext right = ctx.expr().get(1);
        IType leftItype = left.accept(this);
        IType rightItype = right.accept(this);
        Double temp = 0d;
        if (ctx.MUL() != null) {
            temp = leftItype.getValue() * rightItype.getValue();
        }
        if (ctx.DIV() != null) {
            temp = leftItype.getValue() / rightItype.getValue();
        }

        return (T) new CalcNumber(temp.toString());
    }

    @Override
    public T visitAddSub(AdvancedCalcParser.AddSubContext ctx) {
        AdvancedCalcParser.ExprContext left = ctx.expr().get(0);
        AdvancedCalcParser.ExprContext right = ctx.expr().get(1);
        IType leftItype = left.accept(this);
        IType rightItype = right.accept(this);
        Double temp = 0d;
        if (ctx.ADD() != null) {
            temp = leftItype.getValue() + rightItype.getValue();
        }
        if (ctx.SUB() != null) {
            temp = leftItype.getValue() - rightItype.getValue();
        }
        return (T) new CalcNumber(temp.toString());
    }

    @Override
    public T visitId(AdvancedCalcParser.IdContext ctx) {
        CalcVarb CalcVarb = new CalcVarb(ctx.ID().getText());
        return (T) CalcVarb;
    }

    @Override
    public T visitNumber(AdvancedCalcParser.NumberContext ctx) {
        CalcNumber number = new CalcNumber(ctx.getText());
        return (T) number;
    }
}
