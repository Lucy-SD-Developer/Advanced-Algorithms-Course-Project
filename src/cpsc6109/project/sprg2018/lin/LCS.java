/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc6109.project.sprg2018.lin;

/**
 *
 * @author Lu Lin
 */
public class LCS {
    
    public int calculateLCS(int[] N, int[] S) {
        int n = N.length;
        int L[][] = new int[n+1][n+1];
        
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=n; j++) {
                if (i == 0 || j== 0) {
                    L[i][j] = 0;
                } else if (N[i-1] == S[j-1]) {
                    L[i][j] = L[i-1][j-1] + 1;
                } else {
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
                }
            }
        }
        return L[n][n];
            
    }
}
