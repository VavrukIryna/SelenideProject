package BO;

import core.PO.GooglePO;

public class GoogleBO {

    private GooglePO googlePO = new GooglePO();

    public void doSearch(String value) {
        googlePO.typeValue(value);
    }

    public String getFirstResult() {
        return googlePO.getTitle();
    }
}
