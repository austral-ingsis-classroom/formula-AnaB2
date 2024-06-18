package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public class Value implements Function {

  private final double value;

  public Value(double value) {
    this.value = value;
  }

  @Override
  public double evaluate(Map<String, Double> variableValues) {
    return value;
  }

  @Override
  public List<String> listVariables(List<String> variables) {
    return variables;
  }

  @Override
  public String toString() {
    return Double.toString(value);
  }
}
