package wang.zi.jie.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import wang.zi.jie.model.entity.Dictionary;

/**
 * 数据字典(dictionary)表数据库访问层
 *
 * @author makejava
 * @since 2024-03-31 22:13:34
 */
@Mapper
public interface DictionaryMapper extends BaseMapper<Dictionary> {

}
