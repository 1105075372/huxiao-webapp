/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.cuizuoli.huxiao.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import cn.cuizuoli.huxiao.enumeration.Gender;

/**
 * GenderTypeHandler
 * @author cuizuoli
 */
public class GenderTypeHandler extends BaseTypeHandler<Gender> {

	@Override
	public Gender getNullableResult(ResultSet rs, String columnName) throws SQLException {
		Gender gender = null;
		String s = rs.getString(columnName);
		if (StringUtils.isNotEmpty(s)) {
			gender = Gender.getObject(s);
		}
		return gender;

	}

	@Override
	public Gender getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		Gender gender = null;
		String s = rs.getString(columnIndex);
		if (StringUtils.isNotEmpty(s)) {
			gender = Gender.getObject(s);
		}
		return gender;

	}

	@Override
	public Gender getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		Gender gender = null;
		String s = cs.getString(columnIndex);
		if (StringUtils.isNotEmpty(s)) {
			gender = Gender.getObject(s);
		}
		return gender;

	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Gender parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, parameter.getCode());
	}

}
