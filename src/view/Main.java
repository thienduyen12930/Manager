import controller.Manager;
public class Main {
    public static void main(String[] args) {
        String title = "/----------------------------------/\nManage Candidate Of Company File";
        String[] s = new String[]{"Experience", "Fresher", "Intern", "Searching", "Exit"};
        Manager manage = new Manager(title, s);
        manage.run();
    }
}
