package edu.austral.ingsis.math.VisitorSolution;

import edu.austral.ingsis.math.VisitorSolution.MultiFunctions.*;
import edu.austral.ingsis.math.VisitorSolution.Visitor.ResolverVisitor;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ResolutionTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldResolveSimpleFunction1() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(1);
        final Function f2 = new Literal(6);
        final Function f3 = new Sum(f1, f2);
        f3.accept(visitor);
        final Double result = visitor.getResult();

        assertThat(result, equalTo(7d));
    }

    /**
     * Case 12 / 2
     */
    @Test
    public void shouldResolveSimpleFunction2() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(12);
        final Function f2 = new Literal(2);
        final Function f3 = new Division(f1, f2);
        f3.accept(visitor);
        final Double result = visitor.getResult();

        assertThat(result, equalTo(6d));
    }

    /**
     * Case (9 / 2) * 3
     */
    @Test
    public void shouldResolveSimpleFunction3() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(9);
        final Function f2 = new Literal(2);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Literal(3);
        final Function f5 = new Multiplication(f3, f4);
        f5.accept(visitor);
        final Double result = visitor.getResult();

        assertThat(result, equalTo(13.5d));
    }

    /**
     * Case (27 / 6) ^ 2
     */
    @Test
    public void shouldResolveSimpleFunction4() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(27);
        final Function f2 = new Literal(6);
        final Function f3 = new Division(f1, f2);
        final Function f4 = new Literal(2);
        final Function f5 = new Power(f3, f4);
        f5.accept(visitor);
        final Double result = visitor.getResult();

        assertThat(result, equalTo(20.25d));
    }

    /**
     * Case 36 ^ (1/2)
     */
    @Test
    public void shouldResolveSimpleFunction5() {
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
     * Case |136|
     */
    @Test
    public void shouldResolveSimpleFunction6() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(136);
        final Function f2 = new Module(f1);
        f2.accept(visitor);

        final Double result = visitor.getResult();

        assertThat(result, equalTo(136d));
    }

    /**
     * Case |-136|
     */
    @Test
    public void shouldResolveSimpleFunction7() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(-136);
        final Function f2 = new Module(f1);
        f2.accept(visitor);

        final Double result = visitor.getResult();

        assertThat(result, equalTo(136d));
    }

    /**
     * Case (5 - 5) * 8
     */
    @Test
    public void shouldResolveSimpleFunction8() {
        final ResolverVisitor visitor = new ResolverVisitor();
        final Function f1 = new Literal(5);
        final Function f2 = new Literal(5);
        final Function f3 = new Substraction(f1, f2);
        final Function f4 = new Literal(8);
        final Function f5 = new Multiplication(f3, f4);
        f5.accept(visitor);
        final Double result = visitor.getResult();

        assertThat(result, equalTo(0d));
    }
}
