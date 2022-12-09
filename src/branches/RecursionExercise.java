package branches;

import java.util.ArrayList;

public class RecursionExercise {

    public static void main(String[] args) {

        CountNextBranches countNextBranches = new CountNextBranches();

        Branch branchDH = new Branch(new ArrayList<>());
        Branch branchDK = new Branch(new ArrayList<>());
        Branch branchGM = new Branch(new ArrayList<>());
        Branch branchFG = new Branch(new ArrayList<>());
        Branch branchFD = new Branch(new ArrayList<>());
        Branch branchFE = new Branch(new ArrayList<>());
        Branch branchAF = new Branch(new ArrayList<>());
        Branch branchBC = new Branch(new ArrayList<>());
        Branch branchAB = new Branch(new ArrayList<>());
        Branch branchA = new Branch(new ArrayList<>());

        branchFD.getBranches().add(branchDK);
        branchFD.getBranches().add(branchDH);
        branchFG.getBranches().add(branchGM);
        branchAF.getBranches().add(branchFG);
        branchAF.getBranches().add(branchFD);
        branchAF.getBranches().add(branchFE);
        branchAB.getBranches().add(branchBC);
        branchA.getBranches().add(branchAB);
        branchA.getBranches().add(branchAF);


        System.out.println("This structure depth is: " + countNextBranches.countNextBranches(branchA) + " levels.");
    }
}