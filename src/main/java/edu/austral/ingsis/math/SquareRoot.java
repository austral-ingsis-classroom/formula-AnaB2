package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public class SquareRoot implements Function{
  private final Function function;

  public SquareRoot(Function function){
    this.function = function;
  }


  @Override
  public double evaluate(Map<String, Double> variableValues) {
    return Math.sqrt(function.evaluate(variableValues));
  }

  @Override
  public List<String> listVariables(List<String> variables) {
    return function.listVariables(variables);
  }


  @Override
    public String toString() {
    return "sqrt(" + function.toString() + ")";
  }





}
