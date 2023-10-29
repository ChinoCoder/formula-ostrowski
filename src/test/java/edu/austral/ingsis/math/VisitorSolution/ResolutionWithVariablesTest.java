package edu.austral.ingsis.math.VisitorSolution;

import edu.austral.ingsis.math.VisitorSolution.MultiFunctions.*;
import edu.austral.ingsis.math.VisitorSolution.Visitor.ResolverVisitor;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ResolutionWithVariablesTest {

    /**
     * Case 1 + x where x = 3
     */
    @Test
    public void shouldResolveFunction1() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(1);
        final Function f2 = new Variable("x", 3);
        final Function f3 = new Sum(f1, f2);
        f3.accept(visitor);
        final Double result = visitor.getResult();

        assertThat(result, equalTo(4d));
    }

    /**
     * Case 12 / div where div = 4
     */
    @Test
    public void shouldResolveFunction2() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(12);
        final Function f2 = new Variable("div", 4);
        final Function f3 = new Division(f1, f2);
        f3.accept(visitor);
        final Double result = visitor.getResult();

        assertThat(result, equalTo(3d));
    }

    /**
     * Case (9 / x) * y where x = 3 and y = 4
     */
    @Test
    public void shouldResolveFunction3() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(9);
        final Function f2 = new Variable("x", 3);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Variable("y", 4);
        final Function f5 = new Multiplication(f3, f4);
        f5.accept(visitor);
        final Double result = visitor.getResult();

        assertThat(result, equalTo(12d));
    }

    /**
     * Case (27 / a) ^ b where a = 9 and b = 3
     */
    @Test
    public void shouldResolveFunction4() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(27);
        final Function f2 = new Variable("a", 9);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Variable("b", 3);
        final Function f5 = new Power(f3, f4);
        f5.accept(visitor);

        final Double result = visitor.getResult();

        assertThat(result, equalTo(27d));
    }

    /**
     * Case z ^ (1/2) where z = 36
     */
    @Test
    public void shouldResolveFunction5() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(36);
        final Function f2 = new Literal(1);
        final Function f3 = new Literal(2);
        final Function f4 = new Division(f2, f3);
        final Function f5 = new Power(f1, f4);
        f5.accept(visitor);

        final Double result = visitor.getResult();

        assertThat(result, equalTo(6d));
    }

    /**
     * Case |value| - 8 where value = 8
     */
    @Test
    public void shouldResolveFunction6() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f2 = new Variable("value", 8);
        final Function f3 = new Module(f2);
        final Function f4 = new Literal(8);
        final Function f5 = new Substraction(f3, f4);
        f5.accept(visitor);
        final Double result = visitor.getResult();

        assertThat(result, equalTo(0d));
    }

    /**
     * Case |value| - 8 where value = 8
     */
    @Test
    public void shouldResolveFunction7() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f2 = new Variable("value", 8);
        final Function f3 = new Module(f2);
        final Function f4 = new Literal(8);
        final Function f5 = new Substraction(f3, f4);
        f5.accept(visitor);

        final Double result = visitor.getResult();

        assertThat(result, equalTo(0d));
    }

    /**
     * Case (5 - i) * 8 where i = 2
     */
    @Test
    public void shouldResolveFunction8() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(5);
        final Function f2 = new Variable("i", 2);
        final Function f3 = new Substraction(f1, f2);
        final Function f4 = new Literal(8);
        final Function f5 = new Multiplication(f3, f4);
        f5.accept(visitor);
        final Double result = visitor.getResult();

        assertThat(result, equalTo(24d));
    }
}
