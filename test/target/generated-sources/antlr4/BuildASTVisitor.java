
public class BuildASTVisitor extends HelloBaseVisitor {
	{
	    public ExpressionNode VisitCompileUnit(HelloParser.CompileUnitContext context)
	    {
	        return (ExpressionNode) visit(context.expr());
	    }

	    public ExpressionNode VisitNumberExpr(HelloParser.NumberExprContext context)
	    {
	    	NumberNode nn = new NumberNode();
	    	nn.Value = Double.parseDouble(context.value.getText());
	    	return nn;
	    }
	    //    return new NumberNode
	    //    {
	    //        Value = double.Parse(, NumberStyles.AllowDecimalPoint | NumberStyles.AllowExponent);
	    //    };
	    //}

	    public ExpressionNode VisitParensExpr(HelloParser.ParensExprContext context)
	    {
	        return (ExpressionNode) visit(context.expr());
	    }

	    public ExpressionNode VisitInfixExpr(HelloParser.InfixExprContext context)
	    {
	        InfixExpressionNode node;

	        switch (context.op.getType())
	        {
	            case HelloLexer.OP_ADD:
	                node = new AdditionNode();
	                break;

	            case HelloLexer.OP_SUB:
	                node = new SubtractionNode();
	                break;

	            case HelloLexer.OP_MUL:
	                node = new MultiplicationNode();
	                break;

	            case HelloLexer.OP_DIV:
	                node = new DivisionNode();
	                break;

	            default:
	                throw new UnsupportedOperationException();
	        }

	        node.Left = (ExpressionNode) visit(context.left);
	        node.Right = (ExpressionNode) visit(context.right);

	        return node;
	    }

	    public ExpressionNode VisitUnaryExpr(HelloParser.UnaryExprContext context)
	    {
	        switch (context.op.getType())
	        {
	            case HelloLexer.OP_ADD:
	                return (ExpressionNode) visit(context.expr());

	            case HelloLexer.OP_SUB:
	            	NegateNode negNod = new NegateNode();
	            	negNod.InnerNode = (ExpressionNode) visit(context.expr());
	                //return new NegateNode
	                //{
	                //    InnerNode = visit(context.expr()) 
	            	//testarino???
	                //};

	            default:
	                throw new UnsupportedOperationException();
	        }
	    }
}
