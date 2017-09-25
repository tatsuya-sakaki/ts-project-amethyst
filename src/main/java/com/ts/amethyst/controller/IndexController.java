package com.ts.amethyst.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ts.amethyst.logic.ContentService;
import com.ts.amethyst.logic.ContentType;
/**
 * IndexController
 *
 * @author sakaki
 *
 */
public class IndexController implements Controller {

	private ContentService contentService;

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 商品一覧情報を取得
		List<ContentType> contentTypeList = this.contentService.getContentTypeList();
		// モデルの作成
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("contentTypeList", contentTypeList);

		// 戻り値となるModelAndViewインスタンスを作成
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addAllObjects(model);

		return modelAndView;
	}
}
