package com.scnufanz.fangsongbao.bean;

public class TalkBean {
    public String content;//内容
    public int imageId;//图片ID
    public boolean isAsk;//判断是回答还是询问

    public TalkBean(String content, int imageId, boolean isAsk) {
        this.content = content;
        this.imageId = imageId;
        this.isAsk = isAsk;
    }
}
