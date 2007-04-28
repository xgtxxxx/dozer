/*
 * Copyright 2005-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.dozer.util.mapping.vo;

import java.math.BigInteger;

/**
 * @author Peter Monks
 * 
 */
public class Child {
  private BigInteger id;
  private String name;
  private String fu;
  private String bar;
    
  public String getBar() {
    return bar;
  }
    
  public void setBar(String bar) {
    this.bar = bar;
  }
    
  public String getFu() {
    return fu;
  }
    
  public void setFu(String fu) {
    this.fu = fu;
  }
    
  public BigInteger getId() {
    return id;
  }
    
  public void setId(BigInteger id) {
    this.id = id;
  }
    
  public String getName() {
    return name;
  }
    
  public void setName(String name) {
    this.name = name;
  }
}