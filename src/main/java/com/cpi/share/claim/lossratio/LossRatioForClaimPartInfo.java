/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LossRatioForClaimPartInfo
 * Author:   admin
 * Date:     2018/12/27 13:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cpi.share.claim.lossratio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2018/12/27
 * @since 1.0.0
 */
public class LossRatioForClaimPartInfo implements Serializable{

    private Integer caseNum;

    private Integer subCaseNum;

    private BigDecimal estimateAmount;

    private BigDecimal  claimAmount;

    private BigDecimal  riAmount;

    private BigDecimal  thirdpartAmount;

    private BigDecimal  memberPaymentAmount;

    private BigDecimal  surveyorFee;

    private BigDecimal  correspondentFee;

    private BigDecimal  lawyerFee;

    private BigDecimal  otherFee;

    private BigDecimal  paymentAmount;

    private BigDecimal  grossPayment;

    private BigDecimal  netPayment;

    public LossRatioForClaimPartInfo() {
        this.caseNum = 0;
        this.subCaseNum = 0;
        this.estimateAmount = BigDecimal.ZERO;
        this.claimAmount = BigDecimal.ZERO;
        this.riAmount = BigDecimal.ZERO;
        this.thirdpartAmount = BigDecimal.ZERO;
        this.memberPaymentAmount = BigDecimal.ZERO;
        this.surveyorFee = BigDecimal.ZERO;
        this.correspondentFee = BigDecimal.ZERO;
        this.lawyerFee = BigDecimal.ZERO;
        this.otherFee = BigDecimal.ZERO;
        this.paymentAmount = BigDecimal.ZERO;
        this.grossPayment = BigDecimal.ZERO;
        this.netPayment = BigDecimal.ZERO;
    }

    public void init(Integer caseNum, Integer subCaseNum, BigDecimal estimateAmount, BigDecimal claimAmount,
                     BigDecimal riAmount, BigDecimal thirdpartAmount, BigDecimal memberPaymentAmount,
                     BigDecimal surveyorFee, BigDecimal correspondentFee, BigDecimal lawyerFee, BigDecimal otherFee,
                     BigDecimal paymentAmount, BigDecimal grossPayment, BigDecimal netPayment) {
        this.caseNum = caseNum;
        this.subCaseNum = subCaseNum;
        this.estimateAmount = estimateAmount;
        this.claimAmount = claimAmount;
        this.riAmount = riAmount;
        this.thirdpartAmount = thirdpartAmount;
        this.memberPaymentAmount = memberPaymentAmount;
        this.surveyorFee = surveyorFee;
        this.correspondentFee = correspondentFee;
        this.lawyerFee = lawyerFee;
        this.otherFee = otherFee;
        this.paymentAmount = paymentAmount;
        this.grossPayment = grossPayment;
        this.netPayment = netPayment;
    }

    @Override
    public String toString() {
        return "LossRatioForClaimPartInfo{" +
                "caseNum=" + caseNum +
                ", subCaseNum=" + subCaseNum +
                ", estimateAmount=" + estimateAmount +
                ", claimAmount=" + claimAmount +
                ", riAmount=" + riAmount +
                ", thirdpartAmount=" + thirdpartAmount +
                ", memberPaymentAmount=" + memberPaymentAmount +
                ", surveyorFee=" + surveyorFee +
                ", correspondentFee=" + correspondentFee +
                ", lawyerFee=" + lawyerFee +
                ", otherFee=" + otherFee +
                ", paymentAmount=" + paymentAmount +
                ", grossPayment=" + grossPayment +
                ", netPayment=" + netPayment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LossRatioForClaimPartInfo)) return false;
        LossRatioForClaimPartInfo that = (LossRatioForClaimPartInfo) o;
        return Objects.equals(getCaseNum(), that.getCaseNum()) &&
                Objects.equals(getSubCaseNum(), that.getSubCaseNum()) &&
                Objects.equals(getEstimateAmount(), that.getEstimateAmount()) &&
                Objects.equals(getClaimAmount(), that.getClaimAmount()) &&
                Objects.equals(getRiAmount(), that.getRiAmount()) &&
                Objects.equals(getThirdpartAmount(), that.getThirdpartAmount()) &&
                Objects.equals(getMemberPaymentAmount(), that.getMemberPaymentAmount()) &&
                Objects.equals(getSurveyorFee(), that.getSurveyorFee()) &&
                Objects.equals(getCorrespondentFee(), that.getCorrespondentFee()) &&
                Objects.equals(getLawyerFee(), that.getLawyerFee()) &&
                Objects.equals(getOtherFee(), that.getOtherFee()) &&
                Objects.equals(getPaymentAmount(), that.getPaymentAmount()) &&
                Objects.equals(getGrossPayment(), that.getGrossPayment()) &&
                Objects.equals(getNetPayment(), that.getNetPayment());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCaseNum(), getSubCaseNum(), getEstimateAmount(), getClaimAmount(), getRiAmount(), getThirdpartAmount(), getMemberPaymentAmount(), getSurveyorFee(), getCorrespondentFee(), getLawyerFee(), getOtherFee(), getPaymentAmount(), getGrossPayment(), getNetPayment());
    }

    public Integer getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(Integer caseNum) {
        this.caseNum = caseNum;
    }

    public Integer getSubCaseNum() {
        return subCaseNum;
    }

    public void setSubCaseNum(Integer subCaseNum) {
        this.subCaseNum = subCaseNum;
    }

    public BigDecimal getEstimateAmount() {
        return estimateAmount;
    }

    public void setEstimateAmount(BigDecimal estimateAmount) {
        this.estimateAmount = estimateAmount;
    }

    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(BigDecimal claimAmount) {
        this.claimAmount = claimAmount;
    }

    public BigDecimal getRiAmount() {
        return riAmount;
    }

    public void setRiAmount(BigDecimal riAmount) {
        this.riAmount = riAmount;
    }

    public BigDecimal getThirdpartAmount() {
        return thirdpartAmount;
    }

    public void setThirdpartAmount(BigDecimal thirdpartAmount) {
        this.thirdpartAmount = thirdpartAmount;
    }

    public BigDecimal getMemberPaymentAmount() {
        return memberPaymentAmount;
    }

    public void setMemberPaymentAmount(BigDecimal memberPaymentAmount) {
        this.memberPaymentAmount = memberPaymentAmount;
    }

    public BigDecimal getSurveyorFee() {
        return surveyorFee;
    }

    public void setSurveyorFee(BigDecimal surveyorFee) {
        this.surveyorFee = surveyorFee;
    }

    public BigDecimal getCorrespondentFee() {
        return correspondentFee;
    }

    public void setCorrespondentFee(BigDecimal correspondentFee) {
        this.correspondentFee = correspondentFee;
    }

    public BigDecimal getLawyerFee() {
        return lawyerFee;
    }

    public void setLawyerFee(BigDecimal lawyerFee) {
        this.lawyerFee = lawyerFee;
    }

    public BigDecimal getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(BigDecimal otherFee) {
        this.otherFee = otherFee;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getGrossPayment() {
        return grossPayment;
    }

    public void setGrossPayment(BigDecimal grossPayment) {
        this.grossPayment = grossPayment;
    }

    public BigDecimal getNetPayment() {
        return netPayment;
    }

    public void setNetPayment(BigDecimal netPayment) {
        this.netPayment = netPayment;
    }
}