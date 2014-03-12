package com.xgen.config;

import java.util.Map;

import com.xgen.config.vo.GenConfigModel;
import com.xgen.config.vo.ModuleConfModel;

public interface GenConfigEbi {

	/**
	 * ��ȡx-gen���Ŀ����������Ҫ����������Model
	 * 
	 * @return ���Ŀ����������Ҫ����������model
	 */
	public GenConfigModel getConfig();

	/**
	 * ��ȡ��Ҫ���ɵ�����ģ�������
	 * 
	 * @return ����������Ҫ���ɵ�����ģ����������ݵ�Map��key-ģ���id��value-��Ӧ��ģ����������ݵ�model
	 */
	public Map<String, ModuleConfModel> getMapModuleConf();
	
}
