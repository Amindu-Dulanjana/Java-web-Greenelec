package lk.ads.web.greenelec.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;
@Path("/login")
public class LoginController {
    @GET
    public Viewable index(){
        return new Viewable("/frontend/auth/login");
    }
}
