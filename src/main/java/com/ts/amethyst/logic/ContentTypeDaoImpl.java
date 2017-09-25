package com.ts.amethyst.logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class ContentTypeDaoImpl implements ContentTypeDao {

    NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    public void setDataSource() {
    	if (this.jdbcTemplate == null) {
    		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    	}
    }

    public List<ContentType> findAll() {
    	setDataSource();
    	String sql = "SELECT * FROM MST_CONTENT_TYPE WHERE DELETEFLG = 0 ORDER BY ID";
    	SqlParameterSource param = new MapSqlParameterSource();
    	// Listは行、Mapのキーが列、値がデータに当たる。
    	List<Map<String, Object>> maplist = jdbcTemplate.queryForList(sql, param);
    	List<ContentType> result = new LinkedList<ContentType>();
    	for (Map<String, Object> map : maplist) {
    		result.add(new ContentType((Integer)map.get("id"), (String)map.get("name"), (String)map.get("description"), (String)map.get("pictureUrl")));
    	}
    	return result;
    }

    public ContentType findById(Integer contentTypeId) {
    	setDataSource();
    	String sql = "SELECT * FROM MST_CONTENT_TYPE WHERE ID = :id AND DELETEFLG = 0 ORDER BY ID";
    	SqlParameterSource param = new MapSqlParameterSource().addValue("id", contentTypeId);
    	ContentType result = jdbcTemplate.queryForObject(sql, param, new RowMapper<ContentType>() {

    		public ContentType mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new ContentType(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getString("pictureUrl"));
            }
    	});
    	return result;

    }
}
