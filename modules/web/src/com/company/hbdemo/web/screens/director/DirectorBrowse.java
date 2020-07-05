package com.company.hbdemo.web.screens.director;

import com.haulmont.cuba.gui.screen.*;
import com.company.hbdemo.entity.Director;

@UiController("hbdemo_Director.browse")
@UiDescriptor("director-browse.xml")
@LookupComponent("directorsTable")
@LoadDataBeforeShow
public class DirectorBrowse extends StandardLookup<Director> {
}