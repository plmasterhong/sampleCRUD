package com.eteam.web03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eteam.web03.mapper.SampleMapper;
import com.eteam.web03.vo.Sample;

/*
 * @file SampleService.java
 * @brief Sample Service
 * @author ksmart30 HSY
 */


@Service
public class SampleService {
	@Autowired private SampleMapper sampleMapper;
	public List<Sample> getSampleList(){
		List<Sample> sampleList = sampleMapper.selectSampleList();
		return sampleList;
	}
	
	public Sample getSampleOne(){
		return null;
	}
	/*
	 * @param String sampleName
	 * @brief smapleMapper.xml를 인터페이스 SampleMapper.java와 맵핑 후 insertSample()메서드 호출 
	 * 		   입력처리(result) 성공:1 실패:0
	 * @return int(result)
	 */
	public int addSample(String sampleName) {
		int result = sampleMapper.insertSample(sampleName); 
		return result;
	}
	
	public int removeSample(Sample sample) {
		return 0;	
	}
	
	public int modifySample(Sample sample) {
		return 0;
	}
}
