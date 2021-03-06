package com.android.cloudsearch.tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import rp2.UserIndex;

import com.android.cloudsearch.common.CloudTool;
import com.android.cloudsearch.constant.GlobalConstant;
import com.android.cloudsearch.constant.SearchType;
import com.android.cloudsearch.obj.CloudItemObj;
import com.android.cloudsearch.obj.CloudSearchObj;
import com.android.search.obj.SearchForUI;
import com.android.search.obj.SearchForUIData;

public class SearchCloudInterface {

	public static CloudSearchObj CloudSearchNearbyInterfaceForOriginalPoiData(
			String longitude, String latitude, String scope, String tagList,
			int recordMax) {
		CloudSearchObj obj = CloudTool.getAllCloudSearchObjSearchResult(
				latitude, longitude, scope, "", "", tagList,
				new Date().getTime() + "", GlobalConstant.page_size,
				GlobalConstant.recordMax, GlobalConstant.region,
				SearchType.nearbySearch);
		return obj;
	}

	public static SearchForUI CloudSearchForUi(String longitude,
			String latitude, String scope, String tagList, int recordMax) {
		CloudSearchObj obj = CloudTool.getAllCloudSearchObjSearchResult(
				latitude, longitude, scope, "", "", tagList,
				new Date().getTime() + "", GlobalConstant.page_size,
				GlobalConstant.recordMax, GlobalConstant.region,
				SearchType.nearbySearch);
		SearchForUI searchForUi = new SearchForUI();
		searchForUi.setCode(obj.getStatus() != 0 ? 1 : 0);
		searchForUi.setMessage(obj.getStatus() == 0 ? "success" : "failed");
		List<SearchForUIData> data = new ArrayList<SearchForUIData>();
		for (CloudItemObj result : obj.getContents()) {
			SearchForUIData uiData = new SearchForUIData();
			uiData.setPoiId(result.getUid() + "");
			uiData.setNickName(result.getTitle());
			uiData.setMessageType(result.getMessageType());
			uiData.setPhotoPath(result.getPhotoPath());
			uiData.setPoiTag(result.getTags());
			uiData.setLngX(result.getLocation().get(1));
			uiData.setLatY(result.getLocation().get(0));
			uiData.setDistance(result.getDistance());
			// feedbackId
			// Message
			uiData.setUserId(result.getUserId() + "");
			uiData.setMessage(result.getMessage());
			uiData.setBeginTime(result.getBeginTime() + "");
			uiData.setEndTime(result.getEndTime() + "");
			data.add(uiData);
		}
		searchForUi.setData(data);
		return searchForUi;
	}

	public static CloudSearchObj CloudSearchRegionInterfaceForOriginalPoiData(
			String tagList) {
		CloudSearchObj obj = CloudTool.getAllCloudSearchObjSearchResult("0.0",
				"0.0", "0", "", "", tagList, new Date().getTime() + "",
				GlobalConstant.page_size, GlobalConstant.recordMax,
				GlobalConstant.region, SearchType.regionSearch);
		return obj;
	}

	public static SearchForUI CloudPersonalSearchForUi(String userId,
			String messageType) {
		CloudSearchObj obj = SearchCloudInterface
				.CloudSearchPersonalInterfaceForOriginalPoiData(userId,
						messageType);
		SearchForUI searchForUi = new SearchForUI();
		searchForUi.setCode(obj.getStatus() != 0 ? 1 : 0);
		searchForUi.setMessage(obj.getStatus() == 0 ? "success" : "failed");
		List<SearchForUIData> data = new ArrayList<SearchForUIData>();
		for (CloudItemObj result : obj.getContents()) {
			SearchForUIData uiData = new SearchForUIData();
			uiData.setPoiId(result.getUid() + "");
			uiData.setNickName(result.getTitle());
			uiData.setMessageType(result.getMessageType());
			uiData.setPhotoPath(result.getPhotoPath());
			uiData.setPoiTag(result.getTags());
			uiData.setLngX(result.getLocation().get(1));
			uiData.setLatY(result.getLocation().get(0));
			uiData.setDistance(result.getDistance());
			// feedbackId
			uiData.setFeedbackId(result.getFeedbackId() + "");
			uiData.setUserId(result.getUserId() + "");
			uiData.setMessage(result.getMessage());
			uiData.setBeginTime(result.getBeginTime() + "");
			uiData.setEndTime(result.getEndTime() + "");
			data.add(uiData);
		}
		searchForUi.setData(data);
		return searchForUi;
	}

	public static CloudSearchObj CloudSearchPersonalInterfaceForOriginalPoiData(
			String userId, String messageType) {
		CloudSearchObj obj = CloudTool.getAllCloudSearchObjSearchResult("0.0",
				"0.0", "0", userId, messageType, "", "",
				GlobalConstant.page_size, GlobalConstant.recordMax,
				GlobalConstant.region, SearchType.personalSearch);
		return obj;
	}

	public static CloudSearchObj CloudSearchDetailInterfaceForOriginalPoiData(
			String poiId) {
		// CloudSearchObj obj =
		// CloudTool.cloudInterfaceForOriginalPoiData("0.0", "0.0", "0", "", "",
		// "", "", "0", "0", "", SearchType.detailSearch, poiId);
		CloudSearchObj obj = CloudTool.cloudInterfaceForOriginalPoiData("", "",
				"", "", "", "", "", "", "", "", SearchType.detailSearch, poiId);
		return obj;
	}

	public static SearchForUI CloudDetailSearchForUi(String poiId) {
		CloudSearchObj obj = SearchCloudInterface
				.CloudSearchDetailInterfaceForOriginalPoiData(poiId);
		SearchForUI searchForUi = new SearchForUI();
		searchForUi.setCode(obj.getStatus() != 0 ? 1 : 0);
		searchForUi.setMessage(obj.getStatus() == 0 ? "success" : "failed");
		List<SearchForUIData> data = new ArrayList<SearchForUIData>();
		for (CloudItemObj result : obj.getContents()) {
			SearchForUIData uiData = new SearchForUIData();
			uiData.setPoiId(result.getUid() + "");
			uiData.setNickName(result.getTitle());
			uiData.setMessageType(result.getMessageType());
			uiData.setPhotoPath(result.getPhotoPath());
			uiData.setPoiTag(result.getTags());
			uiData.setLngX(result.getLocation().get(1));
			uiData.setLatY(result.getLocation().get(0));
			uiData.setDistance(result.getDistance());
			// feedbackId
			uiData.setFeedbackId(result.getFeedbackId() + "");
			uiData.setUserId(result.getUserId() + "");
			uiData.setMessage(result.getMessage());
			uiData.setBeginTime(result.getBeginTime() + "");
			uiData.setEndTime(result.getEndTime() + "");
			data.add(uiData);
		}
		searchForUi.setData(data);
		return searchForUi;
	}

	public static List<UserIndex> CloudSearchNearbyInterfaceForRp(
			String longitude, String latitude, String scope, String tagList) {
		CloudSearchObj obj = CloudTool.getAllCloudSearchObjSearchResult(
				latitude, longitude, scope, "", "", tagList,
				new Date().getTime() + "", GlobalConstant.page_size,
				GlobalConstant.recordMax, GlobalConstant.region,
				SearchType.nearbySearch);
		List<UserIndex> lists = new ArrayList<UserIndex>();
		if (obj.getContents() == null || obj.getContents().size() == 0)
			return lists;
		UserIndex index;
		for (CloudItemObj item : obj.getContents()) {
			index = new UserIndex();
			index.setName(item.getTitle());
			index.setUid(item.getUid() + "");
			index.setTagList(Arrays.asList(item.getTags().split(",")));
			lists.add(index);
		}
		return lists;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
