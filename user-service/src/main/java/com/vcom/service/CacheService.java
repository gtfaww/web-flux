package com.vcom.service;

import com.google.common.cache.LoadingCache;
import io.lettuce.core.support.caching.CacheFrontend;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class CacheService {
    private static final Logger logger = LoggerFactory.getLogger(CacheService.class);

    @Autowired(required = false)
    private CacheFrontend<String, String> frontend;

    @Autowired
    private LoadingCache<String, String> redisGuavaCache;

    @Autowired
    private RedisTemplate redisTemplate;


    public String get(String key) {
        return frontend.get(key);
    }

    public String getInGuava(String key) throws ExecutionException {
        return redisGuavaCache.get(key);
    }

}

