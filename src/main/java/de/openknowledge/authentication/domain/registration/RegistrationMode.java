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
package de.openknowledge.authentication.domain.registration;

public enum RegistrationMode {
  DEFAULT, DOUBLE_OPT_IN;

  public static RegistrationMode fromValue(String value) {
    for (RegistrationMode mode : values()) {
      if (mode.name().equals(value.toUpperCase())) {
        return mode;
      }
    }
    throw new IllegalArgumentException("unsupported value: " + value);
  }
}
