package cn.atguigu.bean;

/**
 * TODO
 * 商品详情
 * @author ming
 * @date 2021/5/18 17:13
 */
public class AppNewsDetail {
    private String entry; //页面入口来源
    private String action; //动作
    private String goodsid; //商品id
    private String showtype; //商品样式
    private String news_staytime; //页面停留时长
    private String loading_time; //加载时长
    private String typel; //加载失败吗
    private String category; //分类id

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getShowtype() {
        return showtype;
    }

    public void setShowtype(String showtype) {
        this.showtype = showtype;
    }

    public String getNews_staytime() {
        return news_staytime;
    }

    public void setNews_staytime(String news_staytime) {
        this.news_staytime = news_staytime;
    }

    public String getLoading_time() {
        return loading_time;
    }

    public void setLoading_time(String loading_time) {
        this.loading_time = loading_time;
    }

    public String getType1() {
        return typel;
    }

    public void setType1(String typel) {
        this.typel = typel;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
