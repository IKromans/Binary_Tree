package io.branches;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

public class CountBranchesTests {

    CountBranches countBranches = new CountBranches();

    @Test
    void testWhenNextBranchIsNull() {
        Branch branch = new Branch(null);
        int expected = 0;
        int actual = countBranches.countNextBranches(branch);
        assertEquals(expected, actual);
    }

    @Test
    void testWhenOnlyTwoChildBranches() {
        Branch branchBE = new Branch(new ArrayList<>());
        Branch branchBC = new Branch(new ArrayList<>());
        Branch branchAB = new Branch(new ArrayList<>());
        Branch branchAF = new Branch(new ArrayList<>());
        Branch branch = new Branch(new ArrayList<>());
        branchAB.getBranches().add(branchBE);
        branchAB.getBranches().add(branchBC);
        branch.getBranches().add(branchAB);
        branch.getBranches().add(branchAF);
        int expected = 3;
        int actual = countBranches.countNextBranches(branch);
        assertEquals(expected, actual);
    }

    @Test
    void testWhenMoreThanTwoChildBranches() {
        Branch branchAC = new Branch(new ArrayList<>());
        Branch branchAE = new Branch(new ArrayList<>());
        Branch branchAB = new Branch(new ArrayList<>());
        Branch branchAF = new Branch(new ArrayList<>());
        Branch branch = new Branch(new ArrayList<>());
        branch.getBranches().add(branchAE);
        branch.getBranches().add(branchAC);
        branch.getBranches().add(branchAB);
        branch.getBranches().add(branchAF);
        int expected = 2;
        int actual = countBranches.countNextBranches(branch);
        assertEquals(expected, actual);
    }
}