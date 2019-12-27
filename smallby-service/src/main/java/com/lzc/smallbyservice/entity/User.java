package com.lzc.smallbyservice.entity;

import java.io.Serializable;
import javax.persistence.*;

public class User implements Serializable {
    @Id
    @Column(name = "u_id")
    private Long uId;

    @Column(name = "u_name")
    private String uName;

    @Column(name = "vx_id")
    private String vxId;

    private String status;

    private String channel;

    @Column(name = "create_time")
    private Integer createTime;

    private String phone;

    @Column(name = "update_time")
    private Integer updateTime;

    @Column(name = "login_time")
    private Integer loginTime;

    private String remark1;

    private String remark2;

    private String remark3;

    private static final long serialVersionUID = 1L;

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
     * @return u_name
     */
    public String getuName() {
        return uName;
    }

    /**
     * @param uName
     */
    public void setuName(String uName) {
        this.uName = uName;
    }

    /**
     * @return vx_id
     */
    public String getVxId() {
        return vxId;
    }

    /**
     * @param vxId
     */
    public void setVxId(String vxId) {
        this.vxId = vxId;
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
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
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
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * @return login_time
     */
    public Integer getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime
     */
    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
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
        sb.append(", uId=").append(uId);
        sb.append(", uName=").append(uName);
        sb.append(", vxId=").append(vxId);
        sb.append(", status=").append(status);
        sb.append(", channel=").append(channel);
        sb.append(", createTime=").append(createTime);
        sb.append(", phone=").append(phone);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", remark3=").append(remark3);
        sb.append("]");
        return sb.toString();
    }
}