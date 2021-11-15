package com.company.arina.web.screens.progect;

import com.haulmont.cuba.gui.screen.*;
import com.company.arina.entity.Progect;

@UiController("arina_Progect.browse")
@UiDescriptor("progect-browse.xml")
@LookupComponent("progectsTable")
@LoadDataBeforeShow
public class ProgectBrowse extends StandardLookup<Progect> {
}