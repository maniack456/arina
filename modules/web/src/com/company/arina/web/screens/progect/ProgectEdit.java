package com.company.arina.web.screens.progect;

import com.haulmont.cuba.gui.screen.*;
import com.company.arina.entity.Progect;

@UiController("arina_Progect.edit")
@UiDescriptor("progect-edit.xml")
@EditedEntityContainer("progectDc")
@LoadDataBeforeShow
public class ProgectEdit extends StandardEditor<Progect> {
}