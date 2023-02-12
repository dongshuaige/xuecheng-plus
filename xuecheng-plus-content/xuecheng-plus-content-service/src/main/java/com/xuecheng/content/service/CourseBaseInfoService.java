package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @description: 课程基本信息管理业务接口
 * @author：hgd
 * @date: 2023-02-10
 */
public interface CourseBaseInfoService {
    /**
     * 课程基本信息分页查询
     * @param pageParams 分页参数
     * @param queryCourseParamsDto 课程查询参数
     * @return PageResult<CourseBase>
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
