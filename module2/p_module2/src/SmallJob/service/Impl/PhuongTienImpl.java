package SmallJob.service.Impl;

import SmallJob.service.IPhuongTien;

public class PhuongTienImpl implements IPhuongTien {
    OtoImpl oto = new OtoImpl();
    XeMayImpl xeMay = new XeMayImpl();
    @Override
    public void add() {

    }

    @Override
    public void display() {
        oto.display();
        xeMay.display();

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}
