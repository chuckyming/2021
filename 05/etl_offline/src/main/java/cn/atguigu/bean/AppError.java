package cn.atguigu.bean;

/**
 * TODO
 * 错误日志
 * @author ming
 * @date 2021/5/18 17:10
 */
public class AppError {
    private String errorBrief;//错误摘要
    private String errorDetail; //错误详情

    public String getErrorBrief() {
        return errorBrief;
    }

    public void setErrorBrief(String errorBrief) {
        this.errorBrief = errorBrief;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }
}
