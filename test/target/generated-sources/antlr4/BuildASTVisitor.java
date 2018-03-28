
public class BuildASTVisitor extends HelloBaseVisitor<ExpressionNode> 
	{
	    public ExpressionNode VisitCompileUnit(HelloParser.CompileUnitContext context)
	    {
	        return visit(context.expr());
	    }

	    public ExpressionNode VisitNumberExpr(HelloParser.NumberExprContext context)
	    {
	    	NumberNode nn = new NumberNode();
	    	nn.Value = Double.parseDouble(context.value.getText());
	    	return nn;
	    }
	    //    return new NumberNode
	    //    {
	    //        Value = double.Parse(context.value.getText(), NumberStyles.AllowDecimalPoint | NumberStyles.AllowExponent);
	    //    };
	    //}

	    public ExpressionNode VisitParensExpr(HelloParser.ParensExprContext context)
	    {
	        return visit(context.expr());
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

	        node.Left =  visit(context.left);
	        node.Right =  visit(context.right);

	        return node;
	    }

	    public ExpressionNode VisitUnaryExpr(HelloParser.UnaryExprContext context)
	    {
	        switch (context.op.getType())
	        {
	            case HelloLexer.OP_ADD:
	                return  visit(context.expr());

	            case HelloLexer.OP_SUB:
	            	NegateNode negNod = new NegateNode();
	            	negNod.InnerNode =  visit(context.expr());
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
