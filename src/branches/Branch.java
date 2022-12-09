package branches;

import java.util.List;

public class Branch {

    private final List<Branch> branches;

    public Branch(List<Branch> branches) {
        this.branches = branches;
    }

    public List<Branch> getBranches() {
        return branches;
    }
}