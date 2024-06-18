package edu.austral.ingsis.math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import edu.austral.ingsis.math.Operation.Addition;
import edu.austral.ingsis.math.Operation.Division;
import edu.austral.ingsis.math.Operation.Multiplication;
import edu.austral.ingsis.math.Operation.Power;
import edu.austral.ingsis.math.Operation.Subtraction;
import org.junit.jupiter.api.Test;

public class PrintTest {

  /** Case 1 + 6 */
  @Test
  public void shouldPrintFunction1() {
    final String expected = "1.0 + 6.0";
    final String result = new Addition(new Value(1), new Value(6)).toString();

    assertThat(result, equalTo(expected));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldPrintFunction2() {
    final String expected = "12.0 / 2.0";
    final String result = new Division(new Value(12), new Value(2)).toString();

    assertThat(result, equalTo(expected));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldPrintFunction3() {
    final String expected = "(9.0 / 2.0) * 3.0";
    final String result =
        new Multiplication(new Parentheses(new Division(new Value(9), new Value(2))), new Value(3))
            .toString();

    assertThat(result, equalTo(expected));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldPrintFunction4() {
    final String expected = "(27.0 / 6.0) ^ 2.0";
    final String result =
        new Power(new Parentheses(new Division(new Value(27), new Value(6))), new Value(2))
            .toString();

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction6() {
    final String expected = "|value| - 8.0";
    final String result =
        new Subtraction(new Modulo(new Variable("value")), new Value(8)).toString();

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction7() {
    final String expected = "|value| - 8.0";
    final String result =
        new Subtraction(new Modulo(new Variable("value")), new Value(8)).toString();

    assertThat(result, equalTo(expected));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldPrintFunction8() {
    final String expected = "(5.0 - i) * 8.0";
    final String result =
        new Multiplication(
                new Parentheses(new Subtraction(new Value(5), new Variable("i"))), new Value(8))
            .toString();
    assertThat(result, equalTo(expected));
  }
}
