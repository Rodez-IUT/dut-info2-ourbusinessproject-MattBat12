package ourbusinessproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.xml.ws.ServiceMode;

@Service
public class InitializationService {

    //@Autowired
    private EnterpriseProjectService enterpriseProjectService;

    private Enterprise enterprise1;
    private Enterprise enterprise2;

    private Project project1E1;
    private Project project1E2;
    private Project project2E1;

    public InitializationService(@Autowired EnterpriseProjectService enterpriseProjectService) {
        this.enterpriseProjectService = enterpriseProjectService;
    }

    @Transactional
    public void initProjects() {
        // TODO
        enterprise1 = new Enterprise();
        enterprise1.setName("MyComp");
        enterprise1.setDescription("My comp description");
        enterprise1.setContactEmail("comp@com.com");
        enterprise1.setContactName("comp contact name");

        enterprise2 = new Enterprise();
        enterprise2.setName("MyComp2");
        enterprise2.setDescription("My comp 2 description");
        enterprise2.setContactEmail("comp2@com.com");
        enterprise2.setContactName("comp 2 contact name");

        // given a a valid project
        project1E1 = new Project("A project1E1", "Project1E1 description", enterprise1);
        project1E2 = new Project("A project1E2", "Project1E2 description", enterprise2);
        project2E1 = new Project("A project2E1", "Project2E1 description", enterprise1);

        enterpriseProjectService.save(project1E1);
        enterpriseProjectService.save(project1E2);
        enterpriseProjectService.save(project2E1);
    }

    public Enterprise getEnterprise1() {
        return enterprise1;
    }

    public void setEnterprise1(Enterprise enterprise1) {
        this.enterprise1 = enterprise1;
    }

    public Enterprise getEnterprise2() {
        return enterprise2;
    }

    public void setEnterprise2(Enterprise enterprise2) {
        this.enterprise2 = enterprise2;
    }

    public Project getProject1E1() {
        return project1E1;
    }

    public void setProject1E1(Project project1E1) {
        this.project1E1 = project1E1;
    }

    public Project getProject1E2() {
        return project1E2;
    }

    public void setProject1E2(Project project1E2) {
        this.project1E2 = project1E2;
    }

    public Project getProject2E1() {
        return project2E1;
    }

    public void setProject2E1(Project project2E1) {
        this.project2E1 = project2E1;
    }
}
