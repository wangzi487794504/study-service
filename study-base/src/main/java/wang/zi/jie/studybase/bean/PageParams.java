package wang.zi.jie.studybase.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:PageParams
 * Package:
 * Description:
 *
 * @Aurhor 王子杰
 * @Create 2024/8/17 21:51
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {
    @ApiModelProperty("当前页码")
    private Long pageNo = 1L;
    @ApiModelProperty("每页显示多少条数据")
    private Long pageSize =10L;
}
