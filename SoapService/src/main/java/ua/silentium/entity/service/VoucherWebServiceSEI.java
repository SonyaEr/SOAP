package ua.silentium.entity.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ua.silentium.entity.vouchers.Voucher;

@WebService (targetNamespace="http://silentium.ua")
public interface VoucherWebServiceSEI {
    
    @WebMethod 
    Voucher getVoucher(@WebParam(name = "idVoucher") int idVoucher);
    
    @WebMethod 
    boolean addVoucher(@WebParam(name = "voucher") Voucher voucher);
    
    @WebMethod 
    boolean deleteVoucher(@WebParam(name = "idVoucher") int idVoucher);

    @WebMethod 
    Voucher[] findAllVouchers();
    @WebMethod 
    Voucher[] findAllVouchersbyPerson(@WebParam(name = "idPerson") int idPerson);
   
    @WebMethod 
    boolean updateVoucher(@WebParam(name = "voucher") Voucher voucher);
    
    @WebMethod
    String[] findAllStatusVoucher();
}
