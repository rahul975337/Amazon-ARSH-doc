
import java.util.*;
//TODO:

/**
 * 7. Your team at amazon is overseeing the design of a new high-efficiency data
 * center at HQ2. A power grid need to be generated for supplying power to N
 * servers. All servers in the grid have to be connected such that they have
 * access to power. The cost of connections between different servers varies.
 * Assume that there are no ties, names of servers are unique, connections are
 * directionless, there is at most one connection between a pair of servers, all
 * costs are greater than zero, and a server does not connect to itself.
 * Write an algorithm to minimize the cost of connecting all servers in the
 * power grid.
 * Input
 * two arguments - num, an Integer representing number of connections.
 * connectons, representing a list of connections where each element of the list
 * consists of two servers and the cost of connection between the servers.
 * Note
 * The cost of connection between the servers is always greater than 0.
 * Example
 * Input
 * -----------
 * num = 5
 * connection =[ [A,B,1],[B,C,4],[B,D,6],[D,E,5],[C,E,1] ]
 * Output[ [ [A,B,1],[B,C,4],[C,E,1],[D,E,5] ] ]
 * ----------
 *
 *
 */
public class app07 {
    public static void main(String[] args) {
        int num = 5;
        int connection[][] = { { 'A', 'B', 1 }, { 'B', 'C', 4 }, { 'B', 'D', 6 }, { 'D', 'E', 5 }, { 'C', 'E', 1 } };

    }
}

class Triplet {
    char start, end;
    int dist;

    Triplet(char start, char end, int dist) {
        this.start = start;
        this.end = end;
        this.dist = dist;
    }
}
