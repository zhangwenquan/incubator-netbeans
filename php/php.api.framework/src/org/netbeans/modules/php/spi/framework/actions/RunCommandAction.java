/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.php.spi.framework.actions;

import org.netbeans.modules.php.api.phpmodule.PhpModule;
import org.openide.util.NbBundle;

/**
 * Base Run Command action.
 * @author Tomas Mysik
 */
public abstract class RunCommandAction extends BaseAction {

    /**
     * The typical implementation calls {@link org.netbeans.modules.php.spi.commands.FrameworkCommandSupport#runCommand()}.
     * @param phpModule
     */
    @Override
    public abstract void actionPerformed(PhpModule phpModule);

    /**
     * The default "short" name for this action (<em>Run Command...</em>).
     * @return
     */
    @Override
    protected final String getPureName() {
        return NbBundle.getMessage(RunCommandAction.class, "LBL_RunCommand");
    }
}
