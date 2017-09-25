package com.ts.amethyst.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ContentServiceImpl implements ContentService {
    @Autowired
	private ContentTypeDao contentTypeDao;


	public List<ContentType> getContentTypeList() {
		return this.contentTypeDao.findAll();
	}

	public ContentType getContentType(Integer id) {
		return this.contentTypeDao.findById(id);
	}
}
