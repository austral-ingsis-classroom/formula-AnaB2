package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public class Modulo implements Function {
  Function function;

  public Modulo(Function function) {
    this.function = function;
  }

  @Override
  public double evaluate(Map<String, Double> variableValues) {
    return Math.abs(function.evaluate(variableValues));
  }

  @Override
  public String toString() {
    return "|" + function.toString() + "|";
  }

  @Override
  public List<String> listVariables(List<String> variables) {
    return function.listVariables(variables);
  }
}
