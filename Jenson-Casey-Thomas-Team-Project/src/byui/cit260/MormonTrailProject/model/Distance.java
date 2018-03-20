/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.model;

/**
 *
 * @author tcasey
 */
public class Distance {

    public static void distance(String args[]) {
        double distance[];
        distance = new double[11];
        distance[0] = 0;
        distance[1] = 130;
        distance[2] = 153;
        distance[3] = 300;
        distance[4] = 317;
        distance[5] = 718;
        distance[6] = 788;
        distance[7] = 964;
        distance[8] = 1083;
        distance[9] = 1183;
        distance[10] = 1236;

    }
    public long calcRemainingDistance(int[] distance) {
        long total = 1302;

        for (int i = 0; i < distance.length; i++) {
            total += -distance[i];
        }
        return total;
        //System.out.println("The remaining distance to Salt Lake Valley is " + );
    }

    public void display() {
        
    }
}
