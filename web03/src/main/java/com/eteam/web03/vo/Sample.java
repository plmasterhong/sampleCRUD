package com.eteam.web03.vo;

/*
 * @file Sample.java
 * @brief Sample vo
 * @author ksmart30 HSY
 */

public class Sample {
	private int sampleId;			// tb-name:sample, field:sample_id
	private String sampleName;		// tb-name:sample, field:sample_name
	public int getSampleId() {
		return sampleId;
	}
	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}
	public String getSampleName() {
		return sampleName;
	}
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleName=" + sampleName + "]";
	}
}
