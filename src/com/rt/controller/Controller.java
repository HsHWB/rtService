package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.rt.service.Service;
import com.rt.utils.JsonUtils;


@org.springframework.stereotype.Controller
@RequestMapping("/test") 
public class Controller {
	@Autowired
	private Service service;
	
	
	@RequestMapping(value="/getData",method ={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public JSONObject useGetData()
    {     
	   List list = service.getAll("Table");
	   for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	   JSONArray jsonArray = new JSONArray();
	   JSONObject jsonObject = null;
	   jsonObject = new JsonUtils(list).getJsonObject();
       return jsonObject;
    }
}
