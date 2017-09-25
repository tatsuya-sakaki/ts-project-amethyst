package com.ts.amethyst.logic;

public class ContentType extends TmpBean {

	private Integer contentTypeId;

	private String name;

	private String description;

	private String pictureUrl;

	public ContentType (Integer id, String name, String description, String pictureUrl) {
		this.contentTypeId = id;
		this.name = name;
		this.description = description;
		this.pictureUrl = pictureUrl;
	}
	public String getName() {
		return this.name;
	}

	public Integer getContentTypeId() {
		return this.contentTypeId;
	}

	public void setId(Integer contentTypeId) {
		this.contentTypeId = contentTypeId;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

}