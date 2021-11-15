package com.company.arina.web.screens.task;

import com.haulmont.cuba.gui.screen.*;
import com.company.arina.entity.Task;

@UiController("arina_Task.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
@LoadDataBeforeShow
public class TaskEdit extends StandardEditor<Task> {
}