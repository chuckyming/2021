package cn.atguigu.bean;

import javax.swing.text.StringContent;

/**
 * TODO
 *
 * @author ming
 * @date 2021/5/20 15:46
 */
public class AppNotification {
    private String action;
    private String type;
    private String ap_time;
    private String content;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAp_time() {
        return ap_time;
    }

    public void setAp_time(String ap_time) {
        this.ap_time = ap_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
