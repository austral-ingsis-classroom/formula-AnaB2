package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public interface Function {

  double evaluate(Map<String,Double>variableValues);
  String toString();
  List<String> listVariables(List<String> variables);











}
