package com.company.hbdemo.web.screens.tests;

import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("hbdemo_BaseScreen")
@UiDescriptor("base-screen.xml")
public class BaseScreen extends Screen {

    @Inject
    private ScreenBuilders screenBuilders;

    @Subscribe("xmlDefinitionBtn")
    public void onXmlDefinitionBtnClick(Button.ClickEvent event) {
        screenBuilders.screen(this)
                .withScreenClass(XmlDefinitionScreen.class)
                .withLaunchMode(OpenMode.DIALOG)
                .show();
    }

    @Subscribe("clickEventBtn")
    public void onClickEventBtnClick(Button.ClickEvent event) {
        screenBuilders.screen(this)
                .withScreenClass(ClickEventScreen.class)
                .withLaunchMode(OpenMode.DIALOG)
                .show();
    }

    @Subscribe("runtimeChangesBtn")
    public void onRuntimeChangesBtnClick(Button.ClickEvent event) {
        screenBuilders.screen(this)
                .withScreenClass(RuntimeChangesScreen.class)
                .withLaunchMode(OpenMode.DIALOG)
                .show();
    }
    
    
}