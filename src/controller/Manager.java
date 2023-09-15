package controller;

import common.CandidatesCommon;
import java.util.ArrayList;
import model.Candidate;
import view.Menu;
public class Manager extends Menu {
    
    private static ArrayList<Candidate> arr = new ArrayList();
    public Manager(String title, String[] s) {
        super(title, s);
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                CandidatesCommon.createNewCandidate(arr, 0);
                break;
            case 2:
                CandidatesCommon.createNewCandidate(arr, 1);
                break;
            case 3:
                CandidatesCommon.createNewCandidate(arr, 2);
                break;
            case 4:
                CandidatesCommon.searchCandidate(arr);
                break;
            case 5: 
                System.out.println("Exited");
                return;
            default:
                System.err.println("Choose 1-5");
        }
    } 
}
