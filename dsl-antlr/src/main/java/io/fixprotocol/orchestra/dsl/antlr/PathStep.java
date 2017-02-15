/**
 * Copyright 2017 FIX Protocol Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package io.fixprotocol.orchestra.dsl.antlr;

/**
 * Used to search a Scope
 * <br/>
 * Analogous to an XPath path step
 * @author Don Mendelson
 *
 */
public class PathStep {

  /**
   * No index set
   */
  public static final int NO_INDEX = -1;

  private int index = NO_INDEX;
  private final String name;
  private String predicate;
  
  /**
   * Constructor
   * @param name a symbol
   */
  public PathStep(String name) {
    this.name = name;
  }

  /**
   * @return the index
   */
  public int getIndex() {
    return index;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the predicate
   */
  public String getPredicate() {
    return predicate;
  }

  /**
   * A one-based index into an array-like Scope
   * @param index the index to set
   */
  public void setIndex(int index) {
    this.index = index;
  }
  /**
   * An expression to evaluate to select a symbol in an array-like Scope
   * @param predicate the predicate to set
   */
  public void setPredicate(String predicate) {
    this.predicate = predicate;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "PathStep [" + (name != null ? "name=" + name + ", " : "") + "index=" + index + ", "
        + (predicate != null ? "predicate=" + predicate : "") + "]";
  }

}