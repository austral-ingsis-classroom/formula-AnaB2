package edu.austral.ingsis.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CompositeFunction implements Function {
  private final List<Function> functions;

  public CompositeFunction() {
    this.functions = new ArrayList<>();
  }

  public void addFunction(Function function) {
    functions.add(function);
  }

  @Override
  public double evaluate(Map<String, Double> variableValues) {
    double result = 0;
    for (Function function : functions) {
      result += function.evaluate(variableValues);
    }
    return result;
  }

  @Override
  public List<String> listVariables(List<String> variables) {
    for (Function function : functions) {
      function.listVariables(variables);
    }
    return variables;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Function function : functions) {
      sb.append(function.toString()).append(" ");
    }
    return sb.toString();
  }
}
