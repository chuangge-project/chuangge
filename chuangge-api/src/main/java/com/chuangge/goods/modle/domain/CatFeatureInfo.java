package com.chuangge.goods.modle.domain;

import java.util.Date;

public class CatFeatureInfo {
    private Long featureId;

    private Integer catId;

    private String featureName;

    private Byte enumType;

    private Byte uiType;

    private Short sortNo;

    private Date createTime;

    private Date updateTime;

    private String column9;

    public Long getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public Byte getEnumType() {
        return enumType;
    }

    public void setEnumType(Byte enumType) {
        this.enumType = enumType;
    }

    public Byte getUiType() {
        return uiType;
    }

    public void setUiType(Byte uiType) {
        this.uiType = uiType;
    }

    public Short getSortNo() {
        return sortNo;
    }

    public void setSortNo(Short sortNo) {
        this.sortNo = sortNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getColumn9() {
        return column9;
    }

    public void setColumn9(String column9) {
        this.column9 = column9;
    }
}