// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(@NotNull HelloParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(@NotNull HelloParser.InfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(@NotNull HelloParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(@NotNull HelloParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompileUnit(@NotNull HelloParser.CompileUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompileUnit(@NotNull HelloParser.CompileUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(@NotNull HelloParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(@NotNull HelloParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(@NotNull HelloParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(@NotNull HelloParser.ParensExprContext ctx);
}