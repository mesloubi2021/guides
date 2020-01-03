package org.gradle.docs.internal;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.docs.guides.internal.GuidesDocumentationPlugin;
import org.gradle.docs.samples.internal.SamplesDocumentationPlugin;

public class BuildDocumentationPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getPluginManager().apply(GuidesDocumentationPlugin.class);
        project.getPluginManager().apply(SamplesDocumentationPlugin.class);
    }
}
