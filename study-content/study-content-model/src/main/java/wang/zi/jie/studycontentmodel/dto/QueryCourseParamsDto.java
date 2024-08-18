package wang.zi.jie.studycontentmodel.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ClassName:aa
 * Package:
 * Description:
 *
 * @Aurhor 王子杰
 * @Create 2024/8/17 21:53
 * @Version 1.0
 */
@Data
public class QueryCourseParamsDto {
    @ApiModelProperty("审核状态")
    private String auditStatus;

    @ApiModelProperty("课程名称")
    private String courseName;

    @ApiModelProperty("发布状态")
    private String publishStatus;
}