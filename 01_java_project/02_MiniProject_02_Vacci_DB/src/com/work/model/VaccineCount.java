package com.work.model;

/**
 * <pre>
 * 백신 접종자 수 정보 도메인 클래스 
 * </pre>
 * 
 * ## 접종 정보 
 * 	1. 구분번호
 * 	2. 날짜
 * 	3. 지역
 * 	4. 전날 1차 접종
 * 	5. 전날 2차 접종
 * 	6. 누적 1차 접종
 * 	7. 누적 2차 접종 
 *
 * @author 김기영
 * @version ver 2.0
 * @since jdk1.8
 */
public class VaccineCount {

	private int vacciCountNo;

	private String day;

	private String region;

	private int yesterdayFirst;

	private int yesterdaySecond;

	private int totalFirst;

	private int totalSecond;

	/** 초기 생성자 */
	public VaccineCount() {
	}

	/**
	 * 필수 생성자 
	 * @param day 기준 일자 
	 * @param region 지역
	 * @param yesterdayFirst 전날 1차 접종 수
	 * @param yesterdaySecond 전날 2차 접종 수
	 * @param totalFirst 누적 접종 수
	 * @param totalSecond 누적 접종 수
	 */
	public VaccineCount( String day, String region, int yesterdayFirst, int yesterdaySecond, 
			int totalFirst, int totalSecond) {
		this.day = day;
		this.region = region;
		this.yesterdayFirst = yesterdayFirst;
		this.yesterdaySecond = yesterdaySecond;
		this.totalFirst = totalFirst;
		this.totalSecond = totalSecond;
	}

	
	
	
	
	/**
	 * 전체 생성자
	 * @param vacciCountNo 구분번호
	 * @param day 날짜 
	 * @param region 지역
	 * @param yesterdayFirst 1차 접종자 수
	 * @param yesterdaySecond 2차 접종자 수
	 * @param totalFirst 누적 1차 접종자 수
	 * @param totalSecond 누적 2차 접종자 수
	 */

	public VaccineCount(int vacciCountNo, String day, String region, int yesterdayFirst, int yesterdaySecond,
			int totalFirst, int totalSecond) {
		this(day,region, yesterdayFirst, yesterdaySecond, totalFirst, totalSecond);
		this.vacciCountNo = vacciCountNo;
		
	}

	/**
	 * @return the vacciCountNo
	 */
	public int getVacciCountNo() {
		return vacciCountNo;
	}

	/**
	 * @param vacciCountNo the vacciCountNo to set
	 */
	public void setVacciCountNo(int vacciCountNo) {
		this.vacciCountNo = vacciCountNo;
	}

	/**
	 * @return the day
	 */
	public String getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(String day) {
		this.day = day;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the yesterdayFirst
	 */
	public int getYesterdayFirst() {
		return yesterdayFirst;
	}

	/**
	 * @param yesterdayFirst the yesterdayFirst to set
	 */
	public void setYesterdayFirst(int yesterdayFirst) {
		this.yesterdayFirst = yesterdayFirst;
	}

	/**
	 * @return the yesterdaySecond
	 */
	public int getYesterdaySecond() {
		return yesterdaySecond;
	}

	/**
	 * @param yesterdaySecond the yesterdaySecond to set
	 */
	public void setYesterdaySecond(int yesterdaySecond) {
		this.yesterdaySecond = yesterdaySecond;
	}

	/**
	 * @return the totalFirst
	 */
	public int getTotalFirst() {
		return totalFirst;
	}

	/**
	 * @param totalFirst the totalFirst to set
	 */
	public void setTotalFirst(int totalFirst) {
		this.totalFirst = totalFirst;
	}

	/**
	 * @return the totalSecond
	 */
	public int getTotalSecond() {
		return totalSecond;
	}

	/**
	 * @param totalSecond the totalSecond to set
	 */
	public void setTotalSecond(int totalSecond) {
		this.totalSecond = totalSecond;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VaccineCount other = (VaccineCount) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(vacciCountNo);
		builder.append(", ");
		builder.append(day);
		builder.append(", ");
		builder.append(region);
		builder.append(", ");
		builder.append(yesterdayFirst);
		builder.append(", ");
		builder.append(yesterdaySecond);
		builder.append(", ");
		builder.append(totalFirst);
		builder.append(", ");
		builder.append(totalSecond);
		return builder.toString();
	}
}

