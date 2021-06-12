package com.foxwho.demo.service;

import com.baidu.fsg.uid.UidGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
@Slf4j
public class UidGenService {
  /*  @Resource(name = "cachedUidGenerator")
    private UidGenerator uidGenerator;*/

    @Resource(name = "defaultUidGenerator")
    private UidGenerator defaultUidGenerator;
    public long getUid() {
        long uid = defaultUidGenerator.getUID();
        log.info(defaultUidGenerator.parseUID(uid));
        return uid;
    }
}
