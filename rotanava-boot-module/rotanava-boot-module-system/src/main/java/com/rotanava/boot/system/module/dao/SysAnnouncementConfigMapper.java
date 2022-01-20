package com.rotanava.boot.system.module.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rotanava.boot.system.api.module.system.bo.SysAnnouncementConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: jintengzhou
 * @date: 2021-04-01 16:59
 */
public interface SysAnnouncementConfigMapper extends BaseMapper<SysAnnouncementConfig> {

    List<SysAnnouncementConfig> findAll();

    Integer countByConfigName(@Param("configName") String configName);

    Integer findIdByConfigName(@Param("configName") String configName);

}