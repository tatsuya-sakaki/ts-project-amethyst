package com.ts.amethyst.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ts.amethyst.logic.Item;

public class IndexController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 商品一覧情報を取得
		List<Item> itemList = new LinkedList<Item>();
		itemList.add(new Item(100, "apple", 100));
		itemList.add(new Item(50, "orange", 50));
		itemList.add(new Item(1000, "melon", 1000));
		// モデルの作成
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("itemList", itemList);

		// 戻り値となるModelAndViewインスタンスを作成
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/views/index.jsp");
		modelAndView.addAllObjects(model);

		return modelAndView;
	}
}
