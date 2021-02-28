/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.scxml2.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TransitionTest {

    private Transition transition;

    @BeforeEach
    public void setUp() {
        transition = new Transition();
    }

    @Test
    public void testGetTargets() {
        Assertions.assertEquals(0, transition.getTargets().size());

        final State state = new State();
        state.setId("1");

        transition.getTargets().add(state);

        Assertions.assertEquals(1, transition.getTargets().size());
        Assertions.assertEquals("1", transition.getTargets().iterator().next().getId());
    }
}
