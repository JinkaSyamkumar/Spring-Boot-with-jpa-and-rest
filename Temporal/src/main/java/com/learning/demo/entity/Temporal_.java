/**
 * 
 */
package com.learning.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author syamkumarj
 *
 */
@Entity
@Table(name = "temporal")
public class Temporal_ {
	@Id
	@Column(name = "id")
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "datetime_column")
	private Date datetime_column;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp_column")
	private Date timestamp_column;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_column")
	private Date date_column;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "time_column")
	private Date time_column;

	@Column(name = "sql_datetime_column")
	private java.sql.Timestamp sql_datetime_column;

	@Column(name = "sql_timestamp_column")
	private java.sql.Timestamp sql_timestamp_column;

	@Column(name = "sql_date_column")
	private java.sql.Date sql_date_column;

	@Column(name = "sql_time_column")
	private java.sql.Time sql_time_column;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDatetime_column() {
		return datetime_column;
	}

	public void setDatetime_column(Date datetime_column) {
		this.datetime_column = datetime_column;
	}

	public Date getTimestamp_column() {
		return timestamp_column;
	}

	public void setTimestamp_column(Date timestamp_column) {
		this.timestamp_column = timestamp_column;
	}

	public Date getDate_column() {
		return date_column;
	}

	public void setDate_column(Date date_column) {
		this.date_column = date_column;
	}

	public Date getTime_column() {
		return time_column;
	}

	public void setTime_column(Date time_column) {
		this.time_column = time_column;
	}

	public java.sql.Timestamp getSql_datetime_column() {
		return sql_datetime_column;
	}

	public void setSql_datetime_column(java.sql.Timestamp sql_datetime_column) {
		this.sql_datetime_column = sql_datetime_column;
	}

	public java.sql.Timestamp getSql_timestamp_column() {
		return sql_timestamp_column;
	}

	public void setSql_timestamp_column(java.sql.Timestamp sql_timestamp_column) {
		this.sql_timestamp_column = sql_timestamp_column;
	}

	public java.sql.Date getSql_date_column() {
		return sql_date_column;
	}

	public void setSql_date_column(java.sql.Date sql_date_column) {
		this.sql_date_column = sql_date_column;
	}

	public java.sql.Time getSql_time_column() {
		return sql_time_column;
	}

	public void setSql_time_column(java.sql.Time sql_time_column) {
		this.sql_time_column = sql_time_column;
	}

	@Override
	public String toString() {
		return "Temporal_ [id=" + id + ", datetime_column=" + datetime_column + ", timestamp_column=" + timestamp_column
				+ ", date_column=" + date_column + ", time_column=" + time_column + ", sql_datetime_column="
				+ sql_datetime_column + ", sql_timestamp_column=" + sql_timestamp_column + ", sql_date_column="
				+ sql_date_column + ", sql_time_column=" + sql_time_column + "]";
	}

}
