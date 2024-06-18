package edu.austral.ingsis.math.Operation;

import edu.austral.ingsis.math.Function;
import java.util.List;
import java.util.Map;

public class Division implements Operation {
  Function right;
  Function left;

  public Division(Function right, Function left){
      this.right = right;
      this.left = left;
    }


  @Override
  public double evaluate(Map<String, Double> variableValues) {
    return right.evaluate(variableValues) / left.evaluate(variableValues);
  }

  @Override
  public List<String> listVariables(List<String> variables) {
    variables = right.listVariables(variables);
    variables = left.listVariables(variables);
    return variables;
  }

  @Override
    public String toString() {
    return right.toString() + " / " + left.toString();
  }



}
