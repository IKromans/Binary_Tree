package branches;

public class CountNextBranches {
    public int countNextBranches(Branch branch) {
        if (branch.getBranches() != null) {
            int levelCount = 1;
            for (Branch branches : branch.getBranches()) {
                int childLevelCount = countNextBranches(branches);
                levelCount = Math.max(levelCount, childLevelCount);
            }
            return levelCount + 1;
        }
        return 0;
    }
}
