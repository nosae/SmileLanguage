// Generated from Json.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonParser#jsonText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonText(JsonParser.JsonTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(JsonParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jsonNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonNumber(JsonParser.JsonNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jsonString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonString(JsonParser.JsonStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(JsonParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(JsonParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jsonArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArray(JsonParser.JsonArrayContext ctx);
}