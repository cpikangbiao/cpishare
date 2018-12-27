/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: IvCertificateVersionInfo
 * Author:   admin
 * Date:     2018/12/27 9:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cpi.share.uw.insuredvessel;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2018/12/27
 * @since 1.0.0
 */
public class IvCertificateVersionInfo implements Serializable {

    private Long id;

    private Integer numberId;

    private String certificateCode;

    private Instant createTime;

    public IvCertificateVersionInfo() {
        this.id = 0L;
        this.numberId = 0;
        this.certificateCode = null;
        this.createTime = null;
    }

    public void init(Long id, Integer numberId, String certificateCode, Instant createTime) {
        this.id = id;
        this.numberId = numberId;
        this.certificateCode = certificateCode;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "IvCertificateVersionInfo{" +
                "id=" + id +
                ", numberId=" + numberId +
                ", certificateCode='" + certificateCode + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IvCertificateVersionInfo)) return false;
        IvCertificateVersionInfo that = (IvCertificateVersionInfo) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getNumberId(), that.getNumberId()) &&
                Objects.equals(getCertificateCode(), that.getCertificateCode()) &&
                Objects.equals(getCreateTime(), that.getCreateTime());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getNumberId(), getCertificateCode(), getCreateTime());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public String getCertificateCode() {
        return certificateCode;
    }

    public void setCertificateCode(String certificateCode) {
        this.certificateCode = certificateCode;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }
}