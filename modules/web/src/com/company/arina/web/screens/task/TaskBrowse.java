package com.company.arina.web.screens.task;

import com.haulmont.cuba.gui.screen.*;
import com.company.arina.entity.Task;

@UiController("arina_Task.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
@LoadDataBeforeShow
public class TaskBrowse extends StandardLookup<Task> {
}