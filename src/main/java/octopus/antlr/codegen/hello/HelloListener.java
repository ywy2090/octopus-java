// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/hello/Hello.g4 by
// ANTLR 4.13.1
package octopus.antlr.codegen.hello;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/** This interface defines a complete listener for a parse tree produced by {@link HelloParser}. */
public interface HelloListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link HelloParser#r}.
     *
     * @param ctx the parse tree
     */
    void enterR(HelloParser.RContext ctx);
    /**
     * Exit a parse tree produced by {@link HelloParser#r}.
     *
     * @param ctx the parse tree
     */
    void exitR(HelloParser.RContext ctx);
}
