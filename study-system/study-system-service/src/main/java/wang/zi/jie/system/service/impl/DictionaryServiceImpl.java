package wang.zi.jie.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import wang.zi.jie.model.entity.Dictionary;
import wang.zi.jie.system.mapper.DictionaryMapper;
import wang.zi.jie.system.service.DictionaryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据字典(dictionary)表服务实现类
 *
 * @author makejava
 * @since 2024-03-31 22:15:06
 */
@Service
public class DictionaryServiceImpl extends ServiceImpl<DictionaryMapper, Dictionary> implements DictionaryService {

    @Override
    public List<Dictionary> queryAll() {
        List<Dictionary> list = this.list();
        return list;
    }

    @Override
    public Dictionary getByCode(String code) {
        LambdaQueryWrapper<Dictionary> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Dictionary::getCode, code);
        Dictionary dictionary = this.getOne(queryWrapper);
        return dictionary;
    }
}
