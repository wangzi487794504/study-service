package wang.zi.jie.studycontentapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import wang.zi.jie.studybase.bean.PageParams;
import wang.zi.jie.studybase.dto.PageResult;
import wang.zi.jie.studycontentmodel.domain.CourseBase;
import wang.zi.jie.studycontentmodel.dto.QueryCourseParamsDto;

/**
 * ClassName:CourseBaseInfoController
 * Package:
 * Description:
 *
 * @Aurhor 王子杰
 * @Create 2024/8/17 22:14
 * @Version 1.0
 */
@Api(value = "课程信息管理接口",tags = "课程信息管理接口")
@RestController
public class CourseBaseInfoController {

    @GetMapping("/course/index")
    public String index(){
        return "测试专用";
    }
    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParams){
        //代码准备阶段，先不写逻辑，后面会完善
        return null;
    }

}