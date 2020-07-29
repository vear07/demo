package com.ffcs.oss.web.init;

//public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
public class SpittrWebAppInitializer {

	protected Class<?>[] getRootConfigClasses() { // 根容器
		return new Class<?>[] { RootConfig.class };
	}

	protected Class<?>[] getServletConfigClasses() { // Spring mvc容器
		return new Class<?>[] { WebConfig.class };
	}

	protected String[] getServletMappings() { // DispatcherServlet映射,从"/"开始
		return new String[] { "/" };
	}

}
