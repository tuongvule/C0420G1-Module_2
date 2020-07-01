package single_responsibility_principle.true_design;

/**
 * Class Store nhận nhiệm vụ lưu trữ dữ liệu
 */
public class Store {
    public void SaveToDatabase(Student std) {
        System.out.println("Code lưu trữ dữ liệu vào database");
    }
    public void SaveToFile(Student std) {
        System.out.println("Code lưu trữ dữ liệu vào File");
    }
}
