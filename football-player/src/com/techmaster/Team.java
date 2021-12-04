package com.techmaster;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Team {
    private ArrayList<Player> team;

    public Team(ArrayList<Player> team) {
        this.team = team;
    }

    public Team() {
        this.team=new ArrayList<Player>();
    }
    // add tat ca cau thu vao danh sach doi
    public void addTeam(){
        this.team.add(new Player(1,"Cong Vanh",Position.GK));
        this.team.add(new Player(2,"Cong Vanh1",Position.GK));
        this.team.add(new Player(3,"Cong Vanh2",Position.DF));
        this.team.add(new Player(4,"Cong Vanh3",Position.DF));
        this.team.add(new Player(5,"Cong Vanh4",Position.DF));
        this.team.add(new Player(6,"Cong Vanh5",Position.MF));
        this.team.add(new Player(7,"Cong Vanh6",Position.MF));
        this.team.add(new Player(8,"Cong Vanh7",Position.MF));
        this.team.add(new Player(9,"Cong Vanh8",Position.MF));
        this.team.add(new Player(10,"Cong Vanh9",Position.MF));
        this.team.add(new Player(11,"Cong Vanh10",Position.DF));
        this.team.add(new Player(12,"Cong Vanh11",Position.DF));
        this.team.add(new Player(13,"Cong Vanh12",Position.FW));
        this.team.add(new Player(14,"Cong Vanh13",Position.FW));
        this.team.add(new Player(15,"Cong Vanh14",Position.FW));
        this.team.add(new Player(16,"Cong Vanh15",Position.FW));
        this.team.add(new Player(17,"Cong Vanh16",Position.FW));

    }
    //in ra danh sach doi bong
    void printTeam(){
        for (Player p :
                team) {
            System.out.println(p);
        }
    }
    // Ham xu ly chon ra 11 cau thu vao doi bong
    void controlSelectedTeam(int df, int mf, int fw){

        ArrayList<Player> teamSlected =new ArrayList<Player>();
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int gk=1;
        int gkCount=0;
        int dfCount=0;
        int mfCount=0;
        int fwCount=0;
        //chon ra GK
        while(gkCount<gk) {
            int rdGk=r.nextInt(team.size()); // lay ra 1 cau thu random trong danh sach tat ca cau thu
            if (team.get(rdGk).getPosition().equals(Position.GK)) { //check xem cau thu tai vi tri do co phai la GK hay ko
                teamSlected.add(team.get(rdGk));
                gkCount++;
            }
        }
        //chon ra df
        while(dfCount<df) {
            int rdDf=r.nextInt(team.size());
            if (team.get(rdDf).getPosition().equals(Position.DF) && !teamSlected.contains(team.get(rdDf))) {
                teamSlected.add(team.get(rdDf));
                dfCount++;
            }
        }
//        chon ra mf
        while(mfCount<mf) {
            int rdMf=r.nextInt(team.size());
            if (team.get(rdMf).getPosition().equals(Position.MF) && !teamSlected.contains(team.get(rdMf))) {
                teamSlected.add(team.get(rdMf));
                mfCount++;
            }
        }
//        chon ra fw
        while(fwCount<fw) {
            int rdFw=r.nextInt(team.size());
            if (team.get(rdFw).getPosition().equals(Position.FW) && !teamSlected.contains(team.get(rdFw))) {
                teamSlected.add(team.get(rdFw));
                fwCount++;
            }
        }
        System.out.println("Doi hinh duoc chon la ");
        for (Player p:
            teamSlected ) {
            System.out.println(p);
        }
    }
    // ham goi danh sach cau thu dc chon
    void selectedTeam(){
        Scanner sc=new Scanner(System.in);
        int choice=0;
        do{
            System.out.println("Chon doi hinh mong muon ");
            System.out.println("1. 4-4-2 : 1GK - 4DF - 4MF - 2FW\n" +
                    "2. 4-3-3 : 1GK - 4DF - 3MF - 3FW\n" +
                    "3. 3-5-2 : 1GK - 3DF - 5MF - 2FW\n" +
                    "0. Thoat");
            choice=sc.nextInt();
            if(choice==1){
                controlSelectedTeam(4,4,2);
            }
           else if(choice==2){
                controlSelectedTeam(4,3,3);

            }
           else if(choice==3){
                controlSelectedTeam(3,5,2);

            }
        }
        while(choice!=0);
    }

}
