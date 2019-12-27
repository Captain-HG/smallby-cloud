package com.lzc.smallbyservice.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

public class Order implements Serializable {
    @Id
    @Column(name = "o_id")
    private Long oId;

    @Column(name = "u_id")
    private Long uId;

    @Column(name = "p_ids")
    private String pIds;

    private String status;

    @Column(name = "create_time")
    private Integer createTime;

    @Column(name = "order_tiime")
    private Integer orderTiime;

    private String remark1;

    private String remark2;

    private String remark3;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "total_number")
    private Integer totalNumber;

    private static final long serialVersionUID = 1L;

    /**
     * @return o_id
     */
    public Long getoId() {
        return oId;
    }

    /**
     * @param oId
     */
    public void setoId(Long oId) {
        this.oId = oId;
    }

    /**
     * @return u_id
     */
    public Long getuId() {
        return uId;
    }

    /**
     * @param uId
     */
    public void setuId(Long uId) {
        this.uId = uId;
    }

    /**
     * @return p_ids
     */
    public String getpIds() {
        return pIds;
    }

    /**
     * @param pIds
     */
    public void setpIds(String pIds) {
        this.pIds = pIds;
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
     * @return order_tiime
     */
    public Integer getOrderTiime() {
        return orderTiime;
    }

    /**
     * @param orderTiime
     */
    public void setOrderTiime(Integer orderTiime) {
        this.orderTiime = orderTiime;
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

    /**
     * @return total_price
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @return total_number
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    /**
     * @param totalNumber
     */
    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oId=").append(oId);
        sb.append(", uId=").append(uId);
        sb.append(", pIds=").append(pIds);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", orderTiime=").append(orderTiime);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", remark3=").append(remark3);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", totalNumber=").append(totalNumber);
        sb.append("]");
        return sb.toString();
    }
}