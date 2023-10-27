package edu.austral.ingsis.math.VisitorSolution;

import java.util.List;

public class Literal implements Function {
    private final double value;

    public Literal(double value){
        this.value = value;
    }

}
