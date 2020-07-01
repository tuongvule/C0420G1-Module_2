package dependency_inversion_principle.true_design;

/**
 * Backend phụ thuộc vào IDevelop(abstraction)
 */
class Backend implements IDevelop{

    @Override
    public void develop() {
        this.codeJava();
    }

    private void codeJava(){
        System.out.println("Sử dụng code Java xây dựng Backend");
    }
}
