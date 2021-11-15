package com.company.arina.web.screens.task;

import com.company.arina.core.TaskService;
import com.haulmont.cuba.gui.screen.*;
import com.company.arina.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("arina_Task.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
@LoadDataBeforeShow
public class TaskEdit extends StandardEditor<Task> {
    @Autowired
    private TaskService taskService;
    @Subscribe
    public void onInitEntity(InitEntityEvent<Task> event) {
        event.getEntity().setAssignee(taskService.findLeastBusyUser());
    }
}