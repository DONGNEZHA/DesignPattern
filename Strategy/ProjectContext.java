package Strategy;

public class ProjectContext {
    private ProjectSelect projectSelect;

    public ProjectContext(ProjectSelect projectSelect){
        this.projectSelect = projectSelect;
    }

    public double getResult(double speed,double physical,double strength,double skill){
        return projectSelect.selectProject(speed,physical,strength,skill);
    }
}
