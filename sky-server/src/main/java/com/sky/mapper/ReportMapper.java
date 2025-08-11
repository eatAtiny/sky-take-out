package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface ReportMapper {
    /**
     * 营业额统计
     * @param map
     * @return
     */
    Double getTurnoverByDate(Map map);
}
