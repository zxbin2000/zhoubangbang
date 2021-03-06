package com.android.search.obj;

public class SearchDetailInfo {
	public String type;
	public int distance;
	public String tag;
	public String detail_url;
	public String price;
	public String shop_hours;
	public String overall_rating;
	public String taste_rating;
	public String service_rating;
	public String environment_rating;
	public String facility_rating;
	public String hygiene_rating;
	public String technology_rating;
	public int groupon_num;
	public int discount_num;
	public String image_num;
	public String comment_num;
	public String favorite_num;
	public String checkin_num;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getDetail_url() {
		return detail_url;
	}

	public void setDetail_url(String detail_url) {
		this.detail_url = detail_url;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOverall_rating() {
		return overall_rating;
	}

	public void setOverall_rating(String overall_rating) {
		this.overall_rating = overall_rating;
	}

	public String getService_rating() {
		return service_rating;
	}

	public void setService_rating(String service_rating) {
		this.service_rating = service_rating;
	}

	public String getEnvironment_rating() {
		return environment_rating;
	}

	public void setEnvironment_rating(String environment_rating) {
		this.environment_rating = environment_rating;
	}

	public String getImage_num() {
		return image_num;
	}

	public void setImage_num(String image_num) {
		this.image_num = image_num;
	}

	public String getComment_num() {
		return comment_num;
	}

	public void setComment_num(String comment_num) {
		this.comment_num = comment_num;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getShop_hours() {
		return shop_hours;
	}

	public void setShop_hours(String shop_hours) {
		this.shop_hours = shop_hours;
	}

	public String getTaste_rating() {
		return taste_rating;
	}

	public void setTaste_rating(String taste_rating) {
		this.taste_rating = taste_rating;
	}

	public String getFacility_rating() {
		return facility_rating;
	}

	public void setFacility_rating(String facility_rating) {
		this.facility_rating = facility_rating;
	}

	public String getHygiene_rating() {
		return hygiene_rating;
	}

	public void setHygiene_rating(String hygiene_rating) {
		this.hygiene_rating = hygiene_rating;
	}

	public String getTechnology_rating() {
		return technology_rating;
	}

	public void setTechnology_rating(String technology_rating) {
		this.technology_rating = technology_rating;
	}

	public int getGroupon_num() {
		return groupon_num;
	}

	public void setGroupon_num(int groupon_num) {
		this.groupon_num = groupon_num;
	}

	public int getDiscount_num() {
		return discount_num;
	}

	public void setDiscount_num(int discount_num) {
		this.discount_num = discount_num;
	}

	public String getFavorite_num() {
		return favorite_num;
	}

	public void setFavorite_num(String favorite_num) {
		this.favorite_num = favorite_num;
	}

	public String getCheckin_num() {
		return checkin_num;
	}

	public void setCheckin_num(String checkin_num) {
		this.checkin_num = checkin_num;
	}

	@Override
	public String toString() {
		return "search_detail_info [type=" + type + ", distance=" + distance
				+ ", tag=" + tag + ", detail_url=" + detail_url + ", price="
				+ price + ", shop_hours=" + shop_hours + ", overall_rating="
				+ overall_rating + ", taste_rating=" + taste_rating
				+ ", service_rating=" + service_rating
				+ ", environment_rating=" + environment_rating
				+ ", facility_rating=" + facility_rating + ", hygiene_rating="
				+ hygiene_rating + ", technology_rating=" + technology_rating
				+ ", groupon_num=" + groupon_num + ", discount_num="
				+ discount_num + ", image_num=" + image_num + ", comment_num="
				+ comment_num + ", favorite_num=" + favorite_num
				+ ", checkin_num=" + checkin_num + "]";
	}
}
