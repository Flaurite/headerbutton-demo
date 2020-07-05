package com.company.hbdemo.web.screens.movie;

import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.company.hbdemo.entity.Movie;

import javax.inject.Inject;

@UiController("hbdemo_Movie.browse")
@UiDescriptor("movie-browse.xml")
@LookupComponent("moviesTable")
@LoadDataBeforeShow
public class MovieBrowse extends StandardLookup<Movie> {

    @Inject
    private ScreenBuilders screenBuilders;

    @Inject
    private GroupTable<Movie> moviesTable;

    @Subscribe("moviesTable.create")
    public void onMoviesTableCreate(Action.ActionPerformedEvent event) {
        screenBuilders.editor(moviesTable)
                .newEntity()
                .withOpenMode(OpenMode.DIALOG)
                .show();
    }

    @Subscribe("moviesTable.edit")
    public void onMoviesTableEdit(Action.ActionPerformedEvent event) {
        screenBuilders.editor(moviesTable)
                .editEntity(moviesTable.getSingleSelected())
                .withOpenMode(OpenMode.DIALOG)
                .show();
    }
}