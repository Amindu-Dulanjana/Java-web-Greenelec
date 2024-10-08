package lk.ads.web.greenelec.middleware;

import io.fusionauth.jwt.JWTExpiredException;
import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;
import lk.ads.web.greenelec.annotation.ApiSecure;
import lk.ads.web.greenelec.entity.User;
import lk.ads.web.greenelec.service.UserService;
import lk.ads.web.greenelec.util.JwtTokenUtil;

import java.io.IOException;
import java.util.Optional;

@Provider
@ApiSecure
@Priority(1)
public class JwtValidationFilter implements ContainerRequestFilter {

    @Inject
    private JwtTokenUtil tokenUtil;

    @Context
    private HttpServletRequest request;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println("JwtValidationFilter...");
        UserService userService = new UserService();
        if (requestContext.getHeaders().getFirst("Authorization") == null){
            requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
        }else {
            String token = requestContext.getHeaders().getFirst("Authorization").split(" ")[1];
            try{
                Optional<User> byEmail = userService.getByEmail(tokenUtil.getUsernameFromToken(token));
                if (byEmail.isPresent()){
                    if (!tokenUtil.validateToken(token, byEmail.get())){
                        requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
                    }else {
                        HttpSession session = request.getSession(false);
                        session.setAttribute("user",byEmail.get().getId());
                    }
                }
            }catch (JWTExpiredException | NullPointerException ex){
                requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).entity("Token Expired....").build());
            } catch (Exception ex){
                //ex.printStackTrace();
                requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
            }
        }

    }
}
