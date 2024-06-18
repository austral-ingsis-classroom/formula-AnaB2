package edu.austral.ingsis.math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import edu.austral.ingsis.math.Operation.Addition;
import edu.austral.ingsis.math.Operation.Division;
import edu.austral.ingsis.math.Operation.Multiplication;
import edu.austral.ingsis.math.Operation.Power;
import edu.austral.ingsis.math.Operation.Subtraction;
import org.junit.jupiter.api.Test;

public class ResolutionTest {

  /** Case 1 + 6 */
  @Test
  public void shouldResolveSimpleFunction1() {
    final Function result = new Addition(new Value(1), new Value(6));

    assertThat(result.evaluate(null), equalTo(7d));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldResolveSimpleFunction2() {

    final Function result = new Division(new Value(12), new Value(2));

    assertThat(result.evaluate(null), equalTo(6d));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldResolveSimpleFunction3() {
    final Function result =
        new Multiplication(new Division(new Value(9), new Value(2)), new Value(3));

    assertThat(result.evaluate(null), equalTo(13.5d));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldResolveSimpleFunction4() {
    final Function result = new Power(new Division(new Value(27), new Value(6)), new Value(2));

    assertThat(result.evaluate(null), equalTo(20.25d));
  }

  /** Case 36 ^ (1/2) */
  @Test
  public void shouldResolveSimpleFunction5() {
    final Function result = new Power(new Value(36), new Division(new Value(1), new Value(2)));

    assertThat(result.evaluate(null), equalTo(6d));
  }

  /** Case |136| */
  @Test
  public void shouldResolveSimpleFunction6() {
    final Function result = new Modulo(new Value(136));

    assertThat(result.evaluate(null), equalTo(136d));
  }

  /** Case |-136| */
  @Test
  public void shouldResolveSimpleFunction7() {
    final Function result = new Modulo(new Subtraction(new Value(0), new Value(136)));

    assertThat(result.evaluate(null), equalTo(136d));
  }

  /** Case (5 - 5) * 8 */
  @Test
  public void shouldResolveSimpleFunction8() {
    final Function function1 = new Value(5);
    final Function function3 = new Subtraction(function1, function1);
    final Function function4 = new Value(8);
    final Function result = new Multiplication(function3, function4);
    assertThat(result.evaluate(null), equalTo(0d));
  }
}
