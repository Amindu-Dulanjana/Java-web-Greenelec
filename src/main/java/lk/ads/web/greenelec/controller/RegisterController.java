package lk.ads.web.greenelec.controller;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lk.ads.web.greenelec.dto.RegisterDTO;
import lk.ads.web.greenelec.entity.User;
import lk.ads.web.greenelec.mail.VerificationMail;
import lk.ads.web.greenelec.provider.MailServiceProvider;
import lk.ads.web.greenelec.service.UserService;
import lk.ads.web.greenelec.util.Encryption;
import lk.ads.web.greenelec.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Optional;
import java.util.UUID;

@Path("/register")
public class RegisterController {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response register(RegisterDTO registerDTO){
        //System.out.println(registerDTO.getFirstname());
        //System.out.println(registerDTO.getEmail());
        UserService userService = new UserService();
      Optional<User> byEmail = userService.getByEmail(registerDTO.getEmail());
//      System.out.println(byEmail);
        if (byEmail.isPresent()){
            System.out.println(byEmail);
            return Response.status(Response.Status.BAD_REQUEST).entity("Email already exists.").build();
        }else {
            User user = new User();
            //user.setName(registerDTO.getName());
            user.setEmail(registerDTO.getEmail());
            user.setPassword(Encryption.encrypt(registerDTO.getPassword()));

            String verificationCode = UUID.randomUUID().toString();

            user.setVerification_code(verificationCode);
            userService.save(user);
            VerificationMail mail = new VerificationMail(user.getEmail(),verificationCode);
            MailServiceProvider.getInstance().sendMail(mail);

            return Response.ok().entity("Register Success").build();
        }
    }
}
