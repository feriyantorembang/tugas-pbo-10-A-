package id.ac.unand.fti.si.pbo;

public abstract class Member implements CanGetDiskon {
    protected Integer poin = 0;
    
    public Integer getPoin(){
        return poin;
    }

    public void redeemPoin(Integer hargaSouvenir){
        this.poin = this.poin - hargaSouvenir;
    }

    protected Integer getBonusPoin(Integer totalBayar){
        Integer tambahPoin = (int) (totalBayar / 10000);
        this.poin = this.poin + tambahPoin;
	return this.poin;
    }

    public Integer hitungTotalBayar(Integer jumlahBelanja){
        Integer total = jumlahBelanja;
        
        if (total >= 500000 && total <= 1000000){
            total = total - total * 1/100;
        } else if (total > 1000000 && total <= 7000000){
            total = total - total * 2/100;
        } else if (total > 7000000){
            total = total - total * 3/100;
        }
        
        getBonusPoin(total);
        
        return total;
    }
}
