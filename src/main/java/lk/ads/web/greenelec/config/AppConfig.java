package lk.ads.web.greenelec.config;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class AppConfig extends ResourceConfig {
    public AppConfig(){
        //packages
        packages("lk.ads.web.greenelec.controller");
        packages("lk.ads.web.greenelec.middleware");
        //mvc
        register(JspMvcFeature.class);
        register(MultiPartFeature.class);
        register(DependencyBinder.class);
        property(JspMvcFeature.TEMPLATE_BASE_PATH,"/WEB-INF/views");
    }
}
