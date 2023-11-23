package id.ac.unand.fti.si.pbo;

public class MemberGold extends Member implements CanRequestDelivery, CanRequestCicilan{
    @Override
    public Integer hitungTotalBayar(Integer jumlahBelanja){
        Integer total = jumlahBelanja;
        if (total >= 500000 && total <= 1000000){
            total = total - total * 2/100;
        } else if (total > 1000000 && total <= 7000000){
            total = total - total * 4/100;
        } else if (total > 7000000){
            total = total - total * 6/100;
        }
        
        getBonusPoin(total);
        
        return total;
    }

    public Integer hitungOngkir(Double jarakTujuan){
        Integer hargaOngkir = 0;
        
        if (jarakTujuan >= 7.0) {
            jarakTujuan = jarakTujuan - 7.0;
            while (jarakTujuan > 0.0) {
                hargaOngkir = hargaOngkir + 1000;
                jarakTujuan = jarakTujuan - 1.0;
            }
        }
        
        return hargaOngkir;
    }

    public Integer hitungCicilanPerBulan(Integer totalBelanja, Integer jumlahBulan){
        Integer hitungCicilan = 0;
        hitungCicilan = totalBelanja / jumlahBulan;
        return hitungCicilan;
    }
}