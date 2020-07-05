package com.company.hbdemo.web.screens.director;

import com.haulmont.cuba.gui.screen.*;
import com.company.hbdemo.entity.Director;

@UiController("hbdemo_Director.edit")
@UiDescriptor("director-edit.xml")
@EditedEntityContainer("directorDc")
@LoadDataBeforeShow
public class DirectorEdit extends StandardEditor<Director> {
}