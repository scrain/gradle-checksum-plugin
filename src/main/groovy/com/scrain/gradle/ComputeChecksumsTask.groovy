/*
 * Copyright [2016] Shawn Crain
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.scrain.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

/**
 * Class for the gradle computeChecksums task.
 */
class ComputeChecksumsTask extends DefaultTask {
    protected static final String NAME = 'computeChecksums'

    String group = ChecksumPlugin.TASK_GROUP

    String description = 'Executes all configured checksum tasks'

    @OutputDirectory
    File checksumsDir = project.file "${project.buildDir}/checksums"

    @TaskAction
    def computeChecksums() {
        // just a placeholder for now... maybe not worth keeping as a class long term
        logger.info ":${name} done"
    }
}
