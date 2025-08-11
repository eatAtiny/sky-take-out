package com.sky.service;

import com.sky.vo.*;

import java.time.LocalDate;

public interface ReportService {
    /**
     * 营业额统计
     * @param begin 开始时间
     * @param end 结束时间
     * @return 营业额统计VO
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);

    /**
     * 订单统计
     * @param begin 开始时间
     * @param end 结束时间
     * @return 订单统计VO
     */
    OrderReportVO getOrderStatistics(LocalDate begin, LocalDate end);

    /**
     * 用户统计
     * @param begin 开始时间
     * @param end 结束时间
     * @return 用户统计VO
     */
    UserReportVO getUserStatistics(LocalDate begin, LocalDate end);

    /**
     * 销量排名
     * @param begin 开始时间
     * @param end 结束时间
     * @return 销量排名VO
     */
    SalesTop10ReportVO getSalesTop10(LocalDate begin, LocalDate end);
}
