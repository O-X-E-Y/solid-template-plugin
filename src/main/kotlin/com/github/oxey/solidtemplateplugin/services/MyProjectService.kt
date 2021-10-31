package com.github.oxey.solidtemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.oxey.solidtemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
