package com.company.hbdemo.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.hbdemo.entity.Country;

@UiController("hbdemo_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CountryBrowse extends MasterDetailScreen<Country> {
}