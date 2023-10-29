package edu.austral.ingsis.math.VisitorSolution;

import edu.austral.ingsis.math.VisitorSolution.Visitor.FunctionVisitor;
import edu.austral.ingsis.math.VisitorSolution.Visitor.PrintFunctionVisitor;

import java.util.List;

public class Literal implements Function {
    private final double value;

    public Literal(double value){
        this.value = value;
    }
    @Override
    public void accept(FunctionVisitor visitor) {
        visitor.visitLiteral(this);
    }

    public double getValue(){
        return value;
    }

}
