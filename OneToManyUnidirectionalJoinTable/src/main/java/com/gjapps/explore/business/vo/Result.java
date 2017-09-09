package com.gjapps.explore.business.vo;

import java.io.Serializable;

public class Result<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4631605072288543730L;

	final private boolean success;
	final private T data;
	final private String msg;
	final private long totalCount;

	/**
	 * @param success
	 * @param data
	 */
	public Result(boolean success, T data) {
		this.success = success;
		this.data = data;
		this.msg = null;
		this.totalCount = 0L;

	}

	/**
	 * @param success
	 * @param msg
	 */
	public Result(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
		this.data = null;
		this.totalCount = 0L;

	}

	/**
	 * @param success
	 * @param data
	 * @param msg
	 */
	public Result(boolean success, T data, String msg) {
		this.success = success;
		this.data = data;
		this.msg = msg;
		this.totalCount = 0L;

	}

	/**
	 * @param success
	 * @param data
	 * @param totalCount
	 * @param totalRecords
	 */
	public Result(boolean success, T data, long totalCount) {
		this.success = success;
		this.data = data;
		this.msg = null;
		this.totalCount = totalCount;

	}

	public boolean isSuccess() {
		return success;
	}

	public T getData() {
		return data;
	}

	public String getMsg() {
		return msg;
	}

	public long getTotalCount() {
		return totalCount;
	}

	@Override
	public String toString() {
		return "Result [success=" + success + ", data=" + data + ", msg=" + msg + ", totalCount=" + totalCount + "]";
	}

}
