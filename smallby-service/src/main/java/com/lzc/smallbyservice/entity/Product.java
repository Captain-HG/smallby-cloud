package com.lzc.smallbyservice.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Product implements Serializable {
    @Id
    @Column(name = "p_id")
    private Long pId;

    @Column(name = "p_name")
    private String pName;

    @Column(name = "p_detail")
    private String pDetail;

    @Column(name = "p_price")
    private Long pPrice;

    private String status;

    private String category;

    private Integer sales;

    private String level;

    @Column(name = "create_time")
    private Integer createTime;

    @Column(name = "update_time")
    private Integer updateTime;

    private String remark1;

    private String remark2;

    private String remark3;

    private static final long serialVersionUID = 1L;

    /**
     * @return p_id
     */
    public Long getpId() {
        return pId;
    }

    /**
     * @param pId
     */
    public void setpId(Long pId) {
        this.pId = pId;
    }

    /**
     * @return p_name
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * @return p_detail
     */
    public String getpDetail() {
        return pDetail;
    }

    /**
     * @param pDetail
     */
    public void setpDetail(String pDetail) {
        this.pDetail = pDetail;
    }

    /**
     * @return p_price
     */
    public Long getpPrice() {
        return pPrice;
    }

    /**
     * @param pPrice
     */
    public void setpPrice(Long pPrice) {
        this.pPrice = pPrice;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return sales
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * @param sales
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * @return create_time
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return remark1
     */
    public String getRemark1() {
        return remark1;
    }

    /**
     * @param remark1
     */
    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    /**
     * @return remark2
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * @param remark2
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    /**
     * @return remark3
     */
    public String getRemark3() {
        return remark3;
    }

    /**
     * @param remark3
     */
    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", pName=").append(pName);
        sb.append(", pDetail=").append(pDetail);
        sb.append(", pPrice=").append(pPrice);
        sb.append(", status=").append(status);
        sb.append(", category=").append(category);
        sb.append(", sales=").append(sales);
        sb.append(", level=").append(level);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", remark3=").append(remark3);
        sb.append("]");
        return sb.toString();
    }
}