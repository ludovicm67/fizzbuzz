package fr.unistra.fizzbuzz;

public class ProblemSolver {

  private Int2String converter;
  private Displayer printer;

  public void solve(int max) {
    for (int i = 1; i <= max; i++) {
      printer.display(converter.convert(i));
    }
  }
}