import java.util.*;
class Person 
{
    private String name;
    private int age;
    private String gender;
    private String contact;

      Person(String name, int age, String gender, String contact) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    // Encapsulation - Getters and Setters

    public String getName() 
    {
     return name; 
    }

    public void setName(String name) 
    { 
        this.name = name; 
    }

    public int getAge() 
    {
     return age; 
     }
    public void setAge(int age) 
    { 
        this.age = age; 
    }

    public String getGender() 
    { 
        return gender; 
    }
    public void setGender(String gender) 
    { 
        this.gender = gender; 
    }

    public String getContact() 
    { 
        return contact; 
    }
    public void setContact(String contact) 
    { 
        this.contact = contact; 
    }

    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age );
        System.out.println("Gender: " + gender );
        System.out.println("Contact: " + contact);

    }
}

 
// Trainer class
 
class Trainer extends Person {
    private String trainerId;
    private String skill;
    private double salary;

        //constructor Trainer
     Trainer(String trainerId,String name, int age, String gender, String contact, String skill, double salary) 
     {
        super(name, age, gender, contact);
        this.trainerId = trainerId;
        this.skill = skill;
        this.salary = salary;
    }

    public String getTrainerId() 
    { 
        return trainerId; 
    }

    public void displayTrainer() {
        System.out.println("\n--- Trainer Details ---");
        System.out.println("Trainer ID: " + trainerId);
        super.displayInfo();
        System.out.println("Skill: " + skill);
        System.out.println("Salary: ₹" + salary);
    }
}

 
// MembershipPlan class
 
class MembershipPlan {
    private String planId;
    private String planName;
    private int duration; 
    private double cost;

    public MembershipPlan(String planId, String planName, int duration, double cost) {
        this.planId = planId;
        this.planName = planName;
        this.duration = duration;
        this.cost = cost;
    }

    public String getPlanId() 
    { 
        return planId; 
    }
    public String getPlanName() 
    { 
        return planName; 
    }
    public int getDuration() 
    { 
        return duration;
    }
    public double getCost() 
    { 
        return cost; 
    }

    public void displayPlan() 
    {
        System.out.println("\n Plan Details ");
        System.out.println("PlanID: "+planId);
        System.out.println("PlaneName: " + planName);
        System.out.println("Duration: " + duration);
        System.out.println("Months-₹: " + cost);
    }
}

 
// Member class


class Member extends Person {
    private String memberId;
    private MembershipPlan plan;
    private Trainer trainer;
    private double totalFees;
    private double amountPaid;
    private ArrayList<String> paymentHistory = new ArrayList<>();

    public Member(String memberId,String name, int age, String gender, String contact,
                  MembershipPlan plan, Trainer trainer, double payment) 
    {
        super(name, age, gender, contact);
        this.memberId = memberId;
        this.plan = plan;
        this.trainer = trainer;
        this.totalFees = plan.getCost();
        this.amountPaid = payment;
        paymentHistory.add("Initial payment ₹" + payment);
    }

    public String getMemberId() 
    { 
        return memberId; 
    }

    public void displayMember() {
        System.out.println("\n--- Member Details ---");
        System.out.println("Member ID: " + memberId);
        super.displayInfo();
        System.out.println("Plan: " + plan.getPlanName());
        System.out.println("Trainer: " + trainer.getName());
        System.out.println("Total Fees: ₹" + totalFees);
        System.out.println("Paid: ₹" + amountPaid);
        System.out.println("Due: ₹" + (totalFees - amountPaid));
    }

    public void addPayment(double amt) 
    {
        amountPaid += amt;
        paymentHistory.add("Paid ₹" + amt);
        System.out.println(" Payment added successfully!");
    }

    public void viewPaymentHistory() 
    {
        System.out.println("Payment History for " + getName() + ":");

        for (String p : paymentHistory)
        {
         System.out.println(" - " + p);
        }
    }

    public void checkMembershipStatus() 
    {
        if (amountPaid >= totalFees) 
            {
                System.out.println("Membership is Active ");
            }
        else 
            {
                System.out.println("Pending Payment! Please pay ₹" + (totalFees - amountPaid));
            }
    }
}


// Main Driver Class

public class GymManagementProject {

    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Trainer> trainers = new ArrayList<>();
    private ArrayList<MembershipPlan> plans = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Add Trainer
    private void addTrainer() 
    {
        System.out.print("Enter Trainer ID: ");
        String id = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Gender: ");
        String gender = sc.next();
        System.out.print("Enter Contact: ");
        String contact = sc.next();
        System.out.print("Enter Skill: ");
        String skill = sc.next();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        trainers.add(new Trainer(id, name, age, gender, contact, skill, salary));
        System.out.println(" Trainer added successfully!");
    }

    private void viewTrainers() 
    {
        if (trainers.isEmpty()) 
            {
                System.out.println(" No trainers found!");
            }
        else 
            {
                for (Trainer t : trainers) t.displayTrainer();
            }
    }

    // Add Plan
    private void addPlan() {

        System.out.print("Enter Plan ID: ");
        String id = sc.next();
        System.out.print("Enter Plan Name: ");
        String name = sc.next();
        System.out.print("Enter Duration (months): ");
        int duration = sc.nextInt();
        System.out.print("Enter Cost: ");
        double cost = sc.nextDouble();

        plans.add(new MembershipPlan(id, name, duration, cost));
        System.out.println(" Plan added successfully!");
    }

    private void viewPlans() {
        if (plans.isEmpty()) 
            {
                System.out.println(" No plans found!");
            }
        else 
            {
                for (MembershipPlan p : plans) p.displayPlan();
            }
    }

    // Add Member
    private void addMember() {
        if (plans.isEmpty() || trainers.isEmpty()) {
            System.out.println(" Please add plans and trainers first!");
            return;
        }

        System.out.print("Enter Member ID: ");
        String id = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Gender: ");
        String gender = sc.next();
        System.out.print("Enter Contact: ");
        String contact = sc.next();

        System.out.println("\nAvailable Plans:");

        for (MembershipPlan p : plans) p.displayPlan();

        System.out.print("Enter Plan ID: ");
        String planId = sc.next();
        MembershipPlan chosenPlan = null;
        for (MembershipPlan p : plans)
            if (p.getPlanId().equals(planId)) chosenPlan = p;



        System.out.println("\nAvailable Trainers:");
        for (Trainer t : trainers) t.displayTrainer();
        System.out.print("Enter Trainer ID: ");
        String trainerId = sc.next();
        Trainer chosenTrainer = null;
        for (Trainer t : trainers)
            if (t.getTrainerId().equals(trainerId)) chosenTrainer = t;

        System.out.print("Enter Initial Payment: ");
        double payment = sc.nextDouble();

        members.add(new Member(id, name, age, gender, contact, chosenPlan, chosenTrainer, payment));
        System.out.println(" Member added successfully!");
    }

    private void viewMembers() {
        if (members.isEmpty()) System.out.println(" No members found!");
        else for (Member m : members) m.displayMember();
    }

    // Member Options

    private void memberMenu() {
        System.out.print("Enter Member ID: ");
        String id = sc.next();
        for (Member m : members) {
            if (m.getMemberId().equals(id)) {
                while (true) 
                {
                    System.out.println("\n******Member Menu (" + m.getName() + ")*****");
                    System.out.println("1. View Details");
                    System.out.println("2. Add Payment");
                    System.out.println("3. View Payment History");
                    System.out.println("4. Check Membership Status");
                    System.out.println("5. Back");
                    System.out.print("Enter choice: ");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> m.displayMember();
                        case 2 -> {
                            System.out.print("Enter Amount: ");
                            double amt = sc.nextDouble();
                            m.addPayment(amt);
                        }
                        case 3 -> m.viewPaymentHistory();
                        case 4 -> m.checkMembershipStatus();
                        case 5 -> { return; }
                        default -> System.out.println(" Invalid choice!");
                    }
                }
            }
        }
        System.out.println("Member not found!");
    }

    // Menu

    public void showMenu() {
        while (true) {
            System.out.println("\n ******* GYM MANAGEMENT SYSTEM *******");
            System.out.println("1. Add Membership Plan");
            System.out.println("2. View Plans");
            System.out.println("3. Add Trainer");
            System.out.println("4. View Trainers");
            System.out.println("5. Add Member");
            System.out.println("6. View Members");
            System.out.println("7. Member Options");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> addPlan();
                case 2 -> viewPlans();
                case 3 -> addTrainer();
                case 4 -> viewTrainers();
                case 5 -> addMember();
                case 6 -> viewMembers();
                case 7 -> memberMenu();
                case 8 -> {
                    System.out.println(" Thank you for using Gym Management System!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    public static void main(String[] args) {
        GymManagementProject gms = new GymManagementProject();
        gms.showMenu();
    }
}
