package wang.zi.jie.studybase.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName:PageResult
 * Package:
 * Description:
 *
 * @Aurhor 王子杰
 * @Create 2024/8/17 22:02
 * @Version 1.0
 */
@Data
public class PageResult<T> implements Serializable {

    // 数据列表
    private List<T> items;
    //总记录数
    private long counts;
    //当前页码
    private long page;
    //每页记录数
    private long pageSize;

    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }
}