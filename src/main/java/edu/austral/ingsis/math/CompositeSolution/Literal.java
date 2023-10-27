package edu.austral.ingsis.math.CompositeSolution;

import java.util.List;

public class Literal implements Function {
    private final int value;

    public Literal(int value){
        this.value = value;
    }

    @Override
    public long Resolution() {
        return value;
    }

    @Override
    public String print() {
        return Integer.toString(value);
    }

    @Override
    public List<String> listVariables() {
        return List.of();
    }
}
