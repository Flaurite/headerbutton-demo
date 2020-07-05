package com.company.hbdemo.web.screens.tests;

import com.flaurite.addon.headerbutton.facet.HeaderButtonFacet;
import com.flaurite.addon.headerbutton.impl.HeaderButton;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("hbdemo_RuntimeChangesScreen")
@UiDescriptor("runtimechanges-screen.xml")
public class RuntimeChangesScreen extends Screen {

    @Inject
    private HeaderButtonFacet headerButtons;

    @Inject
    private Notifications notifications;

    @Subscribe("headerButtons.captionBtn")
    private void onCaptionBtnClickEvent(HeaderButton.ButtonClickEvent event) {
        event.getButton().setCaption("Only caption (modified)");

        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Caption is changed")
                .show();
    }

    @Subscribe("headerButtons.iconBtn")
    private void onIconBtnClickEvent(HeaderButton.ButtonClickEvent event) {
        event.getButton().setIcon(CubaIcon.EDIT);

        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Icon is changed")
                .show();
    }

    @Subscribe("addBtn")
    public void onAddBtnClick(Button.ClickEvent event) {
        if (headerButtons.contains("addedBtn")) {
            return;
        }

        headerButtons.addButton(new HeaderButton("addedBtn")
                .withCaption("Added button")
                .withIcon(CubaIcon.ADD_ACTION)
                .withClickHandler(clickEvent -> {
                    notifications.create(Notifications.NotificationType.TRAY)
                            .withCaption("Added button clicked")
                            .show();
                }));
    }

    @Subscribe("removeBtn")
    public void onRemoveBtnClick(Button.ClickEvent event) {
        headerButtons.removeButton("addedBtn");
    }
}