import java.util.ArrayList;
public class Developer {
    // attribuites
    private String name;
    private int yearsOfExperience;
    private double hoursOfSleep;
    private ArrayList<String> languages;
    private ArrayList<Project> projects;
    private static int devCount;
    private static int totalYearsOfEXP;
    private static int totalProjects;


    //constructor
    public Developer(){
        this.name = "somebody";
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        devCount++;
    }

    public Developer(String name, int yearsOfExperience,double hoursOfSleep){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.hoursOfSleep = hoursOfSleep;
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        devCount++;
        totalYearsOfEXP += yearsOfExperience;
    }


    // methods
    public void displayStatus(){
        System.out.println("name: " + this.name);
        System.out.println("yearsOfExperience: " + this.yearsOfExperience);
        System.out.println("hoursOfSleep: " + this.hoursOfSleep);
        System.out.println("languages: " + this.languages);
        System.out.println("projects:");
        for(Project eachProject: this.projects){
            eachProject.displayInfo();
        }
    }

    //Getters and setters

    public static int getTotalProjects(){
        return totalProjects;
    }

    public static int getTotalYearsOfEXP(){
        return totalYearsOfEXP;
    }


    public static int getDevCount(){
        return devCount;
    }

    public void setOneProject(Project project){
        this.projects.add(project);
        totalProjects++;
    }

    public ArrayList<Project> getProjects(){
        return this.projects;
    }

    public void setProjects(ArrayList<Project> projects){
        totalProjects += projects.size();
        this.projects = projects;
    }


    //getter
    public String getName(){
        return this.name;
    }

    //setter
    public Developer setName(String name){
        this.name = name;
        return this;
    }

    //getter
    public int getYearsOfExperience(){
        return this.yearsOfExperience;
    }

    //setter
    public Developer setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
        return this;
    }

    public double getHoursOfSleep(){
        return this.hoursOfSleep;
    }


    public void setHoursOfSleep(double hoursOfSleep){
        this.hoursOfSleep = hoursOfSleep;
    }


}