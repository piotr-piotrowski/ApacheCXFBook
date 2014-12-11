package demo.order;

import org.apache.cxf.service.model.ServiceInfo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OrderProcess {

    @WebMethod
    String processOrder(Order order);

}

