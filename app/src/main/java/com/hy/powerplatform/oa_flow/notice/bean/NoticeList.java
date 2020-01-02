package com.hy.powerplatform.oa_flow.notice.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/12/31.
 */

public class NoticeList implements Serializable {
    public String title;
    public String content;
    public String author;
    public String createtime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}
