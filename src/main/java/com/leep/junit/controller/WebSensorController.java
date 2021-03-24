package com.leep.junit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/**/{packages}")
public class WebSensorController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
		
	@RequestMapping("{uri}.do")
	public String sensorUriTemplate(@PathVariable("packages") String packages, @PathVariable("uri") String uri) {
		logger.info("sensorUriTemplate 호출되었다.");
		//throw new TemplateInputException("템플릿이 존재하지 않거나 엑세스 할수 없습니다.");
		return packages + "/" + uri;
	}
	
//	@ExceptionHandler(TemplateInputException.class)
//	public String resolveInternalServerError() {
//		logger.info("템플릿이 존재하지 않거나 액세스 할 수 없습니다.");
//		return "/error/pageNotFounded";
//	}
		
}