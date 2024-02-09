package Array2D;

import java.util.Scanner;


class Main2 {
    private static class Team {
        public String name;
        public int point;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Team []team = new Team[4];
        for(int j=0; j<team.length; j++) {
            team[j] = new Team();
            team[j].name = kb.next();
        }
                
        int [][]t = new int[4][4];
        for(int j=0; j<t.length; j++) {
            for(int k=0; k<t[j].length; k++) {
                t[j][k] = kb.nextInt();
            }                
        }
//        System.out.println("-----------");
//        for(int j=0; j<team.length; j++) {
//            System.out.println(team[j].name);
//        }        
//        for(int j=0; j<t.length; j++) {
//            for(int k=0; k<t[j].length; k++) {
//                System.out.print( t[j][k] + " ");
//            }
//            System.out.println("");
//        }
//        for(int i=0,k = 0; i<4; i++, k++) {
//            for(int j=0; j<k; j++) {
//                System.out.print( t[i][j] + " ");
//            }
//            System.out.println("");            
//        }
        for(int i=1,k = 1; i<4; i++, k++) {
            for(int j=0; j<k; j++) {
                if( t[i][j] > t[j][i] ){
                    team[i].point += 3;
                }else if( t[i][j] < t[j][i] ){
                    team[j].point += 3;
                }else {
                    team[i].point += 1;
                    team[j].point += 1;
                }                
            }                      
        }
        
        for(int j=0; j<team.length; j++) {
            System.out.println(team[j].name + " " +
                               team[j].point );
        } 
        
        for(int j=0; j<team.length; j++) {
            for(int k=j+1; k < team.length; k++) {
                if( team[j].point < team[k].point ) {
                    Team temp = team[j];
                    team[j] = team[k];
                    team[k] = temp;
                }
            }
            System.out.println("----------");
            for(int v=0; v<team.length; v++) {
                System.out.println(team[v].name + " " +
                               team[v].point );
            } 
        }

        for(int j=0; j<team.length; j++) {
            System.out.println(team[j].name + " " +
                               team[j].point );
        }  
    }
}