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
	/*
	 * @param String sampleName
	 * @brief smapleMapper.xml를 인터페이스 SampleMapper.java와 맵핑 후 selectSampleList()메서드 호출 
	 * @return sampleList(List 객체 주소)
	 */
	public List<Sample> getSampleList(){
		List<Sample> sampleList = sampleMapper.selectSampleList();
		return sampleList;
	}
	/*
	 * @param int sampleId
	 * @brief smapleMapper.xml를 인터페이스 SampleMapper.java와 맵핑 후 selectSampleOne()메서드 호출 
	 * @return sample(vo 객체 주소)
	 */
	public Sample getSampleOne(int sampleId){
		Sample sample = sampleMapper.selectSampleOne(sampleId);
		return sample;
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
	/*
	 * @param int sampleId
	 * @brief smapleMapper.xml를 인터페이스 SampleMapper.java와 맵핑 후 deleteSample()메서드 호출 
	 * 		   삭제처리(result) 성공:1 실패:0
	 * @return int(result)
	 */
	public int removeSample(int sampleId) {
		int result = sampleMapper.deleteSample(sampleId);
		return result;	
	}
	/*
	 * @param int sampleId
	 * @brief smapleMapper.xml를 인터페이스 SampleMapper.java와 맵핑 후 deleteSample()메서드 호출 
	 * 		   수정처리(result) 성공:1 실패:0
	 * @return int(result)
	 */
	public int modifySample(int sampleId, String sampleName) {
		int result = sampleMapper.updateSample(sampleId, sampleName);
		return result;
	}
}
