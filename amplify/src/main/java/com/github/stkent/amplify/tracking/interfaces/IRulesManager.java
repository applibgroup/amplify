/*
 * Copyright 2015 Stuart Kent
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.github.stkent.amplify.tracking.interfaces;

/**
 * An abstract representation of a class used to aggregate the states of several other prompt timing
 * rules.
 */

public interface IRulesManager {

    /**
     * shouldAllowFeedbackPrompt.
     *
     * @return true if all managed prompt timing rules are satisfied; false otherwise.
     */
    boolean shouldAllowFeedbackPrompt();

}
