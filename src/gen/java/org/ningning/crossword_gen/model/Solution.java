package org.ningning.crossword_gen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class Solution   {
  
  private String word;

  private List<Integer> startPosition = new ArrayList<>();


@XmlType(name="OrientationEnum")
@XmlEnum(String.class)
public enum OrientationEnum {

    @XmlEnumValue("horizontal") HORIZONTAL(String.valueOf("horizontal")), @XmlEnumValue("vertical") VERTICAL(String.valueOf("vertical"));


    private String value;

    OrientationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrientationEnum fromValue(String v) {
        for (OrientationEnum b : OrientationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  private OrientationEnum orientation;


  /**
   * a word in the word search puzzle
   **/
  public Solution word(String word) {
    this.word = word;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "a word in the word search puzzle")
  @JsonProperty("word")
  @NotNull
  public String getWord() {
    return word;
  }
  public void setWord(String word) {
    this.word = word;
  }


  /**
   * First number in the array is the row index, second number is the column index.
   **/
  public Solution startPosition(List<Integer> startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "First number in the array is the row index, second number is the column index.")
  @JsonProperty("startPosition")
  @NotNull
  public List<Integer> getStartPosition() {
    return startPosition;
  }
  public void setStartPosition(List<Integer> startPosition) {
    this.startPosition = startPosition;
  }

  public Solution addStartPositionItem(Integer startPositionItem) {
    this.startPosition.add(startPositionItem);
    return this;
  }


  /**
   * Describes the orientation of the word placed. Either horizontal or vertical.
   **/
  public Solution orientation(OrientationEnum orientation) {
    this.orientation = orientation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Describes the orientation of the word placed. Either horizontal or vertical.")
  @JsonProperty("orientation")
  @NotNull
  public OrientationEnum getOrientation() {
    return orientation;
  }
  public void setOrientation(OrientationEnum orientation) {
    this.orientation = orientation;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Solution solution = (Solution) o;
    return Objects.equals(word, solution.word) &&
        Objects.equals(startPosition, solution.startPosition) &&
        Objects.equals(orientation, solution.orientation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, startPosition, orientation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Solution {\n");
    
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
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

