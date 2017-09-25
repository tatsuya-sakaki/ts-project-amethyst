package com.ts.amethyst.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ts.amethyst.logic.ContentService;
import com.ts.amethyst.logic.ContentType;
/**
 * TypeController
 *
 * @author sakaki
 *
 */

public class TypeController implements Controller {

	private ContentService contentService;
    private String contentTypeId;
    public void setContentTypeId(String contentTypeId) {
    	this.contentTypeId = contentTypeId;
    }
	public void setContentService(ContentService contentService) {
		this.contentService = contentService;
	}
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 商品一覧情報を取得
		ContentType contentType = this.contentService.getContentType(Integer.valueOf(contentTypeId));
		// モデルの作成
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("contentType", contentType);

		// 戻り値となるModelAndViewインスタンスを作成
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("type");
		modelAndView.addAllObjects(model);

		return modelAndView;
	}
}
