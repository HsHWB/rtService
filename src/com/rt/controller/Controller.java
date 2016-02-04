package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.rt.entity.Table;
import com.rt.service.Service;
import com.rt.utils.JsonUtils;


@org.springframework.stereotype.Controller
@RequestMapping("/test") 
public class Controller {
	@Autowired
	private Service service;
	
	/**
	 * ”√table  Id’“table
	 * @param tableNum
	 * @return
	 */
	@RequestMapping(value="/getTableByNum",method ={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
	public JSONObject getTableByNum(int tableNum){
	
		List<Object> list = service.getItemByTableNum("Table", tableNum);
	    JSONArray jsonArray = new JSONArray();
	    JSONObject jsonObject = null;
	    jsonObject = new JsonUtils(list).getJsonObject();
        return jsonObject;
	}
	
	@RequestMapping(value="/getTableByState",method ={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
	public JSONObject getTableByState(int tableState){
		List<Object> list = service.getItemByTableState("Table", tableState);
	    JSONArray jsonArray = new JSONArray();
	    JSONObject jsonObject = null;
	    jsonObject = new JsonUtils(list).getJsonObject();
        return jsonObject;
	}
	
	@RequestMapping(value="/setTableState",method ={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public void setTableState(String value){
//		for (int i = 0; i < list.size(); i++) {
			System.out.println("value == "+value);
			JSONArray jsonArray = JSONArray.parseArray(value);
			System.out.println("size == "+jsonArray.size());
//		}
	}
	
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
