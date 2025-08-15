package com.lets.platform.common.pojo.typehandle;

import com.google.common.base.Joiner;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: LY
 * @Date: 2020/5/8 15:28
 */
@MappedTypes(value = { String[].class })
@MappedJdbcTypes(value = JdbcType.VARCHAR)
public class StringListTypeHandler extends BaseTypeHandler<String[]> {
    String split = ",";

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String[] strings, JdbcType jdbcType) throws SQLException {
        if (strings==null)
            preparedStatement.setString(i, "");
        else
            preparedStatement.setString(i, Joiner.on(split).join(strings));
    }

    @Override
    public String[] getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String reString = rs.getString(columnName);
        if (reString != null && reString.length() > 0) {
            return reString.split(split);

        }
        return null;
    }

    @Override
    public String[] getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String reString = rs.getString(columnIndex);
        if (reString != null && reString.length() > 0) {
            return reString.split(split);

        }
        return null;
    }

    @Override
    public String[] getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        String reString = callableStatement.getString(columnIndex);
        if (reString != null && reString.length() > 0) {
            return reString.split(split);

        }
        return null;
    }
}
