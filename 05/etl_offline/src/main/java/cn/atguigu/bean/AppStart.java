package cn.atguigu.bean;

/**
 * TODO
 * 启动日志
 * @author ming
 * @date 2021/5/18 17:01
 */
public class AppStart extends AppBase {
    private String entry; //入口
    private String open_ad_type; //开屏广告类型
    private String action; //状态
    private String loading_time; //加载时长：计算下拉开始到接口发牛数据的是加纳
    private String detail; //失败吗（没有则上报空)
    private String extendl; //失败的message
    private String en; //启动日志类型标记

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getOpen_ad_type() {
        return open_ad_type;
    }

    public void setOpen_ad_type(String open_ad_type) {
        this.open_ad_type = open_ad_type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getLoading_time() {
        return loading_time;
    }

    public void setLoading_time(String loading_time) {
        this.loading_time = loading_time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getExtendl() {
        return extendl;
    }

    public void setExtendl(String extendl) {
        this.extendl = extendl;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }
}
