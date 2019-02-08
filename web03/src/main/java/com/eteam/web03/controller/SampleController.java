package com.eteam.web03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eteam.web03.service.SampleService;
import com.eteam.web03.vo.Sample;

/*
 * @file SampleController.java
 * @brief Sample controller
 * @author ksmart30 HSY
 */

@Controller
public class SampleController {
	@Autowired private SampleService sampleService;
	
	/*
	 * @brief "http://localhost/addSample" 주소분기(get방식)
	 * 		   template폴더에 있는 addSample.html forward
	 * @return String(view이름)
	 */
	// 1. 입력폼
	@GetMapping("/addSample")
	public String addSample() {
		return "addSample";	// view 이름은 template폴더에 addSample.html
	}
	/*
	 * @param @RequestParam(value="sampleName") String sampleName
	 * 		  String sampleName = request.getParameter("sampleName"); 동일
	 * @brief "http://localhost/addSample" 주소분기(post방식)
	 * 		   template폴더에 있는 sampleList.html redirect 
	 * 		   입력처리 성공:1 실패:0
	 * @return String(view이름)
	 */
	// 2. 입력 액션
	@PostMapping("/addSample")
	public String addSample(@RequestParam(value="sampleName") String sampleName) {
		int result = sampleService.addSample(sampleName);
		System.out.println("입력처리결과: " + result + " (성공:1, 실패:0)");
		return "redirect:/sampleList";
	}
	// 3. 목록
	@GetMapping("/sampleList")
	public String sampleList(Model model) {
		return "sampleList";
	}
	// 4. 삭제
	
	// 5. 수정 폼
	
	// 6. 수정 액션
}