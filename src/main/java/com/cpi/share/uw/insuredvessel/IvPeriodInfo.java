/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: IvPeriodInfo
 * Author:   admin
 * Date:     2018/12/27 9:05
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
public class IvPeriodInfo implements Serializable {

    private Integer numberId;

    private Instant entryDate;

    private Instant withdrawDate;

    public IvPeriodInfo() {
        this.numberId = 0;
        this.entryDate = null;
        this.withdrawDate = null;
    }

    public void init(Integer numberId, Instant entryDate, Instant withdrawDate) {
        this.numberId = numberId;
        this.entryDate = entryDate;
        this.withdrawDate = withdrawDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IvPeriodInfo)) return false;
        IvPeriodInfo that = (IvPeriodInfo) o;
        return Objects.equals(getNumberId(), that.getNumberId()) &&
                Objects.equals(getEntryDate(), that.getEntryDate()) &&
                Objects.equals(getWithdrawDate(), that.getWithdrawDate());
    }

    @Override
    public String toString() {
        return "IvPeriodInfo{" +
                "numberId=" + numberId +
                ", entryDate=" + entryDate +
                ", withdrawDate=" + withdrawDate +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNumberId(), getEntryDate(), getWithdrawDate());
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
}