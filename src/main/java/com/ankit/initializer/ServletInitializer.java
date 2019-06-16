package com.ankit.initializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import com.ankit.config.RootAppConfig;       
import com.ankit.config.WebMVCAppConfig;
import com.ankit.test.MvcBootProj33AbstractControllerLayeredApplication;
//@Import({WebMVCAppConfig.class,RootAppConfig.class})
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MvcBootProj33AbstractControllerLayeredApplication.class,WebMVCAppConfig.class,RootAppConfig.class);
	}
}
