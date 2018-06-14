package pl.uj.jwzp.allegro;

import com.allegro.webapi.ServicePort_PortType;
import com.allegro.webapi.ServiceServiceLocator;
import org.springframework.stereotype.Component;
import pl.uj.jwzp.properties.AllegroProperties;

import javax.xml.rpc.ServiceException;

@Component
public class WebApiWrapper {
    final ServicePort_PortType servicePort_portType;

    WebApiWrapper(AllegroProperties allegroProperties) throws ServiceException {
        ServiceServiceLocator service = new ServiceServiceLocator(allegroProperties.getWsdlUrl());
        servicePort_portType = service.getservicePort();
    }

    public ServicePort_PortType makeRequest() {
        return servicePort_portType;
    }
}
