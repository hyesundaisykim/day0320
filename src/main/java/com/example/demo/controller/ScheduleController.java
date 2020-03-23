package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DBManager;
import com.example.demo.vo.ScheduleVo;
import com.google.gson.Gson;

@RestController
public class ScheduleController {
	
	
	@RequestMapping(value="/listSchedule", produces="application/json;charset=utf-8")
	public String scheduleList() {
		return (new Gson()).toJson(DBManager.listSchedule());
	}
	@RequestMapping("/insertSchedule")
	public String scheduleInsert(ScheduleVo s) {
		String str = "ok";
		DBManager.insertSchedule(s);
		return str;
	} 
	

}
