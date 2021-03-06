package com.pid.dynamiclists.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The type MenuObject class.
 * @author Ilya Mishin
 */
public class MenuObject {
    @SerializedName("nrec")
    @Expose
    private String nrec;

    @SerializedName("value")
    @Expose
    private String value;

    @SerializedName("selected")
    @Expose
    private boolean selected;

    public String getNrec() {
        return nrec;
    }

    public void setNrec(String nrec) {
        this.nrec = nrec;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
