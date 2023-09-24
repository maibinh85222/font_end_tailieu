
package com.example.backend_bookingcar.DTO;

public class ThuMucDTO {
    private int uidthumuc;
    private String duongdan;
    private String tenthumuc;
    public ThuMucDTO(int uidThucMuc, String duongdan, String tenthumuc){
        this.uidthumuc = uidThucMuc;
        this.duongdan = duongdan;
        this.tenthumuc = tenthumuc;
    }
    public ThuMucDTO(String duongdan, String tenthumuc){
        this.duongdan = duongdan;
        this.tenthumuc = tenthumuc;
    }
    public ThuMucDTO(){

    }

    public int getUidthumuc() {
        return uidthumuc;
    }

    public String getDuongdan() {
        return duongdan;
    }

    public String getTenthumuc() {
        return tenthumuc;
    }

    public void setUidthumuc(int uidthumuc) {
        this.uidthumuc = uidthumuc;
    }

    public void setDuongdan(String duongdan) {
        this.duongdan = duongdan;
    }

    public void setTenthumuc(String tenthumuc) {
        this.tenthumuc = tenthumuc;
    }
}
