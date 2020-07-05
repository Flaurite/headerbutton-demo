package com.company.hbdemo.web.screens.movie;

import com.flaurite.addon.headerbutton.impl.HeaderButton;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.screen.*;
import com.company.hbdemo.entity.Movie;

import javax.inject.Inject;

@UiController("hbdemo_Movie.edit")
@UiDescriptor("movie-edit.xml")
@EditedEntityContainer("movieDc")
@LoadDataBeforeShow
public class MovieEdit extends StandardEditor<Movie> {

    @Inject
    private Notifications notifications;

    @Subscribe("headerButtons.infoBtn")
    private void onInfoBtnClicked(HeaderButton.ButtonClickEvent event) {
        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Dialog notification info")
                .withDescription("Description content")
                .show();
    }
    
}