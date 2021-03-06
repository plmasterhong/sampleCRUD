package com.eteam.web03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.eteam.web03.vo.Sample;

/*
 * @file SampleMapper.java
 * @brief SampleMapper.xml에서 메서드 구현
 * @author ksmart30 HSY
 */

@Mapper
public interface SampleMapper {
	/*
	 * @param String sampleName
	 * @brief smapleMapper.xml에서 구현 후 맵핑 
	 * 		   입력처리(result) 성공:1 실패:0
	 * @return int
	 */
	int insertSample(String sampleName);
	
	/*
	 * @brief smapleMapper.xml에서 구현 후 맵핑 
	 * @return List<Sample>
	 */
	List<Sample> selectSampleList();
	
	/*
	 * @param int sampleId
	 * @brief smapleMapper.xml에서 구현 후 맵핑 
	 * 		   입력처리(result) 성공:1 실패:0
	 * @return int
	 */
	int deleteSample(int sampleId);
	
	/*
	 * @param int sampleId
	 * @brief smapleMapper.xml에서 구현 후 맵핑 
	 * @return Sample(vo객체 주소전달)
	 */
	Sample selectSampleOne(int sampleId);
	
	/*
	 * @param int sampleId, String sampleName
	 * @brief smapleMapper.xml에서 구현 후  맵핑 
	 * @return int
	 */
	int updateSample(int sampleId, String sampleName);
}
