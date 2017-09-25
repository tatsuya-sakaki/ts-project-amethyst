package com.ts.amethyst.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ts.amethyst.logic.ContentService;
import com.ts.amethyst.logic.ContentType;
/**
 * IndexController
 *
 * @author sakaki
 *
 */
@Controller
public class IndexControllerZ {

    @Autowired
	private ContentService contentService;

	@RequestMapping(value="/index.html", method=RequestMethod.GET)
	public ModelAndView indexRequest() throws Exception {
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

	@RequestMapping(value="/type/{id}", method=RequestMethod.GET)
	public ModelAndView typeRequest(@PathVariable String id) throws Exception {
		// 商品一覧情報を取得
		ContentType contentType = this.contentService.getContentType(Integer.valueOf(id));
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
