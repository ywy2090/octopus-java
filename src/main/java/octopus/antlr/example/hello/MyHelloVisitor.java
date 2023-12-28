package octopus.antlr.example.hello;

import octopus.antlr.codegen.hello.HelloParser;
import octopus.antlr.codegen.hello.HelloVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyHelloVisitor implements HelloVisitor {

    @Override
    public Object visitR(HelloParser.RContext ctx) {
        String text = ctx.getText();
        return null;
    }

    @Override
    public Object visit(ParseTree tree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return null;
    }
}
