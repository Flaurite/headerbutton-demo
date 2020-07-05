package com.company.hbdemo.web.screens.genre;

import com.haulmont.cuba.gui.screen.*;
import com.company.hbdemo.entity.Genre;

@UiController("hbdemo_Genre.browse")
@UiDescriptor("genre-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class GenreBrowse extends MasterDetailScreen<Genre> {
}