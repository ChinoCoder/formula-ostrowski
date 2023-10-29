package edu.austral.ingsis.math.VisitorSolution;

import edu.austral.ingsis.math.VisitorSolution.MultiFunctions.*;
import edu.austral.ingsis.math.VisitorSolution.Visitor.PrintFunctionVisitor;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrintTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldPrintFunction1() {
        final PrintFunctionVisitor visitor = new PrintFunctionVisitor();
        final Function f1 = new Literal(1);
        final Function f2 = new Literal(6);
        final Function f3 = new Sum(f1, f2);

        final String expected = "( 1 + 6 )";
        f3.accept(visitor);

        assertThat(visitor.getResult(), equalTo(expected));
    }

    /**
     * Case 12 / 2
     */
    @Test
    public void shouldPrintFunction2() {
        final PrintFunctionVisitor visitor = new PrintFunctionVisitor();
        final Function f1 = new Literal(12);
        final Function f2 = new Literal(2);
        final Function f3 = new Division(f1, f2);

        final String expected = "( 12 / 2 )";
        f3.accept(visitor);

        assertThat(visitor.getResult(), equalTo(expected));
    }

    /**
     * Case (9 / 2) * 3
     */
    @Test
    public void shouldPrintFunction3() {
        final PrintFunctionVisitor visitor = new PrintFunctionVisitor();
        final Function f1 = new Literal(9);
        final Function f2 = new Literal(2);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Literal(3);
        final Function f5 = new Multiplication(f3, f4);

        final String expected = "( ( 9 / 2 ) * 3 )";
        f5.accept(visitor);

        assertThat(visitor.getResult(), equalTo(expected));
    }

    /**
     * Case (27 / 6) ^ 2
     */
    @Test
    public void shouldPrintFunction4() {
        final PrintFunctionVisitor visitor = new PrintFunctionVisitor();
        final Function f1 = new Literal(27);
        final Function f2 = new Literal(6);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Literal(2);
        final Function f5 = new Power(f3, f4);

        final String expected = "( ( 27 / 6 ) ^ 2 )";
        f5.accept(visitor);

        assertThat(visitor.getResult(), equalTo(expected));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldPrintFunction6() {
        final PrintFunctionVisitor visitor = new PrintFunctionVisitor();
        final Function f1 = new Variable("value", 1);
        final Function f2 = new Module(f1);
        final Function f3 = new Literal(8);
        final Function f4 = new Substraction(f2, f3);


        final String expected = "( |value| - 8 )";
        f4.accept(visitor);

        assertThat(visitor.getResult(), equalTo(expected));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldPrintFunction7() {
        final PrintFunctionVisitor visitor = new PrintFunctionVisitor();
        final Function f1 = new Variable("value", 1);
        final Function f2 = new Module(f1);
        final Function f3 = new Literal(8);
        final Function f4 = new Substraction(f2, f3);


        final String expected = "( |value| - 8 )";
        f4.accept(visitor);

        assertThat(visitor.getResult(), equalTo(expected));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldPrintFunction8() {
        final PrintFunctionVisitor visitor = new PrintFunctionVisitor();
        final Function f1 = new Literal(5);
        final Function f2 = new Variable("i", 1);
        final Function f3 = new Substraction(f1, f2);
        final Function f4 = new Literal(8);
        final Function f5 = new Multiplication(f3, f4);

        final String expected = "( ( 5 - i ) * 8 )";
        f5.accept(visitor);

        assertThat(visitor.getResult(), equalTo(expected));
    }
}
