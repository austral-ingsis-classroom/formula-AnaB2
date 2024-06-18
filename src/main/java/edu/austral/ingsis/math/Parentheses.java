package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public class Parentheses implements Function {
  private final Function function;

  public Parentheses(Function function) {
    this.function = function;
  }


  @Override
  public double evaluate(Map<String, Double> variableValues) {
    return function.evaluate(variableValues);
  }

  @Override
  public List<String> listVariables(List<String> variables) {
    return function.listVariables(variables);
  }


  @Override
  public String toString() {
    return "(" + function.toString() + ")";
  }
}