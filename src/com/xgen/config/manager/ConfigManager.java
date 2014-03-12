package com.xgen.config.manager;

import java.util.HashMap;
import java.util.Map;

import com.xgen.config.vo.GenConfigModel;
import com.xgen.config.vo.ModuleConfModel;

public class ConfigManager {
	
	private static ConfigManager manager = null;
	
	private ConfigManager() {
		readConfig();
	}
	
	public static ConfigManager getInstance() {
		if(manager == null) {
			manager = new ConfigManager();
		}
		return manager;
	}
	
	//ʵ�����ݻ���
	private GenConfigModel genConf = new GenConfigModel();
	private Map<String, ModuleConfModel> moduleConfMap = new HashMap<>();

	public GenConfigModel getGenConfig() {
		return this.genConf;
	}
	
	public Map<String, ModuleConfModel> getMapModuleConfig() {
		return this.moduleConfMap;
	}
	
	/**
	 * ȥ������ʵ�����ݵĶ�ȡ
	 */
	private void readConfig() {
		//��ȡ���������ļ�
		readGenConfig();
	}

	private void readGenConfig() {
		
	}
	
}
