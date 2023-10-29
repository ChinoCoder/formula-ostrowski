package edu.austral.ingsis.math.VisitorSolution;

import edu.austral.ingsis.math.VisitorSolution.MultiFunctions.*;
import edu.austral.ingsis.math.VisitorSolution.Visitor.ListVariablesVisitor;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;


public class ListVariablesTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldListVariablesFunction1() {
        final ListVariablesVisitor visitor = new ListVariablesVisitor();
        final Function function = new Sum(new Literal(1), new Literal(6));
        function.accept(visitor);
        final List<String> result = visitor.getResult();

        assertThat(result, empty());
    }

    /**
     * Case 12 / div
     */
    @Test
    public void shouldListVariablesFunction2() {
        final ListVariablesVisitor visitor = new ListVariablesVisitor();
        final Function f1 = new Literal(12);
        final Function f2 = new Variable("div", 12);
        final Function function = new Division(f1, f2);
        function.accept(visitor);
        final List<String> result = visitor.getResult();

        assertThat(result, containsInAnyOrder("div"));
    }

    /**
     * Case (9 / x) * y
     */
    @Test
    public void shouldListVariablesFunction3() {
        final ListVariablesVisitor visitor = new ListVariablesVisitor();
        final Function f1 = new Literal(9);
        final Function f2 = new Variable("x", 12);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Variable("y", 12);
        final Function f5 = new Multiplication(f3, f4);
        f5.accept(visitor);
        final List<String> result = visitor.getResult();

        assertThat(result, containsInAnyOrder("x", "y"));
    }

    /**
     * Case (27 / a) ^ b
     */
    @Test
    public void shouldListVariablesFunction4() {
        final ListVariablesVisitor visitor = new ListVariablesVisitor();
        final Function f1 = new Literal(27);
        final Function f2 = new Variable("a", 12);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Variable("b", 12);
        final Function f5 = new Power(f3, f4);
        f5.accept(visitor);
        final List<String> result = visitor.getResult();

        assertThat(result, containsInAnyOrder("a", "b"));
    }

    /**
     * Case z ^ (1/2)
     */
    @Test
    public void shouldListVariablesFunction5() {
        final ListVariablesVisitor visitor = new ListVariablesVisitor();
        final Function f1 = new Variable("z", 12);
        final Function f2 = new Literal(1);
        final Function f3 = new Literal(2);
        final Function f4 = new Division(f2, f3);
        final Function f5 = new Power(f1, f4);
        f5.accept(visitor);
        final List<String> result = visitor.getResult();

        assertThat(result, containsInAnyOrder("z"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction6() {
        final ListVariablesVisitor visitor = new ListVariablesVisitor();
        final Function f1 = new Variable("value", 12);
        final Function f2 = new Module(f1);
        final Function f3 = new Literal(8);
        final Function f4 = new Substraction(f2, f3);
        f4.accept(visitor);
        final List<String> result = visitor.getResult();

        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction7() {
        final ListVariablesVisitor visitor = new ListVariablesVisitor();
        final Function f1 = new Variable("value", 12);
        final Function f2 = new Module(f1);
        final Function f3 = new Literal(8);
        final Function f4 = new Substraction(f2, f3);
        f4.accept(visitor);
        final List<String> result = visitor.getResult();

        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldListVariablesFunction8() {
        final ListVariablesVisitor visitor = new ListVariablesVisitor();
        final Function f1 = new Literal(5);
        final Function f2 = new Variable("i", 12);
        final Function f3 = new Substraction(f1, f2);
        final Function f4 = new Literal(8);
        final Function f5 = new Multiplication(f3, f4);
        f5.accept(visitor);
        final List<String> result = visitor.getResult();

        assertThat(result, containsInAnyOrder("i"));
    }
}
