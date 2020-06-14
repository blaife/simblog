package com.blaife.service.impl;

import com.blaife.entity.Blog;
import com.blaife.mapper.BlogMapper;
import com.blaife.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author blaife
 * @since 2020-06-14
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
