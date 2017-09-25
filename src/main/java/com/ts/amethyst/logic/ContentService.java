package com.ts.amethyst.logic;

import java.util.List;

public interface ContentService {
	List<ContentType> getContentTypeList();
	ContentType getContentType(Integer id);

}
