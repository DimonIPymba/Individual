import java.util.ArrayList;
import java.util.Scanner;

public class SportTracker {
    private ArrayList<SportActivity> activities;
    private Scanner scanner;
    public SportTracker() {
        this.activities = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    public void addActivity(SportActivity activity) {
        activities.add(activity);
    }
    public void displayActivities() {
        System.out.println("Список сопрт-активностей:");
        for (SportActivity activity : activities) {
            System.out.println(activity);
        }
    }
    public void markActivityCompleted() {
        System.out.print("Введіть назву спорт-активності, яку ви завершили: ");
        String activityName = scanner.nextLine();
        for (SportActivity activity : activities) {
            if (activity.getActivityName().equalsIgnoreCase(activityName) && !activity.isCompleted()) {
                activity.setCompleted(true);
                System.out.println("Спорт-активність \"" + activityName + "\" відзначено завершеною.");
                return;
            }
        }
        System.out.println("Спорт-активність \"" + activityName + "\" не знайдено або вже відзначено завершеною.");
    }
    public static void main(String[] args) {
        SportTracker sportTracker = new SportTracker();
        sportTracker.addActivity(new SportActivity("Біг", 30));
        sportTracker.addActivity(new SportActivity("Велосипедний спорт", 45));
        sportTracker.addActivity(new SportActivity("Плавання", 50));
        sportTracker.addActivity(new SportActivity("Легка атлетика", 60));

        System.out.println("Введіть дані нової спорт-активності:");
        System.out.print("Назва спорт-активності: ");
        String activityName = sportTracker.scanner.nextLine();
        System.out.print("Тривалість у хвилинах: ");
        int duration = sportTracker.scanner.nextInt();
        sportTracker.scanner.nextLine();

        SportActivity newActivity = new SportActivity(activityName, duration);
        sportTracker.addActivity(newActivity);

        sportTracker.displayActivities();

        sportTracker.markActivityCompleted();
        sportTracker.displayActivities();
    }
}