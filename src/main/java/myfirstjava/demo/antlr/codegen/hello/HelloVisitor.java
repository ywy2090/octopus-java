// Generated from /Users/octopus/octo/code/my-first-java/src/main/resources/g4/hello/Hello.g4 by
// ANTLR 4.13.1
package myfirstjava.demo.antlr.codegen.hello;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced by {@link
 * HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link HelloParser#r}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitR(HelloParser.RContext ctx);
}
