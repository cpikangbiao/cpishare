/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: InsuredVesselInfo
 * Author:   admin
 * Date:     2018/12/27 9:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cpi.share.uw.insuredvessel;

import com.cpi.share.uw.reinsurance.IvReinsuranceInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2018/12/27
 * @since 1.0.0
 */
public class InsuredVesselInfo implements Serializable {

    private String vesselName;

    private String memberName;

    private String insuredVesselCode;

    private String policyYear;

    private String vesselGT;

    private String vesselIMO;

    private String vesselBuildYear;

    private String vesselCountry;

    private String specialItem;

    private List<IvPeriodInfo> ivPeriodInfos;

    private List<IvReinsuranceInfo> ivReinsuranceInfos;

    private List<IvCertificateVersionInfo> ivCertificateVersionInfos;

    public InsuredVesselInfo() {
        this.vesselName = null;
        this.memberName = null;
        this.insuredVesselCode = null;
        this.policyYear = null;
        this.vesselGT = null;
        this.vesselIMO = null;
        this.vesselBuildYear = null;
        this.vesselCountry = null;
        this.specialItem = null;
        this.ivPeriodInfos = new ArrayList<>();
        this.ivReinsuranceInfos = new ArrayList<>();
        this.ivCertificateVersionInfos = new ArrayList<>();
    }

    public void init(String vesselName, String memberName, String insuredVesselCode, String policyYear,
                     String vesselGT, String vesselIMO, String vesselBuildYear, String vesselCountry,
                     String specialItem, List<IvPeriodInfo> ivPeriodInfos, List<IvReinsuranceInfo> ivReinsuranceInfos,
                     List<IvCertificateVersionInfo> ivCertificateVersionInfos) {
        this.vesselName = vesselName;
        this.memberName = memberName;
        this.insuredVesselCode = insuredVesselCode;
        this.policyYear = policyYear;
        this.vesselGT = vesselGT;
        this.vesselIMO = vesselIMO;
        this.vesselBuildYear = vesselBuildYear;
        this.vesselCountry = vesselCountry;
        this.specialItem = specialItem;
        this.ivPeriodInfos = ivPeriodInfos;
        this.ivReinsuranceInfos = ivReinsuranceInfos;
        this.ivCertificateVersionInfos = ivCertificateVersionInfos;
    }

    @Override
    public String toString() {
        return "InsuredVesselInfo{" +
                "vesselName='" + vesselName + '\'' +
                ", memberName='" + memberName + '\'' +
                ", insuredVesselCode='" + insuredVesselCode + '\'' +
                ", policyYear='" + policyYear + '\'' +
                ", vesselGT='" + vesselGT + '\'' +
                ", vesselIMO='" + vesselIMO + '\'' +
                ", vesselBuildYear='" + vesselBuildYear + '\'' +
                ", vesselCountry='" + vesselCountry + '\'' +
                ", specialItem='" + specialItem + '\'' +
                ", ivPeriodInfos=" + ivPeriodInfos +
                ", ivReinsuranceInfos=" + ivReinsuranceInfos +
                ", ivCertificateVersionInfos=" + ivCertificateVersionInfos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InsuredVesselInfo)) return false;
        InsuredVesselInfo that = (InsuredVesselInfo) o;
        return Objects.equals(getVesselName(), that.getVesselName()) &&
                Objects.equals(getMemberName(), that.getMemberName()) &&
                Objects.equals(getInsuredVesselCode(), that.getInsuredVesselCode()) &&
                Objects.equals(getPolicyYear(), that.getPolicyYear()) &&
                Objects.equals(getVesselGT(), that.getVesselGT()) &&
                Objects.equals(getVesselIMO(), that.getVesselIMO()) &&
                Objects.equals(getVesselBuildYear(), that.getVesselBuildYear()) &&
                Objects.equals(getVesselCountry(), that.getVesselCountry()) &&
                Objects.equals(getSpecialItem(), that.getSpecialItem()) &&
                Objects.equals(getIvPeriodInfos(), that.getIvPeriodInfos()) &&
                Objects.equals(getIvReinsuranceInfos(), that.getIvReinsuranceInfos()) &&
                Objects.equals(getIvCertificateVersionInfos(), that.getIvCertificateVersionInfos());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getVesselName(), getMemberName(), getInsuredVesselCode(), getPolicyYear(), getVesselGT(), getVesselIMO(), getVesselBuildYear(), getVesselCountry(), getSpecialItem(), getIvPeriodInfos(), getIvReinsuranceInfos(), getIvCertificateVersionInfos());
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getInsuredVesselCode() {
        return insuredVesselCode;
    }

    public void setInsuredVesselCode(String insuredVesselCode) {
        this.insuredVesselCode = insuredVesselCode;
    }

    public String getPolicyYear() {
        return policyYear;
    }

    public void setPolicyYear(String policyYear) {
        this.policyYear = policyYear;
    }

    public String getVesselGT() {
        return vesselGT;
    }

    public void setVesselGT(String vesselGT) {
        this.vesselGT = vesselGT;
    }

    public String getVesselIMO() {
        return vesselIMO;
    }

    public void setVesselIMO(String vesselIMO) {
        this.vesselIMO = vesselIMO;
    }

    public String getVesselBuildYear() {
        return vesselBuildYear;
    }

    public void setVesselBuildYear(String vesselBuildYear) {
        this.vesselBuildYear = vesselBuildYear;
    }

    public String getVesselCountry() {
        return vesselCountry;
    }

    public void setVesselCountry(String vesselCountry) {
        this.vesselCountry = vesselCountry;
    }

    public String getSpecialItem() {
        return specialItem;
    }

    public void setSpecialItem(String specialItem) {
        this.specialItem = specialItem;
    }

    public List<IvPeriodInfo> getIvPeriodInfos() {
        return ivPeriodInfos;
    }

    public void setIvPeriodInfos(List<IvPeriodInfo> ivPeriodInfos) {
        this.ivPeriodInfos = ivPeriodInfos;
    }

    public List<IvReinsuranceInfo> getIvReinsuranceInfos() {
        return ivReinsuranceInfos;
    }

    public void setIvReinsuranceInfos(List<IvReinsuranceInfo> ivReinsuranceInfos) {
        this.ivReinsuranceInfos = ivReinsuranceInfos;
    }

    public List<IvCertificateVersionInfo> getIvCertificateVersionInfos() {
        return ivCertificateVersionInfos;
    }

    public void setIvCertificateVersionInfos(List<IvCertificateVersionInfo> ivCertificateVersionInfos) {
        this.ivCertificateVersionInfos = ivCertificateVersionInfos;
    }
}