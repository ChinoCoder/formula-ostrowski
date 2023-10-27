package edu.austral.ingsis.math.CompositeSolution;

import edu.austral.ingsis.math.CompositeSolution.MultiFunctions.*;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ListVariablesTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldListVariablesFunction1() {
        final Function f1 = new Literal(1);
        final Function f2 = new Literal(6);
        final Function f3 = new Sum(f1, f2);
        final List<String> result = f3.listVariables();

        assertThat(result, empty());
    }

    /**
     * Case 12 / div
     */
    @Test
    public void shouldListVariablesFunction2() {
        final Function f1 = new Literal(12);
        final Function f2 = new Variable("div", 4);
        final Function f3 = new Division(f1, f2);
        final List<String> result = f3.listVariables();

        assertThat(result, containsInAnyOrder("div"));
    }

    /**
     * Case (9 / x) * y
     */
    @Test
    public void shouldListVariablesFunction3() {
        final Function f1 = new Literal(9);
        final Function f2 = new Variable("x", 3);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Variable("y", 4);
        final Function f5 = new Multiplication(f3, f4);
        final List<String> result = f5.listVariables();

        assertThat(result, containsInAnyOrder("x", "y"));
    }

    /**
     * Case (27 / a) ^ b
     */
    @Test
    public void shouldListVariablesFunction4() {
        final Function f1 = new Literal(27);
        final Function f2 = new Variable("a", 9);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Variable("b", 3);
        final Function f5 = new Power(f3, f4);
        final List<String> result = f5.listVariables();

        assertThat(result, containsInAnyOrder("a", "b"));
    }

    /**
     * Case z ^ (1/2)
     */
    @Test
    public void shouldListVariablesFunction5() {
        final Function f1 = new Variable("z", 36);
        final Function f2 = new Literal(0.5);
        final Function f3 = new Power(f1, f2);
        final List<String> result = f3.listVariables();

        assertThat(result, containsInAnyOrder("z"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction6() {
        final Function f1 = new Variable("value", 8);
        final Function f2 = new Module(f1);
        final Function f3 = new Literal(8);
        final Function f4 = new Substraction(f2, f3);
        final List<String> result = f4.listVariables();

        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction7() {
        final Function f1 = new Variable("value", 8);
        final Function f2 = new Module(f1);
        final Function f3 = new Literal(8);
        final Function f4 = new Substraction(f2, f3);
        final List<String> result = f4.listVariables();

        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldListVariablesFunction8() {
        final Function f1 = new Literal(5);
        final Function f2 = new Variable("i", 2);
        final Function f3 = new Substraction(f1, f2);
        final Function f4 = new Literal(8);
        final List<String> result = f3.listVariables();

        assertThat(result, containsInAnyOrder("i"));
    }
}
