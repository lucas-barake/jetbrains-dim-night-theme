package com.github.lpatronr.jetbrainsdimnighttheme.services

import com.intellij.openapi.project.Project
import com.github.lpatronr.jetbrainsdimnighttheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
