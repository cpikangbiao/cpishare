/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: IvReinsuranceInfo
 * Author:   admin
 * Date:     2018/12/26 11:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cpi.share.uw.reinsurance;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2018/12/26
 * @since 1.0.0
 */
public class IvReinsuranceInfo implements Serializable{

    private Long insuredVesselId;

    private Integer numberId;

    private Instant entryDate;

    private Instant withdrawDate;

    private Long   reinsuranceId;

    private String reinsuranceName;

    private Long   currencyId;

    private String currency;

    private BigDecimal currencyRate;

    private BigDecimal deductible;

    public IvReinsuranceInfo() {
        this.insuredVesselId = 0L;
        this.numberId = 0;
        this.entryDate = null;
        this.withdrawDate = null;
        this.reinsuranceId = null;
        this.reinsuranceName = null;
        this.currencyId = null;
        this.currency = null;
        this.currencyRate = null;
        this.deductible = null;
    }

    public void init(Long insuredVesselId, Integer numberId, Instant entryDate, Instant withdrawDate,
                     Long reinsuranceId, String reinsuranceName, Long currencyId, String currency,
                     BigDecimal currencyRate, BigDecimal deductible) {
        this.insuredVesselId = insuredVesselId;
        this.numberId = numberId;
        this.entryDate = entryDate;
        this.withdrawDate = withdrawDate;
        this.reinsuranceId = reinsuranceId;
        this.reinsuranceName = reinsuranceName;
        this.currencyId = currencyId;
        this.currency = currency;
        this.currencyRate = currencyRate;
        this.deductible = deductible;
    }

    @Override
    public String toString() {
        return "IvReinsuranceInfo{" +
                "insuredVesselId=" + insuredVesselId +
                ", numberId=" + numberId +
                ", entryDate=" + entryDate +
                ", withdrawDate=" + withdrawDate +
                ", reinsuranceId=" + reinsuranceId +
                ", reinsuranceName='" + reinsuranceName + '\'' +
                ", currencyId=" + currencyId +
                ", currency='" + currency + '\'' +
                ", currencyRate=" + currencyRate +
                ", deductible=" + deductible +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IvReinsuranceInfo)) return false;
        IvReinsuranceInfo that = (IvReinsuranceInfo) o;
        return Objects.equals(getInsuredVesselId(), that.getInsuredVesselId()) &&
                Objects.equals(getNumberId(), that.getNumberId()) &&
                Objects.equals(getEntryDate(), that.getEntryDate()) &&
                Objects.equals(getWithdrawDate(), that.getWithdrawDate()) &&
                Objects.equals(getReinsuranceId(), that.getReinsuranceId()) &&
                Objects.equals(getReinsuranceName(), that.getReinsuranceName()) &&
                Objects.equals(getCurrencyId(), that.getCurrencyId()) &&
                Objects.equals(getCurrency(), that.getCurrency()) &&
                Objects.equals(getCurrencyRate(), that.getCurrencyRate()) &&
                Objects.equals(getDeductible(), that.getDeductible());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getInsuredVesselId(), getNumberId(), getEntryDate(), getWithdrawDate(), getReinsuranceId(), getReinsuranceName(), getCurrencyId(), getCurrency(), getCurrencyRate(), getDeductible());
    }

    public Long getInsuredVesselId() {
        return insuredVesselId;
    }

    public void setInsuredVesselId(Long insuredVesselId) {
        this.insuredVesselId = insuredVesselId;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public Instant getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Instant entryDate) {
        this.entryDate = entryDate;
    }

    public Instant getWithdrawDate() {
        return withdrawDate;
    }

    public void setWithdrawDate(Instant withdrawDate) {
        this.withdrawDate = withdrawDate;
    }

    public Long getReinsuranceId() {
        return reinsuranceId;
    }

    public void setReinsuranceId(Long reinsuranceId) {
        this.reinsuranceId = reinsuranceId;
    }

    public String getReinsuranceName() {
        return reinsuranceName;
    }

    public void setReinsuranceName(String reinsuranceName) {
        this.reinsuranceName = reinsuranceName;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(BigDecimal currencyRate) {
        this.currencyRate = currencyRate;
    }

    public BigDecimal getDeductible() {
        return deductible;
    }

    public void setDeductible(BigDecimal deductible) {
        this.deductible = deductible;
    }
}