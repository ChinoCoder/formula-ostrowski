package edu.austral.ingsis.math.VisitorSolution;

import java.util.Collections;
import java.util.List;

public class Variable implements Function {

    private final String name;
    private final long value;

    public Variable(String name, long value){
        this.name = name;
        this.value = value;
    }
}
