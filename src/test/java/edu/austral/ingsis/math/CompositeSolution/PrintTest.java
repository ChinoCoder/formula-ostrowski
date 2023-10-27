package edu.austral.ingsis.math.CompositeSolution;

import edu.austral.ingsis.math.CompositeSolution.MultiFunctions.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrintTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldPrintFunction1() {
        final Function f1 = new Literal(1);
        final Function f2 = new Literal(6);
        final Function f3 = new Sum(f1, f2);
        final String expected = "( 1 + 6 )";
        final String result = f3.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case 12 / 2
     */
    @Test
    public void shouldPrintFunction2() {
        final Function f1 = new Literal(12);
        final Function f2 = new Literal(2);
        final Function f3 = new Division(f1, f2);
        final String expected = "( 12 / 2 )";
        final String result = f3.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case (9 / 2) * 3
     */
    @Test
    public void shouldPrintFunction3() {
        final Function f1 = new Literal(9);
        final Function f2 = new Literal(2);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Literal(3);
        final Function f5 = new Multiplication(f3, f4);
        final String expected = "( ( 9 / 2 ) * 3 )";
        final String result = f5.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case (27 / 6) ^ 2
     */
    @Test
    public void shouldPrintFunction4() {
        final Function f1 = new Literal(27);
        final Function f2 = new Literal(6);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Literal(2);
        final Function f5 = new Power(f3, f4);
        final String expected = "( ( 27 / 6 ) ^ 2 )";
        final String result = f5.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldPrintFunction6() {
        final Function f1 = new Variable("value", 8);
        final Function f2 = new Module(f1);
        final Function f3 = new Literal(8);
        final Function f4 = new Substraction(f2, f3);
        final String expected = "( | value | - 8 )";
        final String result = f4.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldPrintFunction7() {
        final Function f1 = new Variable("value", 8);
        final Function f2 = new Module(f1);
        final Function f3 = new Literal(8);
        final Function f4 = new Substraction(f2, f3);
        final String expected = "( | value | - 8 )";
        final String result = f4.print();

        assertThat(result, equalTo(expected));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldPrintFunction8() {
        final Function f1 = new Literal(5);
        final Function f2 = new Variable("i", 2);
        final Function f3 = new Substraction(f1, f2);
        final Function f4 = new Literal(8);
        final Function f5 = new Multiplication(f3, f4);
        final String expected = "( ( 5 - i ) * 8 )";
        final String result = f5.print();

        assertThat(result, equalTo(expected));
    }
}
