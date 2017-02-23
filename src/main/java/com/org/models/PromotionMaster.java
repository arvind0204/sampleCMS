package com.org.models;

import java.io.File;

public class PromotionMaster {

	private String promotionId="";
	private String appId="";
	private String brand="";
	private String pkgName="";
	private String appName="";
	private String appPrice="";
	private String promotionPrice="";
	private String city="";
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	private String promotionDate="";
	private String promotionUpdate="";
	private String promotionPublDate="";
	private String promotionUnPublDate="";
	private String flag="";
	private String priority="";
	private String resField1="";
	private String resField2="";
	private File imageFile;
	private String fromDate="";
	private String toDate="";
	private String[] promoIdUpdateArray;
	private String[] prmoIdsToUnpublish;
	private String[] appIds;
	private String actionType="";   //For Url Mapping
	private String countryCode="";
	private String bannerPreview;
	private String[] publishRecord;
	private String[] unpublishRecord;
	
	public String getBannerPreview() {
		return bannerPreview;
	}

	public void setBannerPreview(String bannerPreview) {
		this.bannerPreview = bannerPreview;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String[] getAppIds() {
		return appIds;
	}

	public void setAppIds(String[] appIds) {
		this.appIds = appIds;
	}
	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	private String ownAppId;
	
	
	public String getOwnAppId() {
		return ownAppId;
	}

	public void setOwnAppId(String ownAppId) {
		this.ownAppId = ownAppId;
	}

	public String[] getPrmoIdsToUnpublish() {
		return prmoIdsToUnpublish;
	}

	public void setPrmoIdsToUnpublish(String[] prmoIdsToUnpublish) {
		this.prmoIdsToUnpublish = prmoIdsToUnpublish;
	}

	public String[] getPromoIdUpdateArray() {
		return promoIdUpdateArray;
	}
	
	public String[] getPublishRecord() {
		return publishRecord;
	}

	public void setPublishRecord(String[] publishRecord) {
		this.publishRecord = publishRecord;
	}

	public String[] getUnpublishRecord() {
		return unpublishRecord;
	}

	public void setUnpublishRecord(String[] unpublishRecord) {
		this.unpublishRecord = unpublishRecord;
	}

	public void setPromoIdUpdateArray(String[] promoIdUpdateArray) {
		this.promoIdUpdateArray = promoIdUpdateArray;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public File getImageFile() {
		return imageFile;
	}
	public void setImageFile(File imageFile) {
		this.imageFile = imageFile;
	}
	private PromotionDetails promoDetails;
	
	
	public PromotionDetails getPromoDetails() {
		return promoDetails;
	}
	public void setPromoDetails(PromotionDetails promoDetails) {
		this.promoDetails = promoDetails;
	}
	public String getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPkgName() {
		return pkgName;
	}
	public void setPkgName(String pkgName) {
		this.pkgName = pkgName;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppPrice() {
		return appPrice;
	}
	public void setAppPrice(String appPrice) {
		this.appPrice = appPrice;
	}
	public String getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public String getPromotionDate() {
		return promotionDate;
	}
	public void setPromotionDate(String promotionDate) {
		this.promotionDate = promotionDate;
	}
	public String getPromotionUpdate() {
		return promotionUpdate;
	}
	public void setPromotionUpdate(String promotionUpdate) {
		this.promotionUpdate = promotionUpdate;
	}
	public String getPromotionPublDate() {
		return promotionPublDate;
	}
	public void setPromotionPublDate(String promotionPublDate) {
		this.promotionPublDate = promotionPublDate;
	}
	public String getPromotionUnPublDate() {
		return promotionUnPublDate;
	}
	public void setPromotionUnPublDate(String promotionUnPublDate) {
		this.promotionUnPublDate = promotionUnPublDate;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getResField1() {
		return resField1;
	}
	public void setResField1(String resField1) {
		this.resField1 = resField1;
	}
	public String getResField2() {
		return resField2;
	}
	public void setResField2(String resField2) {
		this.resField2 = resField2;
	}

	public void publishRecord(String[] chkBoxes) {
		// TODO Auto-generated method stub
		this.publishRecord=chkBoxes;
		
	}

	public void unpublishRecord(String[] arrayToUnpublish) {
		// TODO Auto-generated method stub
		this.unpublishRecord=arrayToUnpublish;
	}
	
}

