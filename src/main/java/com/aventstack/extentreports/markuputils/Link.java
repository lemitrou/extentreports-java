package com.aventstack.extentreports.markuputils;

public class Link implements Markup {

    private String linkText = "Video Link";
    private String src = "";


    public void setText(String src){
        this.src = src;
    }

    public void setLinkText(String linkText){
        this.linkText = linkText;
    }

    public String getMarkup() {
        return "<a target=\"_blank\" href=\"" + src + "\">" + linkText + "</a>";
    }
}
