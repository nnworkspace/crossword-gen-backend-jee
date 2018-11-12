package org.ningning.crossword_gen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.ningning.crossword_gen.model.Solution;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class PuzzleAndSolutions   {
  
  private List<String> puzzle = new ArrayList<>();

  private List<Solution> solutions = new ArrayList<>();


  /**
   **/
  public PuzzleAndSolutions puzzle(List<String> puzzle) {
    this.puzzle = puzzle;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("puzzle")
  @NotNull
  public List<String> getPuzzle() {
    return puzzle;
  }
  public void setPuzzle(List<String> puzzle) {
    this.puzzle = puzzle;
  }

  public PuzzleAndSolutions addPuzzleItem(String puzzleItem) {
    this.puzzle.add(puzzleItem);
    return this;
  }


  /**
   **/
  public PuzzleAndSolutions solutions(List<Solution> solutions) {
    this.solutions = solutions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("solutions")
  @NotNull
  public List<Solution> getSolutions() {
    return solutions;
  }
  public void setSolutions(List<Solution> solutions) {
    this.solutions = solutions;
  }

  public PuzzleAndSolutions addSolutionsItem(Solution solutionsItem) {
    this.solutions.add(solutionsItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PuzzleAndSolutions puzzleAndSolutions = (PuzzleAndSolutions) o;
    return Objects.equals(puzzle, puzzleAndSolutions.puzzle) &&
        Objects.equals(solutions, puzzleAndSolutions.solutions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(puzzle, solutions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PuzzleAndSolutions {\n");
    
    sb.append("    puzzle: ").append(toIndentedString(puzzle)).append("\n");
    sb.append("    solutions: ").append(toIndentedString(solutions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

