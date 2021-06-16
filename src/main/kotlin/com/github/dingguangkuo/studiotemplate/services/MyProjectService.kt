package com.github.dingguangkuo.studiotemplate.services

import com.github.dingguangkuo.studiotemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
