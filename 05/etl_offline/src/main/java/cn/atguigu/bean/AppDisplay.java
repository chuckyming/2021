package cn.atguigu.bean;

/**
 * TODO
 * 商品点击日志
 * @author ming
 * @date 2021/5/18 17:11
 */
public class AppDisplay {
    private String action; //动作
    private String goodsid; //商品id
    private String place; //顺序
    private String extendl; //曝光类型
    private String category; //分类ID

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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getExtendl() {
        return extendl;
    }

    public void setExtendl(String extendl) {
        this.extendl = extendl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
