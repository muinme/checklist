public class TestDSLienKet {
    public static void main(String[] args) {
        DanhSach danhSach = new DanhSach();
        danhSach.insertA(4);


        danhSach.insertA(2);
        danhSach.print();

        danhSach.insertA(8);
        danhSach.print();
        danhSach.insertA(5);
        danhSach.insertAtBack(1);
        danhSach.insertAtFront(9);
        danhSach.insertA(9);
        danhSach.print();




    }
}
