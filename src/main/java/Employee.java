/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    @SuppressWarnings("checkstyle:visibilitymodifier")
    private String name;
    @SuppressWarnings("checkstyle:visibilitymodifier")
    private String manager;

    /**
     * Constructor for initialization.
     * @param name klop
     * @param manager oijlk
     */
    public Employee(final String name, final String manager) {
        this.name = name;
        this.manager = manager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name oielakjf
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager ois;jdfkl.
     */
    public void setManager(final String manager) {
        this.manager = manager;
    }
}
