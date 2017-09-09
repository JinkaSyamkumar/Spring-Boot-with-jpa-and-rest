/**
 * 
 */
package com.gjapps.explore.business.vo;

/**
 * @author Syam
 *
 */
public class ResultFactory {

	/**
	 * @param data
	 * @return
	 */
	public static <T> Result<T> getSuccessResult(T data) {

		return new Result<T>(true, data);
	}

	/**
	 * @param data
	 * @param msg
	 * @return
	 */
	public static <T> Result<T> getSuccessResult(T data, String msg) {

		return new Result(true, data, msg);
	}

	/**
	 * @param data
	 * @param totalCount
	 * @param totalRecords
	 * @return
	 */
	public static <T> Result<T> getSuccessResultWithCount(T data, long totalCount) {

		return new Result(true, data, totalCount);
	}

	/**
	 * @param msg
	 * @return
	 */
	public static <T> Result<T> getSuccessResultMsg(String msg) {

		return new Result(true, msg);
	}

	/**
	 * @param msg
	 * @return
	 */
	public static <T> Result<T> getFailResult(String msg) {

		return new Result(false, msg);
	}
}
