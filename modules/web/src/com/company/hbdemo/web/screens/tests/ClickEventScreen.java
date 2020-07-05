package com.company.hbdemo.web.screens.tests;

import com.flaurite.addon.headerbutton.impl.HeaderButton;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("hbdemo_ClickEventScreen")
@UiDescriptor("clickevent-screen.xml")
public class ClickEventScreen extends Screen {

    @Inject
    private Notifications notifications;

    @Subscribe("headerButtons.captionBtn")
    private void onCaptionBtnClickEvent(HeaderButton.ButtonClickEvent event) {
        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Header button is clicked")
                .withDescription(getNotificationDescription(event))
                .show();
    }

    @Subscribe("headerButtons.iconBtn")
    private void onIconBtnClickEvent(HeaderButton.ButtonClickEvent event) {
        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Header button is clicked")
                .withDescription(getNotificationDescription(event))
                .show();
    }

    private String getNotificationDescription(HeaderButton.ButtonClickEvent event) {
        StringBuilder sb = new StringBuilder();

        sb.append("Button id:").append(event.getButtonId()).append("\n");
        sb.append("Button caption: ").append(event.getButton().getCaption()).append("\n");
        sb.append("Button icon: ").append(event.getButton().getIcon());

        return sb.toString();
    }
}