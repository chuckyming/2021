package cn.atguigu.bean;

/**
 * TODO
 * 购物车
 * @author ming
 * @date 2021/5/20 15:31
 */
public class AppCart {
    int itemid;
    int action; //
    int changeNum; //数量变化
    int beforeNum; //变化前
    int afterNum; //变化后
    Double price; //

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public int getChangeNum() {
        return changeNum;
    }

    public void setChangeNum(int changeNum) {
        this.changeNum = changeNum;
    }

    public int getBeforeNum() {
        return beforeNum;
    }

    public void setBeforeNum(int beforeNum) {
        this.beforeNum = beforeNum;
    }

    public int getAfterNum() {
        return afterNum;
    }

    public void setAfterNum(int afterNum) {
        this.afterNum = afterNum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
