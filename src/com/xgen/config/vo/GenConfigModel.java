package com.xgen.config.vo;

import java.util.List;
import java.util.Map;

/**
 * x-gen���Ŀ�����ö�Ӧ������model
 * 
 * @author wenyou <br/>
 *         2014��3��12��
 * 
 */
public class GenConfigModel {

	/**
	 * ����ע��Ķ���û���Ҫ���ɵ�ģ���model
	 */
	private List<NeedGenModel> needGens;

	/**
	 * ����ע��Ķ���ⲿ�����model
	 */
	private List<ThemeModel> themes;

	/**
	 * ����ͨ�õĳ�������ļ���
	 */
	private Map<String, String> mapConstants;

	public List<NeedGenModel> getNeedGens() {
		return needGens;
	}

	public void setNeedGens(List<NeedGenModel> needGens) {
		this.needGens = needGens;
	}

	public List<ThemeModel> getThemes() {
		return themes;
	}

	public void setThemes(List<ThemeModel> themes) {
		this.themes = themes;
	}

	public Map<String, String> getMapConstants() {
		return mapConstants;
	}

	public void setMapConstants(Map<String, String> mapConstants) {
		this.mapConstants = mapConstants;
	}

	public ThemeModel getThemeById(String themeId) {
		for (ThemeModel tm : this.themes) {
			if (tm.getId().equals(themeId)) {
				return tm;
			}
		}
		return new ThemeModel();
	}

}
