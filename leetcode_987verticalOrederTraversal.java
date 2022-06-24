/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

class Solution {
    
    // public class VerticalOrderTraversal {
    static TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> nodeMap;

    private static void getVerticalOrderTraversal(TreeNode root, int v, int h) {
        if(root == null) {
            return;
        }

        if(!nodeMap.containsKey(v)) {
            nodeMap.put(v, new TreeMap<>());
        }

        if(!nodeMap.get(v).containsKey(h)) {
            nodeMap.get(v).put(h, new ArrayList<>());
        }

        nodeMap.get(v).get(h).add(root.val);

        getVerticalOrderTraversal(root.left, v - 1, h + 1);
        getVerticalOrderTraversal(root.right, v + 1, h + 1);
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        nodeMap = new TreeMap<>();
        List<List<Integer>> outputList = new ArrayList<>();

        getVerticalOrderTraversal(root, 0, 0);

        for(TreeMap<Integer, ArrayList<Integer>> eachNodeMap : nodeMap.values()) {
            List<Integer> list = new ArrayList<Integer>();

            for(ArrayList<Integer> eachNode : eachNodeMap.values()) {
                Collections.sort(eachNode);

                for(Integer eachNodeValue : eachNode) {
                    list.add(eachNodeValue);
                }
            }

            outputList.add(list);
        }

        System.out.println(nodeMap);

        return outputList;
    }
}
    
