package ua.silentium.entity.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ua.silentium.entity.OrderDAO;
import ua.silentium.entity.VoucherDAO;
import ua.silentium.entity.vouchers.Order;
import ua.silentium.entity.vouchers.Voucher;

@WebService(targetNamespace="http://silentium.ua", endpointInterface = "ua.silentium.entity.service.VoucherWebServiceSEI", portName = "VoucherServicePort", serviceName = "VoucherService")

public class VoucherService implements VoucherWebServiceSEI{

    private static List <Voucher> vouchers;

    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public String[] findAllStatusVoucher() {
	return new VoucherDAO().findAllStatusVoucher();
    }
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public Voucher[] findAllVouchers() {
	return new VoucherDAO().findAllVouchers();
    }
    
    @Override
    @WebMethod
    @WebResult(name = "ResponseMessage")
    public Voucher[] findAllVouchersbyPerson(@WebParam(name = "idPerson") int idPerson) {
	return new VoucherDAO().findAllVouchersbyPerson(idPerson);
    }
   public Voucher getVoucher(int id) {
	for(Voucher t : vouchers){
	    if (t.getId() == id){
		return t;
	    } 
	}
	return new Voucher();
    }

   /* 
    
    public Voucher[] findAllOrders(){
	Voucher[] o = new Voucher[vouchers.size()];
	vouchers.toArray(o);
   	return o;
   	}    
    */
    public boolean addVoucher(Voucher voucher) {
        if (vouchers == null) {
            vouchers = new ArrayList<Voucher>();
        }
        vouchers.add(voucher);
	return true;
    }

    public boolean updateVoucher(Voucher voucher) {
   	int id = voucher.getId();
   	for(Voucher t : vouchers){
   	    if (t.getId() == id){
                   t.updateVoucher(voucher);
               	return true;
   	    } 
   	}
           return false;
       }
    public boolean deleteVoucher(int id) {
        Iterator itr = vouchers.iterator();
        while (itr.hasNext()) {
            Voucher t = (Voucher)itr.next();
            if (t.getId() == id) {
                itr.remove();
            	return true;
            	}
        }
        return false;
    }
}
