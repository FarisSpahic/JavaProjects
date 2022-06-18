package assignmentfxml;

import java.util.ArrayList;

public class SalesList {

    ArrayList<SaleModel> saleModels = new ArrayList<>();

    public void printAllSales() {
        for (SaleModel saleModel : saleModels) {
            System.out.println("Ime: " + saleModel.getFirstName());
            System.out.println("Prezime: " + saleModel.getLastName());
            System.out.println("Adresa: " + saleModel.getAdress());
            System.out.println("Trajanje: " + saleModel.getTrajanjeUgovora());
            System.out.println("Protok: " + saleModel.getProtok());
            System.out.println("Brzina protoka: " + saleModel.getBrzinaProtoka());
            System.out.println("ID: #" + saleModel.getId());
            System.out.println("-------------------------------------------------");
        }
    }

    public void setNewSale(SaleModel sale) {
        if (saleModels.isEmpty()) {
            sale.setId(0);
        } else {
            SaleModel lastElement = saleModels.get(saleModels.size() - 1);
            int idEl = lastElement.getId();
            idEl++;
            sale.setId(idEl);
        }
        saleModels.add(sale);
    }

    public void removeSale(Integer idx) {
        if(idx == 0 && saleModels.size()==1){
            saleModels.clear();
        }else{
            for (SaleModel saleModel : saleModels) {
            if(saleModel.getId() == idx) {
                int pos = saleModels.indexOf(saleModel);
                saleModels.remove(pos);
            }
        }
        }
        
    }

}
