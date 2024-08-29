import java.util.HashMap;
import java.util.Map;

class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        UnionFind uf = new UnionFind();
        
        for (int[] stone : stones) {
            uf.union(stone[0], ~stone[1]); // Union the stone's row and the stone's column
        }
        
        return n - uf.getCount();
    }
}

class UnionFind {
    private Map<Integer, Integer> parent;
    private int count;
    
    public UnionFind() {
        parent = new HashMap<>();
        count = 0;
    }
    
    public int find(int x) {
        if (parent.putIfAbsent(x, x) == null) {
            count++;
        }
        if (x != parent.get(x)) {
            parent.put(x, find(parent.get(x)));
        }
        return parent.get(x);
    }
    
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        
        if (rootX != rootY) {
            parent.put(rootX, rootY);
            count--;
        }
    }
    
    public int getCount() {
        return count;
    }
}
