package org.bagab.jaxws.example.deploy.se.ts;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
/**
 * Example after ch 1 of JWSUR
 * @author prekezes.
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface TimeServer {

        @WebMethod String getTimeAsString();
        @WebMethod long getTimeAsElapsed();

}
