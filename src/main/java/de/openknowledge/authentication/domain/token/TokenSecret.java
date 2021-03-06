/*
 * Copyright (C) open knowledge GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package de.openknowledge.authentication.domain.token;

import static org.apache.commons.lang3.Validate.notBlank;

import java.nio.charset.StandardCharsets;

import de.openknowledge.common.domain.AbstractStringValueObject;

public class TokenSecret extends AbstractStringValueObject {

  private TokenSecret(String value) {
    super(value);
  }

  protected TokenSecret() {
    super();
    // for framework
  }

  public static TokenSecret fromValue(String tokenSecret) {
    notBlank(tokenSecret, "tokenSecret may not be blank");
    return new TokenSecret(tokenSecret);
  }

  public byte[] asByteArray() {
    return getValue().getBytes(StandardCharsets.UTF_8);
  }

  @Override
  public String toString() {
    return "******";
  }

}
