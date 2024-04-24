package xsd.wsdl.exclude;

import dao.LoansService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import services.loans.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@EnableWs
@Endpoint
@ComponentScan("dao")
public class SoapPhase {
    private final String url="http://loans.services";
    @Autowired
    private LoansService loansService;

    @PayloadRoot(namespace = url,localPart = "viewAllLoansRequest")
    @ResponsePayload
    public ViewAllLoansResponse listLoans(@RequestPayload ViewAllLoansRequest viewAllLoansRequest){
        ViewAllLoansResponse viewAllLoansResponse=new ViewAllLoansResponse();
        ServiceStatus serviceStatus=new ServiceStatus();
        // loans>> dao
        List<dao.Loans> fromDao=loansService.viewEvery();
//        System.out.println(fromDao.toString());

        // soap Loan
        List<services.loans.Loans> actualLoans=new ArrayList<>();

        Iterator<dao.Loans> iterator= fromDao.iterator();

        while(iterator.hasNext()){
            services.loans.Loans currentLoans=new services.loans.Loans();
            BeanUtils.copyProperties(iterator.next(),currentLoans);
            actualLoans.add(currentLoans);
        }

        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Loan's were fetched");

        viewAllLoansResponse.setServiceStatus(serviceStatus);
        viewAllLoansResponse.getLoans().addAll(actualLoans);

        //System.out.println(viewAllLoansResponse.getLoans().toString());

        return viewAllLoansResponse;
    }
}