package com.granpree.config;

import com.granpree.SpringConfig;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Created by psmkab on 2018. 1. 2..
 */
public class GranInitialize extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {SpringConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {GranpreeConfig.class};
	}

	//요청을 위한 문자 인코딩을 명세하는 메소드
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);

		return new Filter[] {characterEncodingFilter};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
}
