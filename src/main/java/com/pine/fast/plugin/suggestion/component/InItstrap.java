package com.pine.fast.plugin.suggestion.component;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;

/**
 * ��ʼ��������Ŀ
 *
 * @author pine
 */
public interface InItstrap {

    static InItstrap getInstance(Project project) {
        return ServiceManager.getService(project, InItstrap.class);
    }
}
